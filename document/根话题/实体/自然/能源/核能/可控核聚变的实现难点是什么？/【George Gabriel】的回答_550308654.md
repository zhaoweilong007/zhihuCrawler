# 可控核聚变的实现难点是什么？
- 点赞数：5074
- 更新时间：2018年12月12日10时28分19秒
- 回答url：https://www.zhihu.com/question/20084261/answer/550308654
<body>
 <p data-pid="2aZxTgmm">苏联物理学家、托卡马克之父Lev Artsimovich说过一句至理名言：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="0TMGU0db">“<b>当整个社会都需要的时候，聚变就会实现</b> [1]。”</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-9777e66577aafc49ab7435f98c86c08c_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="482" data-rawheight="227" data-original-token="v2-9e1817e261cd6f016c19ddc64fbe817c" data-default-watermark-src="https://picx.zhimg.com/50/v2-2d243d6fc773dccb9c47af86ae41e838_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="482" data-original="https://picx.zhimg.com/v2-9777e66577aafc49ab7435f98c86c08c_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Nr38KsmT">时间回到了1956年4月18日，由两艘驱逐舰护航的一艘苏联巡洋舰停靠在了朴茨茅斯。船上载着的，是苏联部长会议主席布尔加宁，以及，苏共中央委员会第一书记赫鲁晓夫。那是苏联领导人第一次访问西方。那一年，苏联和英国的领导人讨论了欧洲安全、中东局势、扩大贸易，以及，共同利用核能的可能性。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PYIvMMih">两年后，日内瓦。联合国召开了第二次和平利用原子能国际会议。正是在那里，Artsimovich、Teller（氢弹之父）、Spitzer（仿星器之父）等被冷战分隔的双方第一次得以面对面交流。也正是在那一年，世界第一座托卡马克T-1开始运行。自此一切都被改变了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="FR0X8MFv">六十年过去了，回想一下这其中的跌宕坎坷，也是令人感叹不已。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Os4BYa2f">扯远了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="lIMiYazu">回到题目本身，如果要说最大的难点，也是所有可控核聚变研究共同的难点，我想只有一个，那就是：<b>如何实现真正的输出大于输入</b>。其实这一点也应当是这项研究最基本的工程目标，只有在达到这个目标之后，我们一切的讨论才有了意义。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PvP90Pyj">那，究竟是什么原因导致了我们至今无法实现这个目标呢？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Hi3iT4j2">上世纪五十年代提出的Lawson判据（Lawson criterion）其实从某种角度上已经告诉了我们答案。尽管这个公式本身在推导的时候使用了一些假设，但其所揭示的内涵已经很明显了：<b>密度，温度，约束时间</b> [2]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vmyOXs2g">这又意味着什么呢？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="_l33PP9g">拿最主流的方案来说吧。一言以蔽之：<b>磁场的强弱决定了密度和温度的上限，装置的大小则在某种程度上决定了约束时间的上限</b>。（具体计算就不写了，可以参考上一篇回答。）其实如果你回顾一下人类六十年来建造的托卡马克装置，这件事就一目了然了。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-f941a844955e6c856920ef6b57505fd9_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="573" data-rawheight="398" data-original-token="v2-886836ff5b483aa180ab3012d414aa64" data-default-watermark-src="https://picx.zhimg.com/50/v2-8d7ec06f0b2adb142b1c4a4cca341900_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="573" data-original="https://pica.zhimg.com/v2-f941a844955e6c856920ef6b57505fd9_r.jpg?source=1940ef5c">
  <figcaption>
   六十年来托卡马克装置的演化 [3]
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="5KxpcOsz">因此，这条路最终能走多远，取决于两件事：<b>第一，我们能稳定产生多强的磁场？</b>（超导磁体依然存在着临界电流与临界磁场，目前临界电流最大的超导材料是铌钛合金（Nb-Ti），JT-60SA和W7-X都使用了这种材料，而ITER将使用更加昂贵的Nb3Sn [4]。）<b>第二，我们的装置能造得有多大？</b>（ITER装置本身重23000吨，超过三个埃菲尔铁塔，将来的DEMO还会更大 [5]。）</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="7aa5UkB7">而最终达到目标时所付出的成本我们是否能够承受，这亦值得深思。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="sKCJLRxR">好了，下面来谈谈其它事情吧。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>等离子体</b></h2>
 <p data-pid="NZtT5kfq">几乎所有对于可控核聚变的研究都绕不开等离子体。原因很简单，只要温度足够高，电子就会从原子中脱离出来，物质的第四态就会显现。关于等离子体的问题太多太多了，但其实你会发现，不稳定性也好，湍流也好，制约等离子体种种难以捉摸行为的基本方程我们都是知道的（Vlasov和Maxwell方程 [6]），而我们所能做的依然只是近似-计算或者近似-模拟。就像制约三体运动的牛顿定律、制约流体运动的Navier-Stokes方程、制约大量分子运动的Boltzmann方程一样，<b>我们没有办法准确求解这些偏微分方程。</b>或许是这个时代的数学工具限制了我们，或许是更深层次的物理法则没有被揭示，又或许这就是自然对人类预测能力所设的一个天花板。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>原料</b></h2>
 <p data-pid="-FBZk-sS">核聚变之所以能够被称为无限能源，是因为海水中的氘对人类来说，几乎是“无限的”。但问题是，只使用氘，太难了。这里涉及到的问题有两点，反应截面和韧致辐射。在一亿度这个量级的温度下，氘-氘的反应截面比氘-氚低了近两个数量级。而当温度升到十亿度量级时，韧致辐射会大大增强，想要实现输出大于输入会变得异常艰难 [7]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-b6615dfc9b442b66bb796b7edc4c11c2_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="2000" data-rawheight="1500" data-original-token="v2-7e77a3cf138ea0fab02cbbdbce1711ab" data-default-watermark-src="https://pica.zhimg.com/50/v2-5b7d9979296d1ac8d7b746b0ac3f51ae_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2000" data-original="https://picx.zhimg.com/v2-b6615dfc9b442b66bb796b7edc4c11c2_r.jpg?source=1940ef5c">
  <figcaption>
   不同聚变反应的速度平均反应截面与温度的关系 [7]
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="aajEaUZD">如果使用氚，问题也是显然的。氚具有放射性，自然界中几乎天然不存在，人类的生产能力亦极其有限，而氚增殖所使用的锂，其资源也是有限的 [8]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>产物</b></h2>
 <p data-pid="hVxdz4wd">我们把核聚变的产物分为两类：带电的，以及，不带电的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="DSn79tye">带电的α粒子会被约束住，将能量沉积在等离子体中，实现加热，这是我们希望看到的。（如果将来反应堆能够实现自持也是基于这一点。）但α粒子又是一种杂质，需要被去除，否则会降低聚变反应率 [9]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="XjbciPZJ">不带电的中子不会被约束住，它们会撞击在周围的材料上（不管是什么），然后产生巨大的破坏。一方面，我们需要这些中子的能量来最终进行发电。另一方面，我们又想尽可能地屏蔽它们，以减少它们造成的损害。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>效率</b></h2>
 <p data-pid="iCQIcO8a">这其实是一个更加普遍的问题。从输入角度来讲，我们加热等离子体所用的射频波也好，中性束也好，激光也好，它们本身的功率都是要小于甚至远小于产生它们所消耗的电功率的。（ITER的输入功率是50MW，这是注入等离子体中的功率，但产生其所消耗的电功率要大得多，另外维持装置运行还要消耗近100MW的电功率。）从输出角度来讲，中子的能量转化为可被利用的热能的效率是有限的，而热力发电本身的效率我也无需多言。（顺便提一句，ITER预期的聚变功率是500MW。） [10]</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="34pG7fEr">时代的技术，物理的法则，限制了我们。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>成本</b></h2>
 <p data-pid="nHfBJT_B">核聚变会如何影响人类的能源结构？至少在现有的技术下，在还有其他选择的情况下，很难。考虑到建造、维护的巨大成本，以及最终的输出功率，它的单位电价应该不会如很多人预想的那样“接近免费”。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="L0emn73D">核聚变最主要的优势在于原料的丰富，当其他能源的原料逐渐耗尽时，这一优势就会显现出来。这一点倒也印证了Artsimovich的那句话，或许真的只有当全人类都需要的时候，聚变的能源才会变成现实吧。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h2><b>希望</b></h2>
 <p data-pid="AZrl-_WA">恒星依靠天然的引力实现了库伦势垒的跨越，也实现了近乎完美的约束。而我们却不得不依靠外加的能量以及强大的磁场，以期在地球上并不完美地复现这一过程。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="wej2kWDu">人类对恒星巨大能源的追求是值得尊重的，但这其中所遇到的前所未有的困难也是合乎常理的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="DoYSC9GV">如果我们看到了另一种可能性呢？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="EvISe8Wh">我一直相信，<b>那近乎无限的能量是真实存在的，它被自然锁在了那扇门后面。只是除了引力这把钥匙之外，我们需要找到另一把钥匙。而那把钥匙，自然也已经给了我们答案。</b></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="v6ZxJdMW"><b>希望是美好的，也许是人间至善，而美好的事物永不消逝。</b></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="7G5wnmE3">[1] <u><a href="https://link.zhihu.com/?target=http%3A//elementy.ru/nauchno-populyarnaya_biblioteka/430807" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">elementy.ru/nauchno-pop</span><span class="invisible">ulyarnaya_biblioteka/430807</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="8pXOiZnd">[2] <u><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Lawson_criterion" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/L</span><span class="invisible">awson_criterion</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="RSBFsIvZ">[3] Ikeda, Kaname. "ITER on the road to fusion energy." Nuclear Fusion 50.1 (2009): 014002.</p>
 <p data-pid="EuPPwoA0">[4] <u><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Superconducting_magnet" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/S</span><span class="invisible">uperconducting_magnet</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="VFSUnc7C">[5] <u><a href="https://link.zhihu.com/?target=https%3A//www.iter.org/factsfigures" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://www.</span><span class="visible">iter.org/factsfigures</span><span class="invisible"></span></a></u></p>
 <p data-pid="afirw8De">[6] <u><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Vlasov_equation" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/V</span><span class="invisible">lasov_equation</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="WOFO_8FZ">[7] <u><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Nuclear_fusion" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/N</span><span class="invisible">uclear_fusion</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="LBqGTRFV">[8] <u><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Tritium" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/T</span><span class="invisible">ritium</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="jpSsvcNU">[9] <u><a href="https://link.zhihu.com/?target=https%3A//www.euro-fusion.org/glossary/glossary-term/helium-ash/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://www.</span><span class="visible">euro-fusion.org/glossar</span><span class="invisible">y/glossary-term/helium-ash/</span><span class="ellipsis"></span></a></u></p>
 <p data-pid="1_ZJ4MJ_">[10] <u><a href="https://link.zhihu.com/?target=https%3A//thebulletin.org/2017/04/fusion-reactors-not-what-theyre-cracked-up-to-be/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">thebulletin.org/2017/04</span><span class="invisible">/fusion-reactors-not-what-theyre-cracked-up-to-be/</span><span class="ellipsis"></span></a></u></p>
</body>