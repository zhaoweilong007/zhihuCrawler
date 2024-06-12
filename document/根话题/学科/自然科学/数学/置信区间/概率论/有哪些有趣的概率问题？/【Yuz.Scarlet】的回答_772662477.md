# 有哪些有趣的概率问题？
- 点赞数：16438
- 更新时间：2019年09月30日15时51分03秒
- 回答url：https://www.zhihu.com/question/330408241/answer/772662477
<body>
 <p data-pid="GM2O3bAq">有一个很反直觉的问题，叫作百囚徒挑战。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-e98dcafa3325319fd2cec587ca8e8d0c_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="440" data-rawheight="341" data-original-token="v2-e98dcafa3325319fd2cec587ca8e8d0c" data-default-watermark-src="https://picx.zhimg.com/50/v2-af28ec7a4c19ad2a6c40beef56599ac0_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="440" data-original="https://picx.zhimg.com/v2-e98dcafa3325319fd2cec587ca8e8d0c_r.jpg?source=1940ef5c">
  <figcaption>
   图片来自维百
  </figcaption>
 </figure>
 <blockquote data-pid="q3RlLTP7">
  监狱决定给关押的100名囚徒一次特赦的机会，条件是囚徒通过一项挑战。所有囚徒被编号为1-100，对应他们编号的100个号码牌被打乱顺序放在了100个抽屉里。每个囚徒需要从所有抽屉里打开至多半数(50个)，并从中找出对应自己编号的号码牌。如果找到了则该名囚徒的任务成功。所有囚徒会依次单独进入挑战室完成任务，并且从第一个囚徒进入挑战室开始，直到所有囚徒结束挑战为止囚徒之间任何形式的交流都是禁止的。当一名囚徒完成任务后，挑战室会被恢复为他进入之前的样子（号码牌当然也放回原来的抽屉里）。在这100名囚徒中，任意一名囚徒的失败都会导致整个挑战失败，只有当所有囚徒全部成功完成任务时，他们才会统一得到特赦的机会。最后，在开始挑战之前，监狱给了所有囚徒一个月时间商量对策。那么，囚徒究竟有多大的几率得到释放？
 </blockquote>
 <p data-pid="gija3e2J">A.小于0.0000000000000000000000000001%<br>
  B.大于0.0000000000000000000000000001%小于0.1%<br>
  C.大于0.1%小于30%<br>
  D.大于30%</p>
 <blockquote data-pid="JSydkfBr">
  假设囚徒的数量趋于无穷大，那么囚徒获得释放的几率趋于多少？
 </blockquote>
 <p data-pid="kIYdcHN6">A.趋于0<br>
  B.趋于1<br>
  C.趋于(0,1)内的某个实数<br>
  D.在某个区间内振荡</p>
 <hr>
 <p data-pid="yE58fqW6">之所以反直觉，是因为一眼看上去囚徒获胜的概率小的可怜，因为假如每个人的任务都是一次独立实验，那么他完成任务的概率只有 <img src="https://www.zhihu.com/equation?tex=1%2F2" alt="1/2" eeimg="1"> ，再乘以基数 <img src="https://www.zhihu.com/equation?tex=100" alt="100" eeimg="1"> 人最终的成功概率约等于 <img src="https://www.zhihu.com/equation?tex=10%5E%7B-30%7D" alt="10^{-30}" eeimg="1"> ，当人数趋于无穷时这个数值还会继续缩小直到无限趋于0.这样才对。</p>
 <p data-pid="pwrZbczE">但是实际上，这个题目并不是单纯的概率题。比如考虑最简单的情况，囚徒只有两人，那么他们每人只能从两个抽屉里选择一个抽屉打开，这时他们被释放的概率是1/4吗？不是。如果两个囚徒打开不同的抽屉，那么他们被释放的概率是1/2，反之如果两个囚徒打开同一个抽屉，那么他们被释放的概率是0.</p>
 <p data-pid="phVtE3JP">因此，只要囚徒采取了正确的策略，那他们获胜的概率很大，在人数为100人时，仍旧有 <img src="https://www.zhihu.com/equation?tex=30%5C%25" alt="30\%" eeimg="1"> 那么多。同时，当人数趋于无穷，这个概率不会变得更小，而是趋近于 <img src="https://www.zhihu.com/equation?tex=1-%5Cln+2" alt="1-\ln 2" eeimg="1"> .</p>
 <h2>解答环节。</h2>
 <p data-pid="rRgBkdjZ">不妨假设抽屉里的号码牌是随机放置的（否则，囚徒可以自己在脑内打乱所有抽屉的位置以达到同样的效果※），之后囚徒首先为抽屉编号，例如从左上到右下依次编号。而每个囚徒的策略，就是首先打开与自己编号相同的抽屉，从中取出号码牌，并打开号码牌所对应的抽屉。之后，重复此过程，直到找到自己的号码牌，或者50个抽屉的机会用完。</p>
 <p data-pid="FqGk28Zv">例如，29号囚徒首先打开了29号抽屉，里面放着51号的号码牌，于是他打开51号抽屉，里面放着18号的号码牌，于是他打开18号的抽屉，里面放着29号的号码牌，他完成了任务。（只是随便举例）（※※）</p>
 <p data-pid="kuB9f5XJ">为了计算成功概率，首先对这个游戏进行化简。将抽屉与号码牌的对应关系视为一个映射，例如 <img src="https://www.zhihu.com/equation?tex=f%2829%29%3D51" alt="f(29)=51" eeimg="1"> ， <img src="https://www.zhihu.com/equation?tex=f%2851%29%3D18" alt="f(51)=18" eeimg="1"> ，那么从任意一个数出发，不停地迭代计算，最终总能回到这个数。通过这种方法， <img src="https://www.zhihu.com/equation?tex=1%5Csim+100" alt="1\sim 100" eeimg="1"> 的数字被分割为了一些“圆环”，而每个圆环的长度不一，比如 <img src="https://www.zhihu.com/equation?tex=3%5Cto+3" alt="3\to 3" eeimg="1"> 的长度就是1，意味着3号抽屉里装着3号号码牌， <img src="https://www.zhihu.com/equation?tex=29%5Cto+51%5Cto18%5Cto29" alt="29\to 51\to18\to29" eeimg="1"> 的长度是3；这时，我们发现，<b>所有囚徒能够通过挑战，当且仅当所有圆环的长度不超过50</b>，此时显然每个囚徒都能在50次以内找到自己的号码牌，反之如果有一个圆环长度超过50，那么这个圆环上的所有人都会失败。</p>
 <p data-pid="vVloAzyh">接下来就是计算了。比起计算“所有圆环的长度不超过50”的概率，“有一个圆环长度超过50”的概率更容易计算。因为“有一个圆环的长度是51”和“有一个圆环的长度是52”之类的事件是彼此互斥的（圆环的长度总和是100），所以总概率就是它们的和。而对于 <img src="https://www.zhihu.com/equation?tex=m%5Cgeq+51" alt="m\geq 51" eeimg="1"> ，只需先选出 <img src="https://www.zhihu.com/equation?tex=m" alt="m" eeimg="1"> 个元素，将它们构成一个环，之后再将剩下的元素随机打乱即可唯一地得到一种分布。具体地说，所有形成长度为 <img src="https://www.zhihu.com/equation?tex=m" alt="m" eeimg="1"> 环的映射种类为 <img src="https://www.zhihu.com/equation?tex=C_%7B100%7D%5Em%5Ccdot+%28m-1%29%21%5Ccdot+%28100-m%29%21%3D100%21%2F+m" alt="C_{100}^m\cdot (m-1)!\cdot (100-m)!=100!/ m" eeimg="1"> ，全排列个数为 <img src="https://www.zhihu.com/equation?tex=100%21" alt="100!" eeimg="1"> ，因此这个概率等于 <img src="https://www.zhihu.com/equation?tex=P%28m%29%3D1%2Fm" alt="P(m)=1/m" eeimg="1"></p>
 <p data-pid="U3qRPlzj">综上，所有圆环长度不超过50的概率等于 <img src="https://www.zhihu.com/equation?tex=P%3D1-%5Csum_%7Bm%3D51%7D%5E%7B100%7D+%5Cfrac%7B1%7D%7Bm%7D%5Capprox+0.312" alt="P=1-\sum_{m=51}^{100} \frac{1}{m}\approx 0.312" eeimg="1"> ，这个概率就是囚徒被释放的概率。当囚徒人数趋于无穷大时，概率趋向于 <img src="https://www.zhihu.com/equation?tex=P%28N%29%3D1-%5Csum_%7Bm%3DN%2B1%7D%5E%7B2N%7D+%5Cfrac%7B1%7D%7Bm%7D%5Cto1-%5Cln+2" alt="P(N)=1-\sum_{m=N+1}^{2N} \frac{1}{m}\to1-\ln 2" eeimg="1"></p>
 <hr>
 <p data-pid="O3UqWx2c">不那么严密地说，这个策略的关键点在于让所有囚徒尽可能地一起成功或者一起失败，因此所有玩家的任务不再是独立的，一旦有一个人成功，他所翻出的号码牌对应的人也一定会成功，同时只要有一半的人成功，剩下的人都一定成功。</p>
 <p data-pid="-slxcoZR">通过计算可得，在之前所有人都成功的条件下，下一个人成功的概率依次为<br><img src="https://www.zhihu.com/equation?tex=50%5C%25%2C75.25%5C%25%2C89.26%5C%25%2C95.63%5C%25%2C%E2%80%A6%E2%80%A6" alt="50\%,75.25\%,89.26\%,95.63\%,……" eeimg="1"></p>
 <p data-pid="m8sbPmBV">这个策略被证明最优。</p>
 <hr>
 <p data-pid="4HJBrAjt">※否则，囚徒可以自己在脑内打乱所有抽屉的位置以达到同样的效果<br>
  因为在挑战开始之前有一个月时间商讨对策，所以囚徒可以在这段时间内约定好随机打乱抽屉的方式。另外，如果担心囚徒的策略被狱警知晓，也可以考虑迪菲赫尔曼密钥交换（前提是P≠NP），这是一种大声说悄悄话的方法，具体做法是利用非对称算法，使得两个没有任何共同知识的人知晓一个共同的关键词，并且任何窃听者无法通过两人的对话推理出这个关键词，之后这个关键词可以作为加密的秘钥使用。</p>
 <p data-pid="llvchjQr">※※另外直观地解释一下这个策略的含义，这里以10个人的情况举两个例子。</p>
 <p data-pid="CgLdu5Hx"><br>
  假如说10个抽屉与号码牌的对应关系如下：<br>
  1号抽屉→5号牌<br>
  2号抽屉→7号牌<br>
  3号抽屉→3号牌<br>
  4号抽屉→2号牌<br>
  5号抽屉→9号牌<br>
  6号抽屉→10号牌<br>
  7号抽屉→4号牌<br>
  8号抽屉→8号牌<br>
  9号抽屉→1号牌<br>
  10号抽屉→6号牌</p>
 <p data-pid="tnYm5SAD">1号囚徒首先打开自己的编号对应的抽屉即1号抽屉，取出5号号码牌，接着打开5号抽屉，取出9号号码牌，接着打开9号抽屉，取出1号号码牌，完成任务；<br>
  2号囚徒首先打开自己的编号对应的抽屉即2号抽屉，取出7号号码牌，接着打开7号抽屉，取出4号号码牌，接着打开4号抽屉，取出2号号码牌，完成任务；<br>
  ……<br>
  10号囚徒首先打开自己的编号对应的抽屉即10号抽屉，取出6号号码牌，接着打开6号抽屉，取出10号号码牌，完成任务；</p>
 <p data-pid="iyd1shgU">就这样，在这种对应关系下，所有囚徒都完成了任务；</p>
 <p data-pid="_TZolMRX">假如说10个抽屉与号码牌的对应关系如下： <br>
  1号抽屉→2号牌<br>
  2号抽屉→8号牌<br>
  3号抽屉→5号牌<br>
  4号抽屉→6号牌<br>
  5号抽屉→1号牌<br>
  6号抽屉→4号牌 <br>
  7号抽屉→10号牌<br>
  8号抽屉→9号牌<br>
  9号抽屉→3号牌<br>
  10号抽屉→7号牌</p>
 <p data-pid="ItpA0DMt">1号囚徒打开1号抽屉，取出2号号码牌；打开2号抽屉，取出8号号码牌；打开8号抽屉，取出9号号码牌；打开9号抽屉，取出3号号码牌；打开3号抽屉，取出5号号码牌；<b>任务失败</b><br>
  4号囚徒打开4号抽屉，取出6号号码牌；打开6号抽屉，取出4号号码牌；<b>任务成功</b></p>
</body>