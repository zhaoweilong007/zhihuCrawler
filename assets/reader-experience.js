(function () {
  var preferenceKey = 'zhihu-reader-preferences';
  var bookmarkKey = 'zhihu-bookmarks';
  var defaults = { fontSize: 16, lineHeight: 1.75, width: 860 };

  function articlePath() {
    var prefix = '#/document/';
    var hash = window.location.hash || '';
    return hash.indexOf(prefix) === 0 ? decodeURIComponent(hash.slice(prefix.length).split('?')[0]) : '';
  }

  function preferences() {
    return Object.assign({}, defaults, JSON.parse(localStorage.getItem(preferenceKey) || '{}'));
  }

  function applyPreferences() {
    var current = preferences();
    document.documentElement.style.setProperty('--reading-font-size', current.fontSize + 'px');
    document.documentElement.style.setProperty('--reading-line-height', current.lineHeight);
    document.documentElement.style.setProperty('--reading-width', current.width + 'px');
  }

  function savePreferences(next) {
    localStorage.setItem(preferenceKey, JSON.stringify(next));
    applyPreferences();
  }

  function bookmarks() {
    return JSON.parse(localStorage.getItem(bookmarkKey) || '[]');
  }

  function articleTitle(path) {
    return path.slice(path.lastIndexOf('/') + 1).replace(/\.md$/, '');
  }

  function isBookmarked(path) {
    return bookmarks().some(function (item) { return item.path === path; });
  }

  function toggleBookmark(path) {
    var values = bookmarks();
    var index = values.findIndex(function (item) { return item.path === path; });
    if (index === -1) values.unshift({ path: path, title: articleTitle(path) });
    else values.splice(index, 1);
    localStorage.setItem(bookmarkKey, JSON.stringify(values.slice(0, 100)));
    return index === -1;
  }

  function recordArticle(path) {
    var values = JSON.parse(localStorage.getItem('zhihu-recent-articles') || '[]').filter(function (item) { return item.path !== path; });
    values.unshift({ path: path, title: articleTitle(path) });
    localStorage.setItem('zhihu-recent-articles', JSON.stringify(values.slice(0, 12)));
  }

  function mountProgress() {
    if (document.getElementById('reading-progress')) return;
    var progress = document.createElement('div');
    progress.id = 'reading-progress';
    progress.innerHTML = '<span></span>';
    document.body.appendChild(progress);
    window.addEventListener('scroll', function () {
      var documentHeight = document.documentElement.scrollHeight - window.innerHeight;
      progress.firstChild.style.width = (documentHeight > 0 ? Math.min(100, window.scrollY / documentHeight * 100) : 0) + '%';
    }, { passive: true });
  }

  function mountArticleTools() {
    var path = articlePath();
    if (!path) return;
    var content = document.querySelector('#main');
    if (!content) return;
    var existing = document.getElementById('reader-tools');
    if (existing) existing.remove();
    recordArticle(path);
    var parent = path.slice(0, path.lastIndexOf('/'));
    var characters = (content.innerText || '').replace(/\s/g, '').length;
    var minutes = Math.max(1, Math.ceil(characters / 400));
    var html = '<section id="reader-tools" class="reader-tools" aria-label="阅读工具">';
    html += '<span class="reader-meta">约 ' + minutes + ' 分钟阅读</span>';
    html += '<a href="#/browse?path=' + encodeURIComponent(parent) + '">返回目录</a>';
    html += '<button type="button" data-reader-action="smaller">A−</button><button type="button" data-reader-action="larger">A+</button>';
    html += '<button type="button" data-reader-action="spacing">行距</button><button type="button" data-reader-action="width">版心</button>';
    html += '<button type="button" data-reader-action="bookmark">' + (isBookmarked(path) ? '已收藏' : '收藏') + '</button>';
    html += '<button type="button" data-reader-action="share">复制链接</button>';
    html += '<button type="button" data-reader-action="feedback">反馈</button>';
    html += '</section>';
    content.insertAdjacentHTML('afterbegin', html);
  }

  function mountInteractions() {
    document.addEventListener('click', function (event) {
      var button = event.target.closest('[data-reader-action]');
      if (!button) return;
      var path = articlePath();
      var action = button.dataset.readerAction;
      var current = preferences();
      if (action === 'smaller') savePreferences(Object.assign(current, { fontSize: Math.max(13, current.fontSize - 1) }));
      if (action === 'larger') savePreferences(Object.assign(current, { fontSize: Math.min(22, current.fontSize + 1) }));
      if (action === 'spacing') {
        var lineHeights = [1.55, 1.75, 1.95];
        var lineIndex = (lineHeights.indexOf(current.lineHeight) + 1) % lineHeights.length;
        savePreferences(Object.assign(current, { lineHeight: lineHeights[lineIndex] }));
        button.textContent = '行距 ' + lineHeights[lineIndex];
      }
      if (action === 'width') {
        var widths = [720, 860, 1000];
        var widthIndex = (widths.indexOf(current.width) + 1) % widths.length;
        savePreferences(Object.assign(current, { width: widths[widthIndex] }));
        button.textContent = '版心 ' + widths[widthIndex];
      }
      if (action === 'bookmark') { button.textContent = toggleBookmark(path) ? '已收藏' : '收藏'; }
      if (action === 'share') {
        var copied = function () { button.textContent = '已复制'; setTimeout(function () { button.textContent = '复制链接'; }, 1200); };
        if (navigator.clipboard && navigator.clipboard.writeText) navigator.clipboard.writeText(window.location.href).then(copied);
        else {
          var input = document.createElement('input');
          input.value = window.location.href;
          document.body.appendChild(input);
          input.select();
          document.execCommand('copy');
          input.remove();
          copied();
        }
      }
      if (action === 'feedback') {
        var title = encodeURIComponent('归档文档反馈：' + path.slice(path.lastIndexOf('/') + 1));
        window.open('https://github.com/zhaoweilong007/zhihuCrawler/issues/new?title=' + title, '_blank', 'noopener');
      }
    });
  }

  applyPreferences();
  window.$docsify = window.$docsify || {};
  window.$docsify.plugins = (window.$docsify.plugins || []).concat(function (hook) {
    hook.mounted(function () { mountProgress(); mountInteractions(); });
    hook.doneEach(function () { mountArticleTools(); });
  });
})();
