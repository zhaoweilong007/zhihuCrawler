# 百度和 Google 的搜索技术是一个量级吗？
- 点赞数：15477
- 更新时间：2014年01月30日13时49分55秒
- 回答url：https://www.zhihu.com/question/22447908/answer/21435705
<body>
 <p data-pid="4zAKhOUw">很多答案是从使用上讲的，我加两个技术方面的。</p>
 <ol>
  <li data-pid="p-Zlcfas">搜索引擎需要对抓取到的结果进行管理。当索引结果越来越多时，保证存储和查询速度，保证数万台服务器内容一致的难度越来越高。Google于03至06年左右公布了三篇论文，描述了GFS、BigTable、MapReduce三种技术以解决这些问题。由于Google并没有公布算法细节，因此由雅虎牵头，在06年左右建立了开源项目Hadoop，目的是根据Google的三篇论文，实现一个大规模的管理计算系统。但直到08年，Hadoop同Google公布的一些关键指标仍有几倍的差距。百度曾经由王选院士的一个博士带领，想基于Google论文独立实现(金字塔计划)一个自己的系统，但开发难度过大项目夭折，最终也转向了Hadoop。如今，Amazon、Facebook、Yahoo包括百度都在大规模应用Hadoop，而Google已经从2010年开始迁移到新的三驾马车Caffeine、Pregel、Dremel上了。单就搜索技术而言，Google不是领先百度，而是领先全世界。</li>
  <li data-pid="9e6fJeFv">2009-2012年，Google公布了世界上第一个全球化的数据库系统Spanner，这套系统将分布在全球各地的数据中心连接到一起，利用原子钟和GPS，打破了地理间隔，实现了全球规模具有一致性和实时性的数据库。在Google之前，很多人认为这种系统不可能做出来，但Google做到了[1]。</li>
 </ol>
 <p data-pid="ir_jYzoJ">另外，除了搜索，Google在深度学习和机器人方面也是全球领先的，尤其是后者。尽管百度也有深度学习研究院，但在这两方面跟Google比起来完全是空白。</p>
 <p data-pid="wi4eeFLH">事实上，让百度来和谷歌比是很不公平的，搜索只是Google的一个部门，但却是百度一整个公司。Google的竞争对手是Apple、Amazon、Facebook和Microsoft，百度的竞争对手是360、搜狗。Google没了搜索，还有Chrome、Android、Youtube，百度没了搜索，那就什么都没有了。<br></p>
 <br>
 <p data-pid="thMzcYuE">[1] <a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//www.wired.com/wiredenterprise/2012/11/google-spanner-time/all/" target="_blank" rel="nofollow noreferrer">Exclusive: Inside Google Spanner, the Largest Single Database on Earth</a></p>
</body>