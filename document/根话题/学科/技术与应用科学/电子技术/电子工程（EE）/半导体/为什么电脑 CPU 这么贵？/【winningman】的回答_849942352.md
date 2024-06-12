# 为什么电脑 CPU 这么贵？
- 点赞数：6513
- 更新时间：2019年11月06日22时21分31秒
- 回答url：https://www.zhihu.com/question/34279916/answer/849942352
<body>
 <p data-pid="oUWL_Mt5">芯片厂工人不请自来。</p>
 <p data-pid="Cer4uqCv">你看到的CPU是这个样子：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-227f9b15aac62a98df31d516f3dce969_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="474" data-rawheight="316" data-original-token="v2-227f9b15aac62a98df31d516f3dce969" data-default-watermark-src="https://pica.zhimg.com/50/v2-a52f6ab9a5924b75dbc3fa3786109ab2_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="474" data-original="https://pic1.zhimg.com/v2-227f9b15aac62a98df31d516f3dce969_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="6slInKcE">这个是已经封装好的形态，外壳、硅板电路实际上不值几个钱，最贵的部分来自于里面的芯片。芯片在没有切割下来前是这样的晶圆形式：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-eee4656c910f265c4a52a6b08ea77f3b_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="362" data-rawheight="333" data-original-token="v2-eee4656c910f265c4a52a6b08ea77f3b" data-default-watermark-src="https://picx.zhimg.com/50/v2-60d354b0122bd22612d34f230ecc0707_720w.jpg?source=1940ef5c" class="content_image" width="362">
  <figcaption>
   晶圆示意图，主流的尺寸为12寸与8寸
  </figcaption>
 </figure>
 <p data-pid="KpoKFUvf">对芯片和半导体行业没有概念的童鞋可以先看一下这个片子补补课。</p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1164215217352540160" target="_blank" data-video-id="" data-video-playable="true" data-name="芯片制造科普视频" data-poster="https://pic3.zhimg.com/v2-e12d8e577bc34451291720e3de141b0d.jpeg" data-lens-id="1164215217352540160"><img class="thumbnail" src="https://pic3.zhimg.com/v2-e12d8e577bc34451291720e3de141b0d.jpeg"><span class="content"><span class="title">芯片制造科普视频<span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1164215217352540160</span></span></a>
 <p data-pid="jdLtO0mF">在这个行业呆的越久，你就会觉得芯片生意真的是超级难做，为什么我们国家现在是以举国之力在发展半导体/芯片行业，而不是依靠市场的自发行为？</p>
 <p data-pid="KK2Fcrj7">一个最重要的原因：成本太高，如果没有国家层面在政策与资金上的支持，几乎没有企业能挺过在研发与startup阶段的巨额烧钱式的投资。</p>
 <p data-pid="1rXGUxDM"><b>成本高在哪些方面呢？</b></p>
 <p data-pid="rQB2M2r9"><b>一、流片成本高。</b></p>
 <p data-pid="JtI63gDZ">在大批量生产前要进行数量较少的流片验证。虽然晶圆片数较少，但是光罩的数目（photomask）一个都不会少。CPU的光刻步骤大约在一两百步以内，每一步光刻都需要一块光罩，光罩的费用占据了流片阶段成本的很大一部分。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-49c4b045fded69cd421684061b16e533_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="300" data-rawheight="200" data-original-token="v2-49c4b045fded69cd421684061b16e533" data-default-watermark-src="https://picx.zhimg.com/50/v2-e80d2d745d780f3e36b1ae52bc830ed8_720w.jpg?source=1940ef5c" class="content_image" width="300">
  <figcaption>
   光罩里的图案极其精细，制造难度大，因而售价不菲
  </figcaption>
 </figure>
 <p data-pid="dVfG4YWQ">而流片后，往往就会发现光罩里的图案设计是需要优化的，并且这种优化并不只针对一层光罩，很多时候需要多层光罩同时修改，成本就进一步增加了。</p>
 <p data-pid="4zLiTgyj"><b>二、工艺成本高。</b></p>
 <p data-pid="ysSqcsjD">先进CPU芯片工艺步骤大约处于1000-3000步这个范畴。每一步都有物料成本，便宜的像scrub（冲洗）这种工艺，大约每片加工成本处于分、毛这个量级，个别步骤的成本也可能会达到百元级别，比如使用了昂贵的材料。所有步骤累加起来就是一个比较大的数字了。</p>
 <p data-pid="xyhCoOfS">越先进的芯片，芯片结构就越复杂，工艺步骤就会越多。折算到每片晶圆上的成本就会越高。</p>
 <p data-pid="MdPCzcMC">就拿最简单的MOSFET（金氧半场效晶体管）结构来讲，早期的MOSFET是这样的物理结构：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-3a39d13ae9735743d784414c7c14b608_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="613" data-rawheight="602" data-original-token="v2-3a39d13ae9735743d784414c7c14b608" data-default-watermark-src="https://pic1.zhimg.com/50/v2-5d707f14d5d0a0e4f86a7bdc954739c4_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="613" data-original="https://pic1.zhimg.com/v2-3a39d13ae9735743d784414c7c14b608_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="qbT0LSs1">而现在，MOSFET发展成了FinFET（鳍式场效应晶体管），工艺步骤明显变多了，它长这样：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-5954dbd587d457d4f32377917db3979c_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="690" data-rawheight="648" data-original-token="v2-5954dbd587d457d4f32377917db3979c" data-default-watermark-src="https://picx.zhimg.com/50/v2-18b175a1633275b8d1deac4834f0aaaa_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="690" data-original="https://pica.zhimg.com/v2-5954dbd587d457d4f32377917db3979c_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="rgcDrTLA">除了物料成本，生产超净间要365天*24小时保持电力运转，这么大空间的空气净化、湿度保持、恒温保持、污染颗粒去除，都需要电力成本。有媒体甚至爆出，全台湾用电的增加量，约三分之一由台积电贡献。足见半导体生产线的用电量之大。</p>
 <p data-pid="f_YbC-pu"><b>三、设备成本高。</b></p>
 <p data-pid="Sh11H4yl">半导体厂的生产设备都是极其昂贵的，很多设备的消耗性零件的售价是可以轻松买一辆路虎的。设备的折旧费用自然也会折算到芯片的成本之中。</p>
 <p data-pid="MEUKGLP2">最昂贵的就是光刻机，因为光刻机要实现的工艺太过精密，我在回答这个问题中有介绍到光刻机的精密：</p><a href="https://www.zhihu.com/question/53394745/answer/801699800" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-1bd964cf14d4ec935a8e140aa13adf70_180x120.jpg" data-image-width="1732" data-image-height="1038" class="internal">你现实中见过科技含量最高的东西是什么？</a>
 <p data-pid="4p1Ko0xX"><b>四、风险成本高。</b></p>
 <p data-pid="JuklDsQ1">越是先进的制程与产品，对产品工艺的要求就越高。晶圆从第一步开始，到最后完成加工，先进芯片往往要历时几个月才能完成这一过程，它们随时都会“死”在半路，包括但不局限于以下的死法：</p>
 <p data-pid="7e47cosv">1）技术工人由于太想女朋友走神了，装错了设备零件。</p>
 <p data-pid="7oRWfOz9">2）设备发生异常而没有警报，从而发生工艺偏离。</p>
 <p data-pid="RWJ6wUaD">3）自动化系统自己死机了......</p>
 <p data-pid="o_8vk7zA">4）晶圆水土不服，不知道什么原因自己碎在了FOUP（装晶圆的容器）里。</p>
 <p data-pid="FmUuLFC-">5）旋转过程中被甩飞了，撞的粉身碎骨......</p>
 <p data-pid="Kz13lzvZ">.......</p>
 <p data-pid="ohMVJfZO">原因五花八门，先不说工艺本身的失效，单是可以避开各种事故而冲到最后一步就已经很幸运了。而“死掉”的那些晶圆不能白死，都会反映到芯片的售价中来。</p>
 <p data-pid="htSBOoY1">再先进的厂子也无法避免这些风险事件的发生。台积电就也曾因为风险工艺报废了十万片晶圆，当然这事得赖猪队友供应商陶氏化学。</p><a href="https://link.zhihu.com/?target=https%3A//new.qq.com/omn/20190129/20190129A0JHI6.html" data-draft-node="block" data-draft-type="link-card" data-image="https://pic1.zhimg.com/v2-c191a4660351d1b328020ff2b5a18370_180x120.jpg" data-image-width="640" data-image-height="426" class=" wrap external" target="_blank" rel="nofollow noreferrer">台积电上万片晶圆报废 猪队友或是日商信越、JSR 及陶氏化学</a>
 <p data-pid="7YUXXYp_">除了这些，还有芯片设计成本、人力成本、封装成本、运输成本、销售宣传成本......</p>
 <p data-pid="sPWiN5Ee">看完这些，你还会觉得CPU贵吗？一个经历了几千步的加工步骤，集合了差不多全人类所有智慧的结晶，叠加了林林总总的成本后居然只卖几千元，简直便宜爆了好伐。</p>
</body>