# 怎样评价《数码宝贝》第一部中的泉光子郎的编程水平？
- 点赞数：26996
- 更新时间：2019年09月30日18时04分52秒
- 回答url：https://www.zhihu.com/question/30290082/answer/840708044
<body>
 <p data-pid="nqHAQ9He">受到 <a class="member_mention" href="https://www.zhihu.com/people/89e97c09fc1d1458fa92eadd0978d259" data-hash="89e97c09fc1d1458fa92eadd0978d259" data-hovercard="p$b$89e97c09fc1d1458fa92eadd0978d259">@夜路川</a> 答主勇于用python进化自己室友的激励，我顺便深挖了一下《数码宝贝》第一部第五集中光子郎在电脑上敲出的代码，终于把原始代码跑了出来，视频在最后。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-ecab588c4ee111f677b2f1d32caa7b5f_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1300" data-rawheight="976" data-original-token="v2-525926748855afedc0a80813daefc195" data-default-watermark-src="https://pic1.zhimg.com/50/v2-d8c750d53cb5e1868b99a9a980c37e74_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1300" data-original="https://picx.zhimg.com/v2-ecab588c4ee111f677b2f1d32caa7b5f_r.jpg?source=1940ef5c">
  <figcaption>
   《数码宝贝》第一部第五集截图
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="9uVzJVD1">虽然这段代码会自己乱动并让甲虫兽进化，显得狂拽酷炫吊炸天，但其实和第十集出现的代码是一模一样的（而动画里表现出的效果明显不同）。第十集里的代码反而看得更清楚一点。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e686703e1b384f01df600d96c8f5e7ae_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1307" data-rawheight="978" data-original-token="v2-6c4bec2d1c187e9dd3905e15f2ec9e2e" data-default-watermark-src="https://picx.zhimg.com/50/v2-6b89d9223aeb299afa5111088e61a94c_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1307" data-original="https://pic1.zhimg.com/v2-e686703e1b384f01df600d96c8f5e7ae_r.jpg?source=1940ef5c">
  <figcaption>
   《数码宝贝》第一部第十集截图
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Dot2eD34">根据这张图抽出文本如下：</p>
 <div class="highlight">
  <pre><code class="language-vim"><span class="m">100</span> <span class="sr">/* func sample. coast creation */</span><span class="err">
</span><span class="err"></span><span class="m">110</span> <span class="nx">float</span> <span class="nx">s</span><span class="err">
</span><span class="err"></span><span class="m">120</span> <span class="nx">while</span> <span class="nx">s</span><span class="p">&lt;</span><span class="m">1</span> <span class="nx">or</span> <span class="nx">s</span><span class="p">&gt;=</span><span class="m">2</span><span class="err">
</span><span class="err"></span><span class="m">130</span>     <span class="nx">input</span> <span class="s2">"ratio 1 to 2"</span>;<span class="nx">s</span><span class="err">
</span><span class="err"></span><span class="m">140</span> <span class="nx">endwhile</span><span class="err">
</span><span class="err"></span><span class="m">150</span> <span class="nx">s</span> <span class="p">=</span> <span class="p">(</span><span class="nx">s</span><span class="m">-1</span><span class="p">)</span>/<span class="m">10</span><span class="p">+</span><span class="m">1</span><span class="err">
</span><span class="err"></span><span class="m">160</span> <span class="nx">screen</span> <span class="m">1</span><span class="p">,</span><span class="m">2</span><span class="p">,</span><span class="m">1</span><span class="p">,</span><span class="m">1</span><span class="err">
</span><span class="err"></span><span class="m">170</span> <span class="nx">s</span><span class="p">=</span><span class="nx">sqr</span><span class="p">(</span><span class="nx">s</span>*<span class="nx">s</span><span class="m">-1</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">180</span> <span class="nx">float</span> <span class="nx">x0</span><span class="p">=</span><span class="m">100</span><span class="p">,</span> <span class="nx">x1</span><span class="p">=</span><span class="m">412</span><span class="p">,</span> <span class="nx">y0</span><span class="p">=</span><span class="m">0</span><span class="p">,</span> <span class="nx">y1</span><span class="p">=</span><span class="m">0</span><span class="err">
</span><span class="err"></span><span class="m">190</span> <span class="nx">fractal</span><span class="p">(</span><span class="nx">x0</span><span class="p">,</span><span class="nx">x1</span><span class="p">,</span><span class="nx">y0</span><span class="p">,</span><span class="nx">y1</span><span class="p">,</span><span class="m">1</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">200</span> <span class="nx">line</span><span class="p">(</span><span class="m">100</span><span class="p">,</span> <span class="m">50</span><span class="p">,</span> <span class="m">412</span><span class="p">,</span> <span class="m">50</span><span class="p">,</span> <span class="m">255</span><span class="p">,</span> <span class="m">65535</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">210</span> <span class="nx">end</span><span class="err">
</span><span class="err"></span><span class="m">220</span> <span class="nx">func</span> <span class="nx">fractal</span><span class="p">(</span><span class="nx">x0</span>;<span class="nx">float</span><span class="p">,</span><span class="nx">x1</span>;<span class="nx">float</span><span class="p">,</span><span class="nx">y0</span>;<span class="nx">float</span><span class="p">,</span><span class="nx">y1</span>;<span class="nx">float</span><span class="p">,</span><span class="nx">sp</span>;<span class="nx">int</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">230</span>     <span class="nx">float</span> <span class="nx">l</span><span class="p">,</span> <span class="nx">r</span><span class="p">,</span> <span class="nx">x2</span><span class="p">,</span> <span class="nx">y2</span><span class="err">
</span><span class="err"></span><span class="m">240</span>     <span class="nx">l</span><span class="p">=</span><span class="nx">sqr</span><span class="p">((</span><span class="nx">x1</span><span class="p">-</span><span class="nx">x0</span><span class="p">)</span>*<span class="p">(</span><span class="nx">x1</span><span class="p">-</span><span class="nx">x0</span><span class="p">)+(</span><span class="nx">y1</span><span class="p">-</span><span class="nx">y0</span><span class="p">)</span>*<span class="p">(</span><span class="nx">y1</span><span class="p">-</span><span class="nx">y0</span><span class="p">))</span><span class="err">
</span><span class="err"></span><span class="m">250</span>     <span class="k">if</span> <span class="nx">l</span><span class="p">&lt;</span><span class="m">2</span> <span class="nx">or</span> <span class="nx">sp</span><span class="p">&gt;=</span><span class="m">9</span> <span class="nx">then</span> {<span class="err">
</span><span class="err"></span><span class="m">260</span>         <span class="nx">line</span><span class="p">(</span><span class="nx">x0</span><span class="p">,</span><span class="nx">y0</span><span class="sr">/3+50,x1,y1/</span><span class="m">3</span><span class="p">+</span><span class="m">50</span><span class="p">,</span><span class="m">255</span><span class="p">,</span><span class="m">65535</span><span class="p">)</span> : <span class="nx">return</span><span class="p">()</span><span class="err">
</span><span class="err"></span><span class="m">270</span>     }<span class="err">
</span><span class="err"></span><span class="m">280</span>     <span class="nx">r</span><span class="p">=</span><span class="nx">rnd</span><span class="p">()+</span><span class="nx">rnd</span><span class="p">()+</span><span class="nx">rnd</span><span class="p">()</span><span class="m">-2</span><span class="err">
</span><span class="err"></span><span class="m">290</span>     <span class="nx">x2</span><span class="p">=(</span><span class="nx">x0</span><span class="p">+</span><span class="nx">x1</span><span class="p">)</span>/<span class="m">2</span><span class="p">+</span><span class="nx">s</span>*<span class="p">(</span><span class="nx">y1</span><span class="p">-</span><span class="nx">y0</span><span class="p">)</span>*<span class="nx">r</span><span class="err">
</span><span class="err"></span><span class="m">300</span>     <span class="nx">y2</span><span class="p">=(</span><span class="nx">y0</span><span class="p">+</span><span class="nx">y1</span><span class="p">)</span>/<span class="m">2</span><span class="p">+</span><span class="nx">s</span>*<span class="p">(</span><span class="nx">x0</span><span class="p">-</span><span class="nx">x1</span><span class="p">)</span>*<span class="nx">r</span><span class="err">
</span><span class="err"></span><span class="m">310</span>     <span class="nx">sp</span> <span class="p">=</span> <span class="nx">sp</span> <span class="p">+</span> <span class="m">1</span><span class="err">
</span><span class="err"></span><span class="m">320</span>     <span class="nx">fractal</span><span class="p">(</span><span class="nx">x0</span><span class="p">,</span><span class="nx">x2</span><span class="p">,</span><span class="nx">y0</span><span class="p">,</span><span class="nx">y2</span><span class="p">,</span><span class="nx">sp</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">330</span>     <span class="nx">fractal</span><span class="p">(</span><span class="nx">x2</span><span class="p">,</span><span class="nx">x1</span><span class="p">,</span><span class="nx">y2</span><span class="p">,</span><span class="nx">y1</span><span class="p">,</span><span class="nx">sp</span><span class="p">)</span><span class="err">
</span><span class="err"></span><span class="m">340</span> <span class="nx">endfunc</span></code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="JesI-apO">如果想重新原汁原味地运行这段代码，首先要明确它的语言和版本。注意到注释和变量定义的语法更接近C系语言，但还有endwhile、func、endfunc等关键字，可以确定这不是VB或者其他主流的BASIC系语言。但是代码行号的格式暴露了这货肯定是个远古产物，我本来想看看光子郎电脑上这个文件的后缀名是什么，瞅了半天发现是“名称未设定 3”（见上图），失去线索的我只能开始疯狂的google……</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="J3ItK4h1">在资料检索过程中主要发现两个问题。一是和这段代码语法相近的语言太多，比如VFP（Visual FoxPro，知道它的人肯定都老了）、VimScript、SAP采用的ABAP、早期PHP、伪代码的某个版本<sup data-text="Pseudocode Examples" data-url="https://www.unf.edu/~broggio/cop3530/3530pseu.htm" data-draft-node="inline" data-draft-type="reference" data-numero="1">[1]</sup>、乃至德仪计算器的自创脚本语言等等。经过一个个的尝试，发现这些语言都是形似神不似，并不是真正的答案。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-08956f1614066b133753499a82742412_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="1571" data-rawheight="806" data-original-token="v2-942680a24808e99708f6fb964a9ddc2b" data-default-watermark-src="https://picx.zhimg.com/50/v2-87b681471049704519ee4731b0bcb372_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1571" data-original="https://picx.zhimg.com/v2-08956f1614066b133753499a82742412_r.jpg?source=1940ef5c">
  <figcaption>
   Google Books里找到的一本TI计算器手册
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="seW45NvF">第二个问题是，如果仔细看光子郎的代码，你一定会陷入困惑，因为这段代码根本不像是有一个统一的语法规则。这里举两个栗子：</p>
 <ul>
  <li data-pid="BDJWq3hE">流程控制语法不统一。120-140行的while-endwhile结构，或许让你觉得和BASIC有一点点类似，而且顺便猜测if语句肯定也会有个endif结尾。但是250-270行的if语句居然用了大括号，更丧心病狂的是在then后面接大括号！</li>
  <li data-pid="T7uqZMe1">变量声明格式不统一。110行是类C的声明格式，而220行的函数参数却用了类似ECMAScript的声明方式，但用的不是冒号是分号。这让我一度以为这段代码就是导演魔改的，是一种不存在的噩梦般的语言。</li>
 </ul>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="XCrx8eAX">然而，在我就要放弃之际，一位国外先行者的博文给了我曙光（尽管文章里有一些错误）<sup data-text="Running Izzy's &quot;Digivolving&quot; code" data-url="https://digitalworldproblems.tumblr.com/post/76036641581/while-im-looking-at-that-moviecode-post-he" data-draft-node="inline" data-draft-type="reference" data-numero="2">[2]</sup>。这个语言最终还是被查出来了……</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="V9sUp5Cg">事情要追溯到1987年，夏普发布了一款型号为X68000的PC。作为那个年代的电脑，搭载了10MHz的摩托罗拉68000CPU，1MB的内存，没有硬盘，且只在日本发售<sup data-text="X68000" data-url="https://en.wikipedia.org/wiki/X68000" data-draft-node="inline" data-draft-type="reference" data-numero="3">[3]</sup>。其操作系统是夏普为这一系列电脑专门设计的Human68k，《数码宝贝》中的那段代码，就属于这个操作系统专有的编程语言<b>X-BASIC</b><sup data-text="X-BASIC" data-url="https://ja.wikipedia.org/wiki/X-BASIC" data-draft-node="inline" data-draft-type="reference" data-numero="4">[4]</sup>。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-3590cac907e1d96a7b2d3a4936fe6b65_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="400" data-rawheight="652" data-original-token="v2-54b3c3002fda9c55c0317dd5628ba135" data-default-watermark-src="https://picx.zhimg.com/50/v2-ef7db9fe07b4a17c3138c5fd664031ab_720w.jpg?source=1940ef5c" class="content_image" width="400">
  <figcaption>
   Sharp X68000ACE-HD
  </figcaption>
 </figure>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-b5ae8426d5307b6e3f0a7308b0355dd8_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="259" data-rawheight="194" data-original-token="v2-b2151808192b439ec4a271c820ba23da" data-default-watermark-src="https://pica.zhimg.com/50/v2-0c92c2675012df44a3bbb9f1e3051099_720w.jpg?source=1940ef5c" class="content_image" width="259">
  <figcaption>
   X-BASIC手册
  </figcaption>
 </figure>
 <figure data-size="small">
  <img src="https://picx.zhimg.com/50/v2-7e36a7e5b86cf0a5679aa929a4a8342d_720w.jpg?source=1940ef5c" data-size="small" data-rawwidth="846" data-rawheight="1211" data-original-token="v2-1b1e3c380c89b5725ad3ecd099147e92" data-default-watermark-src="https://picx.zhimg.com/50/v2-52967b03118e0606c4609f393b1a4503_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="846" data-original="https://picx.zhimg.com/v2-7e36a7e5b86cf0a5679aa929a4a8342d_r.jpg?source=1940ef5c">
  <figcaption>
   日本维基上X-BASIC的一段例程
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="uhEDcnF9">这个系列的最后一款电脑在1993年发布（配置有所增强），而《数码宝贝》第一部是在1999年放映的，可见在动画制作时期，光子郎的代码也不算特别陈旧。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="iEs3rEZH">为了实际地跑一下这段代码，又经过一番艰辛的努力，我搞到了X68000的模拟器，还有操作系统Human68k（version 3.02）的磁盘映像，现在还能找到这些东西，真的要感谢极客阿宅们的默默奉献。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="HK_dCqck">在模拟器里一开机，感觉就成功了一半：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-581c85ffc20e3f9e0ab8940424ca6d70_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="936" data-rawheight="306" data-original-token="v2-b94d4e67b4f4343ab40dcfab616afd98" data-default-watermark-src="https://picx.zhimg.com/50/v2-e9c7790900b0b75eb4b974571ae0ba64_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="936" data-original="https://picx.zhimg.com/v2-581c85ffc20e3f9e0ab8940424ca6d70_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="imnlYBBB">为了能使代码顺利运行，还需加载SX-WINDOW映像。最后终于找到X-BASIC，一字不差地键入了光子郎的代码：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-ac56ac4b73c1b2ad6138d5808fca33ad_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1361" data-rawheight="1183" data-original-token="v2-d45e2f99f035c969addc5de100ace7ed" data-default-watermark-src="https://picx.zhimg.com/50/v2-52aa464a232f39b7b726e00d8339fe56_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1361" data-original="https://picx.zhimg.com/v2-ac56ac4b73c1b2ad6138d5808fca33ad_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="1bzBYIWP">执行run命令，按代码要求输入一个1到2之间的浮点数值，下面就是见证奇迹的时刻了！</p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1162012539662876672" target="_blank" data-video-id="" data-video-playable="true" data-name="运行《数码宝贝》光子郎写的代码" data-poster="https://pic4.zhimg.com/v2-601a42e6ca38abd1209dc21f23dcb56f.jpeg" data-lens-id="1162012539662876672"><img class="thumbnail" src="https://pic4.zhimg.com/v2-601a42e6ca38abd1209dc21f23dcb56f.jpeg"><span class="content"><span class="title">运行《数码宝贝》光子郎写的代码<span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1162012539662876672</span></span></a>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="FjC3it1y">我不禁望向窗外的那只放屁虫，它仍在很悠闲地晒太阳，很遗憾我的甲虫兽并没有进化……原因很简单，这真的只是一段随机生成「coast」轮廓的代码。初始输入是一个阈值，从视频里看，显然阈值越高「海岸」越险峻，阈值越低「海岸」越平滑，很有可能是摘取了当时哪个游戏里地图生成器的一段源码。所以，导演又糊弄事呢？</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="4XOICnhu">为了跑这段代码，我查到了一些资料和工具，在此罗列一下，有兴趣可以看看。</p>
 <blockquote data-pid="HijXYE42">
  X-BASIC文档（日文）：
  <br><a href="https://link.zhihu.com/?target=http%3A//ww3.enjoy.ne.jp/~zoomark/ip/xb/xb_frm.html" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">ww3.enjoy.ne.jp/~zoomar</span><span class="invisible">k/ip/xb/xb_frm.html</span><span class="ellipsis"></span></a>
  <br>
  <br>
  X68000 Emulator in Java：
  <br><a href="https://link.zhihu.com/?target=https%3A//stdkmd.net/xeij/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">stdkmd.net/xeij/</span><span class="invisible"></span></a>
  <br>
  <br>
  Human68k磁盘映像（日文）：
  <br><a href="https://link.zhihu.com/?target=http%3A//retropc.net/x68000/software/sharp/human302/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">retropc.net/x68000/soft</span><span class="invisible">ware/sharp/human302/</span><span class="ellipsis"></span></a>
  <br>
  <br>
  X68000相关资料（日文）：
  <br><a href="https://link.zhihu.com/?target=http%3A//retropc.net/x68000/book/x68book.htm" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">retropc.net/x68000/book</span><span class="invisible">/x68book.htm</span><span class="ellipsis"></span></a>
  <br>
  <br>
  Programming Languages Database：
  <br><a href="https://link.zhihu.com/?target=http%3A//www.epocalc.net/php/liste_langue.php" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://www.</span><span class="visible">epocalc.net/php/liste_l</span><span class="invisible">angue.php</span><span class="ellipsis"></span></a>
 </blockquote>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="vNRKmJnh">最后话说回光子郎的编程水平，这段代码的难点主要在于用递归实现了分形图形的绘制，虽然没什么特别神秘的地方，但还是需要一定程度的编程技能和数学知识。原理上很像我之前绘制谢尔宾斯基三角形的代码：</p><a href="https://zhuanlan.zhihu.com/p/26606208" data-draft-node="block" data-draft-type="link-card" data-image="https://pic2.zhimg.com/v2-756029fa11be24a7f343d92745bf99ed_180x120.jpg" data-image-width="593" data-image-height="345" class="internal">Random Forest：小练手：用Canvas绘制谢尔宾斯基三角形</a>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="SUlppdbs">但是光子郎当时好像上小学四年级？</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-6e7dc09e3d3f97114cdeea48a0384021_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="440" data-rawheight="400" data-original-token="v2-a82b05b1e75fd76643d3fe7d9005004f" data-default-watermark-src="https://picx.zhimg.com/50/v2-6ea09fea97312ffaed4135a5e22833a9_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="440" data-original="https://picx.zhimg.com/v2-6e7dc09e3d3f97114cdeea48a0384021_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="oL0BEgRf">而且在动画里，这段程序的输出是这样的，光子郎最后靠这个成功还原了他和美美所在的迷宫。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-2b6792f7f9235db7cfc0fee569d7f545_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1303" data-rawheight="977" data-original-token="v2-037522e4d2e1080c8241054454e8db0c" data-default-watermark-src="https://pica.zhimg.com/50/v2-79bf549af5cdae66a28b41d22931cfe3_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1303" data-original="https://pic1.zhimg.com/v2-2b6792f7f9235db7cfc0fee569d7f545_r.jpg?source=1940ef5c">
 </figure>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-5e3432e2b7f8b50896e811691eb36c78_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1295" data-rawheight="970" data-original-token="v2-c4cc467799127d62ab6bc0ccdc8d282e" data-default-watermark-src="https://picx.zhimg.com/50/v2-fe1ca4789126638b2b89f49e664ae0e0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1295" data-original="https://pic1.zhimg.com/v2-5e3432e2b7f8b50896e811691eb36c78_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="9KpWA_3y">嘛，单从这里看，感觉能进科大少年班就是了……</p>
 <p class="ztext-empty-paragraph"><br></p>
 <hr>
 <p data-pid="4Es3Oau0">彩蛋：当年X68000系列的电脑还随附一个名为060turbo<sup data-text="060turbo の添付ディスク" data-url="http://retropc.net/x68000/software/hardware/060turbo/disk060t/" data-draft-node="inline" data-draft-type="reference" data-numero="5">[5]</sup>的软件，单独装在一个磁盘。这个软件的唯一功能是在屏幕上随机打印一张复杂的分形图形（疑似Mandelbrot图像？并不是很确定）。我用模拟器试了一下，效果确实惊艳，感觉光子郎在成为分形大师的路上还需努力23333。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-812d16536267c1904cdd198594ec18de_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1361" data-rawheight="1183" data-original-token="v2-9a7d8cd54a6e342112ce5a86a2f624e4" data-default-watermark-src="https://pic1.zhimg.com/50/v2-6f0f61f645ecd08d8ceb224857742917_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1361" data-original="https://pic1.zhimg.com/v2-812d16536267c1904cdd198594ec18de_r.jpg?source=1940ef5c">
 </figure>
 <p></p>
</body>