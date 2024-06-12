# 什么是张量 (tensor)？
- 点赞数：5210
- 更新时间：2015年03月31日13时50分06秒
- 回答url：https://www.zhihu.com/question/20695804/answer/43265860
<body>
 <p data-pid="1wJP1Stc">现在已有的回答都好吓人...</p>
 <figure>
  <img src="https://pica.zhimg.com/50/af968a8a6eb9b25b5c0901e964e74054_720w.jpg?source=1940ef5c" data-rawwidth="120" data-rawheight="58" data-original-token="af968a8a6eb9b25b5c0901e964e74054" class="content_image" width="120">
 </figure>
 <p data-pid="ljD9LMvJ">对于大部分已经熟练的数学和物理工作者, 这实在是一个极为基础的问题. 但这个问题在我刚接触张量时也困扰了我很久. 张量的那么多定义, 究竟哪些是对的? (显然都是对的. ) 它们的关系是什么? 我尽可能简单地用我自己的话把我对它粗浅的理解讲得明白些.</p>
 <ul>
  <li data-pid="mgpOykLS">A View from Physics</li>
 </ul>
 <p data-pid="2Wye-OhA">张量的概念早在19世纪末就被数学家提出了, 但这个概念真正发扬光大, 还是在相对论出现以后. 原因是, 在相对论中, 在不同的参考系下看同一个物理系统, 它"看起来"是不一样的: 比如粒子的动量和能量在不同的参考系下根据 Lorentz 变换相联系.</p>
 <p data-pid="Uv8kxdZ8">这带来一个问题: 在 Bob 看来, 一个粒子的能动量是<img src="https://www.zhihu.com/equation?tex=%28E_b%2C%5Cbm%7Bp%7D_b%29" alt="(E_b,\bm{p}_b)" eeimg="1">. 如果你问 Bob, 这个粒子的能动量是多少, 他会告诉你是<img src="https://www.zhihu.com/equation?tex=%28E_b%2C%5Cbm%7Bp%7D_b%29" alt="(E_b,\bm{p}_b)" eeimg="1">. 但我 (Andrew) 听了以后, 必然是反对的: Bob 说的不对! 我看到的粒子的能动量明明是<img src="https://www.zhihu.com/equation?tex=%28E_a%2C%5Cbm%7Bp%7D_a%29" alt="(E_a,\bm{p}_a)" eeimg="1">!</p>
 <p data-pid="2Nu1YK2F">我们知道, Andrew 和 Bob 都没有说错. <img src="https://www.zhihu.com/equation?tex=%28E_a%2C%5Cbm%7Bp%7D_a%29" alt="(E_a,\bm{p}_a)" eeimg="1">和<img src="https://www.zhihu.com/equation?tex=%28E_b%2C%5Cbm%7Bp%7D_b%29" alt="(E_b,\bm{p}_b)" eeimg="1">可以通过恰当的 Lorentz 变换相互转化. "你说的我都懂", 想必你已经看得不耐烦了, "可是这个粒子的能动量究竟是多少? " 由于参考系都是平权的, Andrew 和 Bob 的参考系并没有哪个更优越. 那我们干脆把它们都舍弃. 于是我们说, 这个粒子的能动量就由能动量张量<img src="https://www.zhihu.com/equation?tex=T" alt="T" eeimg="1">来描述. 能动量张量是一个不随坐标而改变的, 物理系统内在的量. (如果你对左边这句话的确切含义感到疑惑, 请先往下看. ) 它在 Andrew 的坐标系里看是<img src="https://www.zhihu.com/equation?tex=%28E_a%2C%5Cbm%7Bp%7D_a%29" alt="(E_a,\bm{p}_a)" eeimg="1">, 在 Bob 的坐标系里看是<img src="https://www.zhihu.com/equation?tex=%28E_b%2C%5Cbm%7Bp%7D_b%29" alt="(E_b,\bm{p}_b)" eeimg="1">, <img src="https://www.zhihu.com/equation?tex=%28E_a%2C%5Cbm%7Bp%7D_a%29" alt="(E_a,\bm{p}_a)" eeimg="1">按照 Lorentz 变换变成<img src="https://www.zhihu.com/equation?tex=%28E_b%2C%5Cbm%7Bp%7D_b%29" alt="(E_b,\bm{p}_b)" eeimg="1">.</p>
 <p data-pid="iCLjMHdX">你现在肯定找到了一点感觉. 什么是张量? 如 A.Zee 书中所说: <b>A tensor is something that transforms like a tensor! 一个量, 在不同的参考系下按照某种特定的法则进行变换, 就是张量. </b></p>
 <p data-pid="3JMcEyaL">用张量有什么好处? 物理定律是不会随参考系的变化而变化的. 考虑下面一个物理过程: 两个粒子1和2经过散射变成了3和4. 在 Andrew 看来, 能动量守恒是<img src="https://www.zhihu.com/equation?tex=%28E_%7Ba%2C1%7D%2C%5Cbm%7Bp%7D_%7Ba%2C1%7D%29%2B%28E_%7Ba%2C2%7D%2C%5Cbm%7Bp%7D_%7Ba%2C2%7D%29%3D%28E_%7Ba%2C3%7D%2C%5Cbm%7Bp%7D_%7Ba%2C3%7D%29%2B%28E_%7Ba%2C4%7D%2C%5Cbm%7Bp%7D_%7Ba%2C4%7D%29" alt="(E_{a,1},\bm{p}_{a,1})+(E_{a,2},\bm{p}_{a,2})=(E_{a,3},\bm{p}_{a,3})+(E_{a,4},\bm{p}_{a,4})" eeimg="1">. 但这样写, 并不能直接看出 Bob 也看到能动量守恒. 但如果用张量的语言直接写成: <img src="https://www.zhihu.com/equation?tex=T_1%2BT_2%3DT_3%2BT_4" alt="T_1+T_2=T_3+T_4" eeimg="1">, 我们立刻就知道它在 Andrew 看来是<img src="https://www.zhihu.com/equation?tex=%28E_%7Ba%2C1%7D%2C%5Cbm%7Bp%7D_%7Ba%2C1%7D%29%2B%28E_%7Ba%2C2%7D%2C%5Cbm%7Bp%7D_%7Ba%2C2%7D%29%3D%28E_%7Ba%2C3%7D%2C%5Cbm%7Bp%7D_%7Ba%2C3%7D%29%2B%28E_%7Ba%2C4%7D%2C%5Cbm%7Bp%7D_%7Ba%2C4%7D%29" alt="(E_{a,1},\bm{p}_{a,1})+(E_{a,2},\bm{p}_{a,2})=(E_{a,3},\bm{p}_{a,3})+(E_{a,4},\bm{p}_{a,4})" eeimg="1">, 在 Bob 看来是<img src="https://www.zhihu.com/equation?tex=%28E_%7Bb%2C1%7D%2C%5Cbm%7Bp%7D_%7Bb%2C1%7D%29%2B%28E_%7Bb%2C2%7D%2C%5Cbm%7Bp%7D_%7Bb%2C2%7D%29%3D%28E_%7Bb%2C3%7D%2C%5Cbm%7Bp%7D_%7Bb%2C3%7D%29%2B%28E_%7Bb%2C4%7D%2C%5Cbm%7Bp%7D_%7Bb%2C4%7D%29" alt="(E_{b,1},\bm{p}_{b,1})+(E_{b,2},\bm{p}_{b,2})=(E_{b,3},\bm{p}_{b,3})+(E_{b,4},\bm{p}_{b,4})" eeimg="1">. <b>用张量语言描述的物理定律自动保证了不随参考系变化的这一性质. 而且从记号的角度看, 用张量也更加简洁. [*]</b></p>
 <ul>
  <li data-pid="1kRrJCdY">Let us go deeper</li>
 </ul>
 <p data-pid="rD_hh7rr">我们已经从物理上理解了什么是张量. 物理学家到此就很满意了. 但严谨的数学家们并不满意. "你刚刚说张量是一个不随坐标而改变的, 物理系统内在的量", 数学家质问道, "你说的我都懂, 可是张量究竟是什么?"</p>
 <p data-pid="tmvTXeAC">如果你对线性代数略知一二, 可能知道线性变换这个概念. 线性变换这个概念的精髓之处在于, 它不依赖于线性空间的基的选取. 在某一组基下, 它的矩阵表示<img src="https://www.zhihu.com/equation?tex=A" alt="A" eeimg="1">是一个模样; 在另外一组基下, 它的矩阵表示<img src="https://www.zhihu.com/equation?tex=A%27%3DTAT%5E%7B-1%7D" alt="A'=TAT^{-1}" eeimg="1">是另一个模样, 其中<img src="https://www.zhihu.com/equation?tex=T" alt="T" eeimg="1">是基变换矩阵. 有一种常见的说法: <b>矩阵的意义是线性变换, 相似矩阵是同一个线性变换在不同的基下的表示. </b></p>
 <p data-pid="YBTL9Omx">慢着! "同一个线性变换在不同的基下的表示", 这难道不就是和之前说的张量是一回事嘛! Lorentz 变换就是 Minkowski 空间中的基变换, 能动量张量实质上就是一个线性变换. Andrew 和 Bob 看到的能动量张量, 不就是这个线性变换在不同的基下的表示吗?</p>
 <p data-pid="araesdk0">你现在肯定找到了一点感觉. 什么是张量? 在数学家眼中, 张量已经被抽象成了线性变换.</p>
 <p data-pid="KiiZbbI3">当然, 数学家们还可以再进一步抽象这个概念, 提取出更普遍的 universal property. 这时, 张量被定义为张量积空间中的一个元素. 具体的定义不在此赘述, 请参考相关专著. 但尽管已经抽象到那样的程度, 其背后的思想依然是不变的.</p>
 <p data-pid="E3uyzFmf">如果你通过上面的阅读理解了张量背后的思想, 再去看相关数学或物理专著上或繁杂或抽象的式子, 或许会开朗很多 :-)</p>
 <br>
 <p data-pid="Y6H5J5yl">最后引用陈维桓先生的《微分流形初步》一书中的一段话进行总结:</p>
 <blockquote data-pid="Dx1hzqp_">
  张量的概念是 G.Ricci 在19世纪末提出的. G.Ricci 研究张量的目的是为几何性质和物理规律的表达寻求一种在坐标变换下不变的形式. 他所考虑的张量是如同向量的分量那样的数组, 要求它们在坐标变换下服从某种线性变换的规律. 近代的理论已经把张量叙述成向量空间及其对偶空间上的多重线性函数, 但是用分量表示张量仍有它的重要性, 尤其是涉及张量的计算时更是如此.
 </blockquote>
 <p data-pid="cFAvj1-0">[*] 如果还定义了内积/缩并等运算, 还可以由张量迅速得到一些不变量. 此时会涉及对偶空间(因为内积本质是个线性函数)等概念, 进而涉及张量的协变和逆变. 为了行文简洁, 我在正文中没有提及这些概念. 但它们本质上和正文所说没有区别.</p>
</body>