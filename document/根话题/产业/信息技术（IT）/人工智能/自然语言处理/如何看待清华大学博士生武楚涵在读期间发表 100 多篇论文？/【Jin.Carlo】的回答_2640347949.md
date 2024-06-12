# 如何看待清华大学博士生武楚涵在读期间发表 100 多篇论文？
- 点赞数：5677
- 更新时间：2023年11月05日11时28分37秒
- 回答url：https://www.zhihu.com/question/537342945/answer/2640347949
<body>
 <p data-pid="2p_8z6V-">这就像当初刚出GIoU loss时，我提出了一个DIoU，接着发现了CIoU有点效果但偏偏不写，而另新建一个tex文件继续写。接着又发现了一个改动EIoU也不错，还能借鉴focal loss的思想，再写一篇。接着又发现可以给它们加一个指数，理论性也有所进步，再写一篇alpha-IoU！我将这套思想搬到3D检测，再搞一个3D版IoU loss。于是凭我一己之力，整出了个IoU family，得到了集大成者3D-alpha-focal-EIoU。</p>
 <p data-pid="1SnECPvG">回过头，当初搞DIoU时发现它还可以应用到NMS中，得到DIoU-NMS，先新建一个tex再说。NMS只是改动模型推理阶段的后处理算法，无需对模型训练，随便整一个检测器都能改。这很方便地产生了大量的实验结果。</p>
 <p data-pid="cGyYFV-I">我们还对DIoU添加了一个指数β，可以获得更好的效果。有了DIoU-NMS，肯定也得来个CIoU-NMS啊，我们进一步替换DIoU为CIoU，发现在挑选合适的β时，可以更进一步。同理，还有EIoU，alpha-IoU等等选择，于是论文有了层次感。于是我们又整了篇“Enhancing geometric factors in Non-maximum suppression”</p>
 <p data-pid="zdw0Dw7I">这时候我们注意到实例分割算法YOLACT提出了一个Fast NMS算法，这是可利用GPU并行计算的NMS方法，可以加快后处理速度。于是，Fast-DIoU-NMS，Fast-CIoU-NMS，Fast-EIoU-NMS，以及Fast-alpha-IoU-NMS应运而生。我立即新建了一个tex，罗列出了这些针对提高NMS运行速度的方法，很快就投了出去，论文名叫“Improving non-maximum suppression with better IoU metric for real-time object detection”</p>
 <p data-pid="S0uz2pPn">这时候我们注意到如果给Fast NMS添加一个循环操作，得到Cluster-NMS，这可以与原始NMS的结果相同，不会丢失精度。于是有了Cluster-DIoU-NMS，Cluster-CIoU-NMS，Cluster-EIoU-NMS，Cluster-alpha-IoU-NMS。我们实现了比Fast NMS系列轻微降低一点运行速度的情况下，大幅度提升了模型的precision与recall。很顺利地，这篇论文就叫“Cluster-NMS: Faster and Better non-maximum suppresion for real-time object detection”</p>
 <p data-pid="v24Zva_8">紧接着，实例分割SOLOv2提出了一个可利用mask IoU来做NMS的Matrix NMS，我们如法炮制，将Mask的质心类比成box的中心点，同样可以引入distance的概念，利用边缘提取算法，还可得到mask的周长等等信息，而且Cluster NMS的循环操作思想也能用过来。话不多说，于是我们投了一篇“Geometric-based non-maximum suppression for real-time instance segmentation”</p>
 <p data-pid="n_6dxtaY">统计一下近期工作，一共投了DIoU一篇，CIoU一篇，EIoU一篇，alpha-IoU一篇，3D版本的IoU loss一篇，基于IoU family的NMS一篇，加速版的Fast NMS系列一篇，又快又好的Cluster-NMS系列一篇，针对实例分割的Matrix NMS系列一篇，共9篇，已经中的论文与其余论文互相结合一下扩期刊，没中的斐波那契投稿。</p>
 <p data-pid="GTZJi6h7">上述这些方法及其思想还可以应用到旋转检测，目标跟踪，多目标距离估计，还能利用IoU family搞label assign，知识蒸馏，只要有愿意帮忙的师弟，又会多出几篇。</p>
 <p data-pid="vlcwBpSn">最后搞了这么多，再来个rethinking IoU-based loss for object detection。</p>
 <p data-pid="H0NY9Q2F">一年中十几篇也不是很难，给我30块卡，以上这些工作半年以内就做完了</p>
 <p data-pid="_nNn_vS8">以上纯属娱乐</p>
 <p data-pid="a7o79YgH">其实你可以看到，每一篇工作确实都有效果，都更进了一步。由于内容很相似，几乎是同一个系列，所以论文写作必然也会是一个模板套路，有时为了节省力气也会套用句子，但作图与实验必然是不一样的，而且甚至我还可以整一个comparison，以比较我方法与之前方法的区别，确实也都是实打实的区别。</p>
 <p data-pid="Ho4jNI73">这一整套操作的核心，在于先发掘到一个可能有利于性能提高的点，然后用现有技术替换个遍。这个点如果站得住脚，一切都好说，如果不太站得住脚，就不得不使上一些trick了。</p>
 <ol>
  <li data-pid="YcZYQMd4">特殊升一般法：假设原算法为L，我发现了一个点H，这个点H有着一个说得通的逻辑(方便后面写故事)，如果成功，皆大欢喜。如果不那么容易成功，对H引入一个超参a，新算法则变为L+aH，或者L*H^a。显然，当a=0时，算法退化为原算法L，这意味着，最极端的情况是，a在整个实数域上变动，新算法的性能全部落后于原算法，且当a=0时取得最大值(原算法的性能)。这有可能吗？发生这种事的概率几乎为0。因为a=0是实数域中的一个非常特殊的点！也就是特殊情形。怎么可能算法恰好只在这一特殊情形下就表现最好呢？因此，调整超参a，可能它在a=0.123456时取得最高性能呢？使用二分法，可在数次实验中快速确定最佳参数a为0.125。</li>
  <li data-pid="2nse_yAl">排列组合法：在整个模型中，往往有多处地方可以引入H变量，因此有着多种排列组合方式。比如如果我要考虑两个box的中心点距离，我在label assign上可以考虑，我在loss function上可以考虑，我在后处理NMS上可以考虑，甚至得到了后处理后的结果了，我还能在它们即将进入性能评估之前，对box的分类得分使用有关于H的某种函数进行惩罚。这么多地方值得我考虑，只要有一个成功，就说明H这个点成功，论文story就可以写得很漂亮。大致就是说，前人都没考虑过某某问题和因素，to our best knowledge，we first propose。。。We first reveal that。。。总之就是体现一句话，我们是首创！世界之首创！前无古人！</li>
  <li data-pid="7bYdy9F1">多变量组合法：上述创新都是单变量的，我们可以使用多变量组合。例如，目标检测中分类与定位都很重要，于是我要综合考虑它们两个。假设他们是u和v，我同样引入两个超参a和b，得到a<i>u+b</i>v，或者u^a+v^b，或者u^a*<i>v^b，(u*exp(a))*(v*exp(b))，</i>再次应用特殊升一般法，不可能不成功。</li>
  <li data-pid="wdofOJ1f">动态法：在神经网络时代，没有什么是不能动态的。最简单的思路是利用神经网络自身的输出，作用一些归一化函数，softmax或者sigmoid，得到某个分数H，用这个分数H对之前的算法进行加权。同样，设原算法为L，我要考虑引入分数H，做法参考上面的流程。还是那句话，由于有特殊升一般法的坚实支撑，不可能不成功。成功了，我就声称，我们的算法是首个动态的，自适应算法，会随着训练动态调整，而不是以前那些静态算法可比的，它们都依赖于较强的先验知识。</li>
  <li data-pid="_Kyfu9Fv">即插即用法：原理与动态法相同，不过是从网络结构这个层面入手。使用一系列跳跃连接，注意力，上下采样，分组，维度对调，softmax重加权，点乘，对原模型的拓扑结构进行变换，能够起作用的大部分原因是因为蕴含了动态法的思想，依据其形式可类比出attention，特征融合，扩大感受野，获得长距离依赖关系建模能力等等不同的叫法。</li>
  <li data-pid="1PdgAUcd">重命名法：这是最终的不得已手段。例如我上面举例的Fast-DIoU-NMS，Fast-CIoU-NMS，这么直白地取这个名字，显得我们方法太过low b，只是结合性的，缝合性的，incremental改进。那怎么办，我确实只是将Fast NMS中的IoU metric替换为各种各样的IoU变体。而他们都是基于几何因子的，于是叫它Geometric NMS，简称G-NMS。再比如，实例分割中的基于Matrix NMS的变体应该怎么改名字呢？叫GM-NMS？不好，因为前面已经有了G-NMS，审稿人可能已经知道了。我需要再换一个字母，既能体现我的原创性，还能体现我方法的精髓，不妨叫Geometry-based Instance Suppression (GIS)。这里说个小插曲，当初我Cluster-NMS刚提出时，论文修改已经进入尾声，其实取名是Matrix NMS，毕竟是矩阵操作的NMS，然而很不巧的是那段时间突然SOLOv2带着Matrix NMS发布了出来，我很紧张地看了一下是不是撞idea了，幸好不是，但改名是必须的了。那怎么办？既然是基于几何因子的矩阵运算的NMS，可以叫Tensor NMS(基于张量的NMS)，可以是可以，但还不够有区分性。也可以叫Fast Matrix NMS，简称FM-NMS，但缝合味道太重。最终，我采纳了通讯作者的意见，由于我们算法是一次性对所有cluster的box做NMS，而无需循环遍历每一个cluster。因此，取名为Cluster-NMS。</li>
 </ol>
 <p data-pid="v0fmCvyT">值得一提的是，以上这些创新方法并不是水文的特征，很多经典论文也有其中的思想。例如，知识蒸馏鼻祖论文中，对分类网络的输出概率向量x，作用一个softmax函数，其引入了一个温度T，得到softmax(x/T)，这个T就是一个超参，通常对图像分类任务而言，T=5，10，15，20会比较好，这是一个经验值。显然，引入温度T这个操作正属于特殊升一般法，且还被冠名以温度(temperature)这种非常规的名称。</p>
 <p data-pid="ulFeIAIf">focal loss，对balanced CE loss引入权重项，大幅度降低背景位置的分类损失，其论文中也充斥着特殊升一般法，排列组合法。</p>
 <p data-pid="6JoIFTp2">再比如，分类任务中的长尾分布，使得头部类别分类好，尾部类别分类差，那么为解决类别不平衡问题，自然可以考虑利用某类别样本占全体样本的比值H，对loss重加权。此外，还可以对样本进行扰动，可以数据增强给尾部扩充更多样本。这里可以利用上面的6种创新套路，进行反复地设计表达式，调参，组合，套娃。</p>
 <p data-pid="wB5eCEhY">此外，在众多创新方法中，特殊升一般法实际上是一种非常智慧的创新套路，很多事物都是如此，原理简单，但蕴含的却是大智慧。在使用时需要咱们拿捏好尺度，拿捏得好就是“我们方法是原算法的推广，原算法是我们方法的特殊情形”，仿佛我们方法海纳百川，使得以前的算法都只是我们这个方法中的一个很特殊的小弟。而如果拿捏不好，则变成了耍小聪明，变成了调参，还要被人喷调参侠。这时候还有一个补救措施，叫做<b>超参数敏感性实验</b>(hyper-parameter sensitivity)，从而说明我们的方法对这个超参不敏感。</p>
 <p data-pid="XaIA9oAK">那要是对这个超参比较敏感呢？还有没有补救措施？还真有，考虑L*exp(a*H)</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-85e1c4b9168487f87502a2161ff07cdc_720w.jpg?source=1940ef5c" data-rawwidth="2015" data-rawheight="1420" data-size="normal" data-original-token="v2-cf7c31666a94859ceb3d0cc26546dcb2" data-default-watermark-src="https://picx.zhimg.com/50/v2-fe50fe52507a98117d378770545bb292_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2015" data-original="https://pic1.zhimg.com/v2-85e1c4b9168487f87502a2161ff07cdc_r.jpg?source=1940ef5c">
  <figcaption>
   初步调参，得到大致范围
  </figcaption>
 </figure>
 <p data-pid="C6wxfNtL">我们看到方法对a比较敏感，似乎在a=3与4之间取得比较好的效果，但还未超过baseline。</p>
 <p data-pid="yUTCBhM9">于是我们进一步精细调参，发现在a=3.4时表现不错，但其他的取值有点难以入眼，很难说明我们方法对超参a不敏感。而且a=3.2，3.4，3.6从曲线图来看也已经很接近了，那怎么办？</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-b010322f6fe24356e4a4eba5b59ba58f_720w.jpg?source=1940ef5c" data-rawwidth="2025" data-rawheight="1241" data-size="normal" data-original-token="v2-0885833a5b2b4ef7b7a418e5b5456283" data-default-watermark-src="https://picx.zhimg.com/50/v2-d4a4f75dc850fbcc073d220b28362930_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2025" data-original="https://picx.zhimg.com/v2-b010322f6fe24356e4a4eba5b59ba58f_r.jpg?source=1940ef5c">
  <figcaption>
   二次调参，成功，但对超参很敏感
  </figcaption>
 </figure>
 <p data-pid="rvsGSAF8">简单，把公式改为 <img src="https://www.zhihu.com/equation?tex=e%5E%7B-%5Cfrac%7BbH%7D%7B%5Cbeta%7D%7D" alt="e^{-\frac{bH}{\beta}}" eeimg="1"> ，其中 <img src="https://www.zhihu.com/equation?tex=b%3D%5Cbeta+a" alt="b=\beta a" eeimg="1"> ，这是什么？这不是很像拉普拉斯分布的形式吗？当 <img src="https://www.zhihu.com/equation?tex=%5Cbeta%3D1" alt="\beta=1" eeimg="1"> 时，就是上面的调参情形。而当 <img src="https://www.zhihu.com/equation?tex=%5Cbeta%3D4" alt="\beta=4" eeimg="1"> 时，参数取值也从3~4变成了12~16，这么做的目的是扩大参数区间。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-9621f7ea1434aad1a2c774037261da12_720w.jpg?source=1940ef5c" data-rawwidth="1624" data-rawheight="1013" data-size="normal" data-original-token="v2-bbda9bfa0aa7481be11eb0221d9b4580" data-default-watermark-src="https://picx.zhimg.com/50/v2-fac1c6dae331ac8bba66388bcfdf0ae7_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1624" data-original="https://pica.zhimg.com/v2-9621f7ea1434aad1a2c774037261da12_r.jpg?source=1940ef5c">
  <figcaption>
   这三种完全一样
  </figcaption>
 </figure>
 <p data-pid="00Yu7a1a">于是对b接着调。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2f0db66cf525f8e7be417b7deb993cf9_720w.jpg?source=1940ef5c" data-rawwidth="1581" data-rawheight="359" data-size="normal" data-original-token="v2-9f932bef92cbe490a88c313d41f8efdd" data-default-watermark-src="https://pica.zhimg.com/50/v2-caeb52a2d44a4398db4a9961b4600049_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1581" data-original="https://picx.zhimg.com/v2-2f0db66cf525f8e7be417b7deb993cf9_r.jpg?source=1940ef5c">
  <figcaption>
   等价放缩参数区间
  </figcaption>
 </figure>
 <p data-pid="4fVFwk1Y">终于，我获得了看起来对超参b不敏感的结果。</p>
 <p data-pid="WGjs4P6s">问题又来了，这样的参数区间b <img src="https://www.zhihu.com/equation?tex=%5Cin%5B12.8%2C14.4%5D" alt="\in[12.8,14.4]" eeimg="1"> 看起来有点丑啊。我最好是希望b=12.8能够对应于某个参数c=0，而b=14.4则对应于c=1.6，这样给人的感觉似乎我是在0~2这个区间上调的参。那怎么办？</p>
 <p data-pid="AAk6sPpR">简单，只需令 <img src="https://www.zhihu.com/equation?tex=c%3Db-12.8" alt="c=b-12.8" eeimg="1"> ，于是我们看一下对算法L魔改后的最终表达式</p>
 <p data-pid="nYgtaDeT"><img src="https://www.zhihu.com/equation?tex=L%2Ae%5E%7B-%5Cfrac%7Bc%2B12.8%7D%7B4%7DH%7D%3DL%2Ae%5E%7B-%5Cfrac%7Bc%7D%7B4%7DH-3.2H%7D%3DL%2Ae%5E%7B-%5Cfrac%7Bc%7D%7B4%7DH%7De%5E%7B-3.2H%7D" alt="L*e^{-\frac{c+12.8}{4}H}=L*e^{-\frac{c}{4}H-3.2H}=L*e^{-\frac{c}{4}H}e^{-3.2H}" eeimg="1"></p>
 <p data-pid="GD8KcVS0">接着，我把 <img src="https://www.zhihu.com/equation?tex=e%5E%7B-3.2H%7D" alt="e^{-3.2H}" eeimg="1"> 当成额外的权重项，在模型的其余部分记得乘上去就行了。例如，所考虑的算法L如果是损失函数的话，有太多地方可以偷偷乘上这个因子 <img src="https://www.zhihu.com/equation?tex=e%5E%7B-3.2H%7D" alt="e^{-3.2H}" eeimg="1">了，神不知鬼不觉。</p>
 <p data-pid="0pHCzana">最终，所提出的算法拥有一个该死的漂亮的简单的形式 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BLa%7D%280%2C%5Cbeta%29%5Csim+e%5E%7B-%5Cfrac%7BcH%7D%7B%5Cbeta%7D%7D" alt="\mathcal{La}(0,\beta)\sim e^{-\frac{cH}{\beta}}" eeimg="1"> ，且当 <img src="https://www.zhihu.com/equation?tex=%5Cbeta%3D4" alt="\beta=4" eeimg="1"> 时(默认参数)，在 <img src="https://www.zhihu.com/equation?tex=c%5Cin%5B0%2C2%5D" alt="c\in[0,2]" eeimg="1"> 上较为鲁棒。</p>
 <p data-pid="eNcHU1NQ">如果被人发现了，"为何你要在这个地方乘上权重 <img src="https://www.zhihu.com/equation?tex=%5Cgamma%3De%5E%7B-3.2H%7D" alt="\gamma=e^{-3.2H}" eeimg="1"> ?" 解释很简单：“我们发现，在这里乘上该默认因子，有助于模型获得稳健的性能。以往的方法通常在此处默认为1，实际上是次优的。” 于是，几乎没有人会去把你的<img src="https://www.zhihu.com/equation?tex=e%5E%7B-%5Cfrac%7BcH%7D%7B%5Cbeta%7D%7D" alt="e^{-\frac{cH}{\beta}}" eeimg="1">与<img src="https://www.zhihu.com/equation?tex=e%5E%7B-3.2H%7D" alt="e^{-3.2H}" eeimg="1">关联起来，特别是如果当这部分代码用不同的字母来表示变量时，故意写得又臭又长时，而且还被放置在看上去无关紧要的地方。逐渐地，未来的研究甚至把权重因子<img src="https://www.zhihu.com/equation?tex=e%5E%7B-3.2H%7D" alt="e^{-3.2H}" eeimg="1">当成一项默认的技术，无人关心。因为确实有了这个权重项后，模型在调参上更稳健了。后人纷纷将目光转向<img src="https://www.zhihu.com/equation?tex=e%5E%7B-%5Cfrac%7BcH%7D%7B%5Cbeta%7D%7D" alt="e^{-\frac{cH}{\beta}}" eeimg="1">这一项，并疯狂改进。</p>
 <p data-pid="uLJTLTaF">从这里不难看到，这样的骚操作，对社区是一种极大的误导。由于整个formulation的成功依赖于偷偷塞入的权重因子，而这个权重因子本身也是精细调参的产物，换句话说，是对这个数据集调参的产物。这导致一旦切换一个应用场景，那个权重因子立马失效，这对于其他人来说，很难发现到底是什么因素在从中作梗。(这里说多了，背后都有我数十甚至上百个GPU小时的爬坑经历。)</p>
 <p data-pid="-E5dgXyX">后人为了能够在新场景下应用，接着又对<img src="https://www.zhihu.com/equation?tex=e%5E%7B-%5Cfrac%7BcH%7D%7B%5Cbeta%7D%7D" alt="e^{-\frac{cH}{\beta}}" eeimg="1">这一项进行改动，引入更多的设计，但性能还是有可能受到当初那个权重因子的桎梏，使得调参困难。因为他当初扩大参数区间这一操作，变向地使人们很难在其他区间上进行有效调参，而被迫只能在对原数据集有利的这一区间上反复尝试。</p>
 <p data-pid="5nTy47yj">以上操作包括但不限于放缩区间，指数变换，对数变换，幂次变换，往拉普拉斯分布形式上靠，往高斯分布形式上靠等等等等。</p>
 <hr>
 <p data-pid="hVtuthzf">水与不水有时在方法上的界限没有那么清晰，问题在于，一篇论文是否抓住了某个问题的痛点，并采取了行之有效的方法缓解了这个痛点。从这个角度来看，经典论文无疑是创造性地发现了某个关键问题，这个问题阻碍了模型的性能。而水文，则是发现了一个无关痛痒的问题，这个问题并没有在很大程度上阻碍了模型的性能。甚至于，它们的泛化性还不够高，以至于切换场景后失效的可能性剧增。</p>
 <p data-pid="W-Fz1aRX">有人可能比较有疑问，为啥有那么多没什么创新的论文也能中呢？这最主要的原因，我认为是论文本身没有明显毛病，从论点的立意，行文的逻辑，实验的充分性，图表的美观性等各方面来看，嗯，没什么问题，无懈可击，你不能说他无效。这样的论文往往可获得超过borderline的均分。</p>
 <p data-pid="yrDTxoCO">把一个平凡的idea，做work，写好文章，甚至让人惊呼妙哉！本身就是一件不容易的事，作者很有可能在多次的实验中挖掘到了事物的本质，有了更深刻的见解，这样的论文并非水文。水的是把一个平凡的idea，做work，刷文章，没内涵，无法follow，让人味同嚼蜡</p>
 <p data-pid="dOzzbevp">还有一个很重要的点，开源，通常也可作为判断论文水与否的重要依据。下面举个例子，是我迄今为止见过的最好的一个开源。是关于深度均衡模型DEQ，及其拓展multi-scale DEQ</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-8c1076dbf052118ce35693300d148104_720w.jpg?source=1940ef5c" data-rawwidth="2520" data-rawheight="1622" data-size="normal" data-caption="" data-original-token="v2-16b2022789a8f221978e0fd09d32a019" data-default-watermark-src="https://pica.zhimg.com/50/v2-0d089ba87272539676503dd38944f447_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2520" data-original="https://picx.zhimg.com/v2-8c1076dbf052118ce35693300d148104_r.jpg?source=1940ef5c">
 </figure>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-ca90bb20dda3009b1e157c269d485fa0_720w.jpg?source=1940ef5c" data-rawwidth="2871" data-rawheight="1766" data-size="normal" data-original-token="v2-8c40fe79e80b6b60e30a0e14daa16cd5" data-default-watermark-src="https://pic1.zhimg.com/50/v2-4054c95c892581955a90ba785e72b4db_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2871" data-original="https://pic1.zhimg.com/v2-ca90bb20dda3009b1e157c269d485fa0_r.jpg?source=1940ef5c">
  <figcaption>
   项目代码主页
  </figcaption>
 </figure>
 <p data-pid="0TMXdqlc">项目主页560+⭐好像对于顶会论文也不算罕见吧，开源个代码与模型，也是很常规的做法吧？一般做到这两点就已经可以产生不小的影响力了，如果再勤于回答别人的问题，那就更好了。然而恐怖的是，在上图的最下方，有一个不起眼的小链接 <a href="https://link.zhihu.com/?target=http%3A//implicit-layers-tutorial.org/" class=" wrap external" target="_blank" rel="nofollow noreferrer">tutorial video &amp; colab notebooks here</a></p>
 <p data-pid="WAJaMnnP">打开之后你将看到</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-8e0148c6f477a5e77c9b3fbd2e34315c_720w.jpg?source=1940ef5c" data-rawwidth="2352" data-rawheight="1769" data-size="normal" data-original-token="v2-0834b350f27f6629eea9ce76011f00ae" data-default-watermark-src="https://pic1.zhimg.com/50/v2-cfdc4e005fb07b51509fe8d7802a2480_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2352" data-original="https://picx.zhimg.com/v2-8e0148c6f477a5e77c9b3fbd2e34315c_r.jpg?source=1940ef5c">
  <figcaption>
   教程网页
  </figcaption>
 </figure>
 <p data-pid="ITKaMbIL"><b>授人以鱼不如授人以渔。</b>在这个网页中，作者手把手教学，搞了一个傻瓜版教程(当然其实一点也不傻瓜)，从研究背景，基础理论推导，到算法原理，再到简单的示例，代码实操，结果分析，一条龙服务。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-01ecb978ee07e9e29a3cb4caae6e9770_720w.jpg?source=1940ef5c" data-rawwidth="2363" data-rawheight="1580" data-size="normal" data-original-token="v2-3362b26b6a131732f10281ebf3f35ca8" data-default-watermark-src="https://picx.zhimg.com/50/v2-2885b6226cc79f151e9ac87491b7c4e0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2363" data-original="https://pic1.zhimg.com/v2-01ecb978ee07e9e29a3cb4caae6e9770_r.jpg?source=1940ef5c">
  <figcaption>
   理论推导
  </figcaption>
 </figure>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-eca4b39980c9350982905af3b2904a3d_720w.jpg?source=1940ef5c" data-rawwidth="2363" data-rawheight="1512" data-size="normal" data-original-token="v2-85ab9f28b53ef754eab5a169225eebbe" data-default-watermark-src="https://pica.zhimg.com/50/v2-3eefce41bbc12b8f3d5532193a27f97a_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2363" data-original="https://pic1.zhimg.com/v2-eca4b39980c9350982905af3b2904a3d_r.jpg?source=1940ef5c">
  <figcaption>
   简单的代码演示
  </figcaption>
 </figure>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-2a42c1431c6fc0ae326498b684a5a780_720w.jpg?source=1940ef5c" data-rawwidth="2372" data-rawheight="1643" data-size="normal" data-original-token="v2-8c519a56c5a4aea040fcf25f5f4309ad" data-default-watermark-src="https://pica.zhimg.com/50/v2-0fde33e92f50ed9374cc5a651d219639_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2372" data-original="https://pic1.zhimg.com/v2-2a42c1431c6fc0ae326498b684a5a780_r.jpg?source=1940ef5c">
  <figcaption>
   结果分析
  </figcaption>
 </figure>
 <p data-pid="snkMb5FO">真的，作者仿佛生怕别人学不会，这硬核的教学，由浅入深，其内容之丰富，远超他的NeurIPS论文所展示的东西。我看论文一知半解的东西，以及对代码实现部分没有的头绪，在这个网页中全部迎刃而解。当然我也只能理解这里的三章内容，花了我两天时间才啃下来，其余内容则是Neural ODE以及优化方法等我不关心的东西。</p>
 <p data-pid="H-9Yi0ym">看到这样的开源，让人不禁感叹这才是科研之美啊，可谓是模范级研究者。</p>
 <p data-pid="w8t22U3-">和这样一个硬核的开源库比起来，我再审视我自己的开源库简直小巫见大巫。</p>
 <hr>
 <p data-pid="kZcMryfl">最后一个判断标志，毫无疑问是论文的影响力。影响力一方面体现在引用量上，另一方面也体现在传播与应用的广泛程度。一般来说，我们会认为citation超过一百表示一个工作不水，超过一千表示小有名气，超过两千表示在一个领域具有举足轻重的绝对贡献。</p>
 <p data-pid="6XJiQj7t">先前我一直持有这个想法，但万事并非绝对。我后来意识到这里一个很重要的因素显然没有被考虑进来，那就是技术难度系数。技术难度系数高会直接影响到使用技术的门槛拔高，最终影响到citation增长缓慢。就比如我上面举例的DEQ，光是要看懂那个教程，就需要一定的门槛与时间积累。</p>
 <p data-pid="BGKtQxtU">拿DIoU/CIoU举例来说，我一直认为这个创新工作虽然有点意思，但技术相对容易，因而更容易获得传播与应用。这导致观察它的引文，不难发现，DIoU吃到了让更多人发论文的红利，毕竟你替换个IoU metric还是非常简单的。而说到底一个边界框回归损失也并不是阻碍模型性能的关键因素，从YOLOv4论文来看，各IoU loss的差距都在零星的百分点上。因此，要判断一个工作水与否，仅从引用量也还是不够的。</p>
 <p data-pid="5PTCfFTK">个人认为，一篇论文如果能被大牛引用或使用，则可以代表这项工作获得了大牛的认可，是经得住考验的作品。因此，我也一直以自己的论文能够被大牛引用为目标。但其实，真正一个好的科研目标，应该是发现一个领域的困难点，并切实地将其往前推进了一步，它不应是只着眼于提高一两个百分点。相反，它要引发的是一个领域的新思想风暴，或者是改变人们以往的固有观念，或者是指明未来发展新方向。</p>
</body>