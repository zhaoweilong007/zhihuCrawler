# 图片里的这个东西真的会使人触电吗？
- 点赞数：5443
- 更新时间：2018年05月21日05时39分12秒
- 回答url：https://www.zhihu.com/question/50333203/answer/390455113
<body>
 <p data-pid="-Zli7E8N"><b>我的结论是：人体会被电到。至于严重程度要看具体情况。</b></p>
 <p data-pid="bgG12HA9">以下开始解答。按U形接触线接触插座的情况，我们分两种情形来讨论。</p>
 <p data-pid="VpNu8PgX"><b>情况1：Y形结构的U形接触线同时接触到火线和零线。</b></p>
 <p data-pid="vHuvOCuY">我们首先需要知道以下几点：</p>
 <p data-pid="YhEmcdMy"><b>第一：当线路发生短路时，电流很大，很小的线路电阻也会产生很大的电压。为此，线路的短路电阻和线路电阻不能再被忽略。</b></p>
 <p data-pid="6qcOYzZH">我们来计算这个Y结构U形接触线的线路电阻：</p>
 <p data-pid="cq59hX2n">一般地，插座两孔的中心距是15毫米。如果我们设图中的导线截面是1平方毫米，我们来计算题主所示导线的电阻。</p>
 <p data-pid="AOBnaCmg">观察题主的图，如下：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-a47ee3231456f916d807fde3b34f52b9_720w.jpg?source=1940ef5c" data-rawwidth="460" data-rawheight="206" data-size="normal" data-original-token="v2-969951efd2f4e5aeed9024ed36bb79cc" data-default-watermark-src="https://picx.zhimg.com/50/v2-4bb3f4df4e5ca93bb9ab07b2e953c23b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="460" data-original="https://picx.zhimg.com/v2-a47ee3231456f916d807fde3b34f52b9_r.jpg?source=1940ef5c">
  <figcaption>
   题主的图，似乎是美标插座
  </figcaption>
 </figure>
 <p data-pid="eR2hX4c6"><img src="https://www.zhihu.com/equation?tex=R%3D%5Crho%5Cfrac%7BL%7D%7BS%7D%3D1.7%5Ctimes+10%5E%7B-8%7D%5Ctimes+%5Cfrac%7B%282%5Ctimes+10%2B15%29%5Ctimes+10%5E%7B-3%7D%7D%7B1%5Ctimes+10%5E%7B-6%7D%7D%5Capprox+5.95%5Ctimes+10%5E%7B-4%7D%5COmega" alt="R=\rho\frac{L}{S}=1.7\times 10^{-8}\times \frac{(2\times 10+15)\times 10^{-3}}{1\times 10^{-6}}\approx 5.95\times 10^{-4}\Omega" eeimg="1"></p>
 <p data-pid="ge81KYAu">由此可知，这个U接触线的线路电阻小于0.6毫欧。</p>
 <p data-pid="nG0_knRq"><b>第二：我们知道配电网是无限大容量配电网。所谓无限大容量配电网，指的是当发生短路时，电网的线路阻抗只有短路点阻抗的1/50。</b></p>
 <p data-pid="f7-ksDs5"><b>由此可知，无限大容量配电网在短路前后电压基本不变。见本贴的附注内容。</b></p>
 <p data-pid="yCj1vNDh">虽然低压配电网不属于无限大容量配电网，但由于短路时间十分短暂，因此系统电压基本不变。</p>
 <p data-pid="oOfTuPI7">事实上，配电网的线路电阻是很小的。方便起见，我们姑且忽略掉配电网的线路电阻和电力变压器内阻，认为220V的电压直接加载在插座上。当我们把题主的Y形结构插入插座后，在U形接触线的导体内出现了短路电流：</p>
 <p data-pid="hNoaEkTx"><img src="https://www.zhihu.com/equation?tex=I_K%3D%5Cfrac%7BU%7D%7BR%7D%3D%5Cfrac%7B220%7D%7B5.95%5Ctimes+10%5E%7B-4%7D%7D%5Capprox+369748A+%5Capprox+370kA" alt="I_K=\frac{U}{R}=\frac{220}{5.95\times 10^{-4}}\approx 369748A \approx 370kA" eeimg="1"></p>
 <p data-pid="CciU34-j"><b>吓人的数值！不过，这里的计算未考虑线路电阻，实际短路电流值远远小于此值，能有10个千安就算到头了。</b></p>
 <p data-pid="OV7LKP4H">我们看到，人手的位置就在U形接触线导体的一半处，因此人手处的电压为：</p>
 <p data-pid="WXrWRj4q"><img src="https://www.zhihu.com/equation?tex=U_%7BMAN%7D%3D%5Cfrac%7B220%7D%7B2%7D%3D110Vac" alt="U_{MAN}=\frac{220}{2}=110Vac" eeimg="1"></p>
 <p data-pid="Sn7VXO5X">注意，这里的电压是有效值，它的最大值是 <img src="https://www.zhihu.com/equation?tex=%5Csqrt%7B2%7D%5Ctimes+110%3D155.54V" alt="\sqrt{2}\times 110=155.54V" eeimg="1"> 。</p>
 <p data-pid="ziIYmnfl">根据国家标准GB16895.21-2006《电气装置_第4-41部分：安全防护和电击防护》规定的安全电压是50V，而110V电压的有效值和最大值都远远大于50V，可见，人必定会被电击。</p>
 <p data-pid="lIdivozG">现在我们来考虑到配电网的线路电阻（阻抗）的影响。我们知道，与电力变压器直接相接的是一级配电系统，再下来在车间或者小区某个局部区域执行分配电能的是二级配电系统，最后入户的配电箱是三级配电系统。由于各级配电系统母线的影响，以及级间电缆的影响，配电网末端的短路电流大约在10kA左右。</p>
 <p data-pid="wNMpphN-">我们知道，在一级配电系统入口处，系统电压是400V/230V，这里的400V是线电压，230V是相电压。在配电网末端的用电设备处，标称电压是380V/220V，这里的380V是线电压，220V是相电压。</p>
 <p data-pid="m9Z2QWpb">这里的名词——系统电压和标称电压，是国家标准GB156《标准电压》中的称谓。</p>
 <p data-pid="dY8_hPN1">由于线路电阻压降的影响，越往配电网终端，运行中的线路压降越大，短路后的电压也越低。</p>
 <p data-pid="ji5e0p_J">当电路的末端发生了短路后，如果各级断路器均未保护，经过一段时间的过渡过程，短路电路进入到深沉短路状态。理论和实践告诉我们，在深沉短路状态下，电源处的电压为额定电压的50%，而线路侧的电压则下降到额定电压的15%。</p>
 <p data-pid="V3Jk05b-">这告诉我们，低压配电网并非是无限大容量配电系统。</p>
 <p data-pid="gKE3OBvH">在深沉短路状态下，插座处的电压为220X0.15=33V，它的一半是16.5V。显然，这个电压低于50V，当然不会使人受到电击了。</p>
 <p data-pid="crITGC6m">由于配电网末端的具体情况较为复杂，特别是变压器负载较重的情况下，深沉短路状态甚至在短路伊始时就出现。</p>
 <p data-pid="YAuqjFMP"><b>总结一下：</b></p>
 <p data-pid="BPMaXWal"><b>（1）我们把Y形结构插入插座，瞬间会出现110V的电压，让人体承受电击冲击。</b></p>
 <p data-pid="wuAeIAhN"><b>（2）如果Y形结构插入插座后线路未作保护，并且配电网因为负载较重而迅速进入深沉短路状态，则电压迅速下降到16.5V，此时的电压已经不会电人了。人体可以侥幸逃过一劫。</b></p>
 <p data-pid="7ER4eL1z">我们再看短路维持的时间。下图是家用微型断路器的脱扣曲线图：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-5d5b5fedeba3eb9b408e5709312aeb10_720w.jpg?source=1940ef5c" data-rawwidth="627" data-rawheight="568" data-caption="" data-size="normal" data-original-token="v2-870a5d5dace45b02e454b011ab4c47b3" data-default-watermark-src="https://picx.zhimg.com/50/v2-0a7d283e96cbaf6f55e4d36d2f8b10a3_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="627" data-original="https://picx.zhimg.com/v2-5d5b5fedeba3eb9b408e5709312aeb10_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="q0R47Gmh">我们设家庭主进线微型断路器的额定电流是40A，10倍额定电流倍数是400A，这个值远远小于10kA，因此断路器的短路保护动作值小于20毫秒。</p>
 <p data-pid="gMw8akSx">由此可知，人体触电的时间小于20毫秒。</p>
 <p data-pid="YqV6Jce2">再次提醒：家用微型断路器的分断容量一般为6到15kA。</p>
 <p data-pid="9NxWywxi"><b>情况2:Y形结构的U形接触线插入插座后只接触到火线或者零线</b></p>
 <p data-pid="lTMVUqS6">我们很容易想到，当U形接触线插入插座时，并不一定会同时接触到两个插座导电接触片。如此一来，Y形结构中就不会形成短路电流。</p>
 <p data-pid="bVjYDdrS">由题主给定的条件中我们看到系统中有火线和零线，这说明题主给定的电路接地形式是TN-C。考虑到许多知友根本就不知道绝大多数居家配电系统中根本就没有火线和零线，而是相线和N线。虽然在TN-C接地系统中是不可能安装漏电保护装置的，但我们按TN-C-S来考虑，认为系统中安装了漏电保护装置。如此一来，系统又会出现何种现象？</p>
 <p data-pid="qcqPtM0i"><b>说明一下：以下讨论中我违心地按题主的意思把相线叫做火线，把N线叫做零线，姑且将错就错吧。</b></p>
 <p data-pid="g4fITl06"><b>1）设Y形结构的右侧接触线首先接触到火线，220V电压将加到人体上。</b></p>
 <p data-pid="OeZkT3OG">为了弄懂原理，我们看下图：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-b8881a25656ab98a3b240a382fb03eca_720w.jpg?source=1940ef5c" data-rawwidth="720" data-rawheight="351" data-caption="" data-size="normal" data-original-token="v2-36fde79a65a6ea35bbfc5270952f2657" data-default-watermark-src="https://picx.zhimg.com/50/v2-55606d93d6e30db4966915dce590be31_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="720" data-original="https://pic1.zhimg.com/v2-b8881a25656ab98a3b240a382fb03eca_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="4ggemTW_">先看a图。图中左侧是火线，右侧是零线PEN。在正常使用时，火线中的电流IL与零线中的电流Ipen大小相等方向相反，因此零序电流互感器的铁芯中不会产生磁通。</p>
 <p data-pid="a2Y6KTo6">注意到a图中的用电设备外壳接到零线，也即保护接零。当火线对用电设备的外壳发生漏电时，漏电流是Ig。我们看到火线中的电流是IL+Ig，零线中的电流是Ipen+Ig，它们依旧是大小相等方向相反，漏电保护器依然不会动作。这也是TN-C系统中不建议配漏电保护器的原因——此时的漏电保护器是一个摆设。</p>
 <p data-pid="W8hQLKG8">我们再看b图。人体从外部接触到已经漏电的用电设备外壳，通过人体的漏电电流是Ig，于是火线中的电流是IL+Ig，而零线中的电流依然是Ipen。如此一来，我们发现漏电保护器的零序电流互感器铁芯中有了磁通，于是漏电保护器就有了保护动作的可能性。当然，此时通过人体流向地面的电流必须大于漏电保护器的动作电流。</p>
 <p data-pid="qmsoco6P">我们设Y形结构的U形接触线右边的一支首先接触到插座内的火线，如果系统中安装了漏电保护器，则漏电保护器将动作。当然，在这里把人体当成接往地线的载流导体了，人会被电击得够呛。</p>
 <p data-pid="PeDUhaKF"><b>2）如果Y形结构的U形接触线左边的一支首先接触到插座内的零线，则因为零线的电位接近于零，因此人体不会发生任何电击现象。</b></p>
 <p data-pid="4SA61A6j">===================</p>
 <p data-pid="N6RMWd76"><b>附注：</b></p>
 <p data-pid="04fOx7l2">以下给大家建立一些重要概念。</p>
 <p data-pid="72vlEgWY"><b>第一：导线是有电阻的！</b></p>
 <p data-pid="c0QZRcvz">在一般性的计算时无需考虑导线电阻，但在计算短路电流时，因为电流很大，此时不能忽略线路电阻（阻抗）的影响。</p>
 <p data-pid="YDG0Fdcp"><b>第二：要知道什么是火线，什么是零线。事实上，一般的居家配电系统内，根本就没有零线，而是中性线。中性线与零线不是一回事。</b></p>
 <p data-pid="rdC0mQCj">中性线是可以进开关的，但零线绝对不允许进开关，这是国家标准GB50054《低压配电设计规范》中强制规定的。</p>
 <p data-pid="MQq888Ih">零线进开关后，另一侧零线可能会出现较高的电压。又因为许多用电电器的外壳保护接零，零线的高压可能伤害到人体，故有此规定。</p>
 <p data-pid="I2UOVCbm">相线与火线倒是一致的。</p>
 <p data-pid="PCuQcFcN">关于TN-C接地系统以及火线和零线的说明，见我的文章：</p><a data-draft-node="block" data-draft-type="link-card" href="https://zhuanlan.zhihu.com/p/23159113" data-image="https://pic2.zhimg.com/v2-c50a5bb2c20ba12fb6056210fe780acd_180x120.jpg" data-image-width="1002" data-image-height="438" class="internal">Patrick Zhang：浅谈接地5——居家配电的接地问题</a>
 <p data-pid="5X76jRKm"><b>第三：有些人以为220V交流电压就是正220V和负220V的脉冲合成，却不知道220V交流电压其实是有效值，并且它的最大值是1.414X220=311.08V。交流电流也类似。</b></p>
 <p data-pid="3VijF-mP">一般地，计算短路电流电动力时要用最大值来计算，而计算短路电流的热冲击时要用有效值来计算。</p>
 <p data-pid="Zc4CT1lH"><b>第四：配电电压中有36V的安全电压，这是GB156《标准电压》中规定的。在本帖中出现的人体保护50V安全电压，是GB16895低压接地系统系列标准规定的，两者不是一回事。</b></p>
 <p data-pid="SFmiY9hu"><b>第五：关于无限大容量配电网的概念</b></p>
 <p data-pid="SwAem1q6">对于电源E，如果电源内阻和线路电阻为r，负载电阻为R，则由中学所学的全电路计算，负载电阻R两端的电压U为：</p>
 <p data-pid="yVW8nsUg"><img src="https://www.zhihu.com/equation?tex=U%3D%5Cfrac%7BER%7D%7Br%2BR%7D%3D%5Cfrac%7BE%7D%7B%5Cfrac%7Br%7D%7BR%7D%2B1%7D" alt="U=\frac{ER}{r+R}=\frac{E}{\frac{r}{R}+1}" eeimg="1"></p>
 <p data-pid="pNlhZfI9">正常运行时，由于电源内阻与线路电阻之和远远小于负载电阻，为百分之一的水平，完全可以忽略不计，于是正常运行时的电压 <img src="https://www.zhihu.com/equation?tex=U_%7BUSE%7D" alt="U_{USE}" eeimg="1"> 为：</p>
 <p data-pid="DHWSw3Qa"><img src="https://www.zhihu.com/equation?tex=U_%7BUSE%7D%3D%5Cfrac%7BE%7D%7B%5Cfrac%7Br%7D%7BR%7D%2B1%7D%5Capprox+%5Cfrac%7BE%7D%7B%5Cfrac%7BR%7D%7B100R%7D%2B1%7D%5Capprox+0.99E%5Capprox+E" alt="U_{USE}=\frac{E}{\frac{r}{R}+1}\approx \frac{E}{\frac{R}{100R}+1}\approx 0.99E\approx E" eeimg="1"></p>
 <p data-pid="9p71rm6c">如果短路后的线路电阻小于短路点电阻Rk的1/50，则短路后负载侧的电压Uk为：</p>
 <p data-pid="-m_JyWBS"><img src="https://www.zhihu.com/equation?tex=U_K%3D%5Cfrac%7BE%7D%7B%5Cfrac%7Br%7D%7BR_K%7D%2B1%7D%3D%5Cfrac%7BE%7D%7B%5Cfrac%7BR_K%7D%7B50R_K%7D%2B1%7D%5Capprox+0.98E%5Capprox+E" alt="U_K=\frac{E}{\frac{r}{R_K}+1}=\frac{E}{\frac{R_K}{50R_K}+1}\approx 0.98E\approx E" eeimg="1"></p>
 <p data-pid="par-Zi-S">可见，在短路后的负载侧电压与短路前相比，几乎相等。也因此，我们把这种配电网叫做无限大容量配电网。</p>
 <p data-pid="miIoyjdE">我们平时见到的中压和高压配电网均为无限大容量配电网。对于低压配电网，在短路后很短的时间（接近断路器的短路保护开断时间）内，也近似满足无限大容量配电网的特征。</p>
</body>