# Mathematica 到底有多厉害？
- 点赞数：6127
- 更新时间：2018年04月17日21时03分21秒
- 回答url：https://www.zhihu.com/question/27834147/answer/38337425
<body>
 <p data-pid="N7e0OGkW">在<a href="https://link.zhihu.com/?target=http%3A//codegolf.stackexchange.com/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Programming Puzzles &amp; Code Golf Stack Exchange</a>上，有人发起了这么一个游戏（<a href="https://link.zhihu.com/?target=http%3A//codegolf.stackexchange.com/questions/44680/showcase-your-language-one-vote-at-a-time-experimental-challenge" class=" wrap external" target="_blank" rel="nofollow noreferrer">popularity contest - Showcase your language one vote at a time</a> ）：每个回答者选一种编程语言，先说一点关于这门语言的有趣事实；然后，如果获得N个赞，就可以添上长度从1到N不等的至多N条代码片段（中间可以跳过一些数字）来展示这门语言的各种特性。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="OoUn5ldK">目前（北京时间2015年1月28日21时）排在第一位的语言是Mathematica，获得了144个赞，恰好是第二名的两倍，比起Python、MATLAB之类的更是不知高到哪里去了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Q5ij_bri">这个回答的作者是<a href="https://link.zhihu.com/?target=http%3A//codegolf.stackexchange.com/users/8478/martin-b%25c3%25bcttner" class=" wrap external" target="_blank" rel="nofollow noreferrer">Martin Büttner</a>。我就搬运一下，顺便翻译一下。原回答是按从长到短排列的，我把它倒了过来，还补上了若干作者已经删掉的代码片段。翻译得不好。<b>欢迎去看<a href="https://link.zhihu.com/?target=http%3A//codegolf.stackexchange.com/a/44683/9288" class=" wrap external" target="_blank" rel="nofollow noreferrer">原回答</a></b>，有stackexchange帐号的话可以顺便点个赞。这个问题里其它语言的回答同样精彩。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UCnxzt2F">另外，这里的很多代码片段仅适用于Mathematica 10。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="cwVor3bK">-----</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="zjdGkka5"><b>事实</b></p>
 <p data-pid="Vy2LyWWB">Mathematica可以执行符号操作，所以在处理变量的时候变量不需要有值。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="CBoCfws5"><b>长度为1的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">π
</code></pre>
 </div>
 <p data-pid="X5ByCWPX">猜猜看？这就是π。它不是用浮点数表示的近似值，它就是π的精确值，因此涉及到π的复变函数和三角函数的运算可以得到精确的结果。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="yo5PdbE0"><b>长度为2的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">3x
</code></pre>
 </div>
 <p data-pid="-pjGHusT">把两个东西放在一起，就可以做乘法，不需要添加*或者空格，只要能明确识别出一个标识符的结束和另一个标识符的开始。乘法的因数还可以是字符串或者未赋值的变量。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="B-o7d_6C"><b>长度为3的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">x-x
</code></pre>
 </div>
 <p data-pid="ta1UofP0">只是展示一下“事实”里说的：不需要知道x的值，也能算出结果是0。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="S8LgJq0W"><b>长度为4的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Here
</code></pre>
 </div>
 <p data-pid="ZCuZhMF_">该展示一下Mathematica中各种疯狂的内建函数了。这段代码可以给出你所在的地理位置；比如说，作者的运行结果是GeoPosition[{51.51, -0.09}]。（看来作者在伦敦……）</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="gj2hI5ti"><b>长度为5的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Green</code></pre>
 </div>
 <p data-pid="PiQaiUAq">Mathematica把颜色作为一种内建类型，还包含了一批预定义的颜色。更好的是，Mathematica会把它显示成一个这种颜色的小方块：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/73d4d50e59ab01438c0a338a7ab65f56_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="110" data-rawheight="57" data-original-token="73d4d50e59ab01438c0a338a7ab65f56" class="content_image" width="110">
 </figure>
 <p data-pid="A3Tes_su">你可以复制这个小方块，把它用在你的代码当中，就像使用别的符号一样。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="VFmGjADV"><b>长度为6的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">23^^H5</code></pre>
 </div>
 <p data-pid="CSGSS6pQ">让我们回到数学。在Mathematica中，你可以用从2到36的各种不同的进制来输入数字，可以用大写或小写字母，也可以混用。还可以用这种方法来输入浮点数。这里输入是23进制的H5，结果是396。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="xhufT8rR"><b>长度为7的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">9!/43!!</code></pre>
 </div>
 <p data-pid="Xqk7WCno">Mathematica中不仅有表示阶乘的运算符（!），还有表示双阶乘的运算符（!!）（n的双阶乘是n*(n-2)*(n-4)*…）。而且，它还支持任意精度的整数，因此43!!可以算出精确值。此外，有理数也会被精确地计算。因此，这里Mathematica不会给出一个浮点数的结果，而是把它约分，最终给出：</p>
 <div class="highlight">
  <pre><code class="language-text">128/198893132162463319205625
</code></pre>
 </div>
 <p data-pid="X-2PxU0w">当然，只要你需要，也可以随时进行浮点数的运算。一般地，如果你的输入不含浮点数，就会得到精确的结果。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eCXbp4w0"><b>长度为8的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Sunset[]</code></pre>
 </div>
 <p data-pid="_KzSPoWX">又一个疯狂的内建函数。不给任何参数的话，这个函数会返回你所在的地方的下一次日落的时间。也可以输入日期和地点作为参数。这是作者当时运行的结果：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/1d141f026b210055ac6052b393e482db_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="256" data-rawheight="64" data-original-token="1d141f026b210055ac6052b393e482db" class="content_image" width="256">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="T06MQoGh"><b>长度为9的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Exp[I*Pi]</code></pre>
 </div>
 <p data-pid="qMo5XrNo">到这里还没有做过复数运算。你可以看到，π只是Pi的一个别名。这段代码会返回精确的答案：整数-1。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="lsvX4QTJ"><b>长度为10的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">f=Exp@*Cos</code></pre>
 </div>
 <p data-pid="zaK4Ii8t">Mathematica 10中新增了@*这个运算符来表示一个原有的函数：Composition。上面的代码把f定义为Exp和Cos的复合：先将Cos作用于参数，然后将Exp作用于其结果。因此f[Pi]会返回1/E。Mathematica 10中还有/*这个运算符，表示的是RightComposition，它先应用的是左边的函数，比如说Cos/*Exp就相当于Exp@*Cos。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="NRGJixK7"><b>长度为11的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Tuples[l,n]</code></pre>
 </div>
 <p data-pid="5wTFzqYd">来点组合数学。这段代码会给出以列表l中的元素为元素的所有n元组。比如说，如果l是{1, 2, 3}，n是2，你就会得到：</p>
 <div class="highlight">
  <pre><code class="language-text">{{1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 2}, {2, 3}, {3, 1}, {3, 2}, {3, 3}}
</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="FE3ChZ2H"><b>长度为12的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">D[x^y^x,x,y]</code></pre>
 </div>
 <p data-pid="2OI8NpUk">偏微分。D会给出第一个参数（某个表达式）对于后面的参数的偏导数，结果以符号表达式的形式给出。所以上面的代码的意思是∂²(x^y^x)/∂x∂y，Mathematica算出来是：</p>
 <div class="highlight">
  <pre><code class="language-text">x^y^x (y^(-1 + x) + y^(-1 + x) Log[x] + x y^(-1 + x) Log[x] Log[y]) + 
  x^(1 + y^x) y^(-1 + x) Log[x] (y^x/x + y^x Log[x] Log[y])
</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="cj74hkog"><b>长度为13的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">l~Riffle~" "</code></pre>
 </div>
 <p data-pid="HrEmtnKP">首先，这里展示了另一种调用双参数的函数的方式：x~f~y是f[x, y]的中缀表达式。其次，Riffle是一个相当使用的函数，它以一个列表和一个值作为参数，然后在那个列表每相邻两个元素间插入那个值。比如说，上面的例子会在l的每相邻两个元素间插入一个" "。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="GcEEv4MN"><b>长度为14的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Prime~Array~9</code></pre>
 </div>
 <p data-pid="s7608OsG">这是构造列表的一种方式。Array会对从1到它的第二个参数的每一个整数调用它的第一个参数（本身也是个函数）。上面的例子会给出前9个素数的列表：</p>
 <div class="highlight">
  <pre><code class="language-text">{2, 3, 5, 7, 11, 13, 17, 19, 23}
</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="L2n3Or_t"><b>长度为15的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">{##4,#,#2,#3}&amp;</code></pre>
 </div>
 <p data-pid="HzfXC7AI">这里展示了两个更强大的特性。这整个东西是一个未命名的纯函数。类似于Python中的lambda和Ruby中的Procs。纯函数以&amp;结尾。&amp;这个运算符的优先级非常低，因此往往会把左边的一切东西包含进去。纯函数的参数用#来表示，有时候会在#后面添上别的东西。第一个参数是#或者#1，第二个参数是#2，以此类推。</p>
 <p data-pid="My8jJEAv">另一个特性是Sequence（序列）。它类似于某些语言中的*。你可以把它理解为两边的括弧的列表——它只是一序列的值，可以用在列表或函数的参数中。##表示纯函数的全部参数的序列，##2则表示纯函数的从第二个开始的参数的序列。所以，如果我们把上面的例子中的纯函数命名为f，那么，</p>
 <div class="highlight">
  <pre><code class="language-text">f[1,2,3,4,5]</code></pre>
 </div>
 <p data-pid="62Z7tRgS">的结果会是</p>
 <div class="highlight">
  <pre><code class="language-text">{4,5,1,2,3}</code></pre>
 </div>
 <p data-pid="U4CNZgbn">所以这个函数只是把左边的三个参数挪到右边。注意这里##4表示的是序列4, 5，并且被压平到列表当中。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="iH2U_4AG"><b>长度为16的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Partition[l,2,1]</code></pre>
 </div>
 <p data-pid="rJvtJWmn">Partition是一个非常实用的处理列表的函数，它有一大堆的重载。上面是作者最常用的一种形式。它会给出列表l的所以长度为2的子列表（这里的1使得子列表互相交叠）。如果l是{1, 2, 3}，你会得到</p>
 <div class="highlight">
  <pre><code class="language-text">{{1, 2}, {2, 3}, {3, 4}}</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="biUO48KT"><b>长度为17的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Plot[x^x,{x,0,2}]</code></pre>
 </div>
 <p data-pid="H4Z0AzfQ">终于有足够的字符数可以画图了。这只是绘制一维图表的一个最简单的例子。后面还会展示一些更加酷炫的图表。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/eeefd264ae34e1d612377af1c201c540_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="227" data-original-token="eeefd264ae34e1d612377af1c201c540" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="4a1JSNlx"><b>长度为18的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">PetersenGraph[7,2]</code></pre>
 </div>
 <p data-pid="_iHmOGLr">Mathematica 8引进了图这个内建类型，随之而来的是一大批图论方面的函数。如果它没有这么多内建函数，它就不是Mathematica了。上面的代码生成了一个广义的<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/%25E4%25BD%25A9%25E7%2589%25B9%25E6%25A3%25AE%25E5%259C%2596" class=" wrap external" target="_blank" rel="nofollow noreferrer">佩特森图</a>。Mathematica生成的事实上是一个可以进行各种操作的数据结构，但显示出来的就是一幅……图：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/70822b76cd819493992f1253fe611b52_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="351" data-original-token="70822b76cd819493992f1253fe611b52" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="zA9eyzRr"><b>长度为19的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">MandelbrotSetPlot[]</code></pre>
 </div>
 <p data-pid="pUcy_K7y">嗯……非常“有用”的函数……有时，他们支持各种可能的计算的意愿走得有点太远了……</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/98cc5f4533bcc8dfdbbde2e9b523e3b0_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="350" data-original-token="98cc5f4533bcc8dfdbbde2e9b523e3b0" class="content_image" width="360">
 </figure>
 <p data-pid="ikqGQMhS">其实这函数比这个要更有用一些：可以指定作图的区域。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="HLJlAnDT"><b>长度为20的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">"Sun"~StarData~"Age"</code></pre>
 </div>
 <p data-pid="gc80Zjy8">回到内建的数据。Mathematica中有一大批以Data结尾的函数，包含了任何你可能想到的数据。使用这些函数的时候，你只需要输入你想要查找数据的东西，和你想要检索的属性。上面只是一个最短的例子，Sun、Star和Age都很短，因为作者等不及要展示这一特性。</p>
 <p data-pid="zoOIXP5U">从第9版开始，Mathematica支持带单位的量。上面的例子算出来是：</p>
 <div class="highlight">
  <pre><code class="language-text">Quantity[4.57*10^9, "Years"]</code></pre>
 </div>
 <p data-pid="P1tFA8w-">在Mathematica中显示成：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/05265b363af83c21aed810c8fff0ff2f_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="240" data-rawheight="57" data-original-token="05265b363af83c21aed810c8fff0ff2f" class="content_image" width="240">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="I5Qh76f_"><b>长度为21的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Integrate[E^(-x^2),x]</code></pre>
 </div>
 <p data-pid="GlaVZnuL">前面展示过了微分。现在该展示积分了。Mathematica能计算定积分和不定积分。Integrate会给你一个精确的解，它能处理很多种不同的积分；NIntegrate则会给出数值解。如果你学过微积分，你会记得上面的高斯积分并没有解析解，除非把<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/%25E8%25AF%25AF%25E5%25B7%25AE%25E5%2587%25BD%25E6%2595%25B0" class=" wrap external" target="_blank" rel="nofollow noreferrer">误差函数</a>也当作是解析解。Mathematica返回的是：</p>
 <div class="highlight">
  <pre><code class="language-text">1/2 Sqrt[π] Erf[x]</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="YXHRVjFO"><b>长度为22的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">30~ElementData~"Color"</code></pre>
 </div>
 <p data-pid="vEikeysU">又一个内建的以Data结尾的函数。对于化学元素，你不仅可以得到原子序数、熔点、名字之类的东西，还可以得到它在室温下的颜色。上面的代码给出了锌的颜色：</p>
 <div class="highlight">
  <pre><code class="language-text">SlateGray</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eTXOoLGD"><b>长度为23的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Rotate[Rectangle, Pi/2]</code></pre>
 </div>
 <p data-pid="t_r8SFNQ">嘿嘿。你以为你知道这段代码干的是什么，其实你不知道。Rectangle本身只是一个函数的名字。要真正地得到一个长方形，你必须调用这个函数，给它一些参数。所以这段代码是在干什么呢？其实：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/7537fb51414981e63af2b51df2cd9505_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="264" data-rawheight="116" data-original-token="7537fb51414981e63af2b51df2cd9505" class="content_image" width="264">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="0-1cQSGu"><b>长度为24的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Series[ArcSin@x,{x,0,9}]</code></pre>
 </div>
 <p data-pid="pHBAXk6q">又一个有趣的功能。Mathematica能够求出一个函数在任意点处的泰勒展开。上面的例子给出的是反正弦函数在0处的直到9次的泰勒展开：</p>
 <div class="highlight">
  <pre><code class="language-text">SeriesData[x, 0, {1, 0, 
 Rational[1, 6], 0, 
 Rational[3, 40], 0, 
 Rational[5, 112], 0, 
 Rational[35, 1152]}, 1, 10, 1]</code></pre>
 </div>
 <p data-pid="Jb7X8XQ6">显示为：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/87c31b116c27be45b205664051ea76a1_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="270" data-rawheight="76" data-original-token="87c31b116c27be45b205664051ea76a1" class="content_image" width="270">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="pDOTKEJm"><b>长度为25的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">{{1,5},{2,3},{7,4}}.{8,9}</code></pre>
 </div>
 <p data-pid="peg-0K1R">终于有足够的字数可以展示向量的运算了。上面的代码展示了一个2x3的矩阵乘以一个2维的列向量：</p>
 <div class="highlight">
  <pre><code class="language-text">{53, 43, 92}</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="Lg5O6JPU"><b>长度为26的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">PolarPlot[Sin[5θ],{θ,0,π}]</code></pre>
 </div>
 <p data-pid="vtA_WH4z">又一个有趣的绘图功能。PolarPlot绘制的是极坐标下的图像。你需要的是对每个θ给出一个r，而不是对每个x给出一个y。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/1f80663cfea97b74b2ed7e3ac12a6ab4_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="343" data-original-token="1f80663cfea97b74b2ed7e3ac12a6ab4" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="4S5gio8-"><b>长度为27的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">CountryData["ITA", "Shape"]</code></pre>
 </div>
 <p data-pid="fFqudOko">又一个Data。CountryData是一个相当强大的函数。获取国家的形状仅仅是其功能的冰山一角。关于国家的数据太多了，你可以为这个函数写一本书。比如说，有一个数据叫FemaleLiteracyFraction。你甚至可以查询不同时间的数据。<a href="https://link.zhihu.com/?target=http%3A//reference.wolfram.com/language/ref/CountryData.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">完整的列表见Mathematica参考资料中心</a>。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/e4e58ca08147ce7e5d7acc17fa1e70f6_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="131" data-rawheight="155" data-original-token="e4e58ca08147ce7e5d7acc17fa1e70f6" class="content_image" width="131">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="z_PbQgcT"><b>长度为28的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Graphics3D@{Sphere[],Cone[]}</code></pre>
 </div>
 <p data-pid="V90L6iWm">该是三维的图像了。这是绘制的是重叠起来的默认参数下的一个球面和一个圆锥，看起来像一个水晶球：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/91b5c82e9038c2c1e7507f63e6cc1367_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="391" data-original-token="91b5c82e9038c2c1e7507f63e6cc1367" class="content_image" width="360">
 </figure>
 <p data-pid="UMw-S3XR">在Mathematica中，你可以点击并拖动来旋转这个图形。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="wUhOz0Wr"><b>长度为29的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Piecewise[{{13+2x^2,x&gt;0}},13]</code></pre>
 </div>
 <p data-pid="YZgID2l-">Piecewice让你可以定义在不同区域有不同定义的函数。它显示出来就跟标准的数学表达式一样：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/aa1cc20b4bb79580e684d5bb71b020ea_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="272" data-rawheight="63" data-original-token="aa1cc20b4bb79580e684d5bb71b020ea" class="content_image" width="272">
 </figure>
 <p data-pid="jDUVX9fG">作为展示，如果绘制它从-5到5的图像，你会得到：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/77715c6be5e9118be9255bc8f990ba71_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="232" data-original-token="77715c6be5e9118be9255bc8f990ba71" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="URi6FH79"><b>长度为30的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">FourierTransform[E^(-x^2),x,k]</code></pre>
 </div>
 <p data-pid="GGZSoz9n">跟别的东西一样，只要可能的话，傅立叶变换算出来也是精确解：</p>
 <div class="highlight">
  <pre><code class="language-text">E^(-(k^2/4))/Sqrt[2]</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="SbGVxUtr"><b>长度为31的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Permutations[{1,1,2,3,3,4},{3}]</code></pre>
 </div>
 <p data-pid="YcCjxbct">再来一点组合数学。这段代码给出了由这个列表的元素组成的所有3个元素的组合。即使列表中的元素有重复，给出的组合也不会重复：</p>
 <div class="highlight">
  <pre><code class="language-text">{{1, 1, 1}, {1, 1, 3}, {1, 1, 4}, {1, 3, 1}, {1, 3, 3}, {1, 3, 4}, {1, 4, 1}, {1, 4, 3}, {3, 1, 1}, {3, 1, 3}, {3, 1, 4}, {3, 3, 1}, {3, 3, 4}, {3, 4, 1}, {3, 4, 3}, {4, 1, 1}, {4, 1, 3}, {4, 3, 1}, {4, 3, 3}}</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="qH01AYuW"><b>长度为32的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">NumberLinePlot[x^2&lt;2^x,{x,-2,5}]</code></pre>
 </div>
 <p data-pid="QwQ63XV9">一个不太寻常的绘图。它可以在数轴上绘制一系列不同的东西，比如说点和区间。你还可以给出一个条件，它会绘制出使条件成立的区域：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/949d22dd3046c36676c9ea5bfd31d1df_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="39" data-original-token="949d22dd3046c36676c9ea5bfd31d1df" class="content_image" width="360">
 </figure>
 <p data-pid="dNgrRB2a">这里的箭头表示这个区域会延伸到无穷大，空心的圈圈则表示这是开区间。如果是闭区间，圈圈会变成实心。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="VvRd0eoR"><b>长度为33的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">ExampleData[{"TestImage","Lena"}]</code></pre>
 </div>
 <p data-pid="W7qqjrR_">Mathematica包含了一系列的范例数据，从图片、纹理、声音片段到3D模型（比如说犹他茶壶）。Lena的名字相当短，也还算出名，所以作者选择了她：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/38e29ca787b2f35bc810fc13f7cf744c_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="336" data-rawheight="241" data-original-token="38e29ca787b2f35bc810fc13f7cf744c" class="content_image" width="336">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PJajb6iy"><b>长度为34的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Solve[a*x^4+b*x^3+c*x^2+d*x==0, x]</code></pre>
 </div>
 <p data-pid="vRFWX5hK">Mathematica可以用来解方程，或者方程组。和往常一样，给出的也是符号解：</p>
 <div class="highlight">
  <pre><code class="language-text">{
  {x -&gt; 0}, 
  {x -&gt; -(b/(3 a)) - (2^(1/3) (-b^2 + 3 a c))/(3 a (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3)) + (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3)/(3 2^(1/3) a)}, 
  {x -&gt; -(b/(3 a)) + ((1 + I Sqrt[3]) (-b^2 + 3 a c))/(3 2^(2/3) a (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3)) - ((1 - I Sqrt[3]) (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3))/(6 2^(1/3) a)}, 
  {x -&gt; -(b/(3 a)) + ((1 - I Sqrt[3]) (-b^2 + 3 a c))/(3 2^(2/3) a (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3)) - ((1 + I Sqrt[3]) (-2 b^3 + 9 a b c - 27 a^2 d + Sqrt[4 (-b^2 + 3 a c)^3 + (-2 b^3 + 9 a b c - 27 a^2 d)^2])^(1/3))/( 6 2^(1/3) a)}
}</code></pre>
 </div>
 <p data-pid="QMJBhpu2">注意解是以规则的形式给出。后面可能会有关于规则的更具体的例子。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UyhWl7Bn"><b>长度为35的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">StreamPlot[{x^2,y},{x,0,3},{y,0,3}]</code></pre>
 </div>
 <p data-pid="v_r_RfNv">一个非常漂亮的绘图，绘制的是一个二维向量场的流线。类似于常规的向量图，它的每一个箭头都相切于向量场；不过，箭头不是按固定的点阵来排列，而是首尾相接连成流线。如果这个向量场是流体的速度场，这些线就是流体中粒子的轨迹（我觉得作者这里说得并不准确……）。上面的例子的输出为：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/51c619093a1875eac7a58ab135219f85_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="358" data-original-token="51c619093a1875eac7a58ab135219f85" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="uC-7aID0"><b>长度为36的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">f[1]=1
f[2]=1
f[n_]:=f[n-1] + f[n-2]</code></pre>
 </div>
 <p data-pid="HPuRTV-8">又该展示新的语言特性了。Mathematica中有几个定义函数方面的好处。首先，你可以给一个函数名提供不同的定义，只要参数的数量或类型不同。你可以用模式来描述参数的类别。而且，你还可为给单独的值添加定义。调用函数的时候，Mathematica会自动选取最特殊的定义；如果没有符合的定义，则会不进行任何计算。这使得可以以更自然的方式来定义递归函数，而不必用If来在不同情况间切换。</p>
 <p data-pid="3B85YNkm">另一点要注意的是这里同时用到了=和:=。不同之处在于=的右边只是在定义的时候计算一次，而:=的右边则是在每次调用的时候计算。其实在定义变量的时候也可以用:=，这时变量就会有动态的值。</p>
 <p data-pid="trjTwYoY">因此上面定义的就是斐波那契数列。不过这是一个非常低效的定义，在作者的电脑上计算前30个数就画了4秒。在后面我们会看到，只要稍作改进，甚至不用改掉递归，便能大大提高其性能。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="d84EZKI9"><b>长度为37的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">l//.{a___,x_,b___,x_,c___}:&gt;{a,x,b,c}</code></pre>
 </div>
 <p data-pid="BgX13Q4J">上一个代码片段中提到了模式。模式常被用在规则中，规则则常用于修改匹配某一模式的结构。让我们来看看这个代码片段。</p>
 <p data-pid="QKDuovhg">{a___,x_,b___,x_,c___}:&gt;{a,x,b,c}是一个规则。x后面跟着一个下划线（x_）是一个模式，它可以代表任意的值（这个值本身也可以是一个列表或者类似的东西）。a___则是一个序列模式（参见长度为15的代码片段），它可以代表长度为0或者更长的序列。这里x_出现了两次，说明其代表的是相同的值。因此，整个模式{a___,x_,b___,x_,c___}匹配的是一个有重复元素的列表，两个x代表的是重复的元素，a、b和c代表的是围绕这两个元素的序列。根据规则，它被替换为{a,x,b,c}，也就是去掉了第二个x。</p>
 <p data-pid="SDtOKKwC">//.会重复地执行一个规则，直到找不到可以匹配这个模式的结构。因此，上面的代码会去掉列表l中所有重复的元素。不过，它的功能并不仅限于此：//.会在任何层次上运用规则，因此如果l中的某个元素也是列表，这个列表中重复的元素也会被去掉。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="iyY4KZWe"><b>长度为38的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">RegionPlot[x^y&gt;2&amp;&amp;y&lt;x,{x,0,3},{y,0,3}]</code></pre>
 </div>
 <p data-pid="G5RqMvPs">又回到绘图。它绘制的是是条件成立的二维区域。当你想绘制一个不以显式表示区域的话，这个函数非常有用。上面的代码画出来是：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/8d5686d63cf74a93cc4dd4fb64fc9850_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="358" data-original-token="8d5686d63cf74a93cc4dd4fb64fc9850" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="LEIfGiP9"><b>长度为39的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">f[1]=1
f[2]=1
f[n_]:=f[n]=f[n-1]+f[n-2]</code></pre>
 </div>
 <p data-pid="mBYkiCKg">前面说过要把斐波那契数列的定义改得更高效。这段代码展示了menmoization在Mathematica中是多么平凡。这里唯一的改动就是在第三行增加一个f[n]=。这样，每次f计算一个新的值，比如说f[3]的时候，执行了f[3]=f[3-1]+f[3-2]。这计算了f[2]+f[1]，然后把结果赋值给f[3]（注意这里用的是=而非:=）。因此，每次调用f计算一个没计算过的值的时候，它就会为这个值添加一条新的定义；这一定义显然比一般的定义更特殊，因此在再次计算这个值的时候就会直接使用这个定义。</p>
 <p data-pid="OwG4JG_b">在长度为36的代码片段中，计算前30个斐波那契数画了4秒；而这里计算前300000个只需要3秒（请勿在内存太小的计算机上尝试）。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="DBg26CPg"><b>长度为40的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">SortBy[PlanetData[#, "EscapeVelocity"]&amp;]</code></pre>
 </div>
 <p data-pid="g6Xr9fvE">和你预料的一样，SortBy的功能是根据一个列表中每个元素应用某个给定的函数的结果来给列表排序。不过等等，这里调用SortBy的时候并没有给它一个列表！其实，在Mathematica 10中，某些函数开始支持柯里化和部分应用。与某些纯函数式的语言不同，这不是一个语言特性，只是一批特定的函数的功能。上面这段代码返回的是一个新的函数，这个函数仅仅以一个列表为参数，并且根据前面给定的函数来为这个列表排序。当你在代码中要多次用到同一个排序规则的时候，这个用法会非常有用。</p>
 <p data-pid="U1KMzhra">另外，这里又出现了一个Data。这是根据<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/%25E5%25AE%2587%25E5%25AE%2599%25E9%2580%259F%25E5%25BA%25A6" class=" wrap external" target="_blank" rel="nofollow noreferrer">逃逸速度</a>来给行星的名字排序。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="HE7CLun7"><b>长度为41的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Thread[{"foo","bar","hm"}&lt;&gt;{"a","b","c"}]</code></pre>
 </div>
 <p data-pid="KpMCiyNm">差点忘了Thread。如果你有两个长度相同的列表，想对位置相应的每一对元素进行某个操作。当然，你可以对列表长度进行迭代；也可以连接两个列表，转置这个矩阵，然后对每对元素进行操作。不过Thread让这一切变得更加简单。大致上，它就是把最顶层的Head（函数或类型）往下“推”一层。所以上面的代码算出来是：</p>
 <div class="highlight">
  <pre><code class="language-text">{"foo"&lt;&gt;"a","bar"&lt;&gt;"b","hm"&lt;&gt;"c"}</code></pre>
 </div>
 <p data-pid="a1eO7wzI">而&lt;&gt;表示字符串的连接，因此最终的结果是：</p>
 <div class="highlight">
  <pre><code class="language-text">{"fooa","barb","hmc"}</code></pre>
 </div>
 <p data-pid="ThhnL_Ne">Thread这个函数非常实用。比如，如果你有一组“左边”和一组“右边”，可以用它来生成一个方程组。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="1hUt8qIP"><b>长度为42的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Animate[Plot[Sin[t-x],{x,0,10}], {t,0,10}]</code></pre>
 </div>
 <p data-pid="sTQf6F-s">在Mathematica中，让东西动起来很简单，它们甚至不必是图像。你只要给出一个在每帧进行计算的表达式，以及随帧数变化的变量。上面的代码会生成一个正弦波的动画，看起来就像下面这个gif一样（啊，知乎不支持动图？那我贴图片地址好了：<a href="https://link.zhihu.com/?target=http%3A//i.stack.imgur.com/EOPuu.gif" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">i.stack.imgur.com/EOPuu</span><span class="invisible">.gif</span><span class="ellipsis"></span></a>）：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/2fa3d656e10df0dfab798eab901b3d68_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="212" data-original-token="2fa3d656e10df0dfab798eab901b3d68" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="lC7x77b3"><b>长度为43的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">HighlightGraph[graph,FindVertexCover@graph]</code></pre>
 </div>
 <p data-pid="16MJrwV0">前面提到过图。Mathematica中有大量常用的图论方面的功能，除了解决各种图论问题的函数外，还有漂亮的可视化工具。例如上面的代码，对于给定的图graph，找出一个顶点数最小的顶点覆盖，并且将图中的这些顶点突出显示。例如，如果graph是长度为18的代码片段中的PetersenGraph[7,2]的话，会得到：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/75f029a4cba7d7d4181295619563f624_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="351" data-original-token="75f029a4cba7d7d4181295619563f624" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="VU86d6Nj"><b>长度为44的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">ArrayPlot@CellularAutomaton[110,{{1},0},100]</code></pre>
 </div>
 <p data-pid="qBde6Jo5">终于有足够多的字数来用上CellularAutomaton这个函数并画出其结果了。据作者所知，这是Mathematica中唯一一个关于元胞自动机的函数。但Stephen Wolfram似乎认为自己是元胞自动机领域的第一人，因此这个函数尤其强大。这里展示的只是它最简单的用法。它模拟的是一个一维元胞自动机的前100步，事实上它返回的是每一步的状态，因此结果是一个二维的数组。函数的第一个参数是元胞自动机的规则，可以用一个列表来详细地指定，也可以只用一个简单的数字编码。在这个例子中，作者选择了著名的图灵完备元胞自动机，<a href="https://link.zhihu.com/?target=https%3A//en.wikipedia.org/wiki/Rule_110" class=" wrap external" target="_blank" rel="nofollow noreferrer">Rule 110</a>。{{1},0}定义了初始条件：单独的一个1，以及作为背景的0。在后面会展示CellularAutomaton的更多特性：它可以模拟更高维数、更大邻域、更多状态的元胞自动机。</p>
 <p data-pid="Q-GyFyq3">ArrayPlot是又一个绘图的工具，用于绘制二维数组，以不同颜色的方块表示数组中不同的值。在最简单的情形下，0对应于白色，1对应于黑色。这段代码的运行结果是：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/9bb967feaf589ffb12d4e9c19c5b49d6_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="359" data-original-token="9bb967feaf589ffb12d4e9c19c5b49d6" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UCoe5-N_"><b>长度为45的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">EdgeDetect@ExampleData@{"TestImage","Splash"}</code></pre>
 </div>
 <p data-pid="t7ARXLTe">然后是图像处理。Mathematica包含了一系列的范例数据，包括图像（例如Lena）、纹理、3D模型和声音片段。我们首先加载其中一个范例图像：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/2d115355a3b2881d8441846e354ce10a_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="300" data-rawheight="300" data-original-token="2d115355a3b2881d8441846e354ce10a" class="content_image" width="300">
 </figure>
 <p data-pid="fu4wcrRM">想要查找边缘？只要调用一个函数！</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/f36f47e282a0d0dc5f1d326c37111da6_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="300" data-rawheight="300" data-original-token="f36f47e282a0d0dc5f1d326c37111da6" class="content_image" width="300">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="gwh6ZKXs"><b>长度为48的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Import["http://www.google.com/doodles","Images"]</code></pre>
 </div>
 <p data-pid="vtSUcuVZ">Import是一个相当强大的命令。它既可以导入磁盘中的文件，也可以下载网上的文件。它懂得很多种不同的文件格式，还可以从其中的一些（例如HTML）直接提取数据。上面的代码会下载Google Doodle页面的所有图片。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="ILmLvNgU"><b>长度为52的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">Manipulate[Plot[x^2a+x*b,{x,-3,3}],{a,.1,3},{b,0,3}]</code></pre>
 </div>
 <p data-pid="ETm55jgm">这个相当好玩。你给Manipulate函数任意一个表达式，它会通过一组变量来把这个表达式参数化，然后返回一个小部件，让你可以调整这些参数，并实时地看到表达式怎样随参数的变化而变化。 这里的表达式可以是某种图表。如果你要在讲座中用Mathematica演示一组解怎样随参数的变化而变化，Manipulate会特别有用。上面的代码展示了抛物线如何随系数a和b的变化而缩放和平移。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/8e5b7600d0921709bef24bb3c6cb44a5_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="417" data-rawheight="349" data-original-token="8e5b7600d0921709bef24bb3c6cb44a5" class="content_image" width="417">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="QA9zmT-L"><b>长度为59的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">SphericalPlot3D[Re[Sin[θ]Cos[θ]Exp[2I*φ]],{θ,0,π},{φ,0,2π}]</code></pre>
 </div>
 <p data-pid="CTbnVh2l">还记得长度为29的代码片段里的极坐标绘图吗？我们还可以在三维中干类似的事情。事实上，Mathematica中有两个相关的函数：用于柱面坐标的RevolutionPlot3D和用于球面坐标的SphericalPlot3D。和Graphics3D一样，Mathematica中所有的三维绘图都可以自动旋转，因此你无须为寻找一个好的角度而烦恼。上面的代码绘制的是一个类似于球谐函数的东西。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/61cdd055c747b16ba87f3f3f5c43d956_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="404" data-original-token="61cdd055c747b16ba87f3f3f5c43d956" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="YSJ9-C7I"><b>长度为64的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">CellularAutomaton[{224,{2,{{2,2,2},{2,1,2},{2,2,2}}},{1,1}},i,n]</code></pre>
 </div>
 <p data-pid="zoNiXw9N">之前说过会为大家展示更多CellularAutomaton的魔法。这一代码片段计算了<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/%25E5%25BA%25B7%25E5%25A8%2581%25E7%2594%259F%25E5%2591%25BD%25E6%25B8%25B8%25E6%2588%258F" class=" wrap external" target="_blank" rel="nofollow noreferrer">康威生命游戏</a>在初始条件i下的前n步，并返回中间每一步的结果。</p>
 <p data-pid="1ljNYyvs">关于函数参数的一点说明：2是细胞状态的数量。{{2,2,2},{2,1,2},{2,2,2}}为3x3邻域中的9个细胞加权，这确保了细胞本身的状态与其周围8个细胞之和有所区分。{1,1}指的是这个元胞自动机规则取决于两个方向上距离不超过一格的细胞。最后，224是这个元胞自动机规则的数字编码。算出这个数字并不是一件容易的事情，不过<a href="https://link.zhihu.com/?target=http%3A//reference.wolfram.com/language/tutorial/CellularAutomata.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">Mathematica的文档里有一份还不错的教程</a>。更复杂的元胞自动机往往不会使用数字编码，因为这个数字会特别大。后面会有相关的例子。</p>
 <p data-pid="cwncf8n6">总之，如果令i为一个随机的点阵，n为200，用ArrayPlot绘制出结果并制成动画，就是这个样子：</p>
 <p data-pid="xJuZvfZA">（动图，图片地址：<a href="https://link.zhihu.com/?target=http%3A//i.stack.imgur.com/ny4Fw.gif" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">i.stack.imgur.com/ny4Fw</span><span class="invisible">.gif</span><span class="ellipsis"></span></a>）</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/cde26196daddc138dcda10aa8fab44ed_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="359" data-original-token="cde26196daddc138dcda10aa8fab44ed" class="content_image" width="360">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="le_EtMKu"><b>长度为69的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">DSolve[r^2*R''[r]+2r*R'[r]-R[r]==0&amp;&amp;(R[r]==1&amp;&amp;R'[r]==2/.r-&gt;1),R[r],r]</code></pre>
 </div>
 <p data-pid="DXoa_W4h">回到实用的功能。除了一般的方程组，Mathematica还能解微分方程组。这个例子中的严格说来只是一个微分方程的边值问题， 不过你可以把它当成由3条方程组成的方程组来提交给DSolve。就像积分一样，DSolve用来求精确解，NDSolve则用来求数值解。上面的方程解出来是：</p>
 <div class="highlight">
  <pre><code class="language-text">{{R[r] -&gt; 1/2 r^(-(1/2) - Sqrt[5]/2) (1 - Sqrt[5] + r^Sqrt[5] + Sqrt[5] r^Sqrt[5])}}</code></pre>
 </div>
 <p data-pid="5pXYDdl5">你可以用它来进行进一步的计算或绘图。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="xIi2Lfmw"><b>长度为81的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">CellularAutomaton[{{0,2,3,If[0&lt;Count[#,1,2]&lt;3,1,3]}[[#[[2,2]]+1]]&amp;,{},{1,1}},i,n]</code></pre>
 </div>
 <p data-pid="WhdBZRQe">这是最后一个元胞自动机的例子。这是一种叫<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/Wireworld" class=" wrap external" target="_blank" rel="nofollow noreferrer">Wireworld</a>的元胞自动机。这次不再将规则编码成一个简单的数字，一来是因为这个数字很可能会大得离谱（作者懒得把它算出来），二来是为了展示CellularAutomaton的另一种用法。这次的规则用一个纯函数来指定，这个函数接收一个细胞的邻域的状态并返回这个细胞的新状态。对于超过两种颜色/状态的元胞自动机，这是更可行的用法。</p>
 <p data-pid="F0N78Y9R">总之，下图中的i用的维基百科里的例子（两个时钟发生器和一个异或门），并让它走了50步：</p>
 <p data-pid="XuyH2lgx">（动图，图片地址：<a href="https://link.zhihu.com/?target=http%3A//i.stack.imgur.com/yMhPe.gif" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">i.stack.imgur.com/yMhPe</span><span class="invisible">.gif</span><span class="ellipsis"></span></a>）</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/671ed56aabbdb1c66ce6df09193c302f_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="180" data-original-token="671ed56aabbdb1c66ce6df09193c302f" class="content_image" width="360">
 </figure>
 <p data-pid="tE2oXog4">事实上，这里的绘图和动画可以用一个长度为77的代码片段来完成：</p>
 <div class="highlight">
  <pre><code class="language-text">ListAnimate[ArrayPlot[#,ColorRules-&gt;{0-&gt;Black,1-&gt;Blue,2-&gt;Red,3-&gt;Yellow}]&amp;/@w]
</code></pre>
 </div>
 <p data-pid="TtYAbEDq"><b>长度为100的代码片段</b></p>
 <div class="highlight">
  <pre><code class="language-text">GeoGraphics[{GeoStyling[Opacity[0.5]], NightHemisphere[]}, GeoBackground -&gt; GeoStyling["ReliefMap"]]</code></pre>
 </div>
 <p data-pid="xjWgj6-q">作者一直想着以某些漂亮的Geo函数作为长度为100的代码片段，但最终在<a href="https://link.zhihu.com/?target=https%3A//twitter.com/wolframtap/status/559290929316909056/photo/1" class=" wrap external" target="_blank" rel="nofollow noreferrer">Tweet-a-Program</a>上找到了一个漂亮的例子，因此只需要把它偷过来。上面的代码生成了一幅展示当前地球上能被太阳找到的地方的地图。它在一个浮雕地图上为夜半球覆盖上了一层半透明的阴影。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/841b9475861168bf240227d0e4a3afbb_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="517" data-rawheight="243" data-original-token="841b9475861168bf240227d0e4a3afbb" class="origin_image zh-lightbox-thumb" width="517" data-original="https://picx.zhimg.com/841b9475861168bf240227d0e4a3afbb_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PAeCNVAx"><b>长度为143和144的代码片段</b></p>
 <p data-pid="aCqaOLXz"><b>（感谢评论中 <a class="member_mention" href="https://www.zhihu.com/people/7de081b9e0535119cf883b07625502b3" data-hash="7de081b9e0535119cf883b07625502b3" data-hovercard="p$b$7de081b9e0535119cf883b07625502b3">@公孙立夏</a> 的翻译）</b></p>
 <p data-pid="4Zza1qdf">最后这一刻我等了好久，有些迫不及待了。我之前提到Mathematica可以求方程的数值解，也可以解微分方程。现在我想举一个很有价值的例子。</p>
 <p data-pid="8c7HGD9-">假设在一杆上的双摆问题（即两个单摆连在一起），并且每个杆都是单位长度。每个单摆都是单位质量。在此，我也用到单位重力来缩短公式。下面143个字符的代码片段解出了这个系统运动所遵循的<a href="https://link.zhihu.com/?target=https%3A//zh.wikipedia.org/wiki/%25E6%258B%2589%25E6%25A0%25BC%25E6%259C%2597%25E6%2597%25A5%25E5%258A%259B%25E5%25AD%25A6" class=" wrap external" target="_blank" rel="nofollow noreferrer">拉格朗日方程</a>（未知参量为单摆的角度和角动量）。更详细的<a href="https://link.zhihu.com/?target=http%3A//sophia.dtp.fmph.uniba.sk/%257Ekovacik/doublePendulum.pdf" class=" wrap external" target="_blank" rel="nofollow noreferrer">戳这里</a>，当然，如果你熟悉拉格朗日理论的话，这只是个很简单的练习。</p>
 <p data-pid="XUXrmjtH">代码很难读，是为了这143字符的长度</p>
 <div class="highlight">
  <pre><code class="language-text">d=θ@t-φ@t;NDSolve[{#''@t==-#4#2''[t]Cos@d-##3#2'@t^2Sin@d-Sin@#@t&amp;@@@{{θ,φ,1,.5},{φ,θ,-1,1}},θ@0==2,φ@0==1,θ'@t==φ'@t==0/.t-&gt;0},{θ,φ},{t,0,60}]</code></pre>
 </div>
 <p data-pid="ABsRhQ-t">Mathematica立即给出了一个非常整齐的答案，用缩略图像展示了方程的解：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/ff30f039b8d34a4dc147bf266acc42f0_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="817" data-rawheight="69" data-original-token="ff30f039b8d34a4dc147bf266acc42f0" class="origin_image zh-lightbox-thumb" width="817" data-original="https://pica.zhimg.com/ff30f039b8d34a4dc147bf266acc42f0_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="D0PUUx-8">但上述结果有些生硬，我们想知道双摆的运动实际是什么样子的。因此，我写了这个144个字符的代码片段，它动态展示了双摆的运动和位于下部的单摆运动的轨迹。</p>
 <div class="highlight">
  <pre><code class="language-text">Graphics@{Line@{{0,0},p=θ~(h={Sin@#@#2,-Cos@#@#2}&amp;)~t,p+φ~h~t},White,{0,0}~Circle~2.2}~Show~ParametricPlot[θ~h~u+φ~h~u,{u,0,t}]~Animate~{t,0,60}</code></pre>
 </div>
 <p data-pid="LWB34ztV">结果如图：（动图，图片地址：<a href="https://link.zhihu.com/?target=http%3A//i.stack.imgur.com/3WS9q.gif" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">i.stack.imgur.com/3WS9q</span><span class="invisible">.gif</span><span class="ellipsis"></span></a>）</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/56329173f05d1d148c5501b86eb1f910_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="360" data-rawheight="359" data-original-token="56329173f05d1d148c5501b86eb1f910" class="content_image" width="360">
 </figure>
 <p data-pid="fpNWsd7y">PS:我不得不作点弊：如果画图超过t=30，ParametricPlot将会画很少的点，并且线条将会变成锯齿状。但有趣的动力学刚好发生在这个时<br>
  间后，因此我用了这个选项PlotPoints -&gt; 200 来使下半部分的运动更顺滑。没什么实质的区别，而且上半部分会看不出什么不同。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PytqmlH3">（译者注：如果要尝试运行这两段代码，在运行143之后，144之前，应该要加一个{θ, φ} = {θ, φ} /. %[[1]] 。作者省去了这一步。）</p>
 <p data-pid="vorM4NhN">---</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="lrTWaptQ">以上是全文。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PNPlqTqE">最后，有兴趣的可以关注一下我的这个收藏夹，专门收集Mathematica在知乎里的各种奇妙应用：<a href="http://www.zhihu.com/collection/31665088" class="internal">Mathematica - 收藏夹</a></p>
</body>