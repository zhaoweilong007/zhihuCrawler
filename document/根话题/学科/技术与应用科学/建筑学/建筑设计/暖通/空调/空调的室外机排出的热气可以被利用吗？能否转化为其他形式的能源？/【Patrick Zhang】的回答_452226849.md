# 空调的室外机排出的热气可以被利用吗？能否转化为其他形式的能源？
- 点赞数：6403
- 更新时间：2018年07月27日20时02分32秒
- 回答url：https://www.zhihu.com/question/286878110/answer/452226849
<body>
 <p data-pid="dS5qreEF">很有意思的问题，想起一件往事了。</p>
 <p data-pid="b5sxKicn">刚刚参加工作时分配在一家老国企，实习期当了一段时间的电工和仪表工。</p>
 <p data-pid="z5UUcYjy">国企的玻璃纤维纺织车间有几台巨大的排风机，排出来的热风温度很高。某日和几位电工一起突发奇想，能不能把这些热量收集利用起来，说不定能成为很好的技术革新项目。要知道，当年工资很低，若能开发出技术革新项目，所获得的奖金是1年的工资总和！</p>
 <p data-pid="JL1HIf1T">仪表专业的特征是各种元器件都有，即便没有，可以立即下订单给采购部门，他们就会按时采购到位。</p>
 <p data-pid="Gv8z58F7">于是立刻动手设计。想法是这样的：我们把热风中的能量收集起来，储存到蓄电池中，这样就可以实现能量转换了。</p>
 <p data-pid="YT16Znvl">用什么来转换？首先想到的是热电偶。</p>
 <p data-pid="jM6E3vKR">大家都知道测温的热电偶，它的原理如下：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-2aa647cd809f3bdc2f0b8939eb86f16b_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="909" data-rawheight="438" data-original-token="v2-6d2e90ab0a3be690a21e3f961ed04678" data-default-watermark-src="https://picx.zhimg.com/50/v2-acc8b7326260b1d0cecb1b6e3d8479d4_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="909" data-original="https://pica.zhimg.com/v2-2aa647cd809f3bdc2f0b8939eb86f16b_r.jpg?source=1940ef5c">
  <figcaption>
   图1：热电偶阵列和蓄电池
  </figcaption>
 </figure>
 <p data-pid="mQeHie9U">想法很简单：我们制作一个热电偶阵列，利用它把热能转换为电能，并存入蓄电池即可。</p>
 <p data-pid="v1kQPa60">我找来若干废旧的镍铬-镍硅热电偶，把它拆开，将镍铬丝和镍硅丝切成百段，用点压焊机把它们焊接成100个热电偶，再组成10X10的热电偶阵列。</p>
 <p data-pid="Y8LxxN_E">下图是镍铬-镍硅热电偶的分度值表：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-50ffad01753398f8bbd5545eaa973bbc_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="855" data-rawheight="471" data-original-token="v2-de69f098cbc64cde2a863d6edf5cad2e" data-default-watermark-src="https://picx.zhimg.com/50/v2-8f75a5ecf47957061d690cb20b7a228e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="855" data-original="https://picx.zhimg.com/v2-50ffad01753398f8bbd5545eaa973bbc_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="OuPfxEVX">热风风口在冬天的温度是60到70度，夏天更高。当时是冬天，温度大约在65度，我们看到镍铬-镍硅输出的电压是2.643毫伏。</p>
 <p data-pid="OgARS7St">我设计了一个电路，输入端就是来自热电偶阵列的100个毫伏电压。我把它们做了组态，通过串并联获得较高的电压；电路的中间级是用运放构建的电压-电流变换器，输出端是恒流源电路，实现向蓄电池恒流充电。</p>
 <p data-pid="8MguO50l">电路制作完毕，和几位电工一起把转换器安装到位。</p>
 <p data-pid="lSJO6G5N">效果如何？一个蓄电池充满需要近2天。于是，打算修改电路，进一步提高转换效率。</p>
 <p data-pid="P7TmCV18">然而，因为突然在排风机风口出现这么一个怪东西，动力车间的工程师来观察一番，接着把我们告到厂部技术科，说我们的东西挡住了排风风口，造成散热流量损失，影响N大。</p>
 <p data-pid="AZffRkUS">技术科科长来看后，通知我们立刻拆除。大家面面相觑，毫无办法。</p>
 <p data-pid="WPbgh5uH">总工也知道了这件事，专门找我谈话。这位留苏的玻璃工业专家，他对我说了几件事：</p>
 <p data-pid="vm1AYmTn">第一：这种电路的测量原理是对的，可以实现能量转换；</p>
 <p data-pid="TvABHOyy">第二：从卡诺循环的原理可知，这件事是得不偿失的。因为温度场的温度太低，我们付出的成本和转换效率与收益相比，没有价值；</p>
 <p data-pid="f_7Q-Pdy">第三：这种技术革新不实用，它会破坏生产条件，增加事故隐患。必须立刻拆除；</p>
 <p data-pid="3r0wrHW3">第四：建议要把思路从技术革新改变为技术创新。让我们的发明在市场中得到运用和检验，这才能实现名利双收。</p>
 <p data-pid="SIHdbeOs">最后，当然是忍痛拆除了。</p>
 <p data-pid="RwTmgi7-">老国企的共青团组织得知此事，立刻写了一个广播稿，把我们大加鼓励和赞赏。说试验虽然不可行，但精神可嘉，并给我们几元钱的午餐补贴。于是午餐时，大家美美地吃了一顿，品尝这来之不易的美味奖赏。</p>
 <p data-pid="iCPuIgrr">当然，我们立刻出名了，全公司近五万名职工都知道我们了，连进大门处的保安都对我们点头致意。开心！</p>
 <p data-pid="gh06STEJ">此后数年，我得到若干项专利技术。正如总工所说，要实现技术创新，才能让发明的价值充分发挥出来。</p>
 <p data-pid="WVqdkRjI">====================</p>
 <p data-pid="ln-6TtWo">故事讲完了，题主的问题答案也有了。答案是：当然可以把空调室外机排出来的热气能量收集起来并转换为电能。然而，这种能量转换的价值不大，投入的成本和转换成本远远高于收益。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-aa15dc291ac06bb4973734b0f2e4efa3_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="613" data-rawheight="428" data-original-token="v2-9f0408bf69d2e84ce1fa78a03514d37f" data-default-watermark-src="https://picx.zhimg.com/50/v2-d6131d63a0a97f30807f74be9bd41cd1_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="613" data-original="https://pica.zhimg.com/v2-aa15dc291ac06bb4973734b0f2e4efa3_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="obeONgD5">其实，想想物理学的卡诺循环效率即可得知此事的可行性了。</p>
 <p data-pid="PC___Pmo">===================</p>
 <p data-pid="JCWNtZA3">这个帖子发布已经有1天了，看到许多知友在评论区提了各种看法和建议，很有意思。</p>
 <p data-pid="0TbtjF5b">为了让大家多了解这个问题，我把我做过的试验再给大家描述一下：</p>
 <p data-pid="A4N_-APy">我所工作过的老国企属于玻璃制造业。它有3种产品，第一种是平板玻璃，第二种是玻璃纤维和玻璃钢。玻璃制造企业属于资金和技术密集型企业，而玻璃纤维因为有织布工序因而属于劳动密集型企业，所以职工人数的绝大部分就在玻璃纤维车间。</p>
 <p data-pid="MNYvcjRn">玻璃纤维的制造过程是这样的：首先要有一座专门日产近百吨玻璃珠的玻璃熔窑，然后在专门的玻璃纤维抽丝机里让玻璃珠熔融，经过白金坩埚的孔板，玻璃液被抽丝机拉制成直径为数微米的玻璃纤维。一颗玻璃珠据说可以拉制成近1千千米的玻璃纤维。再往下自然就是将玻璃纤维纺织成玻璃布了。</p>
 <p data-pid="yxBd8hIj">我们想象一下，一百多台玻璃纤维抽丝机工作是怎样的情景：从人头顶高处熔融的红色玻璃液流出，在人膝盖处有高速旋转的玻璃纤维线框，线框把玻璃纤维缠绕起来。在这个过程种，被抽出的玻璃纤维运行速度极快，它从红热到常温依靠空气来降温散热，可见，拉制玻璃纤维的工段一定是温度相当高的工作环境。</p>
 <p data-pid="igYC0ECz">车间里配备了数台大功率（55kW）的风机，它的叶片直径大约有2米。这些风机利用风管延伸到玻璃纤维抽丝机机台上，把高温的空气抽走，最后直排到大气中。</p>
 <p data-pid="qgN_Vksi">本文谈到的排风机指的就是这些风机。</p>
 <p data-pid="mLCOudQ0">至于抽丝工段所配备的大功率中央空调机组，它的散热依靠建筑物顶端的水循环散热塔，这部分不在本文的讨论范围之内。</p>
 <p data-pid="uA8luQ-y">我们来看下图：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-94351cc7a7e3bf03447505d39197f26b_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="835" data-rawheight="375" data-original-token="v2-0ab302c90d610cee9f3aef46f1859b13" data-default-watermark-src="https://pic1.zhimg.com/50/v2-8d3fe33c5e261031da361b4917ccfa65_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="835" data-original="https://pic1.zhimg.com/v2-94351cc7a7e3bf03447505d39197f26b_r.jpg?source=1940ef5c">
  <figcaption>
   图2：玻璃纤维抽丝机散热空气通道示意图
  </figcaption>
 </figure>
 <p data-pid="NUpXQjEg">从图中我们看到，热空气的流量十分重要。若流量受限，则系统的散热效率会大打折扣。</p>
 <p data-pid="K-zJCt-b">我们还看到，热电偶阵列尽管尺寸不大，但它的确会对热空气流量产生一定的影响。</p>
 <p data-pid="sNB_itRA">如果我们利用热电偶阵列把热空气的热量转换为电能，正如一位知友所说，情况类似于在自行车上安装了发电机，给自己造成了阻力。可见，这的确有点得不偿失的。</p>
 <p data-pid="NpHebzdf">对于空调外机，它的示意图如下：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-a61afefdfa4b7607f9b80682398f8b1d_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="680" data-rawheight="378" data-original-token="v2-fa4bd3f3e25aeeef3497ae5d5b3a6d15" data-default-watermark-src="https://picx.zhimg.com/50/v2-7e9e43a949bf2412674e056f9bf293d6_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="680" data-original="https://pic1.zhimg.com/v2-a61afefdfa4b7607f9b80682398f8b1d_r.jpg?source=1940ef5c">
  <figcaption>
   图3：空调机组户外机的原理示意图
  </figcaption>
 </figure>
 <p data-pid="LUXNTt_a">在这里，我们看到了毛细管风栅，它由细密的毛细管组成，毛细管管道里流动的就是需要散热的热态制冷剂。当风扇吹风时，毛细管风栅中的热量被空气带走，形成了空调外机前端的热风。在这里，热态制冷剂被强制降温，然后被压缩机抽回室内机实施循环降温。</p>
 <p data-pid="0DS9F90l">如果我们也在毛细管风栅处安装热电偶阵列，或者安装在空调外机前不远处，我们很容易想到，冷空气的流量必定会受阻，毛细管风栅的工作效率必然会下降。</p>
 <p data-pid="VmnD95Pe">根据卡诺循环的原理，热机工作在高温热源和低温热源之间，热机的工作效率与高低温热源的温度差成正比。空调外机吹出的热风与冷空气之间的温度差其实并不高，即便我们安装了热电偶阵列，但可以想见，所获得的电能十分有限。</p>
 <p data-pid="MV33jHis">由此我们能看出，不管采取什么方法，只要我们安装的能量转换部件（哪怕只是一件衣服）阻碍了空调外机的空气流量，就会降低空调外机的工作效率，而我们从这些能量转换部件中所获得的能量却很少。</p>
 <p data-pid="7LyCPqsB">如果我们把毛细管风栅本身制作成热电偶阵列，当然可以获得一些能量，但这些可怜兮兮的能量用来点燃几个LED指示灯恐怕都有问题，更别想回馈给空调机作为动力能源了。</p>
 <p data-pid="H8v9dj3c"><b>最后，我给大家总结一下：</b></p>
 <p data-pid="mJScVfRR"><b>空调外机的风扇吹出了热风，热风扩散在大气中。如果我们期望把散失在大气中的热量回收起来，就存在回收效率的问题。</b></p>
 <p data-pid="EYm7Shdj"><b>物理学的卡诺循环告诉我们，效率与高温热源和低温热源的温度差有关。但请注意以下两点：</b></p>
 <p data-pid="Hf7en44T"><b>第一：我们不可能把空调外机所排出的热空气全部都收集起来，热量会有大量的散失；</b></p>
 <p data-pid="Yr2e94QK"><b>第二：空调外机所排出的热空气温度与冷空气之间的温度差太低。</b></p>
 <p data-pid="KHew9TNn"><b>基于这两个原因，不管采用什么方法，我们能从空调外机所排出的热空气中回收的能量是很有限的，转换效率很低。如果要提高效率，所投入的设备和成本会大幅度增加，反过来又进一步降低了效率。</b></p>
 <p data-pid="yC77Tkct"><b>如果我们能把空调外机所排出的热空气能量全部回收，事实上就是永动机了。热力学告诉我们，永动机是不存在的，我们也不可能从空调热风中获得什么实际效益。</b></p>
 <p data-pid="IvDyH62J">当然，利用热风吹干衣服还是可以的，但距离一定要远一些，不要影响空调机组的风场流量才行。</p>
</body>