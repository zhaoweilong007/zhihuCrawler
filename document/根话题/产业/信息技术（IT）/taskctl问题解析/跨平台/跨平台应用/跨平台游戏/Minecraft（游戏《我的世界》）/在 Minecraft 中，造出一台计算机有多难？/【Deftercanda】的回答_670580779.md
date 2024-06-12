# 在 Minecraft 中，造出一台计算机有多难？
- 点赞数：36469
- 更新时间：2020年12月10日23时28分43秒
- 回答url：https://www.zhihu.com/question/320253846/answer/670580779
<body>
 <p data-pid="9ELoejyS">12月10日更新：</p>
 <p data-pid="L4VzIRI0">修改了部分往期更新的内容</p>
 <p data-pid="_zPZ7PBX">&lt;2020&gt;</p>
 <p data-pid="W_lmdhtU">12月9日更新：</p>
 <p data-pid="BgfvesBQ">删去了结尾的部分个人观点</p>
 <p data-pid="4I2gkxJO"><b>7月11日重要更新：</b></p>
 <p data-pid="f_f-JyOB">作者开源了作品的存档，并制作了一个数字电路的教学存档，一并放到了github上，有兴趣者可以自取。</p><a data-draft-node="block" data-draft-type="link-card" href="https://link.zhihu.com/?target=https%3A//github.com/Alpha21016/Minecraft-Digital-Circuit" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">https://</span><span class="visible">github.com/Alpha21016/M</span><span class="invisible">inecraft-Digital-Circuit</span><span class="ellipsis"></span></a>
 <p data-pid="_paz5ssQ">5月23日更新：</p>
 <p data-pid="PpXSDJyY">作者有话说，补在结尾。</p>
 <p data-pid="msu4r6-z">5月8日更新：</p>
 <p data-pid="8r3gaPYO">（已删除，原文为旧存档的获取方式，现已更新存档和链接）</p>
 <p data-pid="6_rUhK6t">5月7日二更：</p>
 <p data-pid="fjugpsGu">上传了第二期工程视频。</p>
 <p data-pid="VtXaWIgh">5月7日更新：</p>
 <p data-pid="UAUhJ85O">发现视频不完整，现已补全，因视频时长原因，故分为两段上传。</p>
 <p data-pid="fiuEhcFa">5月5日更新：</p>
 <p data-pid="1y7Dkh_D"><b>本文已获得作者授权转载！</b></p>
 <p data-pid="H4HvA_VK"><b>以下部分内容经过改编和优化，全文重新排版，以作者视角展示全部内容</b></p>
 <p data-pid="7bzp9831"><b>文章摘自</b> <a class="member_mention" href="https://www.zhihu.com/people/673bb0430090b780500d752beaa99baa" data-hash="673bb0430090b780500d752beaa99baa" data-hovercard="p$b$673bb0430090b780500d752beaa99baa">@季文瀚</a> <b>——《基于Minecraft实现的计算机工程》</b></p>
 <p data-pid="bHWRzf67">先献上视频：</p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1108885362205872128" target="_blank" data-video-id="" data-video-playable="" data-name="基于MC实现的计算机工程_一期(1)" data-poster="https://pic3.zhimg.com/v2-c2bdfc8655827f900cc09d1663a19d4a.jpg" data-lens-id="1108885362205872128"><img class="thumbnail" src="https://pic3.zhimg.com/v2-c2bdfc8655827f900cc09d1663a19d4a.jpg"><span class="content"><span class="title">基于MC实现的计算机工程_一期(1)<span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1108885362205872128</span></span></a>
 <p class="ztext-empty-paragraph"><br></p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1108885440584773632" target="_blank" data-video-id="" data-video-playable="" data-name="基于MC实现的计算机工程_一期(2)" data-poster="https://pic4.zhimg.com/v2-7c25e1cdfe9642a7a669dcbbbb2d2600.jpg" data-lens-id="1108885440584773632"><img class="thumbnail" src="https://pic4.zhimg.com/v2-7c25e1cdfe9642a7a669dcbbbb2d2600.jpg"><span class="content"><span class="title">基于MC实现的计算机工程_一期(2)<span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1108885440584773632</span></span></a>
 <p class="ztext-empty-paragraph"><br></p><a class="video-box" href="https://link.zhihu.com/?target=https%3A//www.zhihu.com/video/1109220128654315520" target="_blank" data-video-id="" data-video-playable="" data-name="基于MC实现的计算机工程_二期" data-poster="https://pic3.zhimg.com/v2-784c54cb8e27ba90f0545ff1e94ccfdc.jpg" data-lens-id="1109220128654315520"><img class="thumbnail" src="https://pic3.zhimg.com/v2-784c54cb8e27ba90f0545ff1e94ccfdc.jpg"><span class="content"><span class="title">基于MC实现的计算机工程_二期<span class="z-ico-extern-gray"></span><span class="z-ico-extern-blue"></span></span><span class="url"><span class="z-ico-video"></span>https://www.zhihu.com/video/1109220128654315520</span></span></a>
 <p data-pid="_k0WSUQ6">（下文图片因来源问题不太清楚）</p>
 <p data-pid="x0cbv_Y7">本工程基于一个叫Minecraft的游戏，我使用的版本是1.4.7。之所以使用一个游戏作为平台，是因为这个游戏可以做到实时运行超大规模集成电路模型（大于10000个逻辑门）并且提供壮观的可视化效果（三维数字电路）。</p>
 <p data-pid="7EVr4ZRf">半年前我刚接触这个游戏的时候，想做一个简单的计算器。国外玩家两年前已经有人做到了，基于整数ALU和直连总线的机器。我开始规划做一个16bit的计算器，输入输出线路一样是直连的，也就是说这个计算器完全是<b>专用的芯片</b>，连单片机的等级都不到。后来我发现这个游戏可以实现更加复杂的东西。原因很简单，游戏只提供了“或”“非”逻辑电路，但理论上“或”“非”门可以表达一切逻辑。同时游戏提供的基于活塞机械的断路，继电器的延时时序特性以及继电器的锁存特性会让很多高级触发器成为可能。换句话说，FPGA能实现的东西这个游戏基本都能实现，区别在于这个游戏提供的是一个纯粹数学模型化的信号系统，元器件是简化的模型而不是现实中根据半导体材料设计的具有一定特性的电子元件，在线路连接的拓扑结构上也和现实中的电路不同。</p>
 <p data-pid="eOTpyWpr">在造计算器到一半的时候我打算改单片机，也就是具有“<b>图灵完备性</b>”的简单计算机，他可以执行一切计算机程序。我规划了指令集架构，储存器架构和指令发射方式等。随着除法器，可读写储存器，缓冲队列等重要电路结构的设计成功，我开始有了一个大胆的设想，尝试实现一个具有流水线结构，总线结构，溢出中断，堆栈，标志位寄存器，基本的分支预测和乱序执行等现代高级计算机技术的16bit RISC CPU以及一个附属的包含超越函数的单精度浮点处理器32bit FPU（目前只规划作为计算器使用）。</p>
 <p data-pid="TvIGs5n7">工程进展顺利，只是因为工程量巨大进度较慢。我已经将16bit整数计算器改成了完全时序逻辑电路控制，并且有溢出判断的计算器。这在全世界Minecraft红石电路玩家里应该是首次。这个计算器作为片外系统借用CPU的ALU部分进行运算并经过总线传输数据。目前CPU的ALU，主储存器，和寄存器等EU部分已经完工，内部环状总线已经完工，CU部分，也就是最繁琐的部分正在建设中。而FPU部分已经完成了加法器，乘法器，三角函数运算单元，开方运算单元。至此，整个工程大约有10万门以上的电路。</p>
 <p data-pid="pVm-ltk7">目前不可逾越的困难是游戏的基准单位延时t是0.1秒，加载地图最大范围是长宽1024m，高256m的范围，这就限制了计算机的运算速度以及造出来的硬件规模。特别是储存器，我的片上程序储存器只有1kb，这对于现实中的储存器容量而言太小了。所以想利用这有限的空间做一个汇编编译器，简易的操作系统实在是太困难。</p>
 <p data-pid="p5U_ma9m">对于工程的介绍我分为6部分：<b>信号系统，硬件单元和硬件算法，储存器架构和流水线，指令集架构，总线和时钟，图形显示原理</b>。我尽量用非专业的语言来介绍，不可避免会用一些术语。</p>
 <p data-pid="CxI7TLM0">本工程需要的专业知识基本就是微机原理，数字电路，少许编译原理和计算机图形学。</p>
 <p data-pid="LS8KCVDc">此处先贴上一张cpu架构图。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-995c67dc3a99fc418e76f94fe5d40b3f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="420" data-size="normal" data-original-token="v2-62daac944b00c7a317fbdb8b41accc9f" data-default-watermark-src="https://picx.zhimg.com/50/v2-c1d266b318e8586c30abaa3673fdd7fe_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-995c67dc3a99fc418e76f94fe5d40b3f_r.jpg?source=1940ef5c">
  <figcaption>
   cpu架构图
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-f6745923736adac7aed61f6ca73ac4d4_720w.jpg?source=1940ef5c" data-rawwidth="309" data-rawheight="153" data-size="normal" data-original-token="v2-57e6c9c334614809d0137065569a15f3" data-default-watermark-src="https://picx.zhimg.com/50/v2-f621d564a55ad2c5e8a4412676826633_720w.jpg?source=1940ef5c" class="content_image" width="309">
  <figcaption>
   上图缩写名称全名
  </figcaption>
 </figure>
 <p data-pid="K5qnsxzU">其中每一个方框都代表一个或若干个硬件单元，小一点的大约一两百个门电路，大的有几千个门电路。架构图基本是按照实际距离做的，在工程上方俯视看到的结构和架构图可以一一对应。下面的俯视图对应架构图的右半部分（Data Bus以及其围住的右下部分。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-ac4fe5f2a37529f8274c59d6c7207a6e_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="600" data-size="normal" data-original-token="v2-59ebf6561eb6a198e57b1d6aba19d983" data-default-watermark-src="https://picx.zhimg.com/50/v2-1f9b44858dbbfd6da0f0f33825759fbc_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-ac4fe5f2a37529f8274c59d6c7207a6e_r.jpg?source=1940ef5c">
  <figcaption>
   cpu俯视图
  </figcaption>
 </figure>
 <p data-pid="c1A8wFVp">ps：目前决定把乱序执行模块取消。</p>
 <h2><b>一、信号系统</b></h2>
 <p data-pid="8XDbXDyG">　　构成超大规模信号系统的逻辑等级基本如下：</p>
 <p data-pid="RHuKoa5c">　　基本信号元件→基本逻辑门→复杂逻辑门→简单功能结构：组合电路，时序电路，触发器→复合功能结构→硬件功能单元→硬件功能模块→计算机</p>
 <p data-pid="H1yMzAsF">举例如：</p>
 <p data-pid="44vfrk1k">　　或门，非门→与门，异或门→全加器，信号长度转换器，多态选择器，储存器单元，译码器单元，求补码单元，移位器单元→可读写储存器，译码器，加法器，移位器，时钟发生器→加减法器，乘法器，除法器，可读写储存器阵列，寄存器，程序计数器→总线，ALU，CU→计算机</p>
 <p data-pid="4nZIm6I6"><b>信号元件：</b></p>
 <p data-pid="V6s1e4Z7">　　先从逻辑底层开始介绍，最主要的原件只有四个，如下图：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-d8a46ccb1a306438f7fcdf3a2779e25b_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="227" data-size="normal" data-original-token="v2-d2ce3648271a126f041ab47d1358d3c0" data-default-watermark-src="https://pic1.zhimg.com/50/v2-413414a3acaaed2aeeaf02cbb684f8cd_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-d8a46ccb1a306438f7fcdf3a2779e25b_r.jpg?source=1940ef5c">
  <figcaption>
   信号元件
  </figcaption>
 </figure>
 <p data-pid="U3wfz4qU">从左到右依次为：1.继电器/二极管/锁存器/延时器（同时兼有四个功能）2.红石火把（高电平信号源）3.红石粉（红石导线）4.粘性活塞（可推拉的开/通路元件）。</p>
 <p data-pid="VmcI9cQf">本工程占地大约600x600x200单位长度。</p>
 <p data-pid="gOjYHR0X">（原文这里详细介绍了这四个元件的特性，这里就不说了，红石老手都懂，不了解请自行搜索）</p>
 <p data-pid="33_ln20e"><b>视觉信号与显示器：</b></p>
 <p data-pid="8UvDlku-">游戏本身没有显示屏这种东西，但是玩家可以通过各种方式实现视觉上的信息传递。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-d1c98281ccd0d4d9d2250a3b696ea84a_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="228" data-size="normal" data-original-token="v2-ff178add9b005d3583caacc594eb381f" data-default-watermark-src="https://pic1.zhimg.com/50/v2-ba47e001e6b4277be99d7d3168416ebc_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-d1c98281ccd0d4d9d2250a3b696ea84a_r.jpg?source=1940ef5c">
  <figcaption>
   两种显示方式
  </figcaption>
 </figure>
 <p data-pid="JYFDcCWx">　　第一种是红石灯。红石灯被充能时会亮，不充能时不亮，这两种状态即可组成图形，和计算机的bitmap一致。</p>
 <p data-pid="y1Rp0hUO">　　第二种是阴影成像。即游戏中白天光照条件下浅颜色的方块凹陷处的阴影会和周围的方块形成反差，也构成了两态信号的图像。而实现方块凹陷的方式就是粘性活塞。</p>
 <p data-pid="s4qrswKB"><b>向上传输和BUD：</b></p>
 <p data-pid="ASXJhI2e">　　向上传输是游戏提供的一种信号单向向上传输的方式，可以用两种方块实现。如图，左边的萤石，本身有自然发光的作用，同时可以用图中方式向上叠放。正常的方块这样叠放肯定会挡住信号，所以正常方块向上向下传输必须螺旋盘叠，这样会占据更大的空间，于是游戏提供了单向向上传输节约空间。但是可惜游戏没有提供单向向下传输（至少我使用的1.4.7版本没有提供），可以看到如图中左边的萤石信号通路输入端在上方，下方方块的红石导线没有亮，而右边的萤石通路输入端在下方，上方方块的红石导线亮了。另一种单向向上传输的方块是“半砖”，即只占一般空间的砖头，如下左图中右边灰色的砖块。因为只有一半高度，所以这样盘叠不会挡住各自导线的连接。半砖同样只实现单向向上传输。（此处的“萤石灯”和“半砖”我认为理解为透明方块更好。透明方块：对所有不具有完整实心方块普遍特性的方块的统称。鉴别方法：充能法，卡头法，箱子法等。）</p>
 <p data-pid="VkoNo1O0">　　BUD是游戏中一类类似BUG的信号特性。但是又不能叫做BUG，因为这些特性也可以看做是信号系统的组成部分。由于游戏编程中对于方块更新的检测机制存在一定局限性，所以一些方块会被非正常激活。有一次我调试线路出现了很奇怪的错误，排查了半天才发现是BUD问题。有些时候也可以利用BUD的特性做成特定功能的线路。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-4b9f950d6fc4f64b94b58b29447b7837_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="191" data-size="normal" data-original-token="v2-134f4211819f61f83df6c99e2086cea6" data-default-watermark-src="https://pic1.zhimg.com/50/v2-863eea999e36de0136e375a656d5f482_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-4b9f950d6fc4f64b94b58b29447b7837_r.jpg?source=1940ef5c">
  <figcaption>
   向上传输和BUD
  </figcaption>
 </figure>
 <p data-pid="cPYfNNtQ">实际上游戏中还是有BUG的，有一次我排查了一个多小时竟然发现某个错误的原因是这样的：两个相隔100多米毫无功能关联的继电器，当一个置于2档的时候，另一个会工作不正常。这属于游戏难免会有的BUG，但是有时候一个小BUG会导致整个计算机瘫痪。</p>
 <p data-pid="b9vcPVbo"><b>逻辑门</b></p>
 <p data-pid="5OBHltw-">游戏提供的二态信号正好对应于二进制0和1，也对应于数字电路里用高低电平表示的信号。所以二态信号系统无论其实现的载体和方式如何，规律必定都是一样的。所以可以用相同的组合和算法构造更复杂的结构。</p>
 <p data-pid="678P-Y2U">　　有了四种信号元件如何进一步做成逻辑门呢？</p>
 <p data-pid="_I1Lu_R8"><b>非门</b>利用红石火把被充能方块熄灭的特性，输出相反的信号。</p>
 <p data-pid="QLCQYdT_"><b>或门</b>更简单，“<b>或</b>”在逻辑上就是只要任意一个输入端（不仅仅是一共2个输入端的情况）输入信号，输出端就一定输出信号。如下左，两个橙色的方块为输入端，只要有一个放上火把，绿色的输出端就会输出信号。下右为简单的组合逻辑，4个输入端组成的<b>或门</b>加上输出端的<b>非门</b>组成的<b>或非门</b>。这种电路一般用于“0判断”，即输入端全为0，输出就有信号，只要有一个输入是1，输出端的红石火把就会灭。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-14774ac95f5d66f6295ba4da0a4e0b2f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="202" data-size="normal" data-original-token="v2-8813ea1759803b263b8026cf43977f24" data-default-watermark-src="https://pica.zhimg.com/50/v2-20a2d98fc48d49abfaec3d43c578f00e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-14774ac95f5d66f6295ba4da0a4e0b2f_r.jpg?source=1940ef5c">
  <figcaption>
   或门
  </figcaption>
 </figure>
 <p data-pid="GziPSbaW">　　可以证明只用<b>或门</b>和<b>非门</b>就能实现一切逻辑，游戏的设计者也只设计了这两种能直接实现的逻辑门，<b>这一点和现实的晶体管电路也很符合</b>。通过在空间上对或门和非门的组合排布就能实现更加复杂的逻辑门。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-3fac7d3828e4a71753db8c35a45db768_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="193" data-size="normal" data-original-token="v2-ccef9d4e20b5edba7fc229bfa3f4ede0" data-default-watermark-src="https://pic1.zhimg.com/50/v2-ffcb579d81c3df724f400a41f703513d_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-3fac7d3828e4a71753db8c35a45db768_r.jpg?source=1940ef5c">
  <figcaption>
   与非门和RS触发器
  </figcaption>
 </figure>
 <p data-pid="TUcmHWp_">　　与非门如左，紫色为输入端，橙色为输出端，可以看出输入端连着两个红石火把是两个非门，火把中间通着导线是一个或门，真值表我就不写了，简单计算即可知这是一个与非门。常见的与非门应用也就是RS触发器了，比如右边这个基本RS触发器，低电平有效，紫色输入，橙色输出，RSQQ非就随便怎么分配了，此时图中输入端均有效，输出端无效，当输入端从01或10置为00（高电平）时会锁存。而当输入端同时从00变为11时游戏的方块刷新机制会默认选择其中一个输出端输出1，另一个输出端输出0，当然本身就不用考虑会使用这种情况。所以用<b>与非门</b>构造的RS触发器和现实中基本一致。</p>
 <p data-pid="z2Mpaih5"><b>与门</b>比<b>与非门</b>复杂一点，只要在<b>与非门</b>基础上加个<b>非门</b>的红石火把就可以了。如下图，下左为标准的<b>与门</b>，两个红色的输入端，紫色为输出端，可以看出是3个<b>非门</b>和一个<b>或门</b>组成的逻辑电路。可能读者仍然不便理解，我就将其转化为框图，如下中图。简单的计算可得只有当两个输入端同时输入1时，输出端为1，和与逻辑相同。下右两个同样为与门，只不过线路排布稍微变化即可变为空间构造不同的与门，可以用于各种不同的布线情况。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2e030c62f437c86d78bdfd7e6f6274d6_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="181" data-size="normal" data-original-token="v2-231a8c4b47bc22e35129aca1a4354d8a" data-default-watermark-src="https://pica.zhimg.com/50/v2-0e1a81edf93381617b97f5276429c4d8_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-2e030c62f437c86d78bdfd7e6f6274d6_r.jpg?source=1940ef5c">
  <figcaption>
   与门
  </figcaption>
 </figure>
 <p data-pid="8ba_Z3kt"><b>活塞断路</b>其实也是<b>与</b>逻辑。广义上的“<b>与</b>”可以看做同时满足各自条件的若干个输入端才能使输出端输出特定信号。比如下左上面的紫色输入端输入0，下面的紫色输入端输入1才能使绿色输出端输出1，而下右活塞原本挡住橙色线路，当活塞被激活将蓝色方块推出时，会使凹下的橙色方块线路与两边联通，这时右边的紫色输入1，左边的绿色才会输出1。即这是输入端必须全为1的标准<b>与门</b>。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-022b646c1115986bcfd2ac9e61e33e23_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="204" data-size="normal" data-original-token="v2-eeba8d30d014bfe9a8e91b7582680c5c" data-default-watermark-src="https://pic1.zhimg.com/50/v2-6bba3938af05c5d4f45f83dba244fd1d_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-022b646c1115986bcfd2ac9e61e33e23_r.jpg?source=1940ef5c">
  <figcaption>
   两种方向的活塞断路
  </figcaption>
 </figure>
 <p data-pid="6PLQ2hkO">之后的复杂信号结构的介绍我都尽量简略，如果真要从头到尾讲清楚，要写一本书。其中涉及到的专业知识太多了，很难让所有读者都能理解，见谅。关于数字电路和微机原理的各种基础知识介绍我都从略。</p>
 <p data-pid="z4DI0cjT"><b>异或门</b>是数字电路里非常重要的一类复杂逻辑门，是构造全加器以及一切具有ALU运算器结构单元的基础。比较简单的<b>异或门</b>设计如下图左右两种，除了红石导线外，左边一种用到了活塞，火把和中继器，右边一种只用了火把。<b>这两种都是国外玩家设计的，是目前设计出来的体积最小的异或门。我一开始自己设计出的异或门比这两种体积大一点。而基础逻辑门的体积对计算机建设至关重要，基础逻辑门稍微大一点整体结构就将超过地图加载范围。我的工程在设计上如果没有这些高手玩家在基础结构上的设计，是不可能实现的，因为用minecraft实现实时运算超大规模信号系统最重要的难题就是体积问题。</b></p>
 <p data-pid="lJE57T6N">　　这两种异或门右边一种较好，因为游戏中的火把可以在1秒钟内承受8次信号变化才会熄灭，而活塞似乎承受不了这么多次的变化，容易在快速的信号变化中出现差错。<b>所以我的计算机中基本都是采用右边一种异或门。</b>两个橙色方块是<b>输入端</b>，紫色方块是<b>输出端</b>。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-a05643dc7408fb71770714d572a611ba_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="208" data-size="normal" data-original-token="v2-04f73b3fe01b8e25da4ffbc59cb2f31f" data-default-watermark-src="https://pic1.zhimg.com/50/v2-d6d3fcd817aa0c648e86690920774c5f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-a05643dc7408fb71770714d572a611ba_r.jpg?source=1940ef5c">
  <figcaption>
   两种异或门
  </figcaption>
 </figure>
 <p data-pid="o9p1IHr0">其他所有逻辑门都可以通过或，非门的组合得到，就不再详述。</p>
 <p data-pid="87E44ie6"><b>简单功能结构</b></p>
 <p data-pid="VylxPWsU">　　利用逻辑门的组合就可以设计适用于各种功能的信号结构。</p>
 <p data-pid="7dHfG0X-">　　全加器：全加器可以看做是计算机最核心的部件，之前的一个异或门相当于一个半加器，两个半加器可以组合成一个全加器。由第一种异或门组成的全加器 如下左，下右是4个相同的全加器级联。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-6f35bf01981474b1d6aeee6ae020a259_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="196" data-size="normal" data-original-token="v2-12726d9b67fa5a82def0518101f86dfd" data-default-watermark-src="https://picx.zhimg.com/50/v2-53c027adebad22cea7faf495cd299bdc_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-6f35bf01981474b1d6aeee6ae020a259_r.jpg?source=1940ef5c">
  <figcaption>
   活塞结构全加器
  </figcaption>
 </figure>
 <p data-pid="e8mmQYJw">但是这种基于活塞的全加器不稳定，所以较为好的设计是如下图的基于第二种异或门设计的全加器。两个红色为输入端，蓝色为进位端，紫色为本位输出端。下右为两个不同颜色的全加器级联。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-d2853161c58b9380ace3d3fb47a78735_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="275" data-size="normal" data-original-token="v2-876f599ce0799652e7b7264b417a8653" data-default-watermark-src="https://pic1.zhimg.com/50/v2-27436dadf39d44b37bc672cbc3eacdef_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-d2853161c58b9380ace3d3fb47a78735_r.jpg?source=1940ef5c">
  <figcaption>
   基于异或门的全加器
  </figcaption>
 </figure>
 <p data-pid="lUyAZ04S">其他的组合电路，时序电路和触发器就举几个例子。</p>
 <p data-pid="b2GjhQWv">　　前一部分已经介绍过RS触发器，实际上并不常用。常用的是一些边沿触发的时序电路。下左图为活塞开路的两种最基本的应用，两个同样的蓝色开路线路，作为输入端的红石火把左边在下，右边在上。左边的蓝色线路因为开路的节点（凹下去的地方）比开路输入端的节点更靠近火把，而4档继电器的延迟为0.4秒，活塞的延迟为0.1秒，所以第0.5秒后活塞会伸出使线路开路，这时输入端信号就传不到活塞了。而继电器里可以存下0.4秒的信号，所以再过0.5秒活塞会收回，线路又会通。然后就会这样循环的“开路-通路-开路-通路”下去，每1秒是一个循环。实际的效果就是每1秒钟内可以输出一个0.5秒的信号。右边那条线路输入端通往活塞的节点在开路节点的前面，所以不受开路影响，只要输入端有持久信号就会在0.1秒后永久开路，使得下方输出0.1秒的瞬间信号。必须等待输入端变为低电平活塞才会收回，这等价于一个上沿信号。</p>
 <p data-pid="pZXDidFZ">　　下右图是一个T触发器，左边紫色为输入端，接一个上沿信号发生器输出0.2秒短信号，右上绿色方块是输出端，T触发器储存一个信号，高电平短信号使触发器工作，效果是使原有信号翻转并储存输出。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-4c8aa3567f3e773bf0999f861aa5a084_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="189" data-size="normal" data-original-token="v2-ea3ea9468f3eb5c5be73855aae927c8d" data-default-watermark-src="https://picx.zhimg.com/50/v2-e78e1c7e75389b34f059a947359247c4_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-4c8aa3567f3e773bf0999f861aa5a084_r.jpg?source=1940ef5c">
  <figcaption>
   T触发器
  </figcaption>
 </figure>
 <p data-pid="o4IkJncs">下左为短信号转1秒信号器，实际上可以做出任意长度信号之间的转换，比如0.1秒转4秒，5秒转0.2秒等等。下右为3秒短信号轮换器，即第0秒输出短信号到A端，第3秒输出短信号到B端，第6秒输出到A端……</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e20023cb6b0779f10b12cfda059eb1d4_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="210" data-size="normal" data-original-token="v2-2513f2ab5ad08d34cee73d0da3937c77" data-default-watermark-src="https://pic1.zhimg.com/50/v2-ddfc9a45442b7e89e42dd0ba684a648b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-e20023cb6b0779f10b12cfda059eb1d4_r.jpg?source=1940ef5c">
  <figcaption>
   信号长度转换器
  </figcaption>
 </figure>
 <p data-pid="rocf1Jwt">移位触发器，也是很常用的一种结构，可以做成单向或双向。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-fd5b65bfcc3857860f0d2482d8df3607_720w.jpg?source=1940ef5c" data-rawwidth="415" data-rawheight="253" data-size="normal" data-original-token="v2-eae3eaee4cbb7fadc3d211d894ff49e4" data-default-watermark-src="https://pic1.zhimg.com/50/v2-7e8622fb275f26c982c5154d32c7f6d1_720w.jpg?source=1940ef5c" class="content_image" width="415">
  <figcaption>
   移位触发器
  </figcaption>
 </figure>
 <p data-pid="uGaZNIuP">下左为时钟频率储存器，即长度mt的信号在长度nt为一个周期的环路中（n&gt;m）作循环传递。时钟频率储存器和信号发生器组合可以变成计算机的时钟信号发生器。下右为短信号阻断器（名字值得吐槽，我也不知道该取什么名字= =），可以滤去0.6秒以下的短信号。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-f330ece0b82b685d10d8c5a0b243852e_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="199" data-size="normal" data-original-token="v2-d19e9c94b30b32b01d9c3ac6307b5970" data-default-watermark-src="https://pic1.zhimg.com/50/v2-a1b449d5e37ea194fec0c3c6980d31cf_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-f330ece0b82b685d10d8c5a0b243852e_r.jpg?source=1940ef5c">
  <figcaption>
   短信号阻断器
  </figcaption>
 </figure>
 <p data-pid="z_bXvMq-">下左蓝色部分为4路选择触发器，发射信号选择其中一路并储存该状态，之后发射信号选择其他某一路会清除之前的选择并存进新的选择。下右黑色部分为总线信号清空单元，可以周期性的阻断总线信号通路。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-115ec7192152af3c2e0f48cb5fd34820_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="207" data-size="normal" data-original-token="v2-efc07292d7858968501010ec7f619740" data-default-watermark-src="https://picx.zhimg.com/50/v2-4d2d543196c75f2021e57bfc19e4d262_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-115ec7192152af3c2e0f48cb5fd34820_r.jpg?source=1940ef5c">
  <figcaption>
   信号触发阻断器
  </figcaption>
 </figure>
 <p data-pid="70OS8apy"><b>储存器：</b></p>
 <p data-pid="vXWbxinQ">见继电器锁存功能的介绍。锁存单元8的并列，然后用同一根线控制锁存，再用一根线控制存储信号的开闭，就组成了一个1byte的储存器。大量储存器组成3D阵列。相邻奇偶编号储存器加上byte/word切换控制模块。最后再用统一的译码模块编码，就成了完整地储存器。</p>
 <p data-pid="oKzjTeUz"><b>复合功能结构</b></p>
 <p data-pid="z7kQuiP6">　　由简单功能结构可以进一步组成复合功能结构，从而完整地实现某一功能。比如全加器级联变成加法器；异或门和加法器串联，然后级联，再加上符号信号端变成求补器等等。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-387ce36753b3cc88db8a323f0e78865e_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="268" data-size="normal" data-original-token="v2-b51b9102ea78e6fb8a5a21f0a8e12f09" data-default-watermark-src="https://pica.zhimg.com/50/v2-852a1bda264cacb581db653c0b53d535_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-387ce36753b3cc88db8a323f0e78865e_r.jpg?source=1940ef5c">
  <figcaption>
   带溢出判断的补码加法器
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-b06b3328b7e28f6dfc3f50b7112265e1_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="261" data-size="normal" data-original-token="v2-42c6447ba7acdf7111b3fcff7b0d4f00" data-default-watermark-src="https://picx.zhimg.com/50/v2-65867aea826062fda830cc687ab1b6e0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-b06b3328b7e28f6dfc3f50b7112265e1_r.jpg?source=1940ef5c">
  <figcaption>
   译码器
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-c957bea38d8a7676421ec577d7947908_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="201" data-size="normal" data-original-token="v2-8a6f5045553578e6ad013583bf1559ff" data-default-watermark-src="https://picx.zhimg.com/50/v2-3e27fd134153abbf8f8b9ee1ef5152d9_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-c957bea38d8a7676421ec577d7947908_r.jpg?source=1940ef5c">
  <figcaption>
   另一种译码器
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-28143339dfb8e854f41db4aa7a638160_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="341" data-size="normal" data-original-token="v2-0b5feac69882da4166b53dba9750da13" data-default-watermark-src="https://pic1.zhimg.com/50/v2-0decc17c41a75b7520b210e93742efef_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-28143339dfb8e854f41db4aa7a638160_r.jpg?source=1940ef5c">
  <figcaption>
   显示器单元
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-55488199dc55a18e9f088023016cfb7f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="273" data-size="normal" data-original-token="v2-340e3fe8ed4c8528e5fa16f1a371401a" data-default-watermark-src="https://pic1.zhimg.com/50/v2-6a3a7a9b5f3790c0851d28c01e94375f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-55488199dc55a18e9f088023016cfb7f_r.jpg?source=1940ef5c">
  <figcaption>
   可读写存储器单元，作为寄存器MAR
  </figcaption>
 </figure>
 <p data-pid="v4U7_jEl"><b>硬件功能单元</b></p>
 <p data-pid="5Apij-0l">　　复合功能单元能执行某一个完整的逻辑功能，比如加法器使两个补码相加，求补器使某个原码求补码。而硬件上加减法器的完整功能一般指从求补码到加减法到求原码返回寄存器或总线的完整过程。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-999e2736144b4a750e7a56104da009b7_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="379" data-size="normal" data-original-token="v2-7cf22f4494375bd301fec5e2c81f9cab" data-default-watermark-src="https://pica.zhimg.com/50/v2-47e43a0ada6f14082b1478cb7e0903fb_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-999e2736144b4a750e7a56104da009b7_r.jpg?source=1940ef5c">
  <figcaption>
   缓冲队列，有两个功能信号端和一个16bit的输入接口和一个16bit的输出接口
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-dc978b096d5ce0fb603bdd5c67f1d0e3_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="245" data-size="normal" data-original-token="v2-17b5b3e36a7002ba9f931ff81c1c9cab" data-default-watermark-src="https://picx.zhimg.com/50/v2-4a3d5aec5ab5813ed55fa9293810377d_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-dc978b096d5ce0fb603bdd5c67f1d0e3_r.jpg?source=1940ef5c">
  <figcaption>
   乘法器溢出判断的一部分，是译码器，位数判断器，加法器构成的
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-ba20dcabe2fd98ffaef0a09fb090f25f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="270" data-size="normal" data-original-token="v2-a8ebac91b097cc5fb9f2a7e252f6fd38" data-default-watermark-src="https://picx.zhimg.com/50/v2-6ee06c243503749af27ee8bc4c7a7a91_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-ba20dcabe2fd98ffaef0a09fb090f25f_r.jpg?source=1940ef5c">
  <figcaption>
   16bit除法器，可以输出商和余数
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-5b4265649044241f99069f85de848fa2_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="323" data-size="normal" data-original-token="v2-1fb47168a472ad6829f1f7d61487f7aa" data-default-watermark-src="https://pic1.zhimg.com/50/v2-b65f5c946d292760fb08f69812acd889_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-5b4265649044241f99069f85de848fa2_r.jpg?source=1940ef5c">
  <figcaption>
   单精度浮点加法器，符合IEEE754标准。这个家伙算是结构比较复杂的了，四种基本元件用掉了34530个，以逻辑门数量来估算也大概有5000个左右了
  </figcaption>
 </figure>
 <p data-pid="d9jhG9HU"><b>硬件功能模块</b></p>
 <p data-pid="hdOUjeAL">　　功能单元足够多的时候就会形成模块。比如加减法器，乘法器，除法器，移位器，布尔逻辑单元等等组成ALU；指令缓冲队列，指令译码器，指令发射端等等组成CU；地址译码器，储存器阵列，寄存器等等组成完整的具有等级结构的储存器体系。功能单元的位置，朝向等都会大大影响布线的困难程度和延时的长短，这对整个计算机的运行效率有至关重要的影响。所以对功能模块的放置需要花很多时间计算，排列，布置。我花了很多时间不断修改，调整。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-dd0d3b9d7e9b20fde488a3cd37d64cc8_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-f40add76576724be3cddca66d41b9f6e" data-default-watermark-src="https://picx.zhimg.com/50/v2-bcb78dcf8ed13d4f4cdae927a84b2998_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-dd0d3b9d7e9b20fde488a3cd37d64cc8_r.jpg?source=1940ef5c">
  <figcaption>
   显示器模块的背面（还在建设中）
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-508607bcec2bfd4c9ce61557450a12e3_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="320" data-size="normal" data-original-token="v2-3a838e99b855ceb681f343ad96e6577b" data-default-watermark-src="https://pic1.zhimg.com/50/v2-ad4104e28a7799e005fdd74483648b71_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-508607bcec2bfd4c9ce61557450a12e3_r.jpg?source=1940ef5c">
  <figcaption>
   （这张应该是前期成品）
  </figcaption>
 </figure>
 <h2><b>二、硬件单元及硬件算法</b></h2>
 <p data-pid="wQkLSZy6"><b>硬件单元列表及特性</b></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-58d8ee2512b4aa6b16e254d82ba237b8_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="1139" data-size="normal" data-original-token="v2-bec889cfaed684e289b3b3742077bacc" data-default-watermark-src="https://picx.zhimg.com/50/v2-a62877d846fff47f56e7903368fd6e92_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-58d8ee2512b4aa6b16e254d82ba237b8_r.jpg?source=1940ef5c">
  <figcaption>
   共40个硬件单元，是大部分CPU和计算器部分硬件单元的列表，其中除了指令译码器，指令发射端，异常中断响应没有做完，其他都竣工了。还有一些小的硬件单元就没写上去了。字符显示器模块零部件太多也没加上去，留到最后一部分介绍。
  </figcaption>
 </figure>
 <p data-pid="7N-c1DKh"><b>硬件算法</b></p>
 <p data-pid="yvj5dlpI">　　算法对硬件设计是灵魂，好的算法设计出来的硬件单元可能要比不好的设计节省10倍的运算时间，10倍的空间，10倍的建造精力。总之算法决定ALU的一切。</p>
 <p data-pid="weUx5SWW">　　加减法就是常见的补码加法算法，乘法就是级联串行乘法，都没什么特别的。重点介绍后面几个。</p>
 <p data-pid="cp1rNL5t"><b>BCD/BIN转换算法</b></p>
 <p data-pid="zNB6P3uV">　　输入端BCD转BIN算法（这个自己想出来的）</p>
 <p data-pid="fU8v1X73">　　想法很直接，BCD十进制码转BIN二进制码按照常规的数学运算就是十进制每一位乘上10的各自位数-1次方。比如123=1x10^2+2x10^1+3。这个反映到二进制算法上就是将BCD每一位数的四个信号乘以10的n次方的二进制值，n为该位数-1，最后所有位再加起来。重要的是这种算法在硬件上实现很简易，所以我也没找其他算法，就直接用了。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-a559a07b7a5b35b6b66056f88cbfffff_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="322" data-size="normal" data-original-token="v2-3c52c79d6bfb054aa187eaca2059fb94" data-default-watermark-src="https://pic1.zhimg.com/50/v2-95a3de40132de01d3602bf4db3b944dd_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-a559a07b7a5b35b6b66056f88cbfffff_r.jpg?source=1940ef5c">
  <figcaption>
   BCD转BIN单元
  </figcaption>
 </figure>
 <p data-pid="iiMf0Qna"><b>输出端BIN转BCD算法</b></p>
 <p data-pid="IjLTFd4j">　　这个用的是通用的算法，流程如下：</p>
 <p data-pid="sInInzkQ">　　某二进制数一直做左移操作，每一次左移后从第一次移位进入的那个位向左每4个位切断成一组（作为BCD数），然后判断改组是否大于等于5，如果大于等于5则该组+3处理，小于5不用处理。所有组处理完后继续移位，一直移到末尾进入第一次移位的那个位。文字介绍很别扭，可以结合下面的图看。</p>
 <p data-pid="isFRxEtK">借用mc论坛上的举例介绍：</p><a data-draft-node="block" data-draft-type="link-card" href="https://link.zhihu.com/?target=http%3A//www.mcbbs.net/thread-97108-1-1.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">【教程】BIN转BCD的演算方法与过程 - 游戏技巧 - Minecraft(我的世界)中文论坛 -</a>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-ec424e05d5f848a2712ec359962e0af4_720w.jpg?source=1940ef5c" data-rawwidth="479" data-rawheight="285" data-size="normal" data-original-token="v2-0e413ef9e4de9f1749c8b28729f7cf98" data-default-watermark-src="https://picx.zhimg.com/50/v2-a67529763a718e36886612d588f84973_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="479" data-original="https://picx.zhimg.com/v2-ec424e05d5f848a2712ec359962e0af4_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="xPA4hRID">　　把Units，Tens，Hundreds和他们所处的那一列统称为1组，另外Binary和它所在的那一列不算一组，表格一行一行看。1组数据对应一个BCD字符，2进制数有多少位就把它往左移多少位。左边的英文是操作，shift是移位，add是加。Units组的最右边一位就是上文指的“第一次移位进入的那个位”。</p>
 <p data-pid="m7O8VA60">　　上图是以255为例，下面再以123为例的流程如下：</p>
 <p data-pid="lVhOxqpW">　　123的二进制数是0111 1011</p>
 <p data-pid="wVWMRKh9">　　我们先将其左移1位，得到1111 0110</p>
 <p data-pid="y6EiG-IH">　　目前还在binary那列里，所以继续移位</p>
 <p data-pid="PAZ7PuVp">　　得到0001 1110 1100</p>
 <p data-pid="xB2jjcT9">　　组里的数字小于5，继续移</p>
 <p data-pid="_03z-KRb">　　得到0011 1101 1000</p>
 <p data-pid="-Thf370i">　　继续移位</p>
 <p data-pid="JNbBsCcM">　　得到0111 1011 0000</p>
 <p data-pid="D5LTAKWf">　　可以看到Units组里的数字已经大于5了，所以把当前该组里的数据+3处理</p>
 <p data-pid="IxNplrmt">　　到1010 1011 0000</p>
 <p data-pid="h5H9KCaB">　　继续移位</p>
 <p data-pid="u_9VUMCh">　　得到0001 0101 0110 0000</p>
 <p data-pid="ImvPRN8J">　　Units组里的数字等于5，所以再加3</p>
 <p data-pid="2KR74XmF">　　得到0001 1000 0110 0000</p>
 <p data-pid="VTodmZOs">　　继续移位</p>
 <p data-pid="55K-u2lU">　　得到0011 0000 1100 0000</p>
 <p data-pid="uuNuQKMa">　　继续移位</p>
 <p data-pid="kvqi5y5s">　　得到0110 0001 1000 0000</p>
 <p data-pid="U7GxeRit">　　这次是Tens里的数据大于5了，所以+3处理</p>
 <p data-pid="ell_XElU">　　得到1001 0001 1000 0000</p>
 <p data-pid="tqygeBGB">　　因为在2进制数前面补了一个0，所以变成了8位的数据，现在还差最后一次的移位</p>
 <p data-pid="P-rmMTph">　　得到0001 0010 0011 0000 0000</p>
 <p data-pid="kaqkhQlX">　　结束</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-83797a541358cf5348c05fbf7ea53ea3_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="372" data-size="normal" data-original-token="v2-942707fe2652a6d03dc4fb38a1fa0ce4" data-default-watermark-src="https://pica.zhimg.com/50/v2-bf2928caacf5077db366da361aff623e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-83797a541358cf5348c05fbf7ea53ea3_r.jpg?source=1940ef5c">
  <figcaption>
   最终设计出的硬件结构，15bit的BIN转BCD转换器
  </figcaption>
 </figure>
 <p data-pid="yaVzSWH3"><b>除法算法</b></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-6998898123d8d04eed7b637e8833857a_720w.jpg?source=1940ef5c" data-rawwidth="455" data-rawheight="353" data-size="normal" data-original-token="v2-f87a52d442096889d4b511248d4bdb0c" data-default-watermark-src="https://pica.zhimg.com/50/v2-5413fb3defc01d9bd89e8ea7b827fae9_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="455" data-original="https://picx.zhimg.com/v2-6998898123d8d04eed7b637e8833857a_r.jpg?source=1940ef5c">
  <figcaption>
   恢复余数的加减交替算法流程
  </figcaption>
 </figure>
 <p data-pid="pnZRULD8">　　整个串行的除法器利用减法判断符号来决定上商和恢复余数。由于除法在硬件上的运算密度比较高，串行除法器如果让它完全不受时序控制直接串行推进运算会让电脑负担太大的运算量导致卡顿。这个的主要原因是信号在时间上的重叠，初始信号一开始就传送到了最后，每一行的部分积余数一算完，后面所有的信号都要全部改变一次，会导致几千个红石火把每一秒经历若干次变化（还好总数比8小不至于崩溃）。所以我又设计了一个控制运算推进的时序电路，最终卡顿的情况比原来好了许多。</p>
 <p data-pid="_pc5owhB">　　设计出来的硬件单元前文已给出，再贴两张细节。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-d3ce5006fef97130d761e46d3d48ae97_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="321" data-size="normal" data-original-token="v2-eb15ab43983ab16c8f00c46b76f2b219" data-default-watermark-src="https://picx.zhimg.com/50/v2-65a077ce277ece876a94409aca8cb0a0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-d3ce5006fef97130d761e46d3d48ae97_r.jpg?source=1940ef5c">
  <figcaption>
   灰色部分是最终恢复的余数输出端，右下红绿相间的加法器是除数输入端，被圈出来的蓝色方块从上到下一共15个是被除数输入端，被圈出来的那个是最低位，它下方偏右的那个是最高位
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-79d130cef8f8538c1236edff99994fba_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="352" data-size="normal" data-original-token="v2-826d04768a07ebe99e1f5b684380bccf" data-default-watermark-src="https://picx.zhimg.com/50/v2-795ef93149615fd68eabbbb0c48625b4_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-79d130cef8f8538c1236edff99994fba_r.jpg?source=1940ef5c">
  <figcaption>
   换一侧看除法器，绿色的一共15个是商输出端
  </figcaption>
 </figure>
 <p data-pid="X4fsEAgx"><b>浮点加减法算法</b></p>
 <p data-pid="wc9wGdRN">　　这个也是用的通用算法。</p>
 <p data-pid="UrfZOSEr">　　按照下面几个步骤来：</p>
 <p data-pid="XcPyUvfH">　　浮点数由阶码和尾数构成，可以看做是二进制的科学计数法。阶码就相当于科学计数法的那个幂次方数，尾数就相当于有效数字的具体数值。比如0.11x2^3,其中0.11是尾数，3是阶数。IEEE754标准的浮点数规格如下</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-cb235ecf1f8ddeb1ee4658924f179960_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="118" data-size="normal" data-original-token="v2-17664f18e352102787ce7f9272196c70" data-default-watermark-src="https://picx.zhimg.com/50/v2-5fae7e8b7ed5d5416f40f6df00280479_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-cb235ecf1f8ddeb1ee4658924f179960_r.jpg?source=1940ef5c">
  <figcaption>
   这是wiki上的图
  </figcaption>
 </figure>
 <p data-pid="y5unm9Se">要不要用偏正值其实无所谓，只要知道单精度浮点数(single precision floating point)的位数是32bit,指数位数=8，尾数位数为=23，还有一位符号位。其中指数位数中有一位是指数的符号位即表示其范围为-127到127，不算这个符号位就是指偏正值0-255，其实含义是一样的。而单独的那个符号位是给整个浮点数用的。</p>
 <p data-pid="oOWy9jB9">　　设有两个浮点数x和y,它们分别为</p>
 <p data-pid="A36Tfg1w">　　x＝2Ex•Mx</p>
 <p data-pid="evgaLQ2a">　　y＝2Ey•My</p>
 <p data-pid="s7R2YkJH">　　其中Ex和Ey分别为数x和y的阶码,Mx和My为数x和y的尾数。</p>
 <p data-pid="JtZfTHLp"><b>(1) 比较阶码大小并完成对阶</b></p>
 <p data-pid="NsuQw7bv">　　两浮点数进行加减,首先要看两数的阶码是否相同,即小数点位置是否对齐。若二数阶码相同,表示小数点是对齐的,就可以进行尾数的加减运算。反之,若二数阶码不同,表示小数点位置没有对齐,此时必须使二数阶码相同,这个过程叫作对阶。要对阶,首先应求出两数阶码Eｘ和Ey之差,即△E ＝ Ex－Ey。若△E＝0,表示两数阶码相等,即Ex＝Ey；若△E&gt;0,表示Ex&lt;Ey；若△E&lt;0,表示Ex&gt;Ey。当Ex≠Ey 时,要通过尾数的移动以改变Ex或Ey,使之相等。原则上,既可以通过Mx移位以改变Ex来达到Ex＝Ey,也可以通过My移位以改变Ey来实现Ex＝Ey。但是,由于浮点表示的数多是规格化的,尾数左移会引起最高有效位的丢失,造成很大误差。尾数右移虽引起最低有效位的丢失,但造成误差较小。因此,对阶操作规定使尾数右移,尾数右移后阶码作相应增加,其数值保持不变。显然,一个增加后的阶码与另一个阶码相等,增加的阶码的一定是小阶。因此在对阶时,总是使小阶向大阶看齐,即小阶的尾数向右移位(相当于小数点左移）每右移一位,其阶码加1,直到两数的阶码相等为止,右移的位数等于阶差△E。</p>
 <p data-pid="e2YpkjAX"><b>(2) 尾数求和运算</b></p>
 <p data-pid="vvB4_Oy_">　　对阶结束后,即可进行尾数的求和运算。不论加法运算还是减法运算,都按加法进行操作,其方法与定点加减法运算完全一样。我这里就照搬常用加减法器。</p>
 <p data-pid="ot2nwM11"><b>(3) 结果规格化</b></p>
 <p data-pid="ZmpXwFyw">　　在浮点加减运算时,尾数求和的结果也可以得到01.ф…ф或10.ф…ф,即两符号位不等,这在定点加减法运算中称为溢出,是不允许的。但在浮点运算中,它表明尾数求和结果的绝对值大于1,向左破坏了规格化。此时将运算结果右移以实现规格化表示,称为向右规格化。规则是：尾数右移1位,阶码加1。当尾数不是1.M时需向左规格化。</p>
 <p data-pid="4ae9dbgW"><b>(4) 舍入处理</b></p>
 <p data-pid="2Uh6xEYF">　　在对阶或向右规格化时,尾数要向右移位,这样,被右移的尾数的低位部分会被丢掉,从而造成一定误差,因此要进行舍入处理。简单的舍入方法有两种：一种是"0舍1入"法,即如果右移时被丢掉数位的最高位为0则舍去,为1则将尾数的末位加"1"。另一种是"恒置一"法,即只要数位被移掉,就在尾数的末尾恒置"1"。</p>
 <p data-pid="xO9heGFN">　　在IEEE754标准中,舍入处理提供了四种可选方法：</p>
 <p data-pid="OsTPhwOd">　　就近舍入 其实质就是通常所说的"四舍五入"，这是默认的常用方法。例如,尾数超出规定的23位的多余位数字是10010,多余位的值超过规定的最低有效位值的一半,故最低有效位应增1。若多余的5位是01111,则简单的截尾即可。对多余的5位10000这种特殊情况：若最低有效位现为0,则截尾；若最低有效位现为1,则向上进一位使其变为 0。</p>
 <p data-pid="5fbV9KAS">　　朝0舍入 即朝数轴原点方向舍入,就是简单的截尾。无论尾数是正数还是负数,截尾都使取值的绝对值比原值的绝对值小。这种方法容易导致误差积累。</p>
 <p data-pid="_bB8uYE5">　　朝＋∞舍入 对正数来说,只要多余位不全为0则向最低有效位进1;对负数来说则是简单的截尾。</p>
 <p data-pid="5UXL46_G">　　朝－∞舍入 处理方法正好与 朝＋∞舍入情况相反。对正数来说,只要多余位不全为0则简单截尾;对负数来说,向最低有效位进1。</p>
 <p data-pid="K1Loqq5t">　　本浮点加减法器符合IEEE754单精度fp32浮点标准，但由于体积问题没有使用舍入法，所以精度有一定损失。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-8fbbff3530ea3cfb1effb4af9034e255_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="279" data-size="normal" data-original-token="v2-cdfa9b3020e67dd2616c9cc7092d25b7" data-default-watermark-src="https://picx.zhimg.com/50/v2-3db5a8b88143ddd91d2548dc19498dfd_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-8fbbff3530ea3cfb1effb4af9034e255_r.jpg?source=1940ef5c">
  <figcaption>
   中间一大块都是对阶判断单元，也就是下图里右下角突出来的那一块。右上方紫色橙色相间的是结果规格化单元
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-4b7152677bbc9e2fcd5541db308fc71f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="382" data-size="normal" data-original-token="v2-bd513bbe828bf52a9613f5b2d05ca0e7" data-default-watermark-src="https://picx.zhimg.com/50/v2-b711fc2e5db8139c0c4a07805e82f0f4_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-4b7152677bbc9e2fcd5541db308fc71f_r.jpg?source=1940ef5c">
  <figcaption>
   呈对称状的三角形一共有三层，都是移位单元用于对阶，其后方，也就是图中藏在移位模块下方红绿相间的是尾数求和加减法器
  </figcaption>
 </figure>
 <p data-pid="ej_Q5KAo"><b>正余弦算法</b></p>
 <p data-pid="VpkTJNve">　　这个用的是经典的cordic迭代算法中的旋转坐标算法。公式推导如下：</p>
 <p data-pid="xryCg4k2">　　将平面坐标系中向量（Xi , Yi）旋转角度θ得到新向量（Xj , Yj）</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2ef24cab9aa370225e17b9433310a79b_720w.jpg?source=1940ef5c" data-rawwidth="370" data-rawheight="69" data-size="normal" data-original-token="v2-d79e18a31839204ca268a686aa2c0ebc" data-default-watermark-src="https://picx.zhimg.com/50/v2-3bc8b501b704a49eff9d65a0d841078e_720w.jpg?source=1940ef5c" class="content_image" width="370">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-5989f995c80f4eabcfda767ec5763e83_720w.jpg?source=1940ef5c" data-rawwidth="463" data-rawheight="306" data-size="normal" data-original-token="v2-fe12fe0655f7861eb02e6f47826c23ce" data-default-watermark-src="https://picx.zhimg.com/50/v2-a4b0d9fd68fe13b9a3515bd82e8d0ce3_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="463" data-original="https://picx.zhimg.com/v2-5989f995c80f4eabcfda767ec5763e83_r.jpg?source=1940ef5c">
  <figcaption>
   β是初始角，θ是旋转角，R是圆周半径
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-48fbd283ed60b3d23bc06d0f067735d7_720w.jpg?source=1940ef5c" data-rawwidth="305" data-rawheight="79" data-size="normal" data-original-token="v2-0a69627ccd8b0b2f4085dc792bfba1f4" data-default-watermark-src="https://pic1.zhimg.com/50/v2-ae29c9c133ad8b3c884cb30bced067c8_720w.jpg?source=1940ef5c" class="content_image" width="305">
  <figcaption>
   化为矩阵式
  </figcaption>
 </figure>
 <p data-pid="Jn60bRmf">　　可以看出θ如果拆成许多个小θ，即θ=θ1+θ2+θ3+…+θn，那么作n次旋转即可得到结果。</p>
 <p data-pid="MtYyv1nP">　　为了方便二进制硬件运算，现构造一个θ序列：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-0d7b8148e7ecfad7b8316f13c4ebc425_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="59" data-size="normal" data-original-token="v2-0d7b8148e7ecfad7b8316f13c4ebc425" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-0d7b8148e7ecfad7b8316f13c4ebc425_r.jpg?source=1940ef5c">
  <figcaption>
   矩阵各项除以θn
  </figcaption>
 </figure>
 <p data-pid="WySiTdFk">先不管cos θn，构造θn=arctan(1/2^n)，并且满足</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-b14793a09ff212e19cc4c658245ddbc8_720w.jpg?source=1940ef5c" data-rawwidth="225" data-rawheight="59" data-size="normal" data-original-token="v2-1bf9a204bcca472f30f48c1ca7e4bfcb" data-default-watermark-src="https://pica.zhimg.com/50/v2-f782af95241ef285499e680929d2da24_720w.jpg?source=1940ef5c" class="content_image" width="225">
 </figure>
 <p data-pid="FENav3Xp">Sn表示θ的正负，也就是说构造出的这列θn前面要加正负号，以反复偏大偏小的趋势逼近θ。每一步旋转的角度Zn满足如下条件</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-369538e74974f5ae7412f6b516083722_720w.jpg?source=1940ef5c" data-rawwidth="162" data-rawheight="64" data-size="normal" data-original-token="v2-369538e74974f5ae7412f6b516083722" class="content_image" width="162">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2054bcc9b67ce8e4927e5d62bfd20806_720w.jpg?source=1940ef5c" data-rawwidth="205" data-rawheight="79" data-size="normal" data-original-token="v2-ae742b24abcf2aefd9d668e3fd77a3ea" data-default-watermark-src="https://pica.zhimg.com/50/v2-9d5253dc031c2607e943e31c1a4cfa84_720w.jpg?source=1940ef5c" class="content_image" width="205">
 </figure>
 <p data-pid="aO5Uuwpl">综上得</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-dbb3abc88ef12a5e8a6a377ed73b096d_720w.jpg?source=1940ef5c" data-rawwidth="333" data-rawheight="76" data-size="normal" data-original-token="v2-f9d1654aad8641ce70273c545ba18442" data-default-watermark-src="https://pica.zhimg.com/50/v2-c11cce4d6aef5d0ca16e17f2bba41318_720w.jpg?source=1940ef5c" class="content_image" width="333">
 </figure>
 <p data-pid="C59b_FGe">经过N次迭代后</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-8bb41373e79bc0fd25ee7a8b4fafc00d_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="64" data-size="normal" data-original-token="v2-8bb41373e79bc0fd25ee7a8b4fafc00d" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-8bb41373e79bc0fd25ee7a8b4fafc00d_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="YHCu4KbS">　　这个K就是一坨cosθn的连乘，定义为增益因子。</p>
 <p data-pid="1P21-10j">　　取无限次迭代值为</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-548a586efa18c41f7f83c569b66e9976_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="69" data-size="normal" data-original-token="v2-548a586efa18c41f7f83c569b66e9976" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-548a586efa18c41f7f83c569b66e9976_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="tCM7W2Rg">　　P为K的倒数。Cordic算法有几种模式，这里只取旋转模式。将上述矩阵化为数列得</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-0cd5d4adcd66f099e9e1b41216ab8db5_720w.jpg?source=1940ef5c" data-rawwidth="252" data-rawheight="122" data-size="normal" data-original-token="v2-c577ed5813774d8f319a894c9fbab0b0" data-default-watermark-src="https://pic1.zhimg.com/50/v2-1e1e93f982811e3928d4ab10b959c111_720w.jpg?source=1940ef5c" class="content_image" width="252">
 </figure>
 <p data-pid="mX80zFzD">N次迭代后</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-7268f9a887ada50d77508872b6248954_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="95" data-size="normal" data-original-token="v2-ee731ef19d9cec19bba72c3baa2dd58a" data-default-watermark-src="https://pic1.zhimg.com/50/v2-1067443448e5a22f54e57f99de215e8f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-7268f9a887ada50d77508872b6248954_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="BLHDG9vA">然后就是套三角函数了，取X0=K，Y0=0，Z0=α，那么N次迭代之后</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-7b717f4a4a77fdf48666a9a4f8301a05_720w.jpg?source=1940ef5c" data-rawwidth="361" data-rawheight="49" data-size="normal" data-original-token="v2-7b717f4a4a77fdf48666a9a4f8301a05" class="content_image" width="361">
 </figure>
 <p data-pid="L_W8FjNq">　　正余弦就算出来了。没了。</p>
 <p data-pid="4MIAFK-m">　　用在硬件上的优势是，该算法从矩阵去除cos因子之后就在尽力构造简易的二进制运算比如加减和移位。需要预先算好那个K的值精确到指定位数，还要算arctan(1/2^n)，这些都要放到储存器里。</p>
 <p data-pid="dzA7ezdu">　　其中细节不说了，最后我设计出的玩意儿就下面这货。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-4b847e411b63f1e79837710c33d904cd_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="310" data-size="normal" data-original-token="v2-df54fa41594ae174cb2f5ec6cb96e1ce" data-default-watermark-src="https://picx.zhimg.com/50/v2-fa261a979e8c0027b4894d9f212a429d_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-4b847e411b63f1e79837710c33d904cd_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-4ff892c0417bf7c1d8f1a7842000b116_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="266" data-size="normal" data-original-token="v2-b96713f3b0417139020e8141d94809c0" data-default-watermark-src="https://pic1.zhimg.com/50/v2-e1059ef0e3ca388001d02fb8b9b30ecf_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-4ff892c0417bf7c1d8f1a7842000b116_r.jpg?source=1940ef5c">
  <figcaption>
   硬件框图
  </figcaption>
 </figure>
 <p data-pid="Wh5Jwlvw">注：1.由于我懒得去用数学软件打公式，以上数学公式的图片均截取自一篇来自桂林电子科技大学李全，陈石平和付佃华的论文《基于CORDIC 算法的32 位浮点三角超越函数之正余弦函数的FPGA 实现》</p>
 <p data-pid="MERik-LY">2.我不打算让三角函数运算单元加入FPU结构了，所以没做成IEEE754标准，只给浮点计算器用。</p>
 <p data-pid="LfWvTDKo"><b>开方算法</b></p>
 <p data-pid="JRIJSiI8">　　特殊函数计算器除了三角函数外另一种运算是7位操作数开方运算，输出4位开方结果和4位余数。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-09969d86d7ac386b4f7848b51e8c6e43_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="352" data-size="normal" data-original-token="v2-a67bd7b2cf32c3ac01cd4e6517346ff7" data-default-watermark-src="https://pic1.zhimg.com/50/v2-889154fcec130fe3348c12fadbc900ee_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-09969d86d7ac386b4f7848b51e8c6e43_r.jpg?source=1940ef5c">
  <figcaption>
   笔算开方算法（快速平方根算法）流程（图片来自《基于FPGA快速平方根算法的实现》- 戢小亮，嵌入式技术，2007年14期）
  </figcaption>
 </figure>
 <p data-pid="dZQEEZA7">　　该算法在硬件上实现很简单，只需要用到加法器和移位器即可，所以在本工程中实现出来的体积不大。最终实现了一个23位开方根器，如下图直角梯形部分。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-2f97d601e0f3ed59ac721c7717f8ed33_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-dbd76492b4c54c5fe4d74b77c35bb0c0" data-default-watermark-src="https://picx.zhimg.com/50/v2-40703a9eb8ee0ecd55d8375bee35a585_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-2f97d601e0f3ed59ac721c7717f8ed33_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="M_pjGTIc">　特殊函数计算器的运行结果显示如下两图示例</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-8edb326661380468e800b373f9c0a774_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-06f368878883888fa638034e2f3df9d8" data-default-watermark-src="https://pic1.zhimg.com/50/v2-5895bf910817afcfa91ee553b3cf9cd9_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-8edb326661380468e800b373f9c0a774_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e5cd75f229f72dccadd45c71a996f6b7_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="331" data-size="normal" data-original-token="v2-1ee04a72dbeb447e84ea0b9e05ac079e" data-default-watermark-src="https://picx.zhimg.com/50/v2-16275b2b6bfe6473532ea71b56c8650f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-e5cd75f229f72dccadd45c71a996f6b7_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="jFTwAhoW">　　三角函数运算输入4位定点有效数字的角度，输出sin值和cos值，运算+输出时间约为130秒输出sin值，再过10秒输出cos值，输入角限制为0-83.88度之间。开方运算输入7位有效数字，可以选择小数点在第三位或整数形式，输出结果为4位开方结果和4位余数，运算+输出时间约为50秒输出开方值，再过10秒输出余数。</p>
 <h2><b>三、储存器架构和流水线</b></h2>
 <p data-pid="ipyFZt6Q">　　因为还没有做完这一部分，可能还会有修改，所以就简要的介绍一下。</p>
 <p data-pid="ddTcr0_i">现代计算机都是围绕储存器为中心，因为储存器容量极其巨大，其占用的晶体管数量远远超过用于运算和指令分配的其他逻辑单元。</p>
 <p data-pid="PbAmmfBB">　　比如一颗GPU，拿GK104为例，一共30多亿晶体管，片上缓存就占了芯片面积的接近三分之一。这还只是第一级的读取机制，缓存分一二三级，后面还有主储存器（内存），还有硬盘，这些容量每一级都要比上一级大了大约两个数量级。容量大，晶体管多，电流流过的时间长，最终读取到数据的时间必然变长。但是处理器时时刻刻都在做运算，如果第一时间不能取到需要的指令和数据，流水线就会空置。现代处理器运算速度和储存器延迟的鸿沟越来越大，计算机核心技术基本都是围绕储存器开展的。为了填补这拉开的时间差所造成的瓶颈，各种流水线结构，总线结构，硬件算法孕育而生。</p>
 <p data-pid="Dq0zvLKO">　　流水线技术使得整个指令流程前后重叠，能最大限度利用每一个硬件单元。早期CPU流水线级数较小，现在的CPU一般都是十几级流水线。流水线级数也不是越大越好，因为存在一些情况，比如较晚的分支预测错误，会导致流水线冒泡。</p>
 <p data-pid="zdj4TeQu">　　本工程使用Harvard结构，相对于Neumann结构。程序储存器和数据储存器分开放置。程序储存器1kb，数据储存器0.5kb。由于指令是统一的双字节，所以程序储存器只按字（双字节）存取。而数据格式可以是单字节（低8位），也可以是双字节，所以数据储存器可以按字或按字节存取。</p>
 <p data-pid="vw6gq9ZX">　　寄存器方面，ALU用ACC存放X操作数和运算结果，这里的运算结果都是需要双操作数的那些逻辑运算指令比如加减乘除与或异或，另一个操作数由Y寄存器存取。除法的余数最终会输出到最靠近除法器输出端的那4个寄存器的末端一个。所以如果之后要使用余数，就要避免在转移余数之前使用该寄存器做其他事情。另外还有8个通用寄存器供自由使用，一共可自由支配的寄存器有13个，ACC+12个通用寄存器。再算上栈区的4个单元，就一共有17个。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-3ca5b706f65e6738513cc290b3f2ae7a_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="319" data-size="normal" data-original-token="v2-811b73ed25b6ccc534f8d3905b073a78" data-default-watermark-src="https://pic1.zhimg.com/50/v2-77f6e0c7ee9f992e998ac26e86cf26a7_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-3ca5b706f65e6738513cc290b3f2ae7a_r.jpg?source=1940ef5c">
  <figcaption>
   简易的CPU功能模块立体位置图
  </figcaption>
 </figure>
 <p data-pid="oJl3Dozy">储存器阵列是3D的，也就是具有长宽高三个向量。为了给一个长方体的每一个单元编码，我采用的是先用地址码的低4位给个面编码，再用地址码的高5位给一条线编码，一个面乘以一条线正好覆盖了整个长方体。</p>
 <p data-pid="k_QxIHUz">　　通往储存器的地址线是总线分出来的支线，数据线也是一样的。这两列线分别连到储存器的3D结构里。地址线就连到刚才说的译码高5位和低4位，数据线的16个bit每一根连到每一个储存单元的对应bit。数据线先分散后集中。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-128250b9385b902458834c7cbaf5f9a4_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="363" data-size="normal" data-original-token="v2-1d7f916a0b007e50dd75e4b6bd8c4f89" data-default-watermark-src="https://picx.zhimg.com/50/v2-8c828ad2b261a47cd4dce888222c26e6_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-128250b9385b902458834c7cbaf5f9a4_r.jpg?source=1940ef5c">
  <figcaption>
   程序储存器侧面图，是立体8层叠加式结构，每一层128byte
  </figcaption>
 </figure>
 <p data-pid="lYaXUFht">　　本工程因为体积和延时问题的特殊性，主程序储存器只有1.5kb，访存速度相对于真实的计算机快多了，所以这个并不是瓶颈，可以在相对较短的时间内取到想要的指令。所以本想借这个优势实现指令全流水，也就是依靠复杂的分支预测机制将流水线漏洞封死。后来尝试做了一下，发现问题还是很多，比如预译码，预跳转中PC的占用冲突和布线困难，前一条跳转指令和后一条跳转指令的冲突，如果想要做出来，开销过于巨大，基本上CU的体积要增加0.5倍，这对我之后的工作影响很大故弃之，改为二位动态分支预测器来执行分支预测，这样流水线会冒气泡，但是损失不大。为了最大限度的缩小流水线气泡，我前后进行了相当多细微的改进。</p>
 <p data-pid="1IY25MdR">　　流水线：取指→预译码，预执行→译码(→间指)→执行(→写回)</p>
 <p data-pid="8UaXcoGT">　　完整的流水线，一条指令会经历如下过程：当指令缓冲队列的指令条数小于4条时，先加载已经处于载入端的下一地址的指令，然后发出一个信号往PC，PC将当前储存的地址传送至程序储存器MAR，然后PC+1，地址译码器将相应地址的指令A传送至程序储存器MDR的载入端，如果是跳转指令等需要修改PC的指令则预执行指令。意思是将程序指针类指令全部放在另一个流水线分叉上执行。如果不是跳转指令，则MDR将A指令压入指令缓冲队列。如果此时缓冲队列里有ABC三条指令按这个顺序排列，那么等待C先弹出，然后B弹出，最后轮到A弹出至IR，IR将A送往指令译码器，控制信号通完各EU单元前端。等待前面的B指令执行完了 ，然后正式执行A指令。此时如果有间指周期，则将数据地址输送至地址译码器，从寄存器或数据储存器读取数据送到相应单元。然后执行指令。执行完毕如果有写回周期则执行写回。一条指令执行完毕。期间在指令缓冲队列和IR中如果前面有一条指令是条件跳转指令并且分支预测错误，会使缓冲队列和IR清存。PC发射正确的地址重新取指。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-c55787d7c0a08d1337c956411723f5d3_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="245" data-size="normal" data-original-token="v2-f52c0e5d9fb51c84eb75f1638b754f19" data-default-watermark-src="https://pic1.zhimg.com/50/v2-93fe671587713a45aa3b76fa6cd31aab_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-c55787d7c0a08d1337c956411723f5d3_r.jpg?source=1940ef5c">
  <figcaption>
   流水线流程图
  </figcaption>
 </figure>
 <p data-pid="fWAm3o82">　　蓝线是控制信号，绿线是数据信号，红色字母和橙色箭头是指令队列的顺序压进方式。</p>
 <p data-pid="COCf6xKQ">　　另：本工程的所谓内存实际上是硬盘，因为我的程序是储存在这里面的，关机的时候我不会把储存器清空。不过这个问题无关紧要。</p>
 <h2><b>四、指令集架构</b></h2>
 <p data-pid="pxe2iA_v">指令格式和取指方式：</p>
 <p data-pid="RYrFgHzd">ALU Instruction Formats</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-90a08e32a1d55eda5671f9b53ee9c633_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="594" data-size="normal" data-original-token="v2-5d201dcc67af06a429e8ada6f5163f21" data-default-watermark-src="https://pica.zhimg.com/50/v2-71c8316f5f22b40ac6918ca017b32264_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-90a08e32a1d55eda5671f9b53ee9c633_r.jpg?source=1940ef5c">
  <figcaption>
   暂定指令表（此表暂时作废，已经制定出新表，与此表出入较大）
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="8Pq9FCUP">　　由于CU还没做完，指令机器码可能还有较大变动，所以是暂定表，这一部分也不多介绍。其中有一些指令是我特殊设计出来为了节约代码，所以助记符不一定规范（有些缩写就是在瞎编）。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-6af984753ea934793a99133f34413bef_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="1022" data-size="normal" data-original-token="v2-3d04bcceb22dcc84e4f1f79bbf9b21e8" data-default-watermark-src="https://picx.zhimg.com/50/v2-0b4fafc97250ceb55923bed21786b3c5_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-6af984753ea934793a99133f34413bef_r.jpg?source=1940ef5c">
  <figcaption>
   部分指令说明（此处说明与最新设计的版本出入较大）
  </figcaption>
 </figure>
 <p data-pid="iMuIUm28"><b>1. 数据传送指令：MOV,PUSH,POP,RIA</b></p>
 <p data-pid="YsUXk5JV">　　MOV指令支持除了MAR,MDR,PC和栈区之外的寄存器之间的数据传送；</p>
 <p data-pid="Mug41h7_">　　PUSH和POP指令为压栈和弹栈，原地址和目标地址均为寄存器，当栈满时PUSH则无效，原栈区数据不变，以溢出中断处理；</p>
 <p data-pid="9ijH9f0R">　　RIA指令可实现单字节的立即数写入寄存器，设计该指令的目的是为了使寄存器赋初值等操作更灵活，节约指令周期。</p>
 <p data-pid="DeLzSYN2"><b>2. 数据读写指令：LDB,SDB,LDW,SDW,LIB,SIB</b></p>
 <p data-pid="2XOcs0__">　　LDB,SDB,LDW,SDW均为对数据储存器的读写操作，读操作均由储存器传输至ACC，写操作均由ACC至储存器；</p>
 <p data-pid="gefXGexG">　　LIB,SIB均为对程序储存器的读写操作，读操作均由储存器传输至ACC，写操作均由ACC至储存器；</p>
 <p data-pid="xY8r7w3r">　　这6种操作均支持4种寻址方式。</p>
 <p data-pid="gg3qwJlU"><b>3.算术运算指令：ADD,SUB,MUL,DIV,INC,DEC</b></p>
 <p data-pid="yKtrzYqf">ADD,SUB,MUL,DIV均为取操作数于Y寄存器，然后与ACC进行算术运算，结果存于ACC。当寻址方式为寄存器寻址时，指令格式为</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-47ea4fdfeec8d0763e662072e3defbf2_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="32" data-size="normal" data-original-token="v2-47ea4fdfeec8d0763e662072e3defbf2" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-47ea4fdfeec8d0763e662072e3defbf2_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="hSW3Zpo9">　　即该格式指令支持目标寄存器，结果由ACC存至目标寄存器；</p>
 <p data-pid="aqguBkBi">　　INC和DEC指令只支持寄存器直接寻址。</p>
 <p data-pid="rP10wpiV"><b>4.逻辑运算指令：</b></p>
 <p data-pid="Qz2i3wPC">ASH,LSH,AND,ORL,XRL,NOTASH和LSH指令只支持寄存器内数据移位操作，移位数值为立即数，取值范围-15到+15；</p>
 <p data-pid="hLSlWtTT">　　AND,OR,XOR指令和算术运算指令同格式；</p>
 <p data-pid="br0YPKJL">　　NOT,LSH指令为单操作数指令。</p>
 <p data-pid="vKTmb_Et">　　控制转移类指令参考流水线架构。</p>
 <p data-pid="AZ1WAh09">　　关于寻址位数。因为储存器很小，我在16bit的双字节指令里正好塞下了5位的基本操作码，2位的寻址方式和9位的储存器寻址。9位寻址对应512个程序储存器单元共1kb，也正好对应了512个数据储存器单元512byte，所有可用空间都填满了。所以不能再扩充内存，也用不到像8086一样的造过于复杂的段式内存管理，那样的MMU会给系统造成很大的延迟。</p>
 <h2>五、总线和时钟</h2>
 <p data-pid="TfYHOKFR">　　把总线单拉出来讲是因为本工程CPU的延迟瓶颈在总线而不是储存器。储存器体积虽然大但是立体结构使得信号传输时间相对较短。由于本工程CPU的EU部分接口太多，还都是16bit，还要考虑ALU输入输出接口朝向的问题，排了半天也很难将这些接口的距离缩短，最终变成了一个折线形排布。此时就需要总线将所有接口贯通起来。而本工程总线的一个重要特点是环状的，因为游戏用继电器实现信号传输具有二极管特性，只能单向导通（做成双向很麻烦），所以总线如果实现从任意段输入任意段输出只能走环路。环路虽然增加了一倍的距离，其延迟还在可以接受的范围内，大约5.8秒（每一个bit位的总线一共58个继电器800多米长）。最大的难题是当总线在某一周期的任务完成后，需要进行下一轮数据传输。但是因为环路的特性，继电器的储存器效应会让环路保持原有的信号。此时必须加一个开路装置将原有的信号阻断。按照平常的思路在某一个环路节点加一排活塞将线路切断，信号会在总线里拖尾5.8秒（因为继电器会储存相同长度信号，切断的节点其一边的信号会沿环路绕一大圈传输到另一边后才会最终消失）。这样的话一个周期一共要耗费11.6-12秒，这长度实在是难以接受。</p>
 <p data-pid="7X28mNEQ">　　在我本以为实在没办法解决这个延迟问题准备向其妥协的时候，突然想到了一个解决方案：总线清存也用时序逻辑控制。也就是说在总线上找若干个节点都放上一排开路活塞，每一次传输完毕后所有活塞在同一时间切断线路，那么这时需要考虑的延迟时间就是相隔最远的两个节点之间的距离差。比如最后的成品中相隔最远的两个节点是180米，那么就是1.2秒的信号拖尾，从原来的5.8秒节省到1.2秒，总的单周期时间正好是7秒。只需要加一个总线控制电路让其和系统时钟同步就可以了。而且这样设计的另一个好处马上凸显：在这1.2秒的清存时间里，指令发射端正好可以做各种调整工作，此时不需要使用总线，打了一个时间差，意味着各设备都充分利用到了时间间隙，是一个让我很惊讶的非常巧合的设计，感觉就好像有一种内在驱动力会让这一切看起来就应该是这样契合一样。</p>
 <p data-pid="9zni_tB_">　　下图黑色方块部分为总线清存器（第一部分已经提到过一次）。图中蓝白相间的，橙灰相间的，以及深灰色的线路全是总线，蓝白相间的是高八位，橙灰相间的是低八位，深灰色的是转角处的线路。颜色不同只是为了方便识别节点和高低位，没有功能上的区别。黑色方块上有很多继电器都是时序控制电路，用于周期性的向活塞输出开路信号。每7秒输出一个1.2秒的信号将一段一段的信号阻隔直到全部消失。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-87bf8986aeab156cb74dd029121b1392_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="310" data-size="normal" data-original-token="v2-ad898cc38527819ada44a26a8738580b" data-default-watermark-src="https://picx.zhimg.com/50/v2-412f86a6efb1233cdf449cb87622f1c6_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-87bf8986aeab156cb74dd029121b1392_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="hgc3M9rt">　　时钟暂定为总线周期7秒，取指周期5秒。所有信号的源头都是CU的时钟信号发生器发出的。一般的指令都是1或2周期，所以一般执行一条指令需要7或14秒，乘除类的运算指令时间较长，最长的除法指令需要6个周期。所以这个计算机的运算速度根本指望不上了，一个极简单的程序就会运行几分钟。毕竟是在“计算机实时模拟计算机”，所以速度什么的已经尽力做到最快了。</p>
 <p data-pid="ZGC1PdkU">PS:在最新版的DATA BUS中，我做了相当多的改进，比如互联驻存机制，每一个节点都可以储存信号，使信号可以在同一周期内一直停留在环路内。</p>
 <h2>七、图形显示原理</h2>
 <p data-pid="zTZgGUxN">　　说实话，显示器是最难做的东西之一，因为完全是时序逻辑在控制还要顾及到和使用者的交互。而且图形的东西对面积体积时间等问题要求极其严格（现实中的显示器没必要考虑那么多，因为这些都不是瓶颈）。而图形处理器就更是天方夜谭了，有很多玩家会说要是在Minecraft 里造一台计算机可以玩Minecraft就吊炸天。这显然不可能，而且想做一个纯粹靠通用处理器运算来玩的小游戏都绝对不可能。比如贪吃蛇这种图像刷新率低的游戏，肯定做不出来。</p>
 <p data-pid="9CiWWcPg">　　先简单介绍一下现实中的图形处理器以及显示器是如何工作的，这对理解一些设计理念有很大帮助，也能解释为啥MC里如此难以实现标准意义上的显卡。这一部分专业术语过多，仅供做相关参考，可以直接跳过看下面本工程的图形设备的设计。</p>
 <p data-pid="qW_NfQ4G">　　现实中的图形显示是按照“图形流水线”(graphic pipeline)来完成的。一般我们玩的3D游戏中，显卡是图像处理的设备。显卡的核心是GPU，CPU将应用程序的图像请求发送往GPU，GPU是图形处理器，作为协处理器。操作系统将所有的设备统一编址，并具有各自规范，所以每一个操作系统要调用GPU必须要有相应GPU的软件驱动程序。现在的GPU较为独立，CPU大部分时间不参与图形运算。GPU直接运行的是shader API，驱动程序指导GPU运行shader API，GPU的硬件结构将API编译成一条一条instruction。现在常用的shader API是OpenGL和Direct3D。由于图形运算是密集型并行运算，所以GPU内部有成百上千的unified shader ALU组成若干模块如nVIDIA GPU中的SM或者AMD GPU中的CU ，这些模块是程序员直接面对的对象，包含FPU，Load/Store Unit和SFU等等。还有TMU，Tessellator，rasterizer等等流水线上其他的功能单元，我们叫这些东西为：Fixed Function Unit。GPU的底层指令按照warp/wave的模式每一个指令周期都有成百上千条被发射，这些指令相关性小，一般都是顶点，像素，几何或纹理的shader指令。指令列队叫thread，每一个thread都会对应一个像素或顶点，若干shader ALU组成的vector单元同一时间用不同数据执行不同thread中相同的指令（因为front-end单元稀缺）。 每一个周期有成百上千个thread的某些指令被处理完，若干周期后所有thread都处理完，这时候一张画面就被初步执行完了，一般都是接近百万个像素点比如1280x720分辨率的显示器。之后图形流水线会将画面光栅化-rasterization，经过各种纹理，抗锯齿处理后，完整的具有正确几何信息和颜色信息的画面就处理完了。然后该幅画面就被送往帧缓存-framebuffer，这个是在显存中划出来的模块，等到合适的时机，该幅画面就传送往显示器输出，一张画面称为一帧。每秒钟一个GPU绘制出几十张这样的画面，人的肉眼就会看到流畅的画面。</p>
 <p data-pid="J3vSjNib">　　GPU是典型的SIMD结构，单指令多数据的大规模并行运算。并且其运算的数据多为浮点型。GPU耗费的晶体管数量会大于CPU，需要造一大堆重复的ALU阵列和寄存器阵列。</p>
 <p data-pid="FYXYzTBl">　　下面贴三张GPU架构图，都是AMD(ATI)和nVIDIA这两年的GPU产品（2013年前后）。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-759782193a8c059befee0c767dcace05_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="265" data-size="normal" data-original-token="v2-5d5d1b54ba510eaab2d00e4865c80c94" data-default-watermark-src="https://pica.zhimg.com/50/v2-d0e7dd9097825e1b2f2434b170bc460e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-759782193a8c059befee0c767dcace05_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-42a28c78a61cce390fc91aadee388e4f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="384" data-size="normal" data-original-token="v2-5ed2e82d0dc61e089dd9c5102a25e5cf" data-default-watermark-src="https://picx.zhimg.com/50/v2-8d22923f054b4d22c450a12f56e53965_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-42a28c78a61cce390fc91aadee388e4f_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-b198cb278178449db3538bfe1aacd1a1_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="562" data-size="normal" data-original-token="v2-fb9d0cfb23cf4449b24a24b7e6819e0f" data-default-watermark-src="https://pic1.zhimg.com/50/v2-bb2085e39d4ca92044e7f57362457148_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-b198cb278178449db3538bfe1aacd1a1_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="G0JnWpEm">　　可以很明显的看出GPU一般重复结构较多，都是SIMD阵列加上少数dispatch和其他shading pipeline结构，所以如果在minecraft中简化到极致，比如每一个模块只造一个单元确实可以造出一个具有完整结构的显卡，但是想要做一个可以持续输出流畅画面的GPU对于minecraft来说基本是不可能，光是造一个浮点ALU就要占据几百乘以几百乘以几十的体积。假若一个屏幕按照30x30的像素来计算，并且是bitmap，只有亮暗两种色彩。就算是2D的图像程序，一共900个像素，再放宽条件要求每3秒才出一帧，那么每一秒钟也要处理300个像素，按照最简单的2D指令，假若平均一个像素只需要3条指令就能得出其是亮还是暗，那么就需要300个ALU每秒运算3次。到这里也不需要考虑其他什么图形流水线了，光是ALU团簇已经这么多，造出标准意义的显卡基本不可能。很多玩家认为在minecraft里面可以造出运行minecraft的计算机，这种宏图大业是不可能完成了。就算是常用的显示程序比如操作系统界面，也没不可能造出鼠标这种东西了，因为不可能做出点控的设备。</p>
 <p data-pid="hm7ee6hC">　　然后回归正题，既然造标准意义的显卡不可能，那么就退而求其次，做一些功能弱一些的显示设备，比如说只要求显示器输出部分字符，并不要求其控制每一个像素。这样可行度会大大提高。</p>
 <p data-pid="d-AFuPyg">　　演示视频中的计算器和字符显示器都是可以控制输出字符的显示设备。那么该如何用尽量少的电路来实现这些结构并且能够让其反应迅速呢？又如何增加显示设备与玩家的交互性呢？</p>
 <p data-pid="7GQFxymR">　　前面已经介绍过minecraft中常见的图像信号组成方式：红石灯和阴影。视频里正好展示了这两种，计算器和电子表部分用的是阴影，字符显示器用的是红石灯。为什么这样选择呢，这和方块的特性也有一定关系不过这个无关紧要。先来介绍计算器的数字显示。</p>
 <p data-pid="wK1cNK1g">　　常接触单片机的人很容易看出我用的是七段数码显示器。七段显示器顾名思义，所有十进制数字信息都可以由七个部分组成的，3横4竖。电话机，老式收银机上的数字都是用这种方式显示的。“8”这个数字是最复杂的，它把7个段都用到了。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-8d23b55e2691a8fc349281e3225f85e8_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="284" data-size="normal" data-original-token="v2-5247f8f81befaf76a41b6331823ac596" data-default-watermark-src="https://pica.zhimg.com/50/v2-97b0a0790072b667f9e318ed03e79b18_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-8d23b55e2691a8fc349281e3225f85e8_r.jpg?source=1940ef5c">
  <figcaption>
   右边的“2”显然是“8”去掉左上和右下两个段，其他所有数字都可以用少于7个段表示
  </figcaption>
 </figure>
 <p data-pid="xi5yAO7c">　　那么如何用二进制电路表示十进制数呢？编码的原则是越简单越好，显然10个十进制数字可以用10个4位二进制数表示，比如3是0011, 9是1001，这就是BCD码。计算机说到底就是一堆不同种类的码来回转换的过程。要达到数字显示到屏幕上的过程，需要如下步骤：二进制码发射到A单元上，A单元将二进制码对应的十进制数连接到各数字对应的七段信息上，比如0100是数字4，而4对应的七段信息如上图是左上，右上，中，右下四个段，最后这四个段每段3个方块的活塞抽回来，则数字4就被显示出来，这整个过程译码了两次，一次是二进制码BIN转十进制码BCD一次，然后十进制码转对应的七段信息是第二次。字符显示也一样是这种原理，具体后面具体再说。</p>
 <p data-pid="NTrE6BBw">　　上面所提的A单元就是译码器。计算机里充斥了各种译码器。下图为BIN转BCD再转七段信息的译码器（橙色条形方块下面的部分）。这个译码器经过极度的体积压缩保证它占据的体积是所能实现的最小的。因为一连串字符排在一起，如果译码器较宽，一个一个排在一起会占据较大空间使数字看起来松散。实际上整个工程每一个单元的体积我都尽了最大努力将其压缩，这耗费非常大的脑力和精力。关于如何在三维结构上压缩电路也可以单拉出来写几千字。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-4c327169e71fc410612fe86c628a3f1e_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="261" data-size="normal" data-original-token="v2-cc4dc828a8f51903d46429b16b7ca121" data-default-watermark-src="https://picx.zhimg.com/50/v2-39a312af00345e5fcdbb007de05dba44_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-4c327169e71fc410612fe86c628a3f1e_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="RAagt1oL">　　计算器还需要控制端按钮转BIN译码器，多位BIN转BCD译码器和多位BCD译码器转BIN用于和CPU沟通，这些比较复杂就不多说了和显示设备无关，上面部分已经介绍过算法。</p>
 <p data-pid="zFmSwe-t">字符显示器是点阵式的，即在一个5x5像素的点阵上显示一个字符，如下图5x5显示屏单元上的字母N，和七段显示器一样，后面一长串就是BIN转字符转5x5像素译码器。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-aaad24252422f7a4cec5a8d34bb88a92_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="411" data-size="normal" data-original-token="v2-32ec2acb3a381c3fc999d5a32427d753" data-default-watermark-src="https://pica.zhimg.com/50/v2-5dfa2b8fe64b449fe58aac1eefc2c710_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-aaad24252422f7a4cec5a8d34bb88a92_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="R4lfrKrI">　　我使用的是自己设计的缩减版的ASCII码，只有不到64个字符，如下表，我暂时称之为ASCII X码。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-a7f7147f0b14e5a22878da74b673b5ab_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="201" data-size="normal" data-original-token="v2-cace65a6f65b3e0e47e7f5e68fcd8bc4" data-default-watermark-src="https://pica.zhimg.com/50/v2-335c7765703520f64ffe412824699b31_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-a7f7147f0b14e5a22878da74b673b5ab_r.jpg?source=1940ef5c">
  <figcaption>
   表中字符的BIN码都是一个字节的低6位，另外还有一个字符Enter表示换行，使用01000000表示的
  </figcaption>
 </figure>
 <p data-pid="dkqnUrkf">　　游戏中能做到的最小像素是2x2个红石灯，之所以不能做到1个红石灯为一个像素，是因为体积上不可能做到在那么小的空间里控制每一个红石灯的亮灭。而就算2x2的红石灯为一个像素，也很难做到点控。关于这些字符译码的具体电路结构不作详述，下面贴几张字符显示器的流水线结构，视频里也有介绍：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-0633e437dd5b85fd464d6bbb6dfe5f3f_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="277" data-size="normal" data-original-token="v2-c0e44f91a2e87be0c4b89a380c859042" data-default-watermark-src="https://picx.zhimg.com/50/v2-509a9745cfdfa9781830ded4d35978ac_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-0633e437dd5b85fd464d6bbb6dfe5f3f_r.jpg?source=1940ef5c">
  <figcaption>
   字符显示器BIOS部分的输入端，有两个寄存器用轮发射方式发射字符信息，字符信息来自右边的只读储存器
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-b1e0cb2900043ec2dcf891dfc7ebd8d9_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="254" data-size="normal" data-original-token="v2-8c3ef15c682ddb773b898fd8be2fb276" data-default-watermark-src="https://pic1.zhimg.com/50/v2-940e57474c731492aa48983d0f648ae1_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-b1e0cb2900043ec2dcf891dfc7ebd8d9_r.jpg?source=1940ef5c">
  <figcaption>
   双线程字符译码器，整个字符显示器模块都是时序控制的
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-5e879756d70ae5074504a807225ca952_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="313" data-size="normal" data-original-token="v2-2041f9c94e5a7b2305e30af9baf8c546" data-default-watermark-src="https://picx.zhimg.com/50/v2-b6ed9ea2f33d8a7365170eeeca990633_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-5e879756d70ae5074504a807225ca952_r.jpg?source=1940ef5c">
  <figcaption>
   字符显示器的输出部分，用总线连接一共两排24个单元，每个单元分显示器，锁存器和闪屏器。中间的后方是一个总的移位控制单元。全时序控制最快速的每3.4秒输出一个字符，可换行换页
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-48a2c392f340cee3bba82dd68a7840ab_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="305" data-size="normal" data-original-token="v2-59090cd0cbed458a907cc120eb895d78" data-default-watermark-src="https://picx.zhimg.com/50/v2-d4eac53600ca7494e83a0468dd4e5f4a_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-48a2c392f340cee3bba82dd68a7840ab_r.jpg?source=1940ef5c">
  <figcaption>
   双向移位触发器
  </figcaption>
 </figure>
 <p data-pid="VxPbrwNJ">　　做这个显示器耗费了较长的时间，我一开始的设计方案体积大概是这个的三倍，后来突发奇想解决了不少技术问题缩小了体积并改为完全的时序控制。现在还缺计算机键盘的交互式控制和其他几个模块的显示单元。</p>
 <p data-pid="s6tt4m5j">　　现在显示器的键盘也制作完毕了，可以打字，修改，光标前后左右移位等</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-77a12de194d0024bfd37d0de3245f6a8_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-faa659ee7dba14a5c9e6db9c88d43ca9" data-default-watermark-src="https://picx.zhimg.com/50/v2-9838049509c0288eac222c19602be8b3_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-77a12de194d0024bfd37d0de3245f6a8_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-83be75176dd6f87bc114392c072642b0_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-85f559825afbb48133557af0e43e8900" data-default-watermark-src="https://pica.zhimg.com/50/v2-eacab9ea490cee90962d6240ffd77455_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-83be75176dd6f87bc114392c072642b0_r.jpg?source=1940ef5c">
 </figure>
 <h2><b>下面用几段话回顾视频里展示的功能。</b></h2>
 <p data-pid="Jku4ZE82"><b>首先是计算器的功能：</b></p>
 <p data-pid="iPcZgRAO">1.时序控制</p>
 <p data-pid="i95r5Vwi">　　2.bit整数加减乘除，除法输出商和余数</p>
 <p data-pid="I6W1puWp">　　3.溢出判断：输入溢出，输出溢出，除数为0：</p>
 <p data-pid="ZcNGgAHd"><b>然后是电子表功能：</b></p>
 <p data-pid="MuL7wAXi">　　1.关：</p>
 <p data-pid="LuxTTb8Y">　　2.显示0点0分0秒到23点59分59秒</p>
 <p data-pid="YWAVKBdT">　　3.过按钮精确调整时间</p>
 <p data-pid="MXkB1ghh">关于电子表多说几句。电子表对于整个CPU而言只是一个独立的附属物，我把它当做主要的展示品是因为电子表可视化的效果比较好。原本我想再录一些关于总线技术和流水线技术的视频，但是太抽象了看着都困就作罢。电子表电路原理很简单，就是用移位触发器循环一些数字而已。重点不在原理而在电路体积大小。我花了些精力将电子表的体积压缩到如下图这样，应该是非常迷你了。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-02e8713b6afcf926dd7f8ae1a1d455e6_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="165" data-size="normal" data-original-token="v2-8175f074d8d1cb074276b5773a8a9ce9" data-default-watermark-src="https://pica.zhimg.com/50/v2-8edfcc84f0a09cf82e0341f73b89304b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pic1.zhimg.com/v2-02e8713b6afcf926dd7f8ae1a1d455e6_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="FkReiJDU"><b>最后是字符显示器功能：</b></p>
 <p data-pid="_wQ0-u-6">　　1.何标准储存器并输出储存器中的字符信息。</p>
 <p data-pid="vQSF5bqg">　　2.字符可换行换页。</p>
 <p data-pid="9qHyTz5N">　　3.交互式操作，单字符控制（这个还没做完所以视频里没有）。</p>
 <p data-pid="AhbshVUU">　　视频里有个字幕写错了，有一句话里welcome没有加最后那个e，不过已经费劲千辛万苦把超清视频传到优酷里，就懒得重新压视频再传上去了。</p>
 <p data-pid="6Mycp5hw"><b>关于工程的架构名称：Alpha21016。之所以取这个名字，是为了纪念十几年前DEC(Digital Equipment Corporation)的Alpha架构，那是一个处理器时代的传奇，可惜商业上并不成功。Alpha组的人很多后来都去了Intel和AMD，并立下了汗马功劳。</b></p>
 <p data-pid="nADAk6jX">　　综合视频和日志粗略的介绍了一下工程，题目说是“技术细节”实际上还有好多没介绍的，就先不说了，真要写完估计要写一本200多页的书。具体的规划细节比如各种重要功能结构的设计，指令集的设计，硬件单元接口排布，储存器空间位置，流水线级数，动态分支预测，乱序执行，显示器控制原理等等实在写不动，这篇已经写了2万多字了（被我删的删，改的改，减的差不多了）。</p>
 <p data-pid="780pbStP"><b>最后再次感谢大家的支持！！！（这句是原文）</b></p>
 <p data-pid="Btm6dwbF"><b>最新进展图（2014年8月25日）</b></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-0f8163612d0f3f7f78a8e02da73ededc_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-21c1b493a31388e81b2fa19648fd98fb" data-default-watermark-src="https://picx.zhimg.com/50/v2-2afbca760df3c716418043f01af663ac_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-0f8163612d0f3f7f78a8e02da73ededc_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-f8bca938a74cfe851642d5e290114887_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-30dd3536f740c1847090990587c22693" data-default-watermark-src="https://picx.zhimg.com/50/v2-d415d1e35556cfcbc4579d1a0fc78469_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://pica.zhimg.com/v2-f8bca938a74cfe851642d5e290114887_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-0a0e0219c14acfac4f6d42b316f2e885_720w.jpg?source=1940ef5c" data-rawwidth="500" data-rawheight="281" data-size="normal" data-original-token="v2-cd5ca197732f0db585bda524f98ee8f8" data-default-watermark-src="https://picx.zhimg.com/50/v2-49cfdcae5ed7f0c453a85a5f29e9e9e0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="500" data-original="https://picx.zhimg.com/v2-0a0e0219c14acfac4f6d42b316f2e885_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="uwiKU9XI">　　目前CPU已经可以执行若干种机器指令（以MOV为主）：通用寄存器赋值，按字/字节+立即数/间接/直接寻址。</p>
 <p data-pid="9y-4EBh5">详细设置如下：</p>
 <p data-pid="__D_bJE1">　　指令名称：数据储存器取数据至X寄存器</p>
 <p data-pid="-YDZzXN0">　　指令目标：将数据储存器中的某一字/字节数据传输至X寄存器中</p>
 <p data-pid="snh27cPU">　　指令格式：00001　　0/1　　0/1　　addr(9)</p>
 <p data-pid="7dloSYhO">　　对应含义：指令码　　直接寻址/立即数寻址　　按字/按字节　　数据地址</p>
 <p data-pid="yBp51Sar">　　备注：如果地址为奇数且为按字寻址，则改地址数据赋值到目的寄存器高8位</p>
 <p data-pid="gvfjgXO2">　　指令名称：传输MOV</p>
 <p data-pid="lkSmzHze">　　指令目标：通用寄存器之间的数据传输</p>
 <p data-pid="mZd4inDA">　　指令格式：1000000　　x　　reg(4)　　reg(4)</p>
 <p data-pid="BULlNS0a">　　对应含义：指令码　　无效　　源寄存器地址　　目的寄存器地址</p>
 <p data-pid="8mZDVA0j">　　指令名称：加减乘除</p>
 <p data-pid="8JYSO6W2">　　指令目标：将被操作数取出传输至Y寄存器四则运算后储存至X寄存器</p>
 <p data-pid="IuubTz31">　　指令格式：00100/00101/00110/00111　　0/1 　　0/１　　addr(9)</p>
 <p data-pid="xBdZf-Bo">　　对应含义：加/减/乘/除　　直接寻址/立即数寻址　　取数计算/直接计算　　数据地址</p>
 <p data-pid="z6q3xIXx">　　备注：只支持按字读取数据储存器</p>
 <p data-pid="axrQX5Pv">　　指令名称：寄存器间接寻址</p>
 <p data-pid="mQQQ_d8j">　　指令目标：将某寄存器中数据作为地址传输至MAR，取数后传输到任意寄存器</p>
 <p data-pid="s_phVOq6">　　指令格式：1000001　　0/1　　reg(4）　　reg(4)</p>
 <p data-pid="25IgVfQ1">　　对应含义： 指令码　　按字/按字节　地址寄存器地址　　目的寄存器地址</p>
 <p data-pid="a0EeG7xI">　　备注：Y寄存器不支持作为地址寄存器，其他寄存器都可以</p>
 <p data-pid="CTWrHtok"><b>————文末割一下，割割割割割————</b></p>
 <p data-pid="Vew1fE-n">2019年5月23日更新：</p>
 <p data-pid="9olp9cfa"><b>作者的话：</b></p>
 <p data-pid="Q750Bzs3">本文完成于2014年，时隔五年在知乎上因为被转载而突然火起来，并受到很多褒奖和赞美，作为作者我感到很荣幸也感到很惶恐。有一些媒体朋友联系我希望能够继续扩大传播，我在此表示，本作品因为时间和精力有限最终没有完全实现预先规划的内容，并且现在已经有很多玩家可以做出类似的作品，我觉得本作品并没有足够的分量继续在中文互联网里刷流量。实际上，一个计算机或微电子专业的本科生或研究生只要肯花时间，完全有能力做出类似的作品，只不过因为我在游戏里去实现它，在呈现方式上比较吸引人而已。我本身并不是计算机专业出身，出于对硬件的兴趣爱好做了这样一个作品。由于我本身专业基础薄弱，写的文章里难免也会有错误和疏漏，希望大家的包涵和指正。</p>
 <p data-pid="MplvAkPu">如果我的作品可以激起更多人探索计算机科学或者其他工程科学的热情的话，就已经达到我想要的最好的目的。<b>希望年轻一代，尤其是中国的年轻一代，以后可以涌现出更多不拘一格的技术人才，在各自的领域创造出充满想象力和创造力的作品。再次谢谢大家！</b></p>
 <p data-pid="XxWIgG8M"><b>————我割，我割割割割割割————</b></p>
 <p data-pid="qXPC4-hQ"><b>我也想说两句：</b></p>
 <p data-pid="gBupZnCA">为什么大家都要揪着延迟不放呢？只是快慢的问题而已，这不影响计算机的制造。</p>
</body>