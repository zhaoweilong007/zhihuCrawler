(function () {
  var catalogMetaPromise;

  function escapeHtml(value) {
    return String(value).replace(/[&<>'"]/g, function (character) {
      return { '&': '&amp;', '<': '&lt;', '>': '&gt;', "'": '&#39;', '"': '&quot;' }[character];
    });
  }

  function encodePath(path) {
    return path.split('/').map(encodeURIComponent).join('/');
  }

  function currentPath() {
    var hash = window.location.hash || '';
    var marker = '?path=';
    var index = hash.indexOf(marker);
    return index === -1 ? '' : decodeURIComponent(hash.slice(index + marker.length));
  }

  function currentDocumentPath() {
    var prefix = '#/document/';
    var hash = window.location.hash || '';
    return hash.indexOf(prefix) === 0 ? decodeURIComponent(hash.slice(prefix.length).split('?')[0]) : '';
  }

  function catalogMeta() {
    if (!catalogMetaPromise) {
      var url = new URL('catalog/meta.json', window.location.href).toString();
      catalogMetaPromise = fetch(url, { cache: 'no-cache' }).then(function (response) {
        if (!response.ok) throw new Error('目录版本返回 ' + response.status);
        return response.json();
      });
    }
    return catalogMetaPromise;
  }

  function fetchCatalogShard(url, revision) {
    if (!window.caches) return fetch(url);
    return caches.open('zhihu-catalog-' + revision).then(function (cache) {
      return cache.match(url).then(function (cached) {
        if (cached) return cached;
        return fetch(url).then(function (response) {
          if (response.ok) cache.put(url, response.clone());
          return response;
        });
      });
    });
  }

  function loadCatalog(path) {
    var bytes = new TextEncoder().encode(path);
    return crypto.subtle.digest('SHA-256', bytes).then(function (buffer) {
      var hash = Array.from(new Uint8Array(buffer)).map(function (byte) {
        return byte.toString(16).padStart(2, '0');
      }).join('');
      return catalogMeta().then(function (meta) {
        var url = new URL('catalog/' + hash.slice(0, 2) + '.json', window.location.href);
        url.searchParams.set('v', meta.revision);
        return fetchCatalogShard(url.toString(), meta.revision);
      }).then(function (response) {
        if (!response.ok) throw new Error('目录索引返回 ' + response.status);
        return response.json();
      }).then(function (shard) {
        if (!shard[hash] || !Array.isArray(shard[hash].entries)) throw new Error('目录索引格式错误');
        return shard[hash].entries;
      });
    });
  }

  function renderDirectory(path, entries) {
    var container = document.getElementById('catalog-browser');
    if (!container) return;

    entries.sort(function (left, right) {
      if (left.type !== right.type) return left.type === 'dir' ? -1 : 1;
      return left.name.localeCompare(right.name, 'zh-CN');
    });

    var parent = path.lastIndexOf('/') === -1 ? '' : path.slice(0, path.lastIndexOf('/'));
    var html = '<p class="catalog-path">当前位置：document' + (path ? '/' + escapeHtml(path) : '') + '</p>';
    if (path) html += '<p><a href="#/browse?path=' + encodeURIComponent(parent) + '">← 返回上一级</a></p>';
    html += '<label class="directory-filter"><span>筛选当前目录</span><input data-directory-filter type="search" placeholder="输入标题或目录名"></label>';
    html += '<ul class="catalog-list">';
    entries.forEach(function (entry) {
      var nextPath = path ? path + '/' + entry.name : entry.name;
      var href = entry.type === 'dir'
        ? '#/browse?path=' + encodeURIComponent(nextPath)
        : '#/document/' + encodePath(nextPath);
      html += '<li class="catalog-item catalog-item-' + escapeHtml(entry.type) + '" data-directory-entry="' + escapeHtml(entry.name) + '"><a href="' + href + '">' + escapeHtml(entry.name) + '</a></li>';
    });
    html += '</ul>';
    container.innerHTML = html;
    renderTreeNavigation(path, entries);
  }

  function renderTreeNavigation(path, entries) {
    var navigation = document.querySelector('.sidebar-nav');
    if (!navigation) return;

    var segments = path ? path.split('/') : [];
    var cumulative = '';
    var html = '<div id="directory-tree" class="directory-tree">';
    html += '<div class="directory-tree-header"><p class="directory-tree-kicker">ZHIHU ARCHIVE</p><p class="directory-tree-title">目录导航</p></div>';
    html += '<p class="directory-tree-shortcuts"><a href="#/">首页</a><a href="#/browse">全部分类</a></p>';
    if (segments.length) {
      var parent = segments.slice(0, -1).join('/');
      var parentLink = parent ? '#/browse?path=' + encodeURIComponent(parent) : '#/browse';
      html += '<p class="directory-tree-back"><a href="' + parentLink + '">← 返回上一级</a></p>';
      html += '<ol class="directory-tree-breadcrumbs" aria-label="当前路径">';
      segments.forEach(function (segment, index) {
        cumulative = cumulative ? cumulative + '/' + segment : segment;
        html += index === segments.length - 1
          ? '<li aria-current="page"><span>' + escapeHtml(segment) + '</span></li>'
          : '<li><a href="#/browse?path=' + encodeURIComponent(cumulative) + '">' + escapeHtml(segment) + '</a></li>';
      });
      html += '</ol>';
    }
    html += '<label class="directory-filter directory-tree-filter"><span>筛选当前目录</span><input data-directory-filter type="search" placeholder="筛选导航"></label>';
    html += '<p class="directory-tree-current">' + (segments.length ? '当前展开' : '选择一个分类开始浏览') + '</p>';
    html += '<ul class="directory-tree-children">';
    entries.forEach(function (entry) {
      var nextPath = path ? path + '/' + entry.name : entry.name;
      var href = entry.type === 'dir'
        ? '#/browse?path=' + encodeURIComponent(nextPath)
        : '#/document/' + encodePath(nextPath);
      var active = currentDocumentPath() === nextPath ? ' directory-tree-active' : '';
      html += '<li class="directory-tree-' + escapeHtml(entry.type) + active + '" data-directory-entry="' + escapeHtml(entry.name) + '"><a href="' + href + '">' + escapeHtml(entry.name) + '</a></li>';
    });
    html += '</ul></div>';
    navigation.innerHTML = html;
  }

  function renderError(message) {
    var container = document.getElementById('catalog-browser');
    if (container) container.innerHTML = '<div class="catalog-feedback catalog-error"><p>' + escapeHtml(message) + '</p><button type="button" data-catalog-retry>重新加载</button></div>';
  }

  function renderLoading() {
    var container = document.getElementById('catalog-browser');
    if (container) container.innerHTML = '<div class="catalog-feedback catalog-loading"><span aria-hidden="true"></span><p>正在加载目录…</p></div>';
  }

  function loadDirectory() {
    var route = window.location.hash.split('?')[0];
    if (route !== '#/browse') return;
    var path = currentPath();
    renderLoading();
    loadCatalog(path)
      .then(function (entries) {
        renderDirectory(path, entries);
      })
      .catch(function (error) {
        renderError('目录加载失败：' + error.message + '。请稍后重试。');
      });
  }

  function renderArticlePagination(path, entries) {
    if (currentDocumentPath() !== path) return;
    var content = document.querySelector('#main');
    if (!content) return;

    var existing = document.getElementById('article-pagination');
    if (existing) existing.remove();

    var divider = path.lastIndexOf('/');
    var name = divider === -1 ? path : path.slice(divider + 1);
    var articles = entries.filter(function (entry) {
      return entry.type === 'file' && entry.name.endsWith('.md');
    }).sort(function (left, right) {
      return left.name.localeCompare(right.name, 'zh-CN');
    });
    var index = articles.findIndex(function (entry) { return entry.name === name; });
    if (index === -1 || articles.length < 2) return;

    var previous = articles[index - 1];
    var next = articles[index + 1];
    var parent = divider === -1 ? '' : path.slice(0, divider);
    var html = '<nav id="article-pagination" class="article-pagination" aria-label="文章翻页">';
    html += previous
      ? '<a class="article-pagination-previous" href="#/document/' + encodePath(parent ? parent + '/' + previous.name : previous.name) + '">← 上一篇</a>'
      : '<span></span>';
    html += next
      ? '<a class="article-pagination-next" href="#/document/' + encodePath(parent ? parent + '/' + next.name : next.name) + '">下一篇 →</a>'
      : '<span></span>';
    html += '</nav>';
    content.insertAdjacentHTML('beforeend', html);
  }

  function loadArticlePagination() {
    var path = currentDocumentPath();
    if (!path) return;
    var divider = path.lastIndexOf('/');
    var parent = divider === -1 ? '' : path.slice(0, divider);
    loadCatalog(parent)
      .then(function (entries) {
        renderArticlePagination(path, entries);
        renderTreeNavigation(parent, entries);
      })
      .catch(function () {
        // 阅读正文不依赖翻页控件；目录请求失败时保留正文内容。
      });
  }

  function mountPageActions() {
    if (document.getElementById('page-actions')) return;
    var actions = document.createElement('nav');
    actions.id = 'page-actions';
    actions.className = 'page-actions';
    actions.setAttribute('aria-label', '页面操作');
    actions.innerHTML = '<button type="button" data-scroll="top" aria-label="回到顶部">↑ 顶部</button>'
      + '<button type="button" data-scroll="bottom" aria-label="回到底部">↓ 底部</button>';
    actions.addEventListener('click', function (event) {
      var target = event.target.closest('button[data-scroll]');
      if (!target) return;
      window.scrollTo({
        top: target.dataset.scroll === 'top' ? 0 : document.documentElement.scrollHeight,
        behavior: 'smooth'
      });
    });
    document.body.appendChild(actions);
  }

  function mountCatalogInteractions() {
    document.addEventListener('click', function (event) {
      if (event.target.closest('[data-catalog-retry]')) loadDirectory();
    });
    document.addEventListener('input', function (event) {
      if (!event.target.matches('[data-directory-filter]')) return;
      var query = event.target.value.trim().toLocaleLowerCase('zh-CN');
      document.querySelectorAll('[data-directory-entry]').forEach(function (entry) {
        entry.hidden = Boolean(query) && !entry.dataset.directoryEntry.toLocaleLowerCase('zh-CN').includes(query);
      });
    });
  }

  window.$docsify = window.$docsify || {};
  window.$docsify.plugins = (window.$docsify.plugins || []).concat(function (hook) {
    hook.mounted(function () {
      mountPageActions();
      mountCatalogInteractions();
    });
    hook.doneEach(function () {
      loadDirectory();
      loadArticlePagination();
    });
  });
  window.addEventListener('hashchange', loadDirectory);
})();
