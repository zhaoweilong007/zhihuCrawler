# 如何理解 Graph Convolutional Network（GCN）？
- 点赞数：10772
- 更新时间：2022年09月07日11时02分05秒
- 回答url：https://www.zhihu.com/question/54504471/answer/332657604
<body>
 <p data-pid="y_DEj2-C"></p>
 <p data-pid="EfxzP654">从CNN到GCN的联系与区别——GCN从入门到精（fang）通（qi）</p>
 <h2>1 什么是离散卷积？CNN中卷积发挥什么作用？</h2>
 <p data-pid="1mm9yVqO">了解GCN之前必须对离散卷积（或者说CNN中的卷积）有一个明确的认识：</p>
 <p data-pid="SQDbjd1q"><a href="https://www.zhihu.com/question/22298352" class="internal">如何通俗易懂地解释卷积？</a>这个链接的内容已经讲得很清楚了，<b>离散卷积本质就是一种加权求和。</b></p>
 <p data-pid="4CoYc_a_">如图1所示，CNN中的卷积本质上就是利用一个共享参数的过滤器（kernel），<b>通过计算中心像素点以及相邻像素点的加权和来构成feature map实现空间特征的提取</b>，当然加权系数就是卷积核的权重系数。</p>
 <p data-pid="oNdJUR7d">那么卷积核的系数如何确定的呢？是随机化初值，然后根据误差函数通过反向传播梯度下降进行迭代优化。这是一个关键点，<b>卷积核的参数通过优化求出才能实现特征提取的作用，GCN的理论很大一部分工作就是为了引入可以优化的卷积参数。</b></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-394cb7b5f6dfb23dcddd838ebdee548b_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="736" data-rawheight="452" data-original-token="v2-394cb7b5f6dfb23dcddd838ebdee548b" class="origin_image zh-lightbox-thumb" width="736" data-original="https://pic1.zhimg.com/v2-394cb7b5f6dfb23dcddd838ebdee548b_r.jpg?source=1940ef5c">
  <figcaption>
   图1 CNN中卷积提取feature map示意图
  </figcaption>
 </figure>
 <p data-pid="O74qygLi"><b>注：这里的卷积是指深度学习（CNN）中的卷积，与数学中定义的卷积运算严格意义上是有区别的。两者的区别与联系可以见我的另一个回答。</b></p><a href="https://www.zhihu.com/question/52237725/answer/545340892" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-8cc54a59fbf8b1347e3315ac5c455168_720w.jpg" data-image-width="356" data-image-height="151" class="internal">哪位高手能解释一下卷积神经网络的卷积核？</a>
 <h2>2 GCN中的Graph指什么？为什么要研究GCN？</h2>
 <p data-pid="mr6NR-G4">CNN是Computer Vision里的大法宝，效果为什么好呢？原因在上面已经分析过了，可以很有效地提取空间特征。但是有一点需要注意：<b>CNN处理的图像或者视频数据中像素点（pixel）是排列成成很整齐的矩阵</b>（如图2所示，也就是很多论文中所提到的Euclidean Structure）。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-85d93d60cb11dddd64a288bff6688cfc_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1053" data-rawheight="220" data-original-token="v2-85d93d60cb11dddd64a288bff6688cfc" class="origin_image zh-lightbox-thumb" width="1053" data-original="https://pic1.zhimg.com/v2-85d93d60cb11dddd64a288bff6688cfc_r.jpg?source=1940ef5c">
  <figcaption>
   图2 图像矩阵示意图（Euclidean Structure）
  </figcaption>
 </figure>
 <p data-pid="C5jdEIHy">与之相对应，科学研究中还有很多Non Euclidean Structure的数据，如图3所示。社交网络、信息网络中有很多类似的结构。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-f940bce70fb412c75c43ec239b76ee88_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="314" data-rawheight="207" data-original-token="v2-f940bce70fb412c75c43ec239b76ee88" class="content_image" width="314">
  <figcaption>
   图3 社交网络拓扑示意（Non Euclidean Structure）
  </figcaption>
 </figure>
 <p data-pid="jiiVT2f0">实际上，这样的网络结构（Non Euclidean Structure）就是图论中抽象意义上的拓扑图。</p>
 <p data-pid="8rGviBmq">所以，<b>Graph Convolutional Network中的Graph是指数学（图论）中的用顶点和边建立相应关系的拓扑图。</b></p>
 <p data-pid="NQ8pAdgh">那么为什么要研究GCN？原因有三：</p>
 <p data-pid="CT8bQntJ"><b>(1)</b>CNN无法直接处理Non Euclidean Structure的数据。通俗理解就是在拓扑图中每个顶点的相邻顶点数目都可能不同，那么当然无法用一个同样尺寸的卷积核来进行卷积运算。</p>
 <p data-pid="7VxmKs5T"><b>(2)</b>由于CNN无法处理Non Euclidean Structure的数据，又<b>希望在这样的数据结构（拓扑图）上有效地提取空间特征来进行机器学习</b>，所以GCN成为了研究的重点。</p>
 <p data-pid="xcAASxFJ"><b>(3)</b>读到这里大家可能会想，自己的研究问题中没有拓扑结构的网络，那是不是根本就不会用到GCN呢？其实不然，<b>广义上来讲任何数据在赋范空间内都可以建立拓扑关联，谱聚类就是应用了这样的思想</b>（<a href="https://link.zhihu.com/?target=https%3A//www.cnblogs.com/pinard/p/6221564.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">谱聚类（spectral clustering）原理总结</a>）。<b>所以说拓扑连接是一种广义的数据结构，GCN有很大的应用空间。</b></p>
 <p data-pid="i95gb_Bq">综上所述，GCN是要为除CV、NLP之外的任务提供一种处理、研究的模型。</p>
 <h2>3 提取拓扑图空间特征的两种方式</h2>
 <p data-pid="T12aoIXb">GCN的本质目的就是用来提取拓扑图的空间特征，那么实现这个目标只有graph convolution这一种途径吗？当然不是，在vertex domain(spatial domain)和spectral domain实现目标是两种最主流的方式。</p>
 <h3>3.1 空间维度</h3>
 <p data-pid="Jr-YUSwJ"><b>Vertex domain</b>(spatial domain)是非常直观的一种方式。顾名思义：提取拓扑图上的空间特征，那么就把每个顶点相邻的neighbors找出来。这里面蕴含的科学问题有二：</p>
 <p data-pid="gmC9FlTS">a.按照什么条件去找中心vertex的neighbors，也就是如何确定receptive field？</p>
 <p data-pid="Fx8nQi1r">b.确定receptive field，按照什么方式处理包含不同数目neighbors的特征？</p>
 <p data-pid="ncgA6Ll1">根据a,b两个问题设计算法，就可以实现目标了。推荐阅读这篇文章<a href="https://link.zhihu.com/?target=http%3A//proceedings.mlr.press/v48/niepert16.pdf" class=" wrap external" target="_blank" rel="nofollow noreferrer">Learning Convolutional Neural Networks for Graphs</a>（图4是其中一张图片，可以看出大致的思路）。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-22e5b58b959d22eaf838ed4238ec2716_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="667" data-rawheight="107" data-original-token="v2-22e5b58b959d22eaf838ed4238ec2716" class="origin_image zh-lightbox-thumb" width="667" data-original="https://pic1.zhimg.com/v2-22e5b58b959d22eaf838ed4238ec2716_r.jpg?source=1940ef5c">
  <figcaption>
   图4 vertex domain提取空间特征示意
  </figcaption>
 </figure>
 <p data-pid="axEdZLsr">这种方法主要的缺点如下：</p>
 <p data-pid="OQSPxy1x">c.每个顶点提取出来的neighbors不同，使得计算处理必须针对每个顶点</p>
 <p data-pid="qUP6g0Rh">d.提取特征的效果可能没有卷积好</p>
 <p data-pid="GGVvJPDp">当然，对这个思路喜欢的读者可以继续搜索相关文献，学术的魅力在于百家争鸣嘛！</p>
 <h3>3.2 图谱维度</h3>
 <p data-pid="Xcw_1A-7"><b>Spectral domain</b>就是GCN的理论基础了。这种思路就是希望借助图谱的理论来实现拓扑图上的卷积操作。从整个研究的时间进程来看：首先研究GSP（graph signal processing）的学者定义了graph上的Fourier Transformation，进而定义了graph上的Convolution，最后与深度学习结合提出了Graph Convolutional Network。</p>
 <p data-pid="cfpgp2Eb"><b>从上面的介绍可以看出，从vertex domain分析问题，需要逐节点（node-wise）的处理，而图结构是非欧式的连接关系，这在很多场景下会有明显的局限性。</b></p>
 <p data-pid="DxPswwK6"><b>而spectral domain是将问题转换在“频域”里分析，不再需要node-wise的处理，对于很多场景能带来意想不到的便利，也成为了GSP的基础。</b></p>
 <p data-pid="adx0HBCS">关于Spectral graph theory的具体介绍，可以参下面的一些资料，简单的概括就是<b>借助于图的拉普拉斯矩阵的特征值和特征向量来研究图的性质。</b></p>
 <p data-pid="lHBiFSuZ"><a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Spectral_graph_theory" class=" wrap external" target="_blank" rel="nofollow noreferrer">Spectral graph theory</a></p>
 <p data-pid="kKzovz7E"><a href="https://zhuanlan.zhihu.com/p/80817719" class="internal">小杰：谱图理论(spectral graph theory)</a></p>
 <h2>4 什么是拉普拉斯矩阵？为什么GCN要用拉普拉斯矩阵？</h2>
 <p data-pid="0s7JzbcT">Graph Fourier Transformation及Graph Convolution的定义都用到图的拉普拉斯矩阵，那么首先来介绍一下拉普拉斯矩阵。</p>
 <p data-pid="P4bd86YH">对于图 <img src="https://www.zhihu.com/equation?tex=G%3D%28V%2CE%29" alt="G=(V,E)" eeimg="1">，其Laplacian矩阵的定义为 <img src="https://www.zhihu.com/equation?tex=L%3DD-A" alt="L=D-A" eeimg="1">，其中 <img src="https://www.zhihu.com/equation?tex=L" alt="L" eeimg="1"> 是Laplacian 矩阵， <img src="https://www.zhihu.com/equation?tex=D" alt="D" eeimg="1"> 是顶点的度矩阵（对角矩阵），对角线上元素依次为各个顶点的度， <img src="https://www.zhihu.com/equation?tex=A" alt="A" eeimg="1"> 是图的邻接矩阵。看图5的示例，就能很快知道Laplacian 矩阵的计算方法。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-5f9cf5fdeed19b63e1079ed2b87617b4_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="724" data-rawheight="158" data-original-token="v2-5f9cf5fdeed19b63e1079ed2b87617b4" class="origin_image zh-lightbox-thumb" width="724" data-original="https://picx.zhimg.com/v2-5f9cf5fdeed19b63e1079ed2b87617b4_r.jpg?source=1940ef5c">
  <figcaption>
   图5 Laplacian 矩阵的计算方法
  </figcaption>
 </figure>
 <p data-pid="-qzvyf1w">这里要说明的是：<b>常用的拉普拉斯矩阵实际有三种：</b></p>
 <p data-pid="9_vDFbAd">No.1 <img src="https://www.zhihu.com/equation?tex=L%3DD-A" alt="L=D-A" eeimg="1"> 定义的Laplacian 矩阵更专业的名称叫<b>Combinatorial Laplacian</b></p>
 <p data-pid="JW5ATPMY">No.2 <img src="https://www.zhihu.com/equation?tex=L%5E%7Bsys%7D%3DD%5E%7B-1%2F2%7DLD%5E%7B-1%2F2%7D" alt="L^{sys}=D^{-1/2}LD^{-1/2}" eeimg="1"> 定义的叫<b>Symmetric normalized Laplacian</b>，很多GCN的论文中应用的是这种拉普拉斯矩阵</p>
 <p data-pid="K2-ONPwt">No.3 <img src="https://www.zhihu.com/equation?tex=L%5E%7Brw%7D%3DD%5E%7B-1%7DL" alt="L^{rw}=D^{-1}L" eeimg="1"> 定义的叫<b>Random walk normalized Laplacian</b>,有读者的留言说看到了<b>Graph Convolution与Diffusion相似之处</b>，当然从Random walk normalized Laplacian就能看出了两者确有相似之处（<b>其实两者只差一个相似矩阵的变换</b>，可以参考<a href="https://link.zhihu.com/?target=http%3A//xueshu.baidu.com/s%3Fwd%3Dpaperuri%253A%25288af8fce8a9b965967468077a940e2ff6%2529%26filter%3Dsc_long_sign%26tn%3DSE_xueshusource_2kduw22v%26sc_vurl%3Dhttp%253A%252F%252Farxiv.org%252Fabs%252F1511.02136%26ie%3Dutf-8%26sc_us%3D16464359650999541607" class=" wrap external" target="_blank" rel="nofollow noreferrer">Diffusion-Convolutional Neural Networks</a>，以及下图）</p>
 <p data-pid="ovLDv4VW"><b>不需要相关内容的读者可以略过此部分</b></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-87d2a1539a2976e3b9f70119427e9d2a_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="578" data-rawheight="279" data-original-token="v2-87d2a1539a2976e3b9f70119427e9d2a" class="origin_image zh-lightbox-thumb" width="578" data-original="https://picx.zhimg.com/v2-87d2a1539a2976e3b9f70119427e9d2a_r.jpg?source=1940ef5c">
  <figcaption>
   Diffusion Graph Convolution与Spectral Graph Convolution相似性证明
  </figcaption>
 </figure>
 <p data-pid="If4_qqtt">其实维基本科对<a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Laplacian_matrix" class=" wrap external" target="_blank" rel="nofollow noreferrer">Laplacian matrix</a>的定义上写得很清楚，<b>国内的一些介绍中只有第一种定义</b>。这让我在最初看文献的过程中感到一些的困惑，特意写下来，帮助大家避免再遇到类似的问题。</p>
 <p data-pid="amdamLBS"><b>为什么GCN要用拉普拉斯矩阵？</b></p>
 <p data-pid="h_y578kE">拉普拉斯矩阵矩阵有很多良好的性质，这里写三点我感触到的和GCN有关之处：</p>
 <p data-pid="EWm2-WEZ"><b>(1)拉普拉斯矩阵是对称矩阵，可以进行特征分解（谱分解），这就和GCN的spectral domain对应上了</b></p>
 <p data-pid="T24i4lXj"><b>(2)拉普拉斯矩阵只在中心顶点和一阶相连的顶点上（1-hop neighbor）有非0元素，其余之处均为0</b></p>
 <p data-pid="DxAop0U8"><b>(3)通过拉普拉斯算子与拉普拉斯矩阵进行类比（详见第6节）</b></p>
 <p data-pid="wQMp_NkQ">两者的关系可以参考我的另一个文章：</p><a href="https://zhuanlan.zhihu.com/p/85287578" data-draft-node="block" data-draft-type="link-card" data-image="https://pic3.zhimg.com/v2-8e5b7fbfda286a923034cd14a3f407ce_720w.jpg" data-image-width="375" data-image-height="327" class="internal">superbrother：拉普拉斯矩阵与拉普拉斯算子的关系</a>
 <h2><b>5 拉普拉斯矩阵的谱分解（特征分解）</b></h2>
 <p data-pid="ZqylLg5c">GCN的核心基于拉普拉斯矩阵的谱分解，文献中对于这部分内容没有讲解太多，初学者可能会遇到不少误区，所以先了解一下特征分解。</p>
 <p data-pid="cd-YsfWz"><b>矩阵的谱分解，特征分解，对角化都是同一个概念</b>（<a href="https://link.zhihu.com/?target=https%3A//baike.baidu.com/item/%25E7%2589%25B9%25E5%25BE%2581%25E5%2588%2586%25E8%25A7%25A3/12522621%3Ffr%3Daladdin" class=" wrap external" target="_blank" rel="nofollow noreferrer">特征分解_百度百科</a>）。</p>
 <p data-pid="MX5Ly7cb"><b>不是所有的矩阵都可以特征分解</b>，其充要条件为n阶方阵存在n个<a href="https://link.zhihu.com/?target=https%3A//www.baidu.com/s%3Fwd%3D%25E7%25BA%25BF%25E6%2580%25A7%25E6%2597%25A0%25E5%2585%25B3%26tn%3D44039180_cpr%26fenlei%3Dmv6quAkxTZn0IZRqIHckPjm4nH00T1d9mW64Phf3mhD1ujubn1cz0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHT3PjD4njnsP1RdPWfkP1mY" class=" wrap external" target="_blank" rel="nofollow noreferrer">线性无关</a>的<a href="https://link.zhihu.com/?target=https%3A//www.baidu.com/s%3Fwd%3D%25E7%2589%25B9%25E5%25BE%2581%25E5%2590%2591%25E9%2587%258F%26tn%3D44039180_cpr%26fenlei%3Dmv6quAkxTZn0IZRqIHckPjm4nH00T1d9mW64Phf3mhD1ujubn1cz0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHT3PjD4njnsP1RdPWfkP1mY" class=" wrap external" target="_blank" rel="nofollow noreferrer">特征向量</a>。</p>
 <p data-pid="D8E5bAof"><b>但是拉普拉斯矩阵是半正定对称矩阵</b>（半正定矩阵本身就是对称矩阵，<a href="https://link.zhihu.com/?target=https%3A//baike.baidu.com/item/%25E5%258D%258A%25E6%25AD%25A3%25E5%25AE%259A%25E7%259F%25A9%25E9%2598%25B5/2152711%3Ffr%3Daladdin" class=" wrap external" target="_blank" rel="nofollow noreferrer">半正定矩阵_百度百科</a>，此处这样写为了和下面的性质对应，避免混淆），有如下三个性质：</p>
 <ul>
  <li data-pid="gZ0VdKs0"><b>实对称矩阵一定n个线性无关的特征向量</b></li>
  <li data-pid="1-55rbs0"><b>半正定矩阵的特征值一定非负</b></li>
  <li data-pid="DhaKT4yw"><b>实对阵矩阵的特征向量总是可以化成两两相互正交的正交矩阵</b></li>
 </ul>
 <p data-pid="752mSXYK">由上可以知道拉普拉斯矩阵一定可以谱分解，且分解后有特殊的形式。</p>
 <p data-pid="Nrdq0wHM">对于拉普拉斯矩阵其谱分解为：</p>
 <p data-pid="rbNvIqhs"><img src="https://www.zhihu.com/equation?tex=+L%3D+U%5Cleft%28%5Cbegin%7Bmatrix%7D%5Clambda_1+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Clambda_n+%5Cend%7Bmatrix%7D%5Cright%29+U%5E%7B-1%7D" alt=" L= U\left(\begin{matrix}\lambda_1 &amp; \\&amp;\ddots \\ &amp;&amp;\lambda_n \end{matrix}\right) U^{-1}" eeimg="1"></p>
 <p data-pid="52PqkFQu">其中 <img src="https://www.zhihu.com/equation?tex=U%3D%28%5Cvec%7Bu_1%7D%2C%5Cvec%7Bu_2%7D%2C%5Ccdots%2C%5Cvec%7Bu_n%7D%29" alt="U=(\vec{u_1},\vec{u_2},\cdots,\vec{u_n})" eeimg="1"> ，是<b>列向量</b>为单位特征向量的矩阵，<b>也就说 </b><img src="https://www.zhihu.com/equation?tex=%5Cvec%7Bu_l%7D" alt="\vec{u_l}" eeimg="1"><b> 是列向量</b>。</p>
 <p data-pid="0BiTKxvh"><img src="https://www.zhihu.com/equation?tex=%5Cleft%28%5Cbegin%7Bmatrix%7D%5Clambda_1+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Clambda_n+%5Cend%7Bmatrix%7D%5Cright%29" alt="\left(\begin{matrix}\lambda_1 &amp; \\&amp;\ddots \\ &amp;&amp;\lambda_n \end{matrix}\right)" eeimg="1"> 是n个特征值构成的对角阵。</p>
 <p data-pid="CX2Km4PH">由于 <img src="https://www.zhihu.com/equation?tex=U" alt="U" eeimg="1"> 是正交矩阵，即 <img src="https://www.zhihu.com/equation?tex=UU%5E%7BT%7D%3DE" alt="UU^{T}=E" eeimg="1">， <img src="https://www.zhihu.com/equation?tex=E" alt="E" eeimg="1"> 是单位矩阵。</p>
 <p data-pid="S-Ku7YFb">所以特征分解又可以写成：</p>
 <p data-pid="3M5APu3p"><img src="https://www.zhihu.com/equation?tex=L%3D+U%5Cleft%28%5Cbegin%7Bmatrix%7D%5Clambda_1+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Clambda_n+%5Cend%7Bmatrix%7D%5Cright%29+U%5E%7BT%7D" alt="L= U\left(\begin{matrix}\lambda_1 &amp; \\&amp;\ddots \\ &amp;&amp;\lambda_n \end{matrix}\right) U^{T}" eeimg="1"></p>
 <p data-pid="8yJMbicT"><b>文献中都是最后导出的这个公式，但大家不要误解，特征分解最右边的是特征矩阵的逆，只是拉普拉斯矩阵的性质才可以写成特征矩阵的转置。</b></p>
 <p data-pid="V-2gq6zf">其实从上可以看出：整个推导用到了很多数学的性质，在这里写得详细一些，避免大家形成错误的理解。</p>
 <h2>6 如何从传统的傅里叶变换、卷积类比到Graph上的傅里叶变换及卷积？</h2>
 <p data-pid="NOuZTVbg"><b>把传统的傅里叶变换以及卷积迁移到Graph上来，核心工作其实就是把拉普拉斯算子的特征函数 </b><img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"><b> 变为Graph对应的拉普拉斯矩阵的特征向量</b>。</p>
 <h3><b>6.1 推广傅里叶变换</b></h3>
 <p data-pid="indArwBZ">想亲自躬行的读者可以阅读<a href="https://link.zhihu.com/?target=https%3A//arxiv.org/abs/1211.0053" class=" wrap external" target="_blank" rel="nofollow noreferrer">The Emerging Field of Signal Processing on Graphs: Extending High-Dimensional Data Analysis to Networks and Other Irregular Domains</a>这篇论文，下面是我的理解与提炼：</p>
 <p data-pid="DpoBaWsz"><b>(a)Graph上的傅里叶变换</b></p>
 <p data-pid="bm_t4kaO">传统的傅里叶变换定义为：</p>
 <p data-pid="kx5NoA8R"><img src="https://www.zhihu.com/equation?tex=+F%28%5Comega%29%3D%5Cmathcal%7BF%7D%5Bf%28t%29%5D%3D%5Cint_%7B%7D%5E%7B%7Df%28t%29e%5E%7B-i%5Comega+t%7D+dt" alt=" F(\omega)=\mathcal{F}[f(t)]=\int_{}^{}f(t)e^{-i\omega t} dt" eeimg="1"></p>
 <p data-pid="TlvrIPIU">信号 <img src="https://www.zhihu.com/equation?tex=f%28t%29" alt="f(t)" eeimg="1"> 与基函数 <img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"> 的积分，<b>那么为什么要找</b><img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"><b> 作为基函数呢？从数学上看， </b><img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"><b> 是拉普拉斯算子的特征函数（满足特征方程）, </b><img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"><b> 就和特征值有关。</b></p>
 <p data-pid="cECtUdee">广义的特征方程定义为：</p>
 <p data-pid="i9r1JQ3T"><img src="https://www.zhihu.com/equation?tex=+A+V%3D%5Clambda+V" alt=" A V=\lambda V" eeimg="1"></p>
 <p data-pid="eg9Vdmnj">其中 <img src="https://www.zhihu.com/equation?tex=A" alt="A" eeimg="1"> 是一种变换， <img src="https://www.zhihu.com/equation?tex=V" alt="V" eeimg="1"> 是特征向量或者特征函数（无穷维的向量）， <img src="https://www.zhihu.com/equation?tex=%5Clambda" alt="\lambda" eeimg="1"> 是特征值。</p>
 <p data-pid="ig0_uLiO"><img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"> 满足：</p>
 <p data-pid="aiAzqyrt"><img src="https://www.zhihu.com/equation?tex=+%5CDelta+e%5E%7B-i%5Comega+t%7D%3D%5Cfrac%7B%5Cpartial%5E%7B2%7D%7D%7B%5Cpartial+t%5E%7B2%7D%7D+e%5E%7B-i%5Comega+t%7D%3D-%5Comega%5E%7B2%7D+e%5E%7B-i%5Comega+t%7D%5C" alt=" \Delta e^{-i\omega t}=\frac{\partial^{2}}{\partial t^{2}} e^{-i\omega t}=-\omega^{2} e^{-i\omega t}\" eeimg="1"></p>
 <p data-pid="dt19xeXq"><b>当然 </b><img src="https://www.zhihu.com/equation?tex=e%5E%7B-i%5Comega+t%7D" alt="e^{-i\omega t}" eeimg="1"><b> 就是变换 </b><img src="https://www.zhihu.com/equation?tex=%5CDelta" alt="\Delta" eeimg="1"><b> 的特征函数，</b> <img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"> 和特征值密切相关<b>。</b></p>
 <p data-pid="bhvSuhk1">那么，可以联想了，<b>处理Graph问题的时候，用到拉普拉斯矩阵</b>（拉普拉斯矩阵就是离散拉普拉斯算子，想了解更多可以参考<a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Discrete_Laplace_operator" class=" wrap external" target="_blank" rel="nofollow noreferrer">Discrete Laplace operator</a>），<b>自然就去找拉普拉斯矩阵的特征向量了。</b></p>
 <p data-pid="0m8AvygR"><img src="https://www.zhihu.com/equation?tex=L" alt="L" eeimg="1"> 是拉普拉斯矩阵， <img src="https://www.zhihu.com/equation?tex=V" alt="V" eeimg="1"> 是其特征向量，自然满足下式：</p>
 <p data-pid="pNiEc9oN"><img src="https://www.zhihu.com/equation?tex=LV%3D%5Clambda+V" alt="LV=\lambda V" eeimg="1"></p>
 <p data-pid="5ady2eeO"><b>离散积分就是一种内积形式，仿上定义Graph上的傅里叶变换：</b></p>
 <p data-pid="ydhFpCRf"><img src="https://www.zhihu.com/equation?tex=+F%28%5Clambda_l%29%3D%5Chat%7Bf%7D%28%5Clambda_l%29%3D%5Csum_%7Bi%3D1%7D%5E%7BN%7D%7Bf%28i%29+u_l%5E%2A%28i%29%7D" alt=" F(\lambda_l)=\hat{f}(\lambda_l)=\sum_{i=1}^{N}{f(i) u_l^*(i)}" eeimg="1"></p>
 <p data-pid="lLpKVx-3"><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 是Graph上的 </b><img src="https://www.zhihu.com/equation?tex=N" alt="N" eeimg="1"><b> 维向量， </b><img src="https://www.zhihu.com/equation?tex=f%28i%29" alt="f(i)" eeimg="1"><b> 与Graph的顶点一一对应，</b> <img src="https://www.zhihu.com/equation?tex=+u_l%28i%29" alt=" u_l(i)" eeimg="1"><b>表示第 </b><img src="https://www.zhihu.com/equation?tex=l" alt="l" eeimg="1"><b> 个特征向量的第 </b><img src="https://www.zhihu.com/equation?tex=i" alt="i" eeimg="1"><b> 个分量。那么特征值（频率） </b><img src="https://www.zhihu.com/equation?tex=%5Clambda_l" alt="\lambda_l" eeimg="1"><b> 下的， </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 的Graph 傅里叶变换就是与 </b><img src="https://www.zhihu.com/equation?tex=%5Clambda_l" alt="\lambda_l" eeimg="1"><b> 对应的特征向量 </b><img src="https://www.zhihu.com/equation?tex=+u_l" alt=" u_l" eeimg="1"><b> 进行内积运算。</b></p>
 <p data-pid="2utfbSi8">注：上述的内积运算是在复数空间中定义的，<b>所以采用了 </b><img src="https://www.zhihu.com/equation?tex=u_l%5E%2A%28i%29" alt="u_l^*(i)" eeimg="1"><b> ，也就是特征向量 </b><img src="https://www.zhihu.com/equation?tex=u_l" alt="u_l" eeimg="1"><b> 的共轭。</b>Inner product更多可以参考<a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Inner_product_space" class=" wrap external" target="_blank" rel="nofollow noreferrer">Inner product space</a>。</p>
 <p data-pid="Wh5HTupP"><b>利用矩阵乘法将Graph上的傅里叶变换推广到矩阵形式：</b></p>
 <p data-pid="7zrqDmu8"><img src="https://www.zhihu.com/equation?tex=+%5Cleft%28%5Cbegin%7Bmatrix%7D+%5Chat%7Bf%7D%28%5Clambda_1%29%5C%5C+%5Chat%7Bf%7D%28%5Clambda_2%29+%5C%5C+%5Cvdots+%5C%5C%5Chat%7Bf%7D%28%5Clambda_N%29+%5Cend%7Bmatrix%7D%5Cright%29%3D%5Cleft%28%5Cbegin%7Bmatrix%7D%5C+u_1%281%29+%26u_1%282%29%26+%5Cdots+%26u_1%28N%29+%5C%5Cu_2%281%29+%26u_2%282%29%26+%5Cdots+%26u_2%28N%29%5C%5C+%5Cvdots+%26%5Cvdots+%26%5Cddots+%26+%5Cvdots%5C%5C+u_N%281%29+%26u_N%282%29%26+%5Cdots+%26u_N%28N%29+%5Cend%7Bmatrix%7D%5Cright%29%5Cleft%28%5Cbegin%7Bmatrix%7Df%281%29%5C%5C+f%282%29+%5C%5C+%5Cvdots+%5C%5Cf%28N%29+%5Cend%7Bmatrix%7D%5Cright%29" alt=" \left(\begin{matrix} \hat{f}(\lambda_1)\\ \hat{f}(\lambda_2) \\ \vdots \\\hat{f}(\lambda_N) \end{matrix}\right)=\left(\begin{matrix}\ u_1(1) &amp;u_1(2)&amp; \dots &amp;u_1(N) \\u_2(1) &amp;u_2(2)&amp; \dots &amp;u_2(N)\\ \vdots &amp;\vdots &amp;\ddots &amp; \vdots\\ u_N(1) &amp;u_N(2)&amp; \dots &amp;u_N(N) \end{matrix}\right)\left(\begin{matrix}f(1)\\ f(2) \\ \vdots \\f(N) \end{matrix}\right)" eeimg="1"></p>
 <p data-pid="wqig6NCN"><b>即 </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 在Graph上傅里叶变换的矩阵形式为</b>： <img src="https://www.zhihu.com/equation?tex=%5Chat%7Bf%7D%3DU%5ETf+%5Cqquad%28a%29" alt="\hat{f}=U^Tf \qquad(a)" eeimg="1"></p>
 <p data-pid="CeK6FDqS">式中： <img src="https://www.zhihu.com/equation?tex=U%5ET" alt="U^T" eeimg="1"> 的定义与第五节中的相同</p>
 <p data-pid="M3wa8elX"><b>(b)Graph上的傅里叶逆变换</b></p>
 <p data-pid="5mekA1y8">类似地，<b>传统的傅里叶逆变换是对频率 </b><img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"><b> 求积分：</b></p>
 <p data-pid="3YwNoDM0"><img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BF%7D%5E%7B-1%7D%5BF%28%5Comega%29%5D%3D%5Cfrac%7B1%7D%7B2%5CPi%7D%5Cint_%7B%7D%5E%7B%7DF%28%5Comega%29e%5E%7Bi%5Comega+t%7D+d%5Comega" alt="\mathcal{F}^{-1}[F(\omega)]=\frac{1}{2\Pi}\int_{}^{}F(\omega)e^{i\omega t} d\omega" eeimg="1"></p>
 <p data-pid="rgnAh-dv"><b>迁移到Graph上变为对特征值 </b><img src="https://www.zhihu.com/equation?tex=%5Clambda_l" alt="\lambda_l" eeimg="1"><b> 求和：</b></p>
 <p data-pid="Ew1gGOqN"><img src="https://www.zhihu.com/equation?tex=f%28i%29%3D%5Csum_%7Bl%3D1%7D%5E%7BN%7D%7B%5Chat%7Bf%7D%28%5Clambda_l%29+u_l%28i%29%7D" alt="f(i)=\sum_{l=1}^{N}{\hat{f}(\lambda_l) u_l(i)}" eeimg="1"></p>
 <p data-pid="ONwa-nal"><b>利用矩阵乘法将Graph上的傅里叶逆变换推广到矩阵形式：</b></p>
 <p data-pid="UOEeRD5J"><img src="https://www.zhihu.com/equation?tex=+%5Cleft%28%5Cbegin%7Bmatrix%7Df%281%29%5C%5C+f%282%29+%5C%5C+%5Cvdots+%5C%5Cf%28N%29+%5Cend%7Bmatrix%7D%5Cright%29%3D+%5Cleft%28%5Cbegin%7Bmatrix%7D%5C+u_1%281%29+%26u_2%281%29%26+%5Cdots+%26u_N%281%29+%5C%5Cu_1%282%29+%26u_2%282%29%26+%5Cdots+%26u_N%282%29%5C%5C+%5Cvdots+%26%5Cvdots+%26%5Cddots+%26+%5Cvdots%5C%5C+u_1%28N%29+%26u_2%28N%29%26+%5Cdots+%26u_N%28N%29+%5Cend%7Bmatrix%7D%5Cright%29+%5Cleft%28%5Cbegin%7Bmatrix%7D+%5Chat%7Bf%7D%28%5Clambda_1%29%5C%5C+%5Chat%7Bf%7D%28%5Clambda_2%29+%5C%5C+%5Cvdots+%5C%5C%5Chat%7Bf%7D%28%5Clambda_N%29+%5Cend%7Bmatrix%7D%5Cright%29" alt=" \left(\begin{matrix}f(1)\\ f(2) \\ \vdots \\f(N) \end{matrix}\right)= \left(\begin{matrix}\ u_1(1) &amp;u_2(1)&amp; \dots &amp;u_N(1) \\u_1(2) &amp;u_2(2)&amp; \dots &amp;u_N(2)\\ \vdots &amp;\vdots &amp;\ddots &amp; \vdots\\ u_1(N) &amp;u_2(N)&amp; \dots &amp;u_N(N) \end{matrix}\right) \left(\begin{matrix} \hat{f}(\lambda_1)\\ \hat{f}(\lambda_2) \\ \vdots \\\hat{f}(\lambda_N) \end{matrix}\right)" eeimg="1"></p>
 <p data-pid="YjBsjSpX"><b>即 </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 在Graph上傅里叶逆变换的矩阵形式为：</b> <img src="https://www.zhihu.com/equation?tex=+f%3DU%5Chat%7Bf%7D+%5Cqquad%28b%29" alt=" f=U\hat{f} \qquad(b)" eeimg="1"></p>
 <p data-pid="c_SKwpBE">式中： <img src="https://www.zhihu.com/equation?tex=U" alt="U" eeimg="1"> 的定义与第五节中的相同</p>
 <h3><b>6.2 推广卷积</b></h3>
 <p data-pid="_G-2HAZk">在上面的基础上，利用<b>卷积定理</b>类比来将卷积运算，推广到Graph上。</p>
 <p data-pid="FJzyfZLv"><b>卷积定理：函数卷积的傅里叶变换是函数傅立叶变换的乘积，即对于函数</b> <img src="https://www.zhihu.com/equation?tex=f%28t%29" alt="f(t)" eeimg="1"> 与 <img src="https://www.zhihu.com/equation?tex=h%28t%29" alt="h(t)" eeimg="1"><b>两者的卷积是其函数傅立叶变换乘积的逆变换：</b></p>
 <p data-pid="Qyib3vD_"><img src="https://www.zhihu.com/equation?tex=f%2Ah%3D%5Cmathcal%7BF%7D%5E%7B-1%7D%5Cleft%5B+%5Chat%7Bf%7D%28%5Comega%29%5Chat%7Bh%7D%28%5Comega%29+%5Cright%5D%3D%5Cfrac%7B1%7D%7B2%5CPi%7D%5Cint_%7B%7D%5E%7B%7D+%5Chat%7Bf%7D%28%5Comega%29%5Chat%7Bh%7D%28%5Comega%29e%5E%7Bi%5Comega+t%7D+d%5Comega" alt="f*h=\mathcal{F}^{-1}\left[ \hat{f}(\omega)\hat{h}(\omega) \right]=\frac{1}{2\Pi}\int_{}^{} \hat{f}(\omega)\hat{h}(\omega)e^{i\omega t} d\omega" eeimg="1"></p>
 <p data-pid="nDPO8q3U"><b>类比到Graph上并把傅里叶变换的定义带入， </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 与卷积核 </b><img src="https://www.zhihu.com/equation?tex=h" alt="h" eeimg="1"><b> 在Graph上的卷积可按下列步骤求出：</b></p>
 <p data-pid="p9YiEZjD"><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"> 的傅里叶变换为 <img src="https://www.zhihu.com/equation?tex=%5Chat%7Bf%7D%3DU%5ETf" alt="\hat{f}=U^Tf" eeimg="1"></p>
 <p data-pid="Nqwnd7jz">卷积核 <img src="https://www.zhihu.com/equation?tex=h" alt="h" eeimg="1"> 的傅里叶变换写成对角矩阵的形式即为： <img src="https://www.zhihu.com/equation?tex=%5Cleft%28%5Cbegin%7Bmatrix%7D%5Chat+h%28%5Clambda_1%29+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Chat+h%28%5Clambda_n%29+%5Cend%7Bmatrix%7D%5Cright%29" alt="\left(\begin{matrix}\hat h(\lambda_1) &amp; \\&amp;\ddots \\ &amp;&amp;\hat h(\lambda_n) \end{matrix}\right)" eeimg="1"></p>
 <p data-pid="WOQnJZce"><img src="https://www.zhihu.com/equation?tex=%5Chat%7Bh%7D%28%5Clambda_l%29%3D%5Csum_%7Bi%3D1%7D%5E%7BN%7D%7Bh%28i%29+u_l%5E%2A%28i%29%7D" alt="\hat{h}(\lambda_l)=\sum_{i=1}^{N}{h(i) u_l^*(i)}" eeimg="1"> 是<b>根据需要设计的卷积核 </b><img src="https://www.zhihu.com/equation?tex=h" alt="h" eeimg="1"><b> 在Graph上的傅里叶变换。</b></p>
 <p data-pid="rMmtv4VL">两者的傅立叶变换乘积即为： <img src="https://www.zhihu.com/equation?tex=+%5Cleft%28%5Cbegin%7Bmatrix%7D%5Chat+h%28%5Clambda_1%29+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Chat+h%28%5Clambda_n%29+%5Cend%7Bmatrix%7D%5Cright%29U%5ETf" alt=" \left(\begin{matrix}\hat h(\lambda_1) &amp; \\&amp;\ddots \\ &amp;&amp;\hat h(\lambda_n) \end{matrix}\right)U^Tf" eeimg="1"></p>
 <p data-pid="L_7LU2OO">再乘以 <img src="https://www.zhihu.com/equation?tex=U" alt="U" eeimg="1"> 求两者傅立叶变换乘积的逆变换，则求出卷积：</p>
 <p data-pid="a6jXHX_M"><img src="https://www.zhihu.com/equation?tex=%28f%2Ah%29_G%3D+U%5Cleft%28%5Cbegin%7Bmatrix%7D%5Chat+h%28%5Clambda_1%29+%26+%5C%5C%26%5Cddots+%5C%5C+%26%26%5Chat+h%28%5Clambda_n%29+%5Cend%7Bmatrix%7D%5Cright%29+U%5ETf+%5Cqquad%281%29" alt="(f*h)_G= U\left(\begin{matrix}\hat h(\lambda_1) &amp; \\&amp;\ddots \\ &amp;&amp;\hat h(\lambda_n) \end{matrix}\right) U^Tf \qquad(1)" eeimg="1"></p>
 <p data-pid="I5kMvn7W">式中： <img src="https://www.zhihu.com/equation?tex=U" alt="U" eeimg="1"> 及<img src="https://www.zhihu.com/equation?tex=U%5E%7BT%7D" alt="U^{T}" eeimg="1"> 的定义与第五节中的相同。</p>
 <p data-pid="CA3ib6xU"><b>注：很多论文中的Graph卷积公式为：</b></p>
 <p data-pid="dtoiKCZm"><img src="https://www.zhihu.com/equation?tex=%28f%2Ah%29_G%3DU%28%28U%5ETh%29%5Codot%28U%5ETf%29%29+%5Cqquad%282%29" alt="(f*h)_G=U((U^Th)\odot(U^Tf)) \qquad(2)" eeimg="1"></p>
 <p data-pid="7reCr2uy"><img src="https://www.zhihu.com/equation?tex=%5Codot" alt="\odot" eeimg="1"> 表示Hadamard product（哈达马积），对于两个维度相同的向量、矩阵、张量进行对应位置的逐元素乘积运算。</p>
 <p data-pid="SWBqy4AG"><b>其实式(2)与式(1)是完全等价的，详细的证明见我的另一篇文章。</b></p><a href="https://zhuanlan.zhihu.com/p/121090537" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-33b9efc9d49ee700e0a1e110d73cc8ec_720w.jpg" data-image-width="1107" data-image-height="424" class="internal">superbrother：GCN中的等式证明</a>
 <p data-pid="2VqAxWE5"><b>这里主要推(1)式是为了和后面的deep learning相结合。</b></p>
 <p data-pid="1xvii8KX">这部分理论也是我看了很久才想明白的，在此记录下来，如果是想继续探究理论的朋友，可以作为“入门小引”，毕竟理论还很深！对于喜欢实践的朋友，也能初步了解理论基础，也是“开卷有益”。</p>
 <h2><b>7 为什么拉普拉斯矩阵的</b>特征向量可以作为傅里叶变换的基？</h2>
 <p data-pid="IG7kwAe4">傅里叶变换一个本质理解就是：<b>把任意一个函数表示成了若干个正交函数（由</b> <img src="https://www.zhihu.com/equation?tex=%5Csin%5Comega+t%2C%5Ccos%5Comega+t" alt="\sin\omega t,\cos\omega t" eeimg="1"> <b>构成）的线性组合。</b></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e9e00533154bfdad940e966e7eca5075_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1069" data-rawheight="182" data-original-token="v2-e9e00533154bfdad940e966e7eca5075" class="origin_image zh-lightbox-thumb" width="1069" data-original="https://picx.zhimg.com/v2-e9e00533154bfdad940e966e7eca5075_r.jpg?source=1940ef5c">
  <figcaption>
   图6 傅里叶逆变换图示
  </figcaption>
 </figure>
 <p data-pid="0po7ntAC">通过第六节中(b)式也能看出，<b>graph傅里叶变换也把graph上定义的任意向量 </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> ，表示成了拉普拉斯矩阵特征向量的线性组合，即：</b></p>
 <p data-pid="BWMA-GP6"><img src="https://www.zhihu.com/equation?tex=f%3D%5Chat%7Bf%7D%28%5Clambda_1%29u_1%2B%5Chat%7Bf%7D%28%5Clambda_2%29u_2%2B%5Ccdots+%2B%5Chat%7Bf%7D%28%5Clambda_n%29u_n" alt="f=\hat{f}(\lambda_1)u_1+\hat{f}(\lambda_2)u_2+\cdots +\hat{f}(\lambda_n)u_n" eeimg="1"></p>
 <p data-pid="ITOdloQ1">那么<b>：为什么graph上任意的向量 </b><img src="https://www.zhihu.com/equation?tex=f" alt="f" eeimg="1"><b> 都可以表示成这样的线性组合？</b></p>
 <p data-pid="Pn8h6cHd"><b>原因在于</b> <img src="https://www.zhihu.com/equation?tex=%28%5Cvec%7Bu_1%7D%2C%5Cvec%7Bu_2%7D%2C%5Ccdots%2C%5Cvec%7Bu_n%7D%29" alt="(\vec{u_1},\vec{u_2},\cdots,\vec{u_n})" eeimg="1"><b>是graph上</b> <img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b>维空间中的 </b><img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b> 个线性无关的正交向量</b>（原因参看第五节中拉普拉斯矩阵的性质），由线性代数的知识可以知道：<img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b> 维空间中</b><img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b> 个线性无关的向量可以构成空间的一组基，而且拉普拉斯矩阵的特征向量还是一组正交基。</b></p>
 <p data-pid="yaC0tuPn"><b>此外，对于传统的傅里叶变换，拉普拉斯算子的特征值</b> <img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"> <b>表示谐波</b> <img src="https://www.zhihu.com/equation?tex=%5Csin%5Comega+t%2C%5Ccos%5Comega+t" alt="\sin\omega t,\cos\omega t" eeimg="1"> <b>的频率。与之类似，拉普拉斯矩阵的特征值</b> <img src="https://www.zhihu.com/equation?tex=%5Clambda_i" alt="\lambda_i" eeimg="1"><b> 也表示图拉普拉斯变换的频率。具体的分析可以看如下的文章。</b></p><a href="https://zhuanlan.zhihu.com/p/551528542" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-041be8776878dbc39438879c61be3628_180x120.jpg" data-image-width="387" data-image-height="304" class="internal">superbrother：如何理解拉普拉斯矩阵的特征值表示图傅里叶变换的频率</a>
 <p data-pid="_rv4bFA6">Graph Convolution的理论告一段落了，下面开始介绍Graph Convolution Neural Network。</p>
 <hr>
 <h2>8 Deep Learning中的Graph Convolution</h2>
 <p data-pid="UhavrTKw">Deep learning 中的Graph Convolution直接看上去会和第6节推导出的图卷积公式有很大的不同，但是万变不离其宗，(1)式是推导的本源。</p>
 <p data-pid="Rc2h3EfW"><b>第1节的内容已经解释得很清楚：Deep learning 中的Convolution就是要设计含有trainable共享参数的kernel，从(1)式看很直观：graph convolution中的卷积参数就是</b> <img src="https://www.zhihu.com/equation?tex=diag%28%5Chat+h%28%5Clambda_l%29+%29" alt="diag(\hat h(\lambda_l) )" eeimg="1"> 。</p>
 <h3><b>8.1 第一代GCN</b></h3>
 <p data-pid="QSIyyg1l"><a href="https://link.zhihu.com/?target=https%3A//arxiv.org/abs/1312.6203" class=" wrap external" target="_blank" rel="nofollow noreferrer">Spectral Networks and Locally Connected Networks on Graphs</a>中<b>简单粗暴地把 </b><img src="https://www.zhihu.com/equation?tex=diag%28%5Chat+h%28%5Clambda_l%29+%29" alt="diag(\hat h(\lambda_l) )" eeimg="1"><b> 变成了卷积核 </b><img src="https://www.zhihu.com/equation?tex=diag%28%5Ctheta_l+%29" alt="diag(\theta_l )" eeimg="1"><b>，</b>也就是：</p>
 <p data-pid="CEr0IEoA"><img src="https://www.zhihu.com/equation?tex=+y_%7Boutput%7D%3D%5Csigma+%5Cleft%28U+g_%5Ctheta%28%5CLambda%29+U%5ET+x+%5Cright%29+%5Cqquad%283%29" alt=" y_{output}=\sigma \left(U g_\theta(\Lambda) U^T x \right) \qquad(3)" eeimg="1"></p>
 <p data-pid="7J2tidsh">（为避免混淆，本文中称 <img src="https://www.zhihu.com/equation?tex=g_%5Ctheta%28%5CLambda%29" alt="g_\theta(\Lambda)" eeimg="1"> 是卷积核， <img src="https://www.zhihu.com/equation?tex=U+g_%5Ctheta%28%5CLambda%29+U%5ET+" alt="U g_\theta(\Lambda) U^T " eeimg="1"> 的运算结果为卷积运算矩阵）</p>
 <p data-pid="25KD1G5g"><img src="https://www.zhihu.com/equation?tex=+g_%5Ctheta%28%5CLambda%29%3D%5Cleft%28%5Cbegin%7Bmatrix%7D%5Ctheta_1+%26%5C%5C%26%5Cddots+%5C%5C+%26%26%5Ctheta_n+%5Cend%7Bmatrix%7D%5Cright%29" alt=" g_\theta(\Lambda)=\left(\begin{matrix}\theta_1 &amp;\\&amp;\ddots \\ &amp;&amp;\theta_n \end{matrix}\right)" eeimg="1"></p>
 <p data-pid="unFPIvnG"><b>式（3）就是标准的第一代GCN中的layer了，其中</b> <img src="https://www.zhihu.com/equation?tex=%5Csigma%28%5Ccdot%29" alt="\sigma(\cdot)" eeimg="1"><b>是激活函数，</b><img src="https://www.zhihu.com/equation?tex=%5CTheta%3D%28%7B%5Ctheta_1%7D%2C%7B%5Ctheta_2%7D%2C%5Ccdots%2C%7B%5Ctheta_n%7D%29" alt="\Theta=({\theta_1},{\theta_2},\cdots,{\theta_n})" eeimg="1"><b>就跟三层神经网络中的weight一样是任意的参数，通过初始化赋值然后利用误差反向传播进行调整，</b> <img src="https://www.zhihu.com/equation?tex=x" alt="x" eeimg="1"><b>就是graph上对应于每个顶点的feature vector（由特数据集提取特征构成的向量）。</b></p>
 <p data-pid="2A8AKqv0"><b>第一代的参数方法存在着一些弊端：主要在于：</b></p>
 <p data-pid="xX-shgcT"><b>（1）每一次前向传播，都要计算 </b><img src="https://www.zhihu.com/equation?tex=U" alt="U" eeimg="1">,<img src="https://www.zhihu.com/equation?tex=diag%28%5Ctheta_l+%29" alt="diag(\theta_l )" eeimg="1"> 及 <img src="https://www.zhihu.com/equation?tex=U%5ET" alt="U^T" eeimg="1"><b>三者的矩阵乘积，特别是对于大规模的graph，计算的代价较高，也就是论文中</b> <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BO%7D%28n%5E3%29" alt="\mathcal{O}(n^3)" eeimg="1"><b>的计算复杂度</b></p>
 <p data-pid="mWVXiaus"><b>（2）卷积核不具有spatial localization（这个在第9节中进一步阐述）</b></p>
 <p data-pid="j_adr2G0"><b>（3）卷积核需要</b> <img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b> 个参数</b></p>
 <p data-pid="yr7FzI5_">由于以上的缺点第二代的卷积核设计应运而生。</p>
 <h3><b>8.2 第二代GCN</b></h3>
 <p data-pid="3qrIpIQP">(<a href="https://link.zhihu.com/?target=http%3A//papers.nips.cc/paper/6081-convolutional-neural-networks-on-graphs-with-fast-localized-spectral-filtering" class=" wrap external" target="_blank" rel="nofollow noreferrer">Convolutional Neural Networks on Graphs with Fast Localized Spectral Filtering</a>)，把 <img src="https://www.zhihu.com/equation?tex=%5Chat+h%28%5Clambda_l%29" alt="\hat h(\lambda_l)" eeimg="1"><b>巧妙地设计成了</b> <img src="https://www.zhihu.com/equation?tex=%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5Clambda%5Ej_l" alt="\sum_{j=0}^K \alpha_j \lambda^j_l" eeimg="1"> ，也就是：</p>
 <p data-pid="dLitvMrQ"><img src="https://www.zhihu.com/equation?tex=+y_%7Boutput%7D%3D%5Csigma+%5Cleft%28U++g_%5Ctheta%28%5CLambda%29++U%5ET+x+%5Cright%29+%5Cqquad%284%29" alt=" y_{output}=\sigma \left(U  g_\theta(\Lambda)  U^T x \right) \qquad(4)" eeimg="1"></p>
 <p data-pid="O8PKfPwC"><img src="https://www.zhihu.com/equation?tex=+g_%5Ctheta%28%5CLambda%29%3D%5Cleft%28%5Cbegin%7Bmatrix%7D%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5Clambda%5Ej_1+%26%5C%5C%26%5Cddots+%5C%5C+%26%26+%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5Clambda%5Ej_n+%5Cend%7Bmatrix%7D%5Cright%29" alt=" g_\theta(\Lambda)=\left(\begin{matrix}\sum_{j=0}^K \alpha_j \lambda^j_1 &amp;\\&amp;\ddots \\ &amp;&amp; \sum_{j=0}^K \alpha_j \lambda^j_n \end{matrix}\right)" eeimg="1"></p>
 <p data-pid="8ofYs7Fs">上面的公式仿佛还什么都看不出来，下面利用矩阵乘法进行变换，来一探究竟。</p>
 <p data-pid="jCKKA7V5"><img src="https://www.zhihu.com/equation?tex=+%5Cleft%28%5Cbegin%7Bmatrix%7D%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5Clambda%5Ej_1+%26%5C%5C%26%5Cddots+%5C%5C+%26%26+%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5Clambda%5Ej_n+%5Cend%7Bmatrix%7D%5Cright%29%3D%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5CLambda%5Ej" alt=" \left(\begin{matrix}\sum_{j=0}^K \alpha_j \lambda^j_1 &amp;\\&amp;\ddots \\ &amp;&amp; \sum_{j=0}^K \alpha_j \lambda^j_n \end{matrix}\right)=\sum_{j=0}^K \alpha_j \Lambda^j" eeimg="1"></p>
 <p data-pid="L-_GOj16">进而可以导出：</p>
 <p data-pid="d34TTCjk"><img src="https://www.zhihu.com/equation?tex=U+%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+%5CLambda%5Ej+U%5ET+%3D%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+U%5CLambda%5Ej+U%5ET+%3D+%5Csum_%7Bj%3D0%7D%5EK+%5Calpha_j+L%5Ej" alt="U \sum_{j=0}^K \alpha_j \Lambda^j U^T =\sum_{j=0}^K \alpha_j U\Lambda^j U^T = \sum_{j=0}^K \alpha_j L^j" eeimg="1"></p>
 <p data-pid="TgPgGPbj">上式成立是因为 <img src="https://www.zhihu.com/equation?tex=L%5E2%3DU+%5CLambda+U%5ETU+%5CLambda+U%5ET%3DU+%5CLambda%5E2+U%5ET+" alt="L^2=U \Lambda U^TU \Lambda U^T=U \Lambda^2 U^T " eeimg="1"> 且 <img src="https://www.zhihu.com/equation?tex=U%5ET+U%3DE" alt="U^T U=E" eeimg="1"></p>
 <p data-pid="tS3GyIPr">各符号的定义都同第五节。</p>
 <p data-pid="4tqW5jJx">(4)式就变成了：</p>
 <p data-pid="rHloeIQp"><img src="https://www.zhihu.com/equation?tex=+y_%7Boutput%7D%3D%5Csigma+%5Cleft%28+%5Csum_%7Bj%3D0%7D%5E%7BK-1%7D+%5Calpha_j+L%5Ej+x+%5Cright%29+%5Cqquad%285%29" alt=" y_{output}=\sigma \left( \sum_{j=0}^{K-1} \alpha_j L^j x \right) \qquad(5)" eeimg="1"></p>
 <p data-pid="cO0mcwy-"><b>其中 </b><img src="https://www.zhihu.com/equation?tex=%28%7B%5Calpha_0%7D%2C%7B%5Calpha_1%7D%2C%5Ccdots%2C%7B%5Calpha_%7BK-1%7D%7D%29" alt="({\alpha_0},{\alpha_1},\cdots,{\alpha_{K-1}})" eeimg="1"><b> 是任意的参数，通过初始化赋值然后利用误差反向传播进行调整。</b></p>
 <p data-pid="Ox-adYQd"><b>式(5)所设计的卷积核其优点在于在于：</b></p>
 <p data-pid="4rrY9U8r"><b>（1）卷积核只有</b> <img src="https://www.zhihu.com/equation?tex=K" alt="K" eeimg="1"><b>个参数，一般</b> <img src="https://www.zhihu.com/equation?tex=K" alt="K" eeimg="1"><b>远小于</b> <img src="https://www.zhihu.com/equation?tex=n" alt="n" eeimg="1"><b>，参数的复杂度被大大降低了。</b></p>
 <p data-pid="77jHvGoL"><b>（2）矩阵变换后，神奇地发现不需要做特征分解了，直接用拉普拉斯矩阵</b> <img src="https://www.zhihu.com/equation?tex=L" alt="L" eeimg="1"><b>进行变换。然而由于要计算</b> <img src="https://www.zhihu.com/equation?tex=L%5Ej" alt="L^j" eeimg="1"><b>，计算复杂度还是</b><img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BO%7D%28n%5E3%29" alt="\mathcal{O}(n^3)" eeimg="1"></p>
 <p data-pid="vIUP1nFR"><b>（3）卷积核具有很好的spatial localization，特别地，</b> <img src="https://www.zhihu.com/equation?tex=K" alt="K" eeimg="1"><b>就是卷积核的receptive field，也就是说每次卷积会将中心顶点K-hop neighbor上的feature进行加权求和，权系数就是</b> <img src="https://www.zhihu.com/equation?tex=%5Calpha_k" alt="\alpha_k" eeimg="1"></p>
 <p data-pid="9Zns_7vK"><b>更直观地看，</b> <b><i>K</i>=1就是对每个顶点上一阶neighbor的feature进行加权求和，如下图所示：</b></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-5f756da1ce39f38d408bd771a15c8ad3_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="921" data-rawheight="279" data-original-token="v2-5f756da1ce39f38d408bd771a15c8ad3" class="origin_image zh-lightbox-thumb" width="921" data-original="https://pic1.zhimg.com/v2-5f756da1ce39f38d408bd771a15c8ad3_r.jpg?source=1940ef5c">
  <figcaption>
   图7 k=1 的graph convolution示意
  </figcaption>
 </figure>
 <p data-pid="BAg1sZv2">同理，<b><i>K</i>=2的情形如下图所示：</b></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-a13b82907a364c3707a18bb8572b3a63_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1139" data-rawheight="300" data-original-token="v2-a13b82907a364c3707a18bb8572b3a63" class="origin_image zh-lightbox-thumb" width="1139" data-original="https://picx.zhimg.com/v2-a13b82907a364c3707a18bb8572b3a63_r.jpg?source=1940ef5c">
  <figcaption>
   图8 k=2 的graph convolution示意
  </figcaption>
 </figure>
 <p data-pid="Bu7jFE_D">注：上图只是以一个顶点作为实例，GCN每一次卷积对所有的顶点都完成了图示的操作。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <h3><b>8.3 利用Chebyshev多项式作为卷积核</b></h3>
 <p data-pid="_6q4_c3t">在GCN领域中，利用Chebyshev多项式作为卷积核是非常通用的形式。针对这部分内容，我专门整理了如下的文章。</p><a href="https://zhuanlan.zhihu.com/p/106687580" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-d015de8e3fe67ec893f473656fe7d234_720w.jpg" data-image-width="1114" data-image-height="392" class="internal">superbrother：Chebyshev多项式作为GCN卷积核</a>
 <p data-pid="HCsVAH5V"><b>上述的内容已经阐明了GCN的整体思路，其他的一些形式都是“万变不离其宗”。例如<a href="https://link.zhihu.com/?target=https%3A//arxiv.xilesou.top/abs/1609.02907" class=" wrap external" target="_blank" rel="nofollow noreferrer">Semi-Supervised Classification with Graph Convolutional Networks</a>一文中的GCN形式，其实是二阶Chebyshev多项式推导出的特例。</b></p>
 <hr>
 <p data-pid="-oIWFtck">在我最近发表的一篇论文中：就是用这种GCN形式作为基于有限检测器的路网规模交通流量估计问题（一种特殊的时空矩阵填充问题）的baseline，即原文4.2节部分的CGMC模型。感兴趣的朋友可以阅读如下的链接。</p><a href="https://link.zhihu.com/?target=https%3A//www.sciencedirect.com/science/article/pii/S0968090X20307701%3Fvia%253Dihub" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-31e48f77b4ade532809ddbab40eeed4c_720w.jpg" data-image-width="110" data-image-height="150" class=" wrap external" target="_blank" rel="nofollow noreferrer">Network-wide traffic flow estimation with insufficient volume detection and crowdsourcing data</a>
 <p data-pid="iIgv4eIN">Zhang, Z., Li, M., Lin, X., &amp; Wang, Y. (2020). Network-wide traffic flow estimation with insufficient volume detection and crowdsourcing data.<i>Transportation Research Part C: Emerging Technologies</i>,121, 102870.</p>
 <hr>
 <h2>9 在GCN中的<b>Local Connectivity</b>和<b>Parameter Sharing</b></h2>
 <p data-pid="ORYOTyLl"><b>CNN中有两大核心思想：网络局部连接，卷积核参数共享。这两点内容的详细理解可以看我的这个回答。</b></p><a href="https://www.zhihu.com/question/47158818/answer/670431317" data-draft-node="block" data-draft-type="link-card" data-image="https://pic3.zhimg.com/v2-a35a29688a764b9ec5e438d53bc1d35a_720w.jpg" data-image-width="389" data-image-height="337" class="internal">如何理解卷积神经网络中的权值共享？</a>
 <p data-pid="BbclH8ve">那么我们不禁会联想：这两点在GCN中是怎样的呢？以下图的graph结构为例来探究一下。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-8e9abf0e99e3a51d07a3c3c59a4cc15a_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="330" data-rawheight="191" data-original-token="v2-1ee4169f8776f8cf4518cd12ddd1c139" data-default-watermark-src="https://pica.zhimg.com/50/v2-dabd103e985cd39081ef76f2beb45ca5_720w.jpg?source=1940ef5c" class="content_image" width="330">
  <figcaption>
   graph结构示意
  </figcaption>
 </figure>
 <h3><b>9.1 GCN中的Local Connectivity</b></h3>
 <p data-pid="dxN24-2R">(a)如果利用第一代GCN，根据式（3）卷积运算矩阵（ <img src="https://www.zhihu.com/equation?tex=U+g_%5Ctheta%28%5CLambda%29+U%5ET+" alt="U g_\theta(\Lambda) U^T " eeimg="1"> ） 即为：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-ea7c50ca7a5fb372edd3d9b869309472_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1797" data-rawheight="238" data-original-token="v2-ea7c50ca7a5fb372edd3d9b869309472" class="origin_image zh-lightbox-thumb" width="1797" data-original="https://pic1.zhimg.com/v2-ea7c50ca7a5fb372edd3d9b869309472_r.jpg?source=1940ef5c">
  <figcaption>
   第一代卷积核示意（需要放大观看）
  </figcaption>
 </figure>
 <p data-pid="g6umkPCk">这个时候，可以发现这个卷积核没有<b>local的性质，因为该卷积核得到的运算矩阵在所有位置上都有非0元素。以第一个顶点为例，如果考虑一阶local关系的话，那么卷积核中第一行应该只有[1,1],[1,2],[1,5]这三个位置的元素非0。换</b>句话说，这是一个global全连接的卷积核。</p>
 <p data-pid="6r0n6DkC">(b)如果是第二代GCN，根据式（5）当 <img src="https://www.zhihu.com/equation?tex=K%3D0" alt="K=0" eeimg="1"> 卷积运算矩阵即为：</p>
 <p data-pid="6MFZX5Ky"><img src="https://www.zhihu.com/equation?tex=%5Cleft%5B++%5Cbegin%7Bmatrix%7D++++%5Calpha_0+%26+0+%26+0+%260%260%260%5C%5C++++0+%26+%5Calpha_0+%26+0+%260%260%260+%5C%5C++++0+%26+0+%26+%5Calpha_0+%260%260%260%5C%5C++++0+%26+0+%26+0+%26%5Calpha_0%260%260%5C%5C+++0+%26+0+%26+0+%260%26%5Calpha_0%260%5C%5C++++0+%26+0+%26+0+%260%260%26%5Calpha_0+++%5Cend%7Bmatrix%7D+++%5Cright%5D+" alt="\left[  \begin{matrix}    \alpha_0 &amp; 0 &amp; 0 &amp;0&amp;0&amp;0\\    0 &amp; \alpha_0 &amp; 0 &amp;0&amp;0&amp;0 \\    0 &amp; 0 &amp; \alpha_0 &amp;0&amp;0&amp;0\\    0 &amp; 0 &amp; 0 &amp;\alpha_0&amp;0&amp;0\\   0 &amp; 0 &amp; 0 &amp;0&amp;\alpha_0&amp;0\\    0 &amp; 0 &amp; 0 &amp;0&amp;0&amp;\alpha_0   \end{matrix}   \right] " eeimg="1"></p>
 <p data-pid="Znm4tmGg">当 <img src="https://www.zhihu.com/equation?tex=K%3D1" alt="K=1" eeimg="1"> 卷积运算矩阵即为：</p>
 <p data-pid="WYN7z4wx"><img src="https://www.zhihu.com/equation?tex=%5Cleft%5B++%5Cbegin%7Bmatrix%7D++++%5Calpha_0%2B2%5Calpha_1+%26+-%5Calpha_1+%26+0+%260%26-%5Calpha_1%260%5C%5C++++-%5Calpha_1+%26+%5Calpha_0%2B3%5Calpha_1+%26+-%5Calpha_1+%260%26-%5Calpha_1%260+%5C%5C++++0+%26-+%5Calpha_1+%26+%5Calpha_0%2B2%5Calpha_1+%26-%5Calpha_1%260%260%5C%5C++++0+%26+0+%26+-%5Calpha_1+%26%5Calpha_0%2B3%5Calpha_1%26-%5Calpha_1%26-%5Calpha_1%5C%5C++-%5Calpha_1+%26+-%5Calpha_1+%26+0+%26-%5Calpha_1%26%5Calpha_0%2B3%5Calpha_1%260%5C%5C++++0+%26+0+%26+0+%26-%5Calpha_1%260%26%5Calpha_0%2B%5Calpha_1+++%5Cend%7Bmatrix%7D+++%5Cright%5D+" alt="\left[  \begin{matrix}    \alpha_0+2\alpha_1 &amp; -\alpha_1 &amp; 0 &amp;0&amp;-\alpha_1&amp;0\\    -\alpha_1 &amp; \alpha_0+3\alpha_1 &amp; -\alpha_1 &amp;0&amp;-\alpha_1&amp;0 \\    0 &amp;- \alpha_1 &amp; \alpha_0+2\alpha_1 &amp;-\alpha_1&amp;0&amp;0\\    0 &amp; 0 &amp; -\alpha_1 &amp;\alpha_0+3\alpha_1&amp;-\alpha_1&amp;-\alpha_1\\  -\alpha_1 &amp; -\alpha_1 &amp; 0 &amp;-\alpha_1&amp;\alpha_0+3\alpha_1&amp;0\\    0 &amp; 0 &amp; 0 &amp;-\alpha_1&amp;0&amp;\alpha_0+\alpha_1   \end{matrix}   \right] " eeimg="1"></p>
 <p data-pid="BRSl3Kqs">当 <img src="https://www.zhihu.com/equation?tex=K%3D2" alt="K=2" eeimg="1"> 卷积运算矩阵即为：</p>
 <p data-pid="1JH6gknr"><img src="https://www.zhihu.com/equation?tex=%5Cleft%5B++%5Cbegin%7Bmatrix%7D++++%5Calpha_0%2B2%5Calpha_1%2B6%5Calpha_2+%26+-%5Calpha_1-4%5Calpha_2+%26+%5Calpha_2+%26%5Calpha_2%26-%5Calpha_1-4%5Calpha_2%260%5C%5C++++-%5Calpha_1-4%5Calpha_2+%26+%5Calpha_0%2B3%5Calpha_1%2B12%5Calpha_2+%26+-%5Calpha_1-5%5Calpha_2+%262%5Calpha_2%26-%5Calpha_1-5%5Calpha_2%260+%5C%5C++++%5Calpha_2+%26-+%5Calpha_1-5%5Calpha_2+%26+%5Calpha_0%2B2%5Calpha_1%2B6%5Calpha_2+%26-%5Calpha_1-5%5Calpha_2%262%5Calpha_2%26%5Calpha_2%5C%5C++++%5Calpha_2+%26+2%5Calpha_2+%26+-%5Calpha_1-5%5Calpha_2+%26%5Calpha_0%2B3%5Calpha_1%2B12%5Calpha_2%26-%5Calpha_1-6%5Calpha_2%26-%5Calpha_1-4%5Calpha_2%5C%5C++-%5Calpha_1-4%5Calpha_2+%26+-%5Calpha_1-5%5Calpha_2+%26+2%5Calpha_2+%26-%5Calpha_1-6%5Calpha_2%26%5Calpha_0%2B3%5Calpha_1%2B12%5Calpha_2%26%5Calpha_2%5C%5C++++0+%26+0+%26+%5Calpha_2+%26-%5Calpha_1-4%5Calpha_2%26%5Calpha_2%26%5Calpha_0%2B%5Calpha_1%2B2%5Calpha_2+++%5Cend%7Bmatrix%7D+++%5Cright%5D+" alt="\left[  \begin{matrix}    \alpha_0+2\alpha_1+6\alpha_2 &amp; -\alpha_1-4\alpha_2 &amp; \alpha_2 &amp;\alpha_2&amp;-\alpha_1-4\alpha_2&amp;0\\    -\alpha_1-4\alpha_2 &amp; \alpha_0+3\alpha_1+12\alpha_2 &amp; -\alpha_1-5\alpha_2 &amp;2\alpha_2&amp;-\alpha_1-5\alpha_2&amp;0 \\    \alpha_2 &amp;- \alpha_1-5\alpha_2 &amp; \alpha_0+2\alpha_1+6\alpha_2 &amp;-\alpha_1-5\alpha_2&amp;2\alpha_2&amp;\alpha_2\\    \alpha_2 &amp; 2\alpha_2 &amp; -\alpha_1-5\alpha_2 &amp;\alpha_0+3\alpha_1+12\alpha_2&amp;-\alpha_1-6\alpha_2&amp;-\alpha_1-4\alpha_2\\  -\alpha_1-4\alpha_2 &amp; -\alpha_1-5\alpha_2 &amp; 2\alpha_2 &amp;-\alpha_1-6\alpha_2&amp;\alpha_0+3\alpha_1+12\alpha_2&amp;\alpha_2\\    0 &amp; 0 &amp; \alpha_2 &amp;-\alpha_1-4\alpha_2&amp;\alpha_2&amp;\alpha_0+\alpha_1+2\alpha_2   \end{matrix}   \right] " eeimg="1"></p>
 <p data-pid="YXCY92eU"><b>看一下图的邻接结构，卷积运算矩阵的非0元素都在localize的位置上。</b></p>
 <h3><b>9.2 GCN中的Parameter Sharing</b></h3>
 <p data-pid="bD3z9ioj"><b>相关内容比较多，我专门写了一篇文章，感兴趣的朋友可以阅读一下。</b></p><a href="https://zhuanlan.zhihu.com/p/72373094" data-draft-node="block" data-draft-type="link-card" data-image="https://pic4.zhimg.com/v2-544351f0d07ef775fcb5874fdb4bb86f_720w.jpg" data-image-width="700" data-image-height="363" class="internal">superbrother：解读三种经典GCN中的Parameter Sharing</a>
 <hr>
 <p data-pid="isd3bmbR">在我最近新发表的一篇论文中，<b>就充分利用卷积模块，提出了结合图卷积（GCN）与 <img src="https://www.zhihu.com/equation?tex=1%5Ctimes1" alt="1\times1" eeimg="1"> 卷积的全新GRU单元，进一步构建双向循环神经网络，来一体化解决路网级实时交通数据补全与预测问题，算例实验充分讨论了该模型对于提取时空数据中语义信息的有效性。</b></p>
 <p data-pid="Qh-bQKq2">论文链接如下<b>，</b>欢迎感兴趣的朋友下载阅读</p><a href="https://link.zhihu.com/?target=https%3A//www.sciencedirect.com/science/article/pii/S0968090X21003740" data-draft-node="block" data-draft-type="link-card" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://www.</span><span class="visible">sciencedirect.com/scien</span><span class="invisible">ce/article/pii/S0968090X21003740</span><span class="ellipsis"></span></a>
 <p data-pid="TX3KSVg-">如果这篇论文的内容对于大家的研究工作有帮助，也希望进行引用。</p>
 <p data-pid="6mdjuN4S">Zhang, Z., Lin, X., Li, M., &amp; Wang, Y. (2021). A customized deep learning approach to integrate network-scale online traffic data imputation and prediction. <i>Transportation Research Part C: Emerging Technologies</i>, 132, 103372.</p>
 <hr>
 <h2><b>10 GCN的可解释性</b></h2>
 <p data-pid="N2sBpgeu">前面的内容，已经介绍了GCN的基本原理以及一些特性的理解。<b>这章节的内容是我个人的部分研究工作，将GCN应用于大规模交通路网速度预测问题中，通过参数的可视化，给出了所提出深度学习模型的可解释性分析。</b>感兴趣的朋友可以阅读一下我们的论文。</p><a href="https://link.zhihu.com/?target=https%3A//www.sciencedirect.com/science/article/pii/S0968090X18315389%3Fvia%253Dihub" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-24ac0f9a1feefe444b9e4f8e71dcfb80_720w.jpg" data-image-width="110" data-image-height="150" class=" wrap external" target="_blank" rel="nofollow noreferrer">Multistep speed prediction on traffic networks: A deep learning approach considering spatio-temporal dependencies</a>
 <p data-pid="uiGDZDap"><b>如果这个回答的内容对于大家的研究工作有帮助，也希望引用我们的论文。</b></p>
 <p data-pid="cHofDgDg">Zhang, Z., Li, M., Lin, X., Wang, Y., &amp; He, F. (2019). Multistep speed prediction on traffic networks: A deep learning approach considering spatio-temporal dependencies. <i>Transportation Research Part C: Emerging Technologies</i>, 105, 297-322.</p>
 <h2><b>11 关于有向图问题</b></h2>
 <p data-pid="L6fEXXt8">前面的理论推导都是<b>关于无向图，</b>如果是<b>有向图问题，最大的区别就是邻接矩阵会变成非对称矩阵，</b>这个时候不能直接定义<b>拉普利矩阵及其谱分解（拉普拉斯矩阵本身是定义在无向图上的）。这个时候有两条思路解决问题：</b></p>
 <p data-pid="O3amFcoQ"><b>（a）要想保持理论上的完美，就需要重新定义图的邻接关系，保持对称性</b></p>
 <p data-pid="KBi8-tls">比如<a href="https://link.zhihu.com/?target=https%3A//arxiv.org/abs/1802.01572" class=" wrap external" target="_blank" rel="nofollow noreferrer">MotifNet: a motif-based Graph Convolutional Network for directed graphs</a> 提出利用<b>Graph Motifs定义图的邻接关系。</b></p>
 <p data-pid="SPvzbWZS"><b>（b）如果只是为了应用，有其他形式的GCN或者GAT可以处理有向图</b></p>
 <p data-pid="LMHoik2J"><b>简而言之，要想简单地处理有向图问题，那就换成一种逐顶点（node-wise）的运算方式，可以参考下面这篇文章中的3.2及3.3节。</b></p><a href="https://zhuanlan.zhihu.com/p/81350196" data-draft-node="block" data-draft-type="link-card" data-image="https://pic4.zhimg.com/v2-5fa310178908ad84d7bc74c4a8741caf_720w.jpg" data-image-width="988" data-image-height="545" class="internal">superbrother：向往的GAT</a>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="jYP45OO8">值得说明的是：GAT作者写道“It is worth noting that, as Kipf &amp; Welling (2017) and Atwood &amp; Towsley (2016), our work can also be reformulated as a particular instance of MoNet (Monti et al., 2016). ”</p>
 <p data-pid="X7HKg6vl"><b>也就是说本质上这些模型都可以认为是在重新定义了图的邻接关系后，再进行基本的卷积运算。</b></p>
 <h2>12 GCN的过度平滑问题</h2>
 <p data-pid="p5J-8W-S">公式（5）给出的卷积核中，含有拉普拉斯矩阵的 <img src="https://www.zhihu.com/equation?tex=j" alt="j" eeimg="1"> 次幂。<b>当 <img src="https://www.zhihu.com/equation?tex=j" alt="j" eeimg="1">的取值较大时，GCN学习到的特征可能会存在过度平滑现象，即每个顶点的输出特征都十分相似。这个问题的原因及解决方法可以参考我下面的回答。</b></p><a href="https://www.zhihu.com/question/346942899/answer/848298494" data-draft-node="block" data-draft-type="link-card" data-image="https://pic3.zhimg.com/v2-d812d0464ef9c9c0938a1c1179a4ae92_720w.jpg" data-image-width="330" data-image-height="191" class="internal">如何解决图神经网络（GNN）训练中过度平滑的问题？</a>
 <h2><b>13 GCN的相关资料</b></h2>
 <p data-pid="LUe_BIn3">——————GCN的综述与论文合辑————————</p><a href="https://link.zhihu.com/?target=https%3A//mp.weixin.qq.com/s/WW-URKk-fNct9sC4bJ22eg" data-draft-node="block" data-draft-type="link-card" data-image="https://pic4.zhimg.com/v2-e739755f01457dc11e72521ea574cec3_720w.jpg" data-image-width="292" data-image-height="291" class=" wrap external" target="_blank" rel="nofollow noreferrer">深度学习时代的图模型，清华发文综述图网络</a><a href="https://link.zhihu.com/?target=https%3A//mp.weixin.qq.com/s/3CYkXj2dnehyJSPLBTVSDg" data-draft-node="block" data-draft-type="link-card" data-image="https://pic4.zhimg.com/v2-087ad3aa92f2da81af81d5d47bb9f0e3_720w.jpg" data-image-width="337" data-image-height="337" class=" wrap external" target="_blank" rel="nofollow noreferrer">清华大学孙茂松组：图神经网络必读论文列表</a><a href="https://link.zhihu.com/?target=https%3A//github.com/thunlp/GNNPapers" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-13da7b2eabfc6dd510d5e0927dc09a40_720w.jpg" data-image-width="200" data-image-height="200" class=" wrap external" target="_blank" rel="nofollow noreferrer">thunlp/GNNPapers</a>
 <p data-pid="8MFy4yPy">——————动手教程————————</p><a href="https://link.zhihu.com/?target=https%3A//mp.weixin.qq.com/s/sg9O761F0KHAmCPOfMW_kQ" data-draft-node="block" data-draft-type="link-card" data-image="https://pic3.zhimg.com/v2-c840dbf8d063b9aa74cefd700ae99f6a_720w.jpg" data-image-width="1080" data-image-height="458" class=" wrap external" target="_blank" rel="nofollow noreferrer">图卷积网络到底怎么做，这是一份极简的Numpy实现</a>
 <p data-pid="k3-9MqYS">——————华丽的分割线————————</p>
 <p data-pid="-3_gfqs4">还写了一些关于机器学习比较热点的文章，大家有需要可以看看，一起学习进步！</p><a href="https://www.zhihu.com/question/305395488/answer/554847680" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-3f38fbf82bb06771383af196cc4f30a4_720w.jpg" data-image-width="1206" data-image-height="897" class="internal">graph convolution network有什么比较好的应用task？</a><a href="https://www.zhihu.com/question/320688440/answer/697034632" data-draft-node="block" data-draft-type="link-card" data-image="https://pic2.zhimg.com/v2-9ef7c1a47576d077ba9aa3a81188035d_120x160.jpg" data-image-width="706" data-image-height="887" class="internal">要研究深度学习的可解释性（Interpretability），应从哪几个方面着手？</a><a href="https://www.zhihu.com/question/487457797/answer/2135791593" data-draft-node="block" data-draft-type="link-card" data-image="https://pic4.zhimg.com/v2-b679efda7db572ed63c4bad34f49b3cb_180x120.jpg" data-image-width="644" data-image-height="329" class="internal">时间序列预测很火的一维CNN+LSTM结构，CNN和LSTM之间该如何连接？</a><a href="https://www.zhihu.com/question/34878706/answer/654501152" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-c2eab0c5b0594623a4f102682c43a688_720w.jpg" data-image-width="636" data-image-height="498" class="internal">LSTM如何来避免梯度弥散和梯度爆炸？</a><a href="https://zhuanlan.zhihu.com/p/496788825" data-draft-node="block" data-draft-type="link-card" data-image="https://pic3.zhimg.com/v2-473523de57f1e1a4aac1254294e6beae_180x120.jpg" data-image-width="480" data-image-height="342" class="internal">superbrother：数学归纳法证明切比雪夫多项式中的简化运算</a>
 <hr><a data-draft-node="block" data-draft-type="ad-link-card" data-ad-id="fee_cabf11cc8524a31b64a9226f266ee834"></a>
 <p></p>
</body>