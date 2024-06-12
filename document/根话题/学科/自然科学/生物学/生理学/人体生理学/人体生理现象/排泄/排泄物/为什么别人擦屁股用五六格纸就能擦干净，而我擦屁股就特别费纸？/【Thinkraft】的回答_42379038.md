# 为什么别人擦屁股用五六格纸就能擦干净，而我擦屁股就特别费纸？
- 点赞数：24297
- 更新时间：2018年03月11日15时38分30秒
- 回答url：https://www.zhihu.com/question/28577005/answer/42379038
<body>
 <figure>
  <img src="https://picx.zhimg.com/50/efccf7ca5d4d53fa625c8430a66a6910_720w.jpg?source=1940ef5c" data-rawwidth="225" data-rawheight="225" data-original-token="efccf7ca5d4d53fa625c8430a66a6910" class="content_image" width="225">
 </figure>
 <br>
 <br>
 <p data-pid="Abe5nYDz">这个事吧，大概是这样的……</p>
 <div class="highlight">
  <pre><code class="language-csharp"><span class="k">public</span> <span class="k">interface</span> <span class="n">IShitter</span>
<span class="p">{</span>
    <span class="k">void</span> <span class="n">Shit</span><span class="p">();</span>
<span class="p">}</span>

<span class="k">public</span> <span class="k">interface</span> <span class="n">ICapiguable</span>
<span class="p">{</span>
    <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">IEnumerable</span><span class="p">&lt;</span><span class="n">Paper</span><span class="p">&gt;</span> <span class="n">paperRoll</span><span class="p">);</span>
<span class="p">}</span>

<span class="k">public</span> <span class="k">class</span> <span class="nc">Paper</span>
<span class="p">{</span>
    <span class="k">private</span> <span class="kt">bool</span> <span class="n">_isUsed</span> <span class="p">=</span> <span class="k">false</span><span class="p">;</span>
    <span class="k">public</span> <span class="kt">bool</span> <span class="n">IsUsed</span>
    <span class="p">{</span>
        <span class="k">get</span> <span class="p">{</span> <span class="k">return</span> <span class="k">this</span><span class="p">.</span><span class="n">_isUsed</span><span class="p">;</span> <span class="p">}</span>
        <span class="k">private</span> <span class="k">set</span> <span class="p">{</span> <span class="k">this</span><span class="p">.</span><span class="n">_isUsed</span> <span class="p">=</span> <span class="k">value</span><span class="p">;</span> <span class="p">}</span>
    <span class="p">}</span>

    <span class="k">public</span> <span class="k">void</span> <span class="n">Use</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="k">if</span> <span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="n">IsUsed</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="k">throw</span> <span class="k">new</span> <span class="n">PaperAlreadyUsedException</span><span class="p">();</span>
        <span class="p">}</span>
        <span class="k">this</span><span class="p">.</span><span class="n">IsUsed</span> <span class="p">=</span> <span class="k">true</span><span class="p">;</span>
    <span class="p">}</span>
<span class="p">}</span>

<span class="k">public</span> <span class="k">class</span> <span class="nc">Human</span> <span class="p">:</span> <span class="n">IShitter</span><span class="p">,</span> <span class="n">ICapiguable</span>
<span class="p">{</span>
    <span class="k">private</span> <span class="kt">int</span> <span class="n">_dirtiness</span> <span class="p">=</span> <span class="m">0</span><span class="p">;</span>
    <span class="k">public</span> <span class="kt">int</span> <span class="n">Dirtiness</span>
    <span class="p">{</span>
        <span class="k">get</span> <span class="p">{</span> <span class="k">return</span> <span class="k">this</span><span class="p">.</span><span class="n">_dirtiness</span><span class="p">;</span> <span class="p">}</span>
        <span class="k">protected</span> <span class="k">set</span> <span class="p">{</span> <span class="k">this</span><span class="p">.</span><span class="n">_dirtiness</span> <span class="p">=</span> <span class="k">value</span><span class="p">;</span> <span class="p">}</span>
    <span class="p">}</span>

    <span class="k">public</span> <span class="k">virtual</span> <span class="k">void</span> <span class="n">Shit</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="k">this</span><span class="p">.</span><span class="n">Dirtiness</span><span class="p">=</span> <span class="m">100</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="k">protected</span> <span class="k">virtual</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">Paper</span> <span class="n">paper</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="k">if</span> <span class="p">(</span><span class="n">paper</span> <span class="p">==</span> <span class="k">null</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="k">throw</span> <span class="k">new</span> <span class="n">OutOfPaperException</span><span class="p">();</span>
        <span class="p">}</span>
        <span class="n">paper</span><span class="p">.</span><span class="n">Use</span><span class="p">();</span>
        <span class="kt">var</span> <span class="n">effect</span> <span class="p">=</span> <span class="n">Math</span><span class="p">.</span><span class="n">Max</span><span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="n">Dirtiness</span> <span class="p">/</span> <span class="m">2</span><span class="p">,</span> <span class="m">10</span><span class="p">);</span>
        <span class="k">this</span><span class="p">.</span><span class="n">Dirtiness</span> <span class="p">=</span> <span class="n">Math</span><span class="p">.</span><span class="n">Max</span><span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="n">Dirtiness</span> <span class="p">-</span> <span class="n">effect</span><span class="p">,</span> <span class="m">0</span><span class="p">);</span>
    <span class="p">}</span>

    <span class="k">public</span> <span class="k">virtual</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">IEnumerable</span><span class="p">&lt;</span><span class="n">Paper</span><span class="p">&gt;</span> <span class="n">paperRoll</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="k">if</span> <span class="p">(</span><span class="n">paperRoll</span> <span class="p">==</span> <span class="k">null</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="k">throw</span> <span class="k">new</span> <span class="n">OutOfPaperException</span><span class="p">();</span>
        <span class="p">}</span>
        <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">i</span> <span class="p">=</span> <span class="m">0</span><span class="p">;</span> <span class="n">i</span> <span class="p">&lt;</span> <span class="m">3</span><span class="p">;</span> <span class="n">i</span><span class="p">++)</span>
        <span class="p">{</span>
            <span class="kt">var</span> <span class="n">paper</span> <span class="p">=</span> <span class="n">paperRoll</span><span class="p">.</span><span class="n">FirstOrDefault</span><span class="p">(</span><span class="n">p</span> <span class="p">=&gt;</span> <span class="p">!</span><span class="n">p</span><span class="p">.</span><span class="n">IsUsed</span><span class="p">);</span>
            <span class="n">WipeAss</span><span class="p">(</span><span class="n">paper</span><span class="p">);</span>
        <span class="p">}</span>
    <span class="p">}</span>
<span class="p">}</span>
</code></pre>
 </div>
 <br>
 <p data-pid="Pqy6q3z2"><b>你是这么擦的：</b></p>
 <div class="highlight">
  <pre><code class="language-csharp"><span class="k">public</span> <span class="k">class</span> <span class="nc">OcdPeople</span> <span class="p">:</span> <span class="n">Human</span>
<span class="p">{</span>
    <span class="k">public</span> <span class="k">sealed</span> <span class="k">override</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">IEnumerable</span><span class="p">&lt;</span><span class="n">Paper</span><span class="p">&gt;</span> <span class="n">paperRoll</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="k">try</span>
        <span class="p">{</span>
            <span class="k">if</span> <span class="p">(</span><span class="n">paperRoll</span> <span class="p">==</span> <span class="k">null</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="k">throw</span> <span class="k">new</span> <span class="n">OutOfPaperException</span><span class="p">();</span>
            <span class="p">}</span>
            <span class="k">do</span>
            <span class="p">{</span>
                <span class="kt">var</span> <span class="n">paper</span> <span class="p">=</span> <span class="n">paperRoll</span><span class="p">.</span><span class="n">FirstOrDefault</span><span class="p">(</span><span class="n">p</span> <span class="p">=&gt;</span> <span class="p">!</span><span class="n">p</span><span class="p">.</span><span class="n">IsUsed</span><span class="p">);</span>
                <span class="n">WipeAss</span><span class="p">(</span><span class="n">paper</span><span class="p">);</span>
            <span class="p">}</span> <span class="k">while</span> <span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="n">Dirtiness</span> <span class="p">&gt;</span> <span class="m">0</span><span class="p">);</span>
            <span class="c1">//Make sure
</span><span class="c1"></span>            <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">i</span> <span class="p">=</span> <span class="m">0</span><span class="p">;</span> <span class="n">i</span> <span class="p">&lt;</span> <span class="m">3</span><span class="p">;</span> <span class="n">i</span><span class="p">++)</span>
            <span class="p">{</span>
                <span class="kt">var</span> <span class="n">paper</span> <span class="p">=</span> <span class="n">paperRoll</span><span class="p">.</span><span class="n">FirstOrDefault</span><span class="p">(</span><span class="n">p</span> <span class="p">=&gt;</span> <span class="p">!</span><span class="n">p</span><span class="p">.</span><span class="n">IsUsed</span><span class="p">);</span>
                <span class="n">WipeAss</span><span class="p">(</span><span class="n">paper</span><span class="p">);</span>
            <span class="p">}</span>
        <span class="p">}</span>
        <span class="k">catch</span> <span class="p">(</span><span class="n">OutOfPaperException</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="kt">var</span> <span class="n">newPaperRoll</span> <span class="p">=</span> <span class="n">Supplies</span><span class="p">.</span><span class="n">GetNewPaperRoll</span><span class="p">();</span>
            <span class="n">WipeAss</span><span class="p">(</span><span class="n">newPaperRoll</span><span class="p">);</span>
        <span class="p">}</span>
        <span class="k">catch</span> <span class="p">(</span><span class="n">Exception</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="k">throw</span><span class="p">;</span>
        <span class="p">}</span>
    <span class="p">}</span>
<span class="p">}</span>
</code></pre>
 </div>
 <p data-pid="04pD58av"><b>你说的那些别人，是这么擦的：</b></p>
 <div class="highlight">
  <pre><code class="language-csharp"><span class="k">public</span> <span class="k">class</span> <span class="nc">DamnedCarelessPeople</span> <span class="p">:</span> <span class="n">Human</span>
<span class="p">{</span>
    <span class="k">public</span> <span class="k">override</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">IEnumerable</span><span class="p">&lt;</span><span class="n">Paper</span><span class="p">&gt;</span> <span class="n">paperRoll</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="kt">var</span> <span class="n">paper</span> <span class="p">=</span> <span class="n">paperRoll</span><span class="p">.</span><span class="n">FirstOrDefault</span><span class="p">();</span>
        <span class="n">WipeAss</span><span class="p">(</span><span class="n">paper</span><span class="p">);</span>
    <span class="p">}</span>
<span class="p">}</span>
</code></pre>
 </div>
 <p data-pid="jtxkkDvv"><b>还有些人，是这么擦的：</b></p>
 <div class="highlight">
  <pre><code class="language-csharp"><span class="k">public</span> <span class="k">class</span> <span class="nc">Indian</span> <span class="p">:</span> <span class="n">Human</span>
<span class="p">{</span>
    <span class="k">private</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="kt">object</span> <span class="n">whatever</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="c1">//Do not imagine
</span><span class="c1"></span>    <span class="p">}</span>

    <span class="k">public</span> <span class="k">override</span> <span class="k">void</span> <span class="n">WipeAss</span><span class="p">(</span><span class="n">IEnumerable</span><span class="p">&lt;</span><span class="n">Paper</span><span class="p">&gt;</span> <span class="n">paperRoll</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">WipeAss</span><span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="n">LeftHand</span><span class="p">);</span>
    <span class="p">}</span>
<span class="p">}</span>
</code></pre>
 </div>
 <p data-pid="l9TIFT6m">代码烂，吐槽请轻点。</p>
 <br>
 <br>
 <p data-pid="lwnfundX">——————————图解——————————</p>
 <br>
 <br>
 <p data-pid="5JXEdp-u">嗯，为了照顾非程序员网友，再换个方式讲解好了。</p>
 <p data-pid="PqJG1ZAA"><b>多图杀流量杀午餐预警。请心理承受力差者不要继续下拉。</b></p>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <p data-pid="gJKxOvFe">——————————开始——————————</p>
 <br>
 <p data-pid="-t566A02"><b>你说的那些别人</b><b>，是这么擦的：</b></p>
 <figure>
  <img src="https://picx.zhimg.com/50/d8578244f33258eca97e6b269fc8176b_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="d8578244f33258eca97e6b269fc8176b" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pica.zhimg.com/50/9cccff88a5511cc152a5f4a810beb821_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="9cccff88a5511cc152a5f4a810beb821" class="content_image" width="373">
 </figure>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <p data-pid="yuOjtvva"><b>而你大概</b><b>是这么擦的：</b></p>
 <figure>
  <img src="https://pic1.zhimg.com/50/d8578244f33258eca97e6b269fc8176b_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="d8578244f33258eca97e6b269fc8176b" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pica.zhimg.com/50/9cccff88a5511cc152a5f4a810beb821_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="9cccff88a5511cc152a5f4a810beb821" class="content_image" width="373">
 </figure>
 <br>
 <figure>
  <img src="https://picx.zhimg.com/50/337da5acd75cbf0cf7cdc4a5a2db3efe_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="337da5acd75cbf0cf7cdc4a5a2db3efe" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://picx.zhimg.com/50/6cca93702a6a6d30779b2720a56cc187_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="6cca93702a6a6d30779b2720a56cc187" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://picx.zhimg.com/50/93d3676329495132c614bef9620ab282_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="93d3676329495132c614bef9620ab282" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pic1.zhimg.com/50/30be29f8c8264e5d08fe2de615971f89_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="30be29f8c8264e5d08fe2de615971f89" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pic1.zhimg.com/50/2dd7065e506a8b627d45146ab48d99ae_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="2dd7065e506a8b627d45146ab48d99ae" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://picx.zhimg.com/50/497c346ed235857be794cd3ef3a45783_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="497c346ed235857be794cd3ef3a45783" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pic1.zhimg.com/50/d5ac5a7c4f32c34f67fa34897a1ba53e_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="d5ac5a7c4f32c34f67fa34897a1ba53e" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://picx.zhimg.com/50/1ab3c1b782afeca6112033eab9156542_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="1ab3c1b782afeca6112033eab9156542" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pica.zhimg.com/50/c05369e196a902cd023252b2d5945562_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="c05369e196a902cd023252b2d5945562" class="content_image" width="373">
 </figure>
 <figure>
  <img src="https://pica.zhimg.com/50/1ab3c1b782afeca6112033eab9156542_720w.jpg?source=1940ef5c" data-rawwidth="373" data-rawheight="276" data-original-token="1ab3c1b782afeca6112033eab9156542" class="content_image" width="373">
 </figure>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <p data-pid="dvniSwNe"><b>我不知道印度人怎么擦，但是猫扑网友写的省纸攻略是这么擦的：</b></p>
 <br>
 <br>
 <br>
 <br>
 <br>
 <figure>
  <img src="https://picx.zhimg.com/50/ad5afb35a5e3ff59c228ca16bf8a9cd8_720w.jpg?source=1940ef5c" data-rawwidth="350" data-rawheight="3239" data-original-token="ad5afb35a5e3ff59c228ca16bf8a9cd8" class="content_image" width="350">
 </figure>
</body>