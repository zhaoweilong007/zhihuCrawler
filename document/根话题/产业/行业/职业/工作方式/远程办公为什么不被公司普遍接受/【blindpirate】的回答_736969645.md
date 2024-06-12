# 远程办公为什么不被公司普遍接受?
- 点赞数：5443
- 更新时间：2019年07月04日19时40分18秒
- 回答url：https://www.zhihu.com/question/333127774/answer/736969645
<body>
 <p data-pid="zK2635hI">我建议没有全职远程工作过的人就不要发表意见了。我所在的公司全员远程，分布在五个洲，从公司建立的第一天就开始远程，一直远程了十年。我已经这样工作了两年时间。</p>
 <p data-pid="I_eunV2D">回到问题上来。远程工作在技术上没有任何问题，业界的很多公司，如我厂（Gradle）、Pivotal、GitLab都采用这种模式，你们的项目再大能大过GitLab？Gradle的主仓库有接近300万行代码，你们的项目有多少代码？所以说什么项目复杂人员沟通的问题都不是本质原因。</p>
 <p data-pid="i-rAcJI5">本质原因是，以绝大多数程序员的素质，不足以支撑他们进行远程工作与沟通。人员素质才是根本原因。有的人一句话一行代码就能说清楚的问题，有的人得反复沟通上半个小时。能够进行远程办公的人，通常是具备极高的开发水平、沟通素质的人。举个例子，拿alibaba/fastjson仓库里的issue来说：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-3034cce522ad68cbff0ff0ab1d3cc3f9_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1710" data-rawheight="546" data-original-token="v2-82e903e6e475cda32f5dbe7a9b5346f0" data-default-watermark-src="https://picx.zhimg.com/50/v2-c5997c1ea910bfee40282bef929e50c5_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1710" data-original="https://pic1.zhimg.com/v2-3034cce522ad68cbff0ff0ab1d3cc3f9_r.jpg?source=1940ef5c">
 </figure>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2b801d1abd36839d9f0e86eff5f5cebc_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1330" data-rawheight="986" data-original-token="v2-515caf249bbb64bc6ee352d105ce6a47" data-default-watermark-src="https://pic1.zhimg.com/50/v2-95ec5f5602b1a748944c66b619debf76_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1330" data-original="https://pica.zhimg.com/v2-2b801d1abd36839d9f0e86eff5f5cebc_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="kA5TAi6z">太多的开发人员活在自己的世界中，连报bug都报不好，上来就没头没尾地说一大堆，不给重现例子，不说版本，一厢情愿地以为对方“一定能听懂自己在说什么”，很不幸，我不是你，我根本不知道你在说什么。有一段时间我负责跟社区打交道，见了太多这种以自我为中心，报bug就一句话的人：“XXX在XXX时报错”。指望他们去远程协作，还是洗洗睡吧。</p>
 <p data-pid="Q2Xkh_ox">对于我自己，如果我要报bug，我一定会给出详细的环境、重现例子，如果可能的话我甚至会告诉对方哪里错了。比如这个：<a href="https://link.zhihu.com/?target=https%3A//github.com/gradle/gradle/issues/1861" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">github.com/gradle/gradl</span><span class="invisible">e/issues/1861</span><span class="ellipsis"></span></a> 我在加入Gradle之前报告的一个bug，我给出了重现的例子，指出了问题，并定位到了具体的错误代码行。</p>
 <p data-pid="WB2ktMQo">这是我给IDEA报的一个bug：<a href="https://link.zhihu.com/?target=https%3A//youtrack.jetbrains.com/issue/IDEA-197550" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">youtrack.jetbrains.com/</span><span class="invisible">issue/IDEA-197550</span><span class="ellipsis"></span></a> 同样给出了重现的例子，指出了问题，并定位到了具体的错误代码。</p>
 <p data-pid="mZIy6jc2">你可能觉得我说的事情跟远程工作八杆子打不着，但是恰恰是这些你毫不在意的、绝大多数人都做不好的细节，导致了远程工作难以大规模的广泛开展。</p>
</body>