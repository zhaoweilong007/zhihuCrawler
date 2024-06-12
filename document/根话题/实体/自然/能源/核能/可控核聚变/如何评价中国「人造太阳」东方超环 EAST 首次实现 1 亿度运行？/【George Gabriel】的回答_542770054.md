# 如何评价中国「人造太阳」东方超环 EAST 首次实现 1 亿度运行？
- 点赞数：7242
- 更新时间：2018年12月01日09时48分07秒
- 回答url：https://www.zhihu.com/question/302154372/answer/542770054
<body>
 <p data-pid="G9msBqiM">看了很多回答和评论，发现两件事，第一，大多数人对于可控核聚变的难度没有多少概念，第二，就题目本身来说，很多人对于这件事没有客观的认知。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PiZp7C3e">犹豫了很久，决定还是来写下这篇回答，算是献出知乎首答吧。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="fb3GrFDg">之前提到的两件事情其实也无可厚非，我想大家对于可控核聚变的了解一方面是来自其无限能源的美好许诺，另一方面则是永远五十年的调侃。加上媒体又时不时地搞出点“大新闻”，这种觉得好像马上要实现又好像遥遥无期的矛盾是可以理解的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="hlHOqF3T">下面就说第一件事，可控核聚变到底有多难？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="tPn2sDeC">这里我会写得不一样一点，以求大家既有直观的理解，又有具体的分析计算。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eqwFjcl0">首先，作为一种能源，可控核聚变最重要的指标一定是能量增益系数，我们称为Q，即聚变产生的能量与维持等离子体所消耗的能量的比值，通俗地说就是输出/输入。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vUDMNr6-">显然，Q要大于1，即输出大于输入，这件事情作为能源才有意义。而要让它成为有商业价值的能源则至少需要Q大于20 [1]（注意这里的输出还只是聚变输出的能量，而非最终产生的电能！）。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UCsgr6c2">上个世纪五十年代，英国物理学家Lawson提出了一个著名的判据（即Lawson判据），这个判据表明，如果想要Q大于1，等离子体的密度、温度、能量约束时间的乘积（即聚变三重积）应当大于一个定值 [2]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="nL68WLVl">这一点直观上很好理解，单位体积内的离子越多，运动越快，并且这个状态保持的时间越长，那么聚变发生的概率就越大。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="TXxcN_XT">这个值具体是多少呢？对于D-T聚变来说，温度为14keV时（1eV大约对应11600K，14keV大约是1.6亿度），三重积取到最小（之所以有这个条件是因为聚变反应截面是温度的函数），大约为 <img src="https://www.zhihu.com/equation?tex=3%5Ctimes10%5E%7B21%7D+%5Ctext%7BkeV%7D%5Ccdot+%5Ctext%7Bs%7D%2F%5Ctext%7Bm%7D%5E%7B3%7D" alt="3\times10^{21} \text{keV}\cdot \text{s}/\text{m}^{3}" eeimg="1"> [2]。即想要Q大于1，三重积必须超过这个值。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="JXXq9HRp">下面我们来做一点简单的计算。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="OLxdTLGg">首先，对于磁约束装置来说，或者更具体一点，对于托卡马克来说，我们用于约束等离子体的磁场是有限的（技术与成本的限制，而且提升磁场意味着消耗更多能量），即便使用超导，也不能超过临界磁场。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="0dUC53u8">一定强度的磁场含有一定大小的能量，物理上的术语是磁压，即磁场的能量密度。这里我们取一个大一点的值，5.3T，这是ITER的设计环向场大小 [3]，对应的磁压是 <img src="https://www.zhihu.com/equation?tex=p_%5Ctext%7Bmag%7D%3DB%5E2%2F%282%5Cmu_0%29%3D2.2%5Ctimes+10%5E7%5Ctext%7BJ%7D%2F%5Ctext%7Bm%7D%5E3" alt="p_\text{mag}=B^2/(2\mu_0)=2.2\times 10^7\text{J}/\text{m}^3" eeimg="1"> ，在等离子体物理中有一个概念叫比压（beta），即等离子体的热压与磁场的磁压的比值。对于托卡马克来说，beta必须小于1，否则等离子体会破裂 [4]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vnfHwpFt">这一点很好理解，等离子体的密度和温度越高，其热膨胀压力就越大，而我们用来约束的磁场及其所提供的磁压是有限的，所以等离子体的密度和温度的乘积必然有一个上限。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="6EkKf12l">我们假定beta为0.1（实际上绝大多数托卡马克的beta处在0.01的量级，球形托卡马克上最高可以达到0.4 [5]），按照上面的计算等离子体的热压应当满足 <img src="https://www.zhihu.com/equation?tex=p%3Dnk_%5Ctext%7BB%7DT%3D%5Cbeta+p_%5Ctext%7Bmag%7D%5Cleq+2.2%5Ctimes10%5E6%5Ctext%7BJ%7D%2F%5Ctext%7Bm%7D%5E3" alt="p=nk_\text{B}T=\beta p_\text{mag}\leq 2.2\times10^6\text{J}/\text{m}^3" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PfM1XExE">我们之前取的温度是14keV，在这个温度下，等离子体密度满足 <img src="https://www.zhihu.com/equation?tex=n%5Cleq+9.8%5Ctimes+10%5E%7B20%7D%5Ctext%7Bm%7D%5E%7B-3%7D" alt="n\leq 9.8\times 10^{20}\text{m}^{-3}" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="5JdSQzUF">好了，现在密度、温度都确定了，根据Lawson判据，想要实现最基本的输出大于输入，能量约束时间应当满足 <img src="https://www.zhihu.com/equation?tex=%5Ctau_%5Ctext%7BE%7D+%5Cgeq+0.2%5Ctext%7Bs%7D" alt="\tau_\text{E} \geq 0.2\text{s}" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="G1mVetDR">关键的地方来了，什么是能量约束时间？能量密度除以能量损失功率密度。那么对于温度是1.6亿度、密度是 <img src="https://www.zhihu.com/equation?tex=9.8%5Ctimes+10%5E%7B20%7D%5Ctext%7Bm%7D%5E%7B-3%7D" alt="9.8\times 10^{20}\text{m}^{-3}" eeimg="1"> 的等离子体来说能量损失功率密度有多强呢？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Yjg2m9Ai">大家可能会想到一个很简单的道理：物体温度越高，其辐射损失越强。这里需要说明的是，尽管聚变等离子体的密度看起来很吓人，但它依然是一种“稀薄”介质。学过高中化学都知道，空气的分子数密度是 <img src="https://www.zhihu.com/equation?tex=2.5%5Ctimes+10%5E%7B25%7D%5Ctext%7Bm%7D%5E%7B-3%7D" alt="2.5\times 10^{25}\text{m}^{-3}" eeimg="1"> ，所以聚变等离子体的密度只有空气分子数密度的不到万分之一，因此这里说的辐射并非黑体辐射。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="ig9UhIl_">聚变等离子体中存在几种辐射损失，包括：杂质产生的线辐射、带电粒子在磁场中运动产生的回旋辐射、库伦碰撞产生的韧致辐射等，我们这里只考虑占主要部分的韧致辐射，需要明白，这种辐射是无法避免的，也是无法减少的 [6]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="fDL6UAFD">韧致辐射的功率密度是 <img src="https://www.zhihu.com/equation?tex=S_%5Ctext%7BB%7D%3D5.35%5Ctimes+10%5E3Z_%5Ctext%7Beff%7Dn_%7B20%7D%5E2T_%5Ctext%7Bk%7D%5E%7B1%2F2%7D%5Ctext%7BW%7D%2F%5Ctext%7Bm%7D%5E3%3D1.9%5Ctimes+10%5E6%5Ctext%7BW%7D%2F%5Ctext%7Bm%7D%5E3" alt="S_\text{B}=5.35\times 10^3Z_\text{eff}n_{20}^2T_\text{k}^{1/2}\text{W}/\text{m}^3=1.9\times 10^6\text{W}/\text{m}^3" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="yTBnCUFC">聚变等离子体的能量密度是 <img src="https://www.zhihu.com/equation?tex=W%3D3nk_%5Ctext%7BB%7DT%3D6.6%5Ctimes10%5E6%5Ctext%7BJ%7D%2F%5Ctext%7Bm%7D%5E3" alt="W=3nk_\text{B}T=6.6\times10^6\text{J}/\text{m}^3" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="hbSU4duK">显然，由于我们只考虑韧致辐射，那么能量约束时间必然存在一个上限， <img src="https://www.zhihu.com/equation?tex=%5Ctau_%5Ctext%7BE%7D+%5Cleq+W%2FS_%5Ctext%7BB%7D%3D3.5%5Ctext%7Bs%7D" alt="\tau_\text{E} \leq W/S_\text{B}=3.5\text{s}" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="trGEAVWz"><b>现在事情比较清楚了，一方面，由于磁场及其提供的磁压是有限的，我们对于等离子体密度和温度的提升受到了限制，另一方面，为了实现能量增益，我们只能期望提升能量约束时间，而韧致辐射，无法避免且无法减少，同时随着密度和温度的升高而增强，则为能量约束时间设定了一个并不高的上限。</b></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="t2nZ96j5">大家可以想想，这一结果是在诸多理想化假设后得到的，而且仅仅是Q大于1，实际中想要实现Q大于20有多难，不言而喻。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="C4YAk7vN">这里从三重积的角度做了一点分析，其他的诸如等离子体不稳定性、第一壁、氚增殖、氦灰等问题就不赘述了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eb0fw8mA">现在来说第二件事。我觉得仅从几则新闻报道就去评价托卡马克的运行水平毕竟有失公允，这里给大家推荐一个网站：<a href="https://link.zhihu.com/?target=http%3A//www.tokamak.info/" class=" wrap external" target="_blank" rel="nofollow noreferrer">http://www.tokamak.info</a>，该网站记录了全世界历史上曾经建造的以及目前仍在运行的共226个托卡马克装置的信息。 <br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-fec0255cfb9673b1d0b1c11a2dd0b24e_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="862" data-rawheight="288" data-original-token="v2-3c8f68603e91802a0205db1c265a98ee" class="origin_image zh-lightbox-thumb" width="862" data-original="https://pica.zhimg.com/v2-fec0255cfb9673b1d0b1c11a2dd0b24e_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="7zIK_Aku">网站的最后一个部分是托卡马克的世界纪录，这里可以看到离子温度（5.2亿度）、能量约束时间、聚变三重积的记录由JT-60U保持，聚变输出功率的记录（16.1MW）由JET保持，而最长的H模放电记录（101.2s）由EAST保持。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-fa220fa479b323724dfbbb8dd9db2e56_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1430" data-rawheight="751" data-original-token="v2-d9bc28d3dc5f12f4f8a25cc215ddbcc2" class="origin_image zh-lightbox-thumb" width="1430" data-original="https://picx.zhimg.com/v2-fa220fa479b323724dfbbb8dd9db2e56_r.jpg?source=1940ef5c">
  <figcaption>
   托卡马克的世界纪录列表
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-59dd3055b43cc3f8a6601823dd7464ce_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="649" data-rawheight="404" data-original-token="v2-59dd3055b43cc3f8a6601823dd7464ce" class="origin_image zh-lightbox-thumb" width="649" data-original="https://pica.zhimg.com/v2-59dd3055b43cc3f8a6601823dd7464ce_r.jpg?source=1940ef5c">
  <figcaption>
   JT-60的诸多记录 [7]（1.25的Q值并不可信，日本作为战败国，无法进行D-T实验，JT-60上只进行了D-D实验，D-D实验得到的Q值是远小于1的，但换算到D-T就成了1.25。一般认为Q值的记录是JET的0.67。）
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="0F28OyNw">这里我们一方面要认识到差距的存在，但另一方面也没有必要妄自菲薄，毕竟JT-601985年开始运行，EAST2006年开始放电，起步晚了至少20年，能够取得这样的成就已经很了不起了，值得尊敬。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="znHAXx0u">插点题外话，下面这张图显示了近50年来不同装置聚变三重积的变化情况 [8]。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-de0f7b5dc4b3cf54d4b61acec631e83b_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="500" data-rawheight="358" data-original-token="v2-4f3397bb2b343a8c160eaba0432f8f63" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-de0f7b5dc4b3cf54d4b61acec631e83b_r.jpg?source=1940ef5c">
  <figcaption>
   近50年来聚变三重积的变化情况 [8]
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vyxO-0cM">应当说，这里的提升很大程度上归功于超导线圈以及高功率微波源和中性束技术的发展，夸张一点地说，现在的ITER和最初的托卡马克在本质上并无区别，只是装置更大、磁场更强、加热功率更高。但当这些技术发展缓慢时，如前面所分析，三重积的提升就会遇到瓶颈。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vhptYbYo"><b>最后要说的是，可控核聚变可能会是人类能源的圣杯，但驾驭恒星的能量绝不是那么理所当然，圣杯也没有办法解决人类社会的其他问题。我们能不能实现人类文明的飞跃，最终取决于我们是否足够了解我们自己。</b></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="7wBEienB">以上。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="U2ZgxyHv">参考列表（基本概念可以在维基百科上查询）</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="bOOF2a34">[1] <a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Fusion_energy_gain_factor" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/F</span><span class="invisible">usion_energy_gain_factor</span><span class="ellipsis"></span></a></p>
 <p data-pid="mLy5p3tm">[2] <a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Lawson_criterion" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/L</span><span class="invisible">awson_criterion</span><span class="ellipsis"></span></a></p>
 <p data-pid="GE7MPxD4">[3] <a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/ITER" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">en.wikipedia.org/wiki/I</span><span class="invisible">TER</span><span class="ellipsis"></span></a></p>
 <p data-pid="gihJ68vs">[4] Kenro Miyamoto, "Plasma Physics and Controlled Nuclear Fusion", Springer, 2005, pg. 62</p>
 <p data-pid="pyy7z6iD">[5] Alan Sykes, "The Development of the Spherical Tokamak", ICPP, Fukuoka September 2008</p>
 <p data-pid="e-UuWaDS">[6] Jeffrey Freidberg, "Plasma Physics and Fusion Energy", Cambridge University Press, 2007, pg. 51</p>
 <p data-pid="2RQvGHzr">[7] <a href="https://link.zhihu.com/?target=http%3A//www-jt60.naka.qst.go.jp/english/jt60/project/html/history.html" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">www-jt60.naka.qst.go.jp</span><span class="invisible">/english/jt60/project/html/history.html</span><span class="ellipsis"></span></a></p>
 <p data-pid="Sloco-iA">[8] <a href="https://link.zhihu.com/?target=https%3A//www.euro-fusion.org/news/detail/detail/News/50-years-of-lawson-criteria/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://www.</span><span class="visible">euro-fusion.org/news/de</span><span class="invisible">tail/detail/News/50-years-of-lawson-criteria/</span><span class="ellipsis"></span></a></p>
</body>