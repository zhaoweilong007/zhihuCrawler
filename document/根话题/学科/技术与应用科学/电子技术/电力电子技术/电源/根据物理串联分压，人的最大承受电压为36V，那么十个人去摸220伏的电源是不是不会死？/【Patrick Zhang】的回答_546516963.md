# 根据物理串联分压，人的最大承受电压为36V，那么十个人去摸220伏的电源是不是不会死？
- 点赞数：5694
- 更新时间：2018年12月15日07时35分14秒
- 回答url：https://www.zhihu.com/question/304374640/answer/546516963
<body>
 <p data-pid="oJ_oLK64">题主的这个问题有意思，估计题主是中学生吧，</p>
 <p data-pid="rK_knN7R">题主的这个呆问题，我还真切身体验过了。</p>
 <p data-pid="xlC36ady">那是我上初中的时候，班里几位傻呆学生，当然也包括我在内，我们也认为手拉手大家平均分摊电压，就不会触电。我们真的手拉手接触220V交流电，我的位置在中间，通电瞬间，接触相线的那位学生先电倒了，而大家包括中间的我一点反应也没有。为何？原来第一位学生的手脚对地体电阻远小于其他6位学生的串联体电阻，所以他出现了电击，同时不自觉甩手脱离了电源，其他人根本就没有影响。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-90eebc712542b5009e001031bdd22e72_720w.jpg?source=1940ef5c" data-rawwidth="1211" data-rawheight="572" data-size="normal" data-original-token="v2-c37981e6bb6d8fd3ee912e634341ecf4" data-default-watermark-src="https://pica.zhimg.com/50/v2-e94112b4ed609020305bd71a14b8ed49_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1211" data-original="https://picx.zhimg.com/v2-90eebc712542b5009e001031bdd22e72_r.jpg?source=1940ef5c">
  <figcaption>
   图1：傻冒电击试验
  </figcaption>
 </figure>
 <p data-pid="jJxJLvjF">为何会有这个想法？来自当年的一部神剧电影。电影里，几位通信班的士兵因为电话线断了，长度不够，大家就手拉手把身体当作电话导线，让电话电流通过身体，并且一点事也没有。对于初中生来说，以为电话线中的电压和配电电压等同，于是大家自然就认为7个人连在一起接触交流电肯定没事。</p>
 <p data-pid="k5rMIhj4">现在想想，这种做法也只有电影中才能出现。实际上，人体电阻很大，用手拉手的办法接通电话线，根本就行不通。</p>
 <p data-pid="b2VGu94I">说完笑话，来简单分析一下题主的错误认识在哪里。</p>
 <p data-pid="0w0VI7dE"><b>第一：人体承受的电击作用是用电流来定义的</b></p>
 <p data-pid="90Dkyr3s">根据GB/T 13870,1-2008《电流对人和家畜的效应 第1部分：通用部分》可知，对人体产生电击作用的主要是电流。触电电流与人体的体表电阻有关，见下图：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-fc5b01a8b5b0ed2eaefc7377238224b3_720w.jpg?source=1940ef5c" data-rawwidth="942" data-rawheight="514" data-size="normal" data-caption="" data-original-token="v2-021eca1ff4fd3106b926a08dd3c888c5" data-default-watermark-src="https://picx.zhimg.com/50/v2-da6c8ed45725a45db97ec9fb0b89d26b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="942" data-original="https://pica.zhimg.com/v2-fc5b01a8b5b0ed2eaefc7377238224b3_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="m7Tq_c8G">图中的30mA电流值是关键！流过人体的电流小于30mA，人体承受电击的感受就会好很多。</p>
 <p data-pid="eB0V_Hvl"><b>第二：36V电压是安全供电电压，但不是人体可以承受的最低接触电压</b></p>
 <p data-pid="Bo4x9QZ5">供电电压是由国家标准GB156《标准电压》规定的。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-98db6d793770fad80190d30291407335_720w.jpg?source=1940ef5c" data-rawwidth="631" data-rawheight="560" data-size="normal" data-caption="" data-original-token="v2-4ae8bef92a4f3d7b4510806e4eccae7a" data-default-watermark-src="https://pic1.zhimg.com/50/v2-a464312b9e29f535c1fd391e183b1b47_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="631" data-original="https://picx.zhimg.com/v2-98db6d793770fad80190d30291407335_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="t4ntWfRU">我们看到，36V电压与人体承受的最小电击电压没有什么关系。</p>
 <p data-pid="0hf2OzDx"><b>第三：国家标准规定的人体最小电击电压</b></p>
 <p data-pid="VTrd81QP">此电压的规定见GB16985《低压电气装置 第1部分：范围、目的和基本原则》，这个值是50V。</p>
 <p data-pid="kjcfvQu0"><b>第四：如何计算220V电压在7个人或者10个人分摊后的电压值？</b></p>
 <p data-pid="MVj2s3yL">我们知道，220V电压是有效值，它的最大值是： <img src="https://www.zhihu.com/equation?tex=%5Csqrt%7B2%7D%5Ctimes+220%5Capprox+1.414%5Ctimes+220%5Capprox+311.08V" alt="\sqrt{2}\times 220\approx 1.414\times 220\approx 311.08V" eeimg="1"> 。我们把它除以7，得到44.44V，小于50V。可见，若7个人分摊，这个值是小于人体最低电击电压的。这也是我们当年做傻呆试验的依据。</p>
 <p data-pid="Zcbb_tNR">如果是10个人承担，则每个人承受的电压是311.08/10=31.108V，这个值也小于50V安全电压。</p>
 <p data-pid="8_L1zyeF">由此可见，题主的基本概念薄弱，需要切实地加强学习哦！</p>
 <p data-pid="cSsxvDc8">==================</p>
 <p data-pid="1Suv0Kdd">看了评论，发现大家都没有讲到点子上。我在这里补充若干分析吧：</p>
 <p data-pid="Dp1fwcMf">我们看下图：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-5a45bb0a3bcc0882c6587991f800c38b_720w.jpg?source=1940ef5c" data-rawwidth="1313" data-rawheight="408" data-size="normal" data-original-token="v2-9684252629b14df0dc91a40f4998efe3" data-default-watermark-src="https://picx.zhimg.com/50/v2-1bee8e4a87cb36d3f07467249e30d399_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1313" data-original="https://pica.zhimg.com/v2-5a45bb0a3bcc0882c6587991f800c38b_r.jpg?source=1940ef5c">
  <figcaption>
   图2：7个人体电击电流分析
  </figcaption>
 </figure>
 <p data-pid="kgke_Jew">图2中，我们先来分析人体1的电流。</p>
 <p data-pid="TDUxjf8U">人体1的身体中有2条电流通路，其一是手到手通路，它的电流是Iss；其二是手到脚（大地）的电流通路，它的电流是It。</p>
 <p data-pid="Nea1ub_i">先看手到手的通路。</p>
 <p data-pid="AVl3ip-_">人手是有接触电阻的。人手的接触电阻与气候、湿度、出汗程度都有关。一般地，这个电阻不小于2千欧。</p>
 <p data-pid="hT3y5Fpo">我们从图2看到，人体1与火线之间有接触电阻，与人体2之间也有接触电阻。这条由7个人构成的人链从火线到零线单单接触电阻就可达到8X2=16千欧。</p>
 <p data-pid="TmgDQgT-">我们再看手到地的体电阻通路。为了分析方便，我把图2的人体1单独取出来，见图3：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e32d85f82c15baae8c58e60e43d2e7b5_720w.jpg?source=1940ef5c" data-rawwidth="517" data-rawheight="416" data-size="normal" data-original-token="v2-0be43380cd5fc4e1b3959b6bc060080e" data-default-watermark-src="https://pic1.zhimg.com/50/v2-5c20e00b34e97ed0a71b6e3f54c1354b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="517" data-original="https://picx.zhimg.com/v2-e32d85f82c15baae8c58e60e43d2e7b5_r.jpg?source=1940ef5c">
  <figcaption>
   图3：流过人体1的电流分析
  </figcaption>
 </figure>
 <p data-pid="kSMJyePr">体电流It分成两个支路，即左右脚支路，所以图2中的It=Ix1+Ix2。这里的Ix1和Ix2是流过鞋子的电流。</p>
 <p data-pid="wkoD1a1g">鞋子，其实是绝缘体。但由于鞋子上沾了灰尘和水汽，沿着鞋子的表面会有漏电流。我们把鞋子漏电流对应的电阻叫做绝缘电阻Rx，流过Rx的电流是Ir。</p>
 <p data-pid="ORVGXU9_">我们知道，对于交流电来说，鞋子的电容容抗才是它真正的通路。鞋子的容抗等效阻值相对于绝缘电阻Rx来说要小很多。</p>
 <p data-pid="deO2MjeK">我们来设想，两只电阻R1和R2并联，并且R1=10R2，那么并联电阻R等于多少？</p>
 <p data-pid="yk6Z0B4N"><img src="https://www.zhihu.com/equation?tex=R%3D%5Cfrac%7BR_1R_2%7D%7BR_1%2BR_2%7D%3D%5Cfrac%7B10R_2%5E2%7D%7B10R_2%2BR_2%7D%3D%5Cfrac%7B10%7D%7B11%7DR_2%5Capprox+0.91R_2%5Capprox+R_2" alt="R=\frac{R_1R_2}{R_1+R_2}=\frac{10R_2^2}{10R_2+R_2}=\frac{10}{11}R_2\approx 0.91R_2\approx R_2" eeimg="1"></p>
 <p data-pid="kxZFqvRO">也就是说，当并联电阻的阻值相差很大时，并联后的总电阻是由较小的那只电阻阻值决定的。</p>
 <p data-pid="vBBKwvqg"><b>由于电容容抗远远小于绝缘电阻，因此对地的电流是由电容电流决定的。又因为人体的左右两只鞋子的对地电容是并联关系，电容并联后的总电容值等于两只电容值的和。由此可见，关系式： </b><img src="https://www.zhihu.com/equation?tex=I_t%3DI_%7Bx1%7D%2BI_%7Bx2%7D" alt="I_t=I_{x1}+I_{x2}" eeimg="1"><b> 中的电流主体是电容电流。</b></p>
 <p data-pid="oi0esi8i"><b>故知，人体1的两支电流Iss和It中，It远大于Iss。可见，人体1承受的对地电击电流更大。</b></p>
 <p data-pid="TP3EeNk4"><b>相对人体1，人体2承受的电击电流会小很多，而且流过人体2的对地电容电流又会泄放掉大部分的电击电流。以至于人体3及以后的各个人体，几乎已经感觉不到电击的影响了。</b></p>
 <p data-pid="mJzKU_WB"><b>这就是我站在第4名中间位置而感受不到任何电击的原因。</b></p>
</body>