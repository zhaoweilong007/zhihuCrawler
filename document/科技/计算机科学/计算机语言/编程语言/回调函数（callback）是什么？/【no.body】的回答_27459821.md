# 回调函数（callback）是什么？
- 点赞数：5368
- 更新时间：2014年07月01日21时59分53秒
- 回答url：https://www.zhihu.com/question/19801131/answer/27459821
<body>
 <p data-pid="CXjov8Q9"><b>什么是回调函数？</b></p>
 <p data-pid="mFDpd7F5">我们绕点远路来回答这个问题。</p>
 <p data-pid="KQHey3Xx">编程分为两类：系统编程（system programming）和应用编程（application programming）。所谓系统编程，简单来说，就是编写<b>库</b>；而应用编程就是利用写好的各种库来编写具某种功用的程序，也就是<b>应用</b>。系统程序员会给自己写的库留下一些接口，即API（application programming interface，应用编程接口），以供应用程序员使用。所以在抽象层的图示里，库位于应用的底下。</p>
 <p data-pid="8pqyIKP1">当程序跑起来时，一般情况下，应用程序（application program）会时常通过API调用库里所预先备好的函数。但是有些库函数（library function）却要求应用先传给它一个函数，好在合适的时候调用，以完成目标任务。这个被传入的、后又被调用的函数就称为<b>回调函数</b>（callback function）。</p>
 <p data-pid="tXr6wQEm">打个比方，有一家旅馆提供叫醒服务，但是要求旅客自己决定叫醒的方法。可以是打客房电话，也可以是派服务员去敲门，睡得死怕耽误事的，还可以要求往自己头上浇盆水。这里，“叫醒”这个行为是旅馆提供的，相当于库函数，但是叫醒的方式是由旅客决定并告诉旅馆的，也就是回调函数。而旅客告诉旅馆怎么叫醒自己的动作，也就是把回调函数传入库函数的动作，称为<b>登记回调函数</b>（to register a callback function）。如下图所示（图片来源：维基百科）：</p>
 <figure>
  <img src="https://pica.zhimg.com/50/0ef3106510e2e1630eb49744362999f8_720w.jpg?source=1940ef5c" data-rawwidth="625" data-rawheight="233" data-original-token="0ef3106510e2e1630eb49744362999f8" class="origin_image zh-lightbox-thumb" width="625" data-original="https://picx.zhimg.com/0ef3106510e2e1630eb49744362999f8_r.jpg?source=1940ef5c">
 </figure>
 <br>
 <p data-pid="pMlYgKt3">可以看到，回调函数通常和应用处于同一抽象层（因为传入什么样的回调函数是在应用级别决定的）。而回调就成了一个高层调用底层，底层再<b>回</b>过头来<b>调</b>用高层的过程。（我认为）这应该是回调最早的应用之处，也是其得名如此的原因。</p>
 <p data-pid="YfO-9BnY"><b>回调机制的优势</b></p>
 <p data-pid="hM9HtQI1">从上面的例子可以看出，回调机制提供了非常大的灵活性。请注意，从现在开始，我们把图中的库函数改称为<b>中间函数</b>了，这是因为回调并不仅仅用在应用和库之间。任何时候，只要想获得类似于上面情况的灵活性，都可以利用回调。</p>
 <p data-pid="jV__m1DC">这种灵活性是怎么实现的呢？乍看起来，回调似乎只是函数间的调用，但仔细一琢磨，可以发现两者之间的一个关键的不同：在回调中，我们利用某种方式，把回调函数像参数一样传入中间函数。可以这么理解，在传入一个回调函数之前，中间函数是不完整的。换句话说，程序可以在运行时，通过登记不同的回调函数，来决定、改变中间函数的行为。这就比简单的函数调用要灵活太多了。请看下面这段Python写成的回调的简单示例：</p>
 <p data-pid="B4RrHG8F">`even.py`</p>
 <div class="highlight">
  <pre><code class="language-python"><span class="c1">#回调函数1</span>
<span class="c1">#生成一个2k形式的偶数</span>
<span class="k">def</span> <span class="nf">double</span><span class="p">(</span><span class="n">x</span><span class="p">):</span>
    <span class="k">return</span> <span class="n">x</span> <span class="o">*</span> <span class="mi">2</span>
    
<span class="c1">#回调函数2</span>
<span class="c1">#生成一个4k形式的偶数</span>
<span class="k">def</span> <span class="nf">quadruple</span><span class="p">(</span><span class="n">x</span><span class="p">):</span>
    <span class="k">return</span> <span class="n">x</span> <span class="o">*</span> <span class="mi">4</span>
</code></pre>
 </div>
 <p data-pid="bD_se6rd">`callback_demo.py`</p>
 <div class="highlight">
  <pre><code class="language-python"><span class="kn">from</span> <span class="nn">even</span> <span class="kn">import</span> <span class="o">*</span>

<span class="c1">#中间函数</span>
<span class="c1">#接受一个生成偶数的函数作为参数</span>
<span class="c1">#返回一个奇数</span>
<span class="k">def</span> <span class="nf">getOddNumber</span><span class="p">(</span><span class="n">k</span><span class="p">,</span> <span class="n">getEvenNumber</span><span class="p">):</span>
    <span class="k">return</span> <span class="mi">1</span> <span class="o">+</span> <span class="n">getEvenNumber</span><span class="p">(</span><span class="n">k</span><span class="p">)</span>
    
<span class="c1">#起始函数，这里是程序的主函数</span>
<span class="k">def</span> <span class="nf">main</span><span class="p">():</span>    
    <span class="n">k</span> <span class="o">=</span> <span class="mi">1</span>
    <span class="c1">#当需要生成一个2k+1形式的奇数时</span>
    <span class="n">i</span> <span class="o">=</span> <span class="n">getOddNumber</span><span class="p">(</span><span class="n">k</span><span class="p">,</span> <span class="n">double</span><span class="p">)</span>
    <span class="k">print</span><span class="p">(</span><span class="n">i</span><span class="p">)</span>
    <span class="c1">#当需要一个4k+1形式的奇数时</span>
    <span class="n">i</span> <span class="o">=</span> <span class="n">getOddNumber</span><span class="p">(</span><span class="n">k</span><span class="p">,</span> <span class="n">quadruple</span><span class="p">)</span>
    <span class="k">print</span><span class="p">(</span><span class="n">i</span><span class="p">)</span>
    <span class="c1">#当需要一个8k+1形式的奇数时</span>
    <span class="n">i</span> <span class="o">=</span> <span class="n">getOddNumber</span><span class="p">(</span><span class="n">k</span><span class="p">,</span> <span class="k">lambda</span> <span class="n">x</span><span class="p">:</span> <span class="n">x</span> <span class="o">*</span> <span class="mi">8</span><span class="p">)</span>
    <span class="k">print</span><span class="p">(</span><span class="n">i</span><span class="p">)</span>
    
<span class="k">if</span> <span class="vm">__name__</span> <span class="o">==</span> <span class="s2">"__main__"</span><span class="p">:</span>
    <span class="n">main</span><span class="p">()</span>
</code></pre>
 </div>
 <p data-pid="Gbj_oKZK">运行`callback_demp.py`，输出如下：</p>
 <div class="highlight">
  <pre><code class="language-text">3
5
9</code></pre>
 </div>
 <p data-pid="GSwULms0">上面的代码里，给`getOddNumber`传入不同的回调函数，它的表现也不同，这就是回调机制的优势所在。值得一提的是，上面的第三个回调函数是一个匿名函数。</p>
 <p data-pid="SrvtI45A"><b>易被忽略的第三方</b></p>
 <p data-pid="1HVOpMjn">通过上面的论述可知，中间函数和回调函数是回调的两个必要部分，不过人们往往忽略了回调里的第三位要角，就是中间函数的调用者。绝大多数情况下，这个调用者可以和程序的主函数等同起来，但为了表示区别，我这里把它称为<b>起始函数</b>（如上面的代码中注释所示）。</p>
 <p data-pid="5feEZ4zz">之所以特意强调这个第三方，是因为我在网上读相关文章时得到一种印象，很多人把它简单地理解为两个个体之间的来回调用。譬如，很多中文网页在解释“回调”（callback）时，都会提到这么一句话：“If you call me, I will call you back.”我没有查到这句英文的出处。我个人揣测，很多人把起始函数和回调函数看作为一体，大概有两个原因：第一，可能是“回调”这一名字的误导；第二，给中间函数传入什么样的回调函数，是在起始函数里决定的。实际上，回调并不是“你我”两方的互动，而是ABC的三方联动。有了这个清楚的概念，在自己的代码里实现回调时才不容易混淆出错。</p>
 <p data-pid="gMOk0rAO">另外，回调实际上有两种：阻塞式回调和延迟式回调。两者的区别在于：阻塞式回调里，回调函数的调用一定发生在起始函数返回之前；而延迟式回调里，回调函数的调用有可能是在起始函数返回之后。这里不打算对这两个概率做更深入的讨论，之所以把它们提出来，也是为了说明强调起始函数的重要性。网上的很多文章，提到这两个概念时，只是笼统地说阻塞式回调发生在主调函数返回之前，却没有明确这个主调函数到底是起始函数还是中间函数，不免让人糊涂，所以这里特意说明一下。另外还请注意，本文中所举的示例均为阻塞式回调。延迟式回调通常牵扯到多线程，我自己还没有完全搞明白，所以这里就不多说了。</p>
</body>