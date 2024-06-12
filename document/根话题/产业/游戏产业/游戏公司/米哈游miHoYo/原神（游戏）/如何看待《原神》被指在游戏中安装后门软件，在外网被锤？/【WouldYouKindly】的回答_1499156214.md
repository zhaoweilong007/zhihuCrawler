# 如何看待《原神》被指在游戏中安装后门软件，在外网被锤？
- 点赞数：7847
- 更新时间：2020年09月30日10时23分03秒
- 回答url：https://www.zhihu.com/question/423392474/answer/1499156214
<body>
 <a href="https://www.zhihu.com/zvideo/1294452823984095232" data-draft-node="block" data-draft-type="link-card"></a>
 <p data-pid="Qy2MY6Kk"><b>这次炎上（被大范围批判）的最大原因是pc早期版本《原神》关闭后监控程序不关闭，甚至《原神》卸载之后这个监控程序都没有删除，必须手动删掉。而且直接删还不行，得用“管理员模式”。</b></p>
 <p data-pid="OSZr_PlL"><b>关于这点，米哈游也没有对用户有任何告知。</b></p>
 <p data-pid="YieVTufG">这是跟以往反作弊软件节奏都不太一样的原因。</p>
 <p data-pid="dekq90Ki"><b>而这点目前所有国家pc版《原神》玩家都一样。</b></p>
 <p data-pid="cF9jz-Z4"><i>这次是属于吃瓜吃到自己头上来了…</i></p>
 <p data-pid="x3NqPptn"><b>所以建议所有卸载过或者打算卸载pc版《原神》的玩家，如果看到本回答，建议也按照本回答最后的两步做一下，验证一下有利无弊。</b></p>
 <p data-pid="XABRwnWq"><i>有回复说有其他xx游戏也这样，要我“一一分析”……</i></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-d4b77dd0333fe9d0d85d05e67cbeac7f_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1080" data-rawheight="234" data-original-token="v2-a53f31892bf2732457ae863052c9ee6d" data-default-watermark-src="https://picx.zhimg.com/50/v2-0d6bf30ad4d0fbb3b9c2828f18fe4ac1_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1080" data-original="https://picx.zhimg.com/v2-d4b77dd0333fe9d0d85d05e67cbeac7f_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="d0CvUIJD"><i>但我pc之前还真不玩端游，这次《原神》应该算是“本年轻人的第一款pc端游”吧。</i></p>
 <p data-pid="XFlh6PYz"><i>因此可能是少见多怪，这次也只是就事论事，见识短浅之处还望见谅。</i></p>
 <hr>
 <p data-pid="c8lYLpmz">我之前PC也下载过《原神》，正好还没卸载。</p>
 <p data-pid="k5gr-iRD">现在就动手试着卸载验证一下。</p>
 <h2>开始卸载</h2>
 <p data-pid="kk0NMvE7">有一说一，确实是良心卸载界面无欺诈。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-5968814fe3f52d73fe80f158a648da68_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1920" data-rawheight="3136" data-original-token="v2-1598d52e132719c3c881b7c90f8f78b2" data-default-watermark-src="https://pica.zhimg.com/50/v2-19571aa9228bec7931e23b81446e180f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1920" data-original="https://picx.zhimg.com/v2-5968814fe3f52d73fe80f158a648da68_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <h2>卸载完成</h2>
 <h2>再来看下防作弊文件目前的状态</h2>
 <p data-pid="j2hnnz25">打开cmd，输入“sc query mhyprot2”。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-1927f1dad51f435f750bef9ed786e900_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1920" data-rawheight="1080" data-original-token="v2-2fdd6d87ec650723256239a8b9e30824" data-default-watermark-src="https://picx.zhimg.com/50/v2-16a67c55cb9d7b7bd9f5b061eebfb778_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1920" data-original="https://picx.zhimg.com/v2-1927f1dad51f435f750bef9ed786e900_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="9V7rvuYZ"><b>显示文件状态为“STOPPED”。</b></p>
 <h2><b>也就是说防作弊文件已经被停止，但依旧存在于你的硬盘上没有因为卸载了而被删除。</b></h2>
 <p data-pid="ki2B4bxz">（显示DELETED才是删除）</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="s6ksOd1k"><b>海外用户连监控软件都不能接受，难道能接受一个不专门特意去手动删就删不掉的文件？</b></p>
 <p data-pid="dYD2pefW">再考虑到国外很多人对中国流氓软件的忌讳，现在搞这么一出，那自然很多人会往“中国人偷技术”“中国人存心种木马”上面去想，还有阴谋论者会继续上纲上线。</p>
 <p data-pid="OT_NFoxb"><b>这波操作尤其是“不能自动删”算是突破海外玩家的双重底线了，也真怪不得别人往这上面想。好歹别的公司出了海都是夹起尾巴做人的乖乖仔。</b></p>
 <p data-pid="CfDDPAjl">据用户反映，这个问题在二测时候海外已经有玩家提出反馈，当时的海外社区运营在reddit表示了会对玩家进行反馈。然后不了了之。典型的给你机会你不中用…</p>
 <h2><b>昨天日推（不知道的可以大致理解为微博）热搜第一挂了很久，不少外国人直接把这说成“CN间谍软件”，什么性质自己掂量。</b></h2>
 <p data-pid="9Ka4jYL4">不太懂运营，也不想去懂。</p>
 <p data-pid="e2Ats_Br">自己能做的只有电脑删干净，了事。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="L72mred7"><i>评论有人说一打开《原神》就又回来了。</i></p>
 <p data-pid="VxOU-deQ"><i>这是当然啊，如果要继续玩《原神》那肯定删不掉啊，这是端游反作弊软件。</i></p>
 <p data-pid="2_LhiE5x"><i>回答主要解决的是卸载后还没删掉的问题。</i></p>
 <hr>
 <h2><b>改进版步骤：</b></h2>
 <h2><b>可以先照搬上面的步骤，如果发现是stopped不是deleted，那可以继续下面3步操作：</b></h2>
 <h2><b>1、用“以管理员身份打开”点开cmd。</b></h2>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-caa778ec6eb9e06892e6ddff471f8065_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="800" data-rawheight="450" data-original-token="v2-ce0eb3ff30a6738e23b24eee187cd717" data-default-watermark-src="https://picx.zhimg.com/50/v2-5c7e9ab4703619a4c8f9692f7a9f35a0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="800" data-original="https://picx.zhimg.com/v2-caa778ec6eb9e06892e6ddff471f8065_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="u4Hqtmar">注意，一定要管理员身份打开，不然会无法删除。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-f3e2b602f57eb62db606ad4e3ad8f155_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1920" data-rawheight="1080" data-original-token="v2-8f7659f22fbee024f61893353e0f07e6" data-default-watermark-src="https://picx.zhimg.com/50/v2-6fe898460e8393631a02d60ec14c2c76_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1920" data-original="https://picx.zhimg.com/v2-f3e2b602f57eb62db606ad4e3ad8f155_r.jpg?source=1940ef5c">
 </figure>
 <h2><b>2、在cmd里先输入“sc stop mhyprot2”，再输入“sc delete mhyprot2"，回车。</b></h2>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-9543f4a55602091fd08dbb19b7dc8d4a_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1920" data-rawheight="1080" data-original-token="v2-d5293e872c62c7ecf10e0f3b13fcd551" data-default-watermark-src="https://picx.zhimg.com/50/v2-f0c18e082b530f6a0be67f25fa7fc361_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1920" data-original="https://picx.zhimg.com/v2-9543f4a55602091fd08dbb19b7dc8d4a_r.jpg?source=1940ef5c">
  <figcaption>
   我是直接输入delete成功的，但目前来看更推荐先sc stop mhyprot2
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="nfKrcwYa"><b>3、可以用win+R然后输入msinfo32，软件环境，展开，系统驱动程序，然后去找mhyprot2。</b></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-8d8f362700ed72ac26bb462d26cde4fa_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1024" data-rawheight="576" data-original-token="v2-044a9172f7fd62cba6b225eb2f822b54" data-default-watermark-src="https://picx.zhimg.com/50/v2-2fc809b54651aa28ebe86a1966c51bdc_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1024" data-original="https://picx.zhimg.com/v2-8d8f362700ed72ac26bb462d26cde4fa_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="1VI-MfAV">查找不到，说明该驱动已被卸除；接着可以去看看有没有残留文件，可以直接手动删除。<br><br>
  如果你卸载了游戏，依旧查找到了这一项，说明驱动还在，需要按照上面说的在CMD环境下用sc 命令停止运行后，删除掉它的驱动服务，然后再去删除本地文件。</p>
 <p data-pid="P5OeKaxv">最后去找一下C:\Users\（自己的用户名）\AppData\Local\Temp\，找一下有没有mhyprot2.sys。没的话最好，有的话删了。</p>
 <p data-pid="q13gQ3om"><b><i>（我不是大佬，担当不起。这是游戏论坛里大家一起找到的方法，整理了一下而已。只希望确实有帮到大家。）</i></b></p>
 <hr>
 <p data-pid="c7wWBYHF"><b>毕竟，这是我的电脑，我玩你游戏你监控我盘我已经没说什么了。</b></p>
 <p data-pid="M6mcesWz"><b>现在我都把你卸了你就麻溜点。</b></p>
 <p data-pid="SVqGs8mc"><b>你还赖着不走了，那TM踹也要把你踹出去。</b></p>
 <hr>
 <h2>集思广益求助：有几个私信我遇到了这样的问题，有没有碰到类似问题然后解决了的，征集一下。</h2>
 <p data-pid="0b33GtoW">不是stopped也不是deleted而是running，sc delete未果，软件环境里依然没有卸掉。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-db2991cfc880ffd2b2b76ecea501aac9_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2008" data-rawheight="952" data-original-token="v2-3445f8b74a554bf3d0fed2f28279479c" data-default-watermark-src="https://pic1.zhimg.com/50/v2-5ebfd1200311e054d7675847edb268dc_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2008" data-original="https://picx.zhimg.com/v2-db2991cfc880ffd2b2b76ecea501aac9_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="tbMvK-0-">sc stop操作后显示stopped。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-76265cb15e91835e424da9fbffc56552_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2008" data-rawheight="952" data-original-token="v2-86c48e5ef9cecf0cc5f81901658d4555" data-default-watermark-src="https://picx.zhimg.com/50/v2-4325fda0fb5981daf6db738da9acca1c_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2008" data-original="https://pic1.zhimg.com/v2-76265cb15e91835e424da9fbffc56552_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="OpgaDIh2">然后sc delete删除显示未安装。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-60bff63fe749873a0bcc09514c788e8e_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2008" data-rawheight="952" data-original-token="v2-598031640559a5b37d08b1282cc1632b" data-default-watermark-src="https://pic1.zhimg.com/50/v2-1e4a2ce419048f9cd9a8d82bcbcb7beb_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2008" data-original="https://picx.zhimg.com/v2-60bff63fe749873a0bcc09514c788e8e_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="Iv-B41VU">如果有知道解决方法的求私信一下，我可以发出来给碰到类似情况的朋友参考。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="9YqQviLX">现在对于这个问题，大概有几种建议可供参考：</p>
 <p data-pid="u5Z7oZHi">1、 <a class="member_mention" href="https://www.zhihu.com/people/96acf36af3aec166f414b27e1c052d68" data-hash="96acf36af3aec166f414b27e1c052d68" data-hovercard="p$b$96acf36af3aec166f414b27e1c052d68">@lp1234</a> 建议重命名后重启。</p>
 <p data-pid="5FN1HQsW">2、<a href="https://www.zhihu.com/people/chu-sheng-de-91" class="internal">@扶苏</a> 的建议是可以用免费的pchunter替代cmd。在安芯网盾官网下载。</p><a href="https://link.zhihu.com/?target=https%3A//www.anxinsec.com/view/antirootkit/" data-draft-node="block" data-draft-type="link-card" data-image="https://pic2.zhimg.com/v2-1355d5c9077b32211e13bf2f9887d2bd.jpg" data-image-width="2560" data-image-height="1440" class=" wrap external" target="_blank" rel="nofollow noreferrer">系统信息检测工具-安芯网盾-AntiRootkit软件-PCHunter，强效清除隐藏的恶意软件</a>
 <p data-pid="D599_yFS">用pchunter结束带有驱动保护的进程。</p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1294567337694822400" target="_blank" data-video-id="" data-video-playable="true" data-name="" data-poster="https://pic2.zhimg.com/v2-2a9a62da32a372d52f39c82213284e63.jpeg" data-lens-id="1294567337694822400"><img class="thumbnail" src="https://pic2.zhimg.com/v2-2a9a62da32a372d52f39c82213284e63.jpeg"><span class="content"><span class="title"><span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1294567337694822400</span></span></a>
 <p data-pid="ann33eUp">卸载驱动，删除注册表。并好心向我发了视频，以带驱动保护的360作为例子。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-bd4a24ee33984520fa0a9c722e7c7d33_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2277" data-rawheight="1080" data-original-token="v2-f0b4de86025c448180506904c2372e13" data-default-watermark-src="https://picx.zhimg.com/50/v2-6ef621acae2e5ba0a73a7c124256ce5e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2277" data-original="https://pica.zhimg.com/v2-bd4a24ee33984520fa0a9c722e7c7d33_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-ac5ed0c49e6f658ec9fe8dc17fb00d51_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2277" data-rawheight="1080" data-original-token="v2-872358cc5a21f9378bdba75020703fdc" data-default-watermark-src="https://pica.zhimg.com/50/v2-56c60b3b5b4ae5ca144cdb933b1e5cff_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2277" data-original="https://picx.zhimg.com/v2-ac5ed0c49e6f658ec9fe8dc17fb00d51_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="1BBbRbIH">可供大家参考。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="EtinBv65"><b>再次感谢所有好心人的分享！</b></p>
</body>