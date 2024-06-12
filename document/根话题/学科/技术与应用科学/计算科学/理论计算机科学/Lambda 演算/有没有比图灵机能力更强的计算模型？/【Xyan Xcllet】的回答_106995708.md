# 有没有比图灵机能力更强的计算模型？
- 点赞数：5098
- 更新时间：2018年09月16日21时53分01秒
- 回答url：https://www.zhihu.com/question/21579465/answer/106995708
<body>
 <p data-pid="riyS8w0b">有，而且还不少。他们被称为<b>超计算</b>（Hyper computation）模型。</p>
 <p data-pid="p9DiZDzc">超计算，是一个研究比图灵机计算能力更强的计算能力的计算机器的理论计算机科学分支。</p>
 <p data-pid="lWy0FqnX">主要有以下部分模型：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="YwyNquLw">A.谕示机. （Oracle Machine） <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="GIS_bGVI">带“黑箱”的图灵机。由图灵本人亲自提出，“黑箱”就是一个谕示，经过一个谕示就可以得到一个问题的判定结果。所有 Hypercomputation 的“原型机”。后来的大部分计算模型都是基于谕示机的概念，将其他特性引入图灵机中使其不受先前的计算能力限制而得到新的模型。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="D4R1g61c">B.Blum–Shub–Smale machine. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="75WoZxQB">可以在实数域内计算并可以储存无限精度的实数（而经典图灵机只能储存可计算数。）而它对应的计算时间是离散的。但是，如果图灵-丘奇论题在我们宇宙中为真，那么宇宙中就不存在实数，只存在可计算数。</p>
 <p data-pid="LfZ8X3lX">P.S. Blum–Shub–Smale machine 的配置是一个四元组： <img src="https://www.zhihu.com/equation?tex=%28k%2Cr%2Cw%2Cx%29" alt="(k,r,w,x)" eeimg="1"> ，其中 k 是当前执行指令的数量, r 和 w 是复制寄存器（copy registers）， x 是存储在 BSS machine 所有寄存器内的内容。机器的计算由配置 <img src="https://www.zhihu.com/equation?tex=%280%2C0%2C0%2Cx%29" alt="(0,0,0,x)" eeimg="1"> 开始，在 k = N （N 为 indexed）时结束计算。而 x 的最终内容被认为是该机器的输出。</p>
 <p data-pid="SInqt30y">更加具体地，我们假设 R 是一个 ring，BSS machine 在 R 上。 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BN%7D+%3D%5Cleft+%5C%7B+1%2C...%2CN+%5Cright+%5C%7D" alt="\mathcal{N} =\left \{ 1,...,N \right \}" eeimg="1"> 是 BSS machine 的节点（nodes）集。 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BS%7D" alt="\mathcal{S}" eeimg="1"> 为机器的状态空间， <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BS%5Ctimes+N%7D" alt="\mathcal{S\times N}" eeimg="1"> 为机器的 full space。而一个函数 H 来自 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BS%5Ctimes+N%7D%5Crightarrow%5Cmathcal%7BS%5Ctimes+N%7D" alt="\mathcal{S\times N}\rightarrow\mathcal{S\times N}" eeimg="1"> ，且映射至每一对 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+%5Ceta%2Cx+%5Cright%29%5Crightarrow%5Cleft%28+%5Ceta%5E%7B%27%7D+%2Cx%5E%7B%27%7D+%5Cright%29" alt="\left( \eta,x \right)\rightarrow\left( \eta^{'} ,x^{'} \right)" eeimg="1">。这个函数 H 可以定义 BSS machine 的停机集 <img src="https://www.zhihu.com/equation?tex=%5COmega+_%7BM%7D" alt="\Omega _{M}" eeimg="1"> 。</p>
 <p data-pid="jVrKIbgf">一个函数 <img src="https://www.zhihu.com/equation?tex=%5Cpi_%7B%5Cmathcal%7BN%7D%7D%3A%5Cmathcal%7BN%5Ctimes+S%5Crightarrow+N%7D" alt="\pi_{\mathcal{N}}:\mathcal{N\times S\rightarrow N}" eeimg="1"> 为在 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BN%7D" alt="\mathcal{N}" eeimg="1"> 上的 full spaces 的射影（projection）。然后其节点序列 <img src="https://www.zhihu.com/equation?tex=1%2C%5Ceta%5E%7B1%7D%2C...%2C%5Ceta%5E%7Bk%7D" alt="1,\eta^{1},...,\eta^{k}" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=%5Ceta%5E%7Bk%7D%3D%5Cpi_%7B%5Cmathcal%7BN%7D%7D%5Cleft%28+z%5E%7Bk%7D+%5Cright%29" alt="\eta^{k}=\pi_{\mathcal{N}}\left( z^{k} \right)" eeimg="1"> 。如果在时间 <img src="https://www.zhihu.com/equation?tex=T" alt="T" eeimg="1"> 内 <img src="https://www.zhihu.com/equation?tex=u%5Cin%5Cmathcal%7BS%7D" alt="u\in\mathcal{S}" eeimg="1"> 且满足 <img src="https://www.zhihu.com/equation?tex=z%5E%7BT%7D%3D%5Cleft%28N%2Cu+%5Cright%29" alt="z^{T}=\left(N,u \right)" eeimg="1"> 则有限序列 <img src="https://www.zhihu.com/equation?tex=z%5E%7B0%7D%2C...%2Cz%5E%7BT%7D" alt="z^{0},...,z^{T}" eeimg="1"> 为 BSS machine 的停机计算。而 BSS machine 的停机时间 <img src="https://www.zhihu.com/equation?tex=T_%7BM%7D%5Cleft%28+x+%5Cright%29" alt="T_{M}\left( x \right)" eeimg="1"> 为：</p>
 <p data-pid="MFDyD6S0"><img src="https://www.zhihu.com/equation?tex=T_%7BM%7D%5Cleft%28+x+%5Cright%29%3D%5Cmathrm%7Bmin%7D%5Cleft%5C%7B+T_%7Bi%7D%7Cz%5E%7BT_%7Bi%7D%7D+%3D%5Cleft%28+N%2Cu_%7Bi%7D+%5Cright%29%5Cright%5C%7D" alt="T_{M}\left( x \right)=\mathrm{min}\left\{ T_{i}|z^{T_{i}} =\left( N,u_{i} \right)\right\}" eeimg="1"></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="82JqLZhH">C.量子计算机.</p>
 <p data-pid="7gskcjav">在量子物理中，对一个系统状态的完整描述需要使用复数,即量子系统的状态是一个位于 <img src="https://www.zhihu.com/equation?tex=2%5E%7Bn%7D" alt="2^{n}" eeimg="1"> 维向量空间中的一个点。右括向量 <img src="https://www.zhihu.com/equation?tex=%7Cx%5Crangle+" alt="|x\rangle " eeimg="1"> 意味着 x 是一个(纯)量子态。与这个量子系统相关的希尔伯特空间是 <img src="https://www.zhihu.com/equation?tex=2%5E%7Bn%7D" alt="2^{n}" eeimg="1"> 个量子态作为基向量的复向量（complex vector space）空间，系统在任何时候的状态由这个希尔伯特空间中的一个单位长度向量表示。</p>
 <p data-pid="pUBIpyZF">同时系统的叠加态可表示为： <img src="https://www.zhihu.com/equation?tex=%5Csum_%7Bi%3D0%7D%5E%7B2%5E%7Bn%7D-1%7D%7Ba_%7Bi%7D%7CS_%7Bi%7D%5Crangle+%7D" alt="\sum_{i=0}^{2^{n}-1}{a_{i}|S_{i}\rangle }" eeimg="1"></p>
 <p data-pid="FpbrdodS">其中振幅（amplitudes） <img src="https://www.zhihu.com/equation?tex=a_%7Bi%7D" alt="a_{i}" eeimg="1"> 为满足 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7Bi%7D%7Ca_%7Bi%7D%7C%5E%7B2%7D%3D1" alt="\Sigma _{i}|a_{i}|^{2}=1" eeimg="1"> 的复数，每一个 <img src="https://www.zhihu.com/equation?tex=%7CS_%7Bi%7D%5Crangle+" alt="|S_{i}\rangle " eeimg="1"> 为希尔伯特空间中的一个基向量。</p>
 <p data-pid="gzm4-KMd">为了使用物理系统进行计算，我们必须能够改变系统的状态。量子力学定律只允许状态向量的幺正转换。一个幺正矩阵的共轭转置（conjugate transpose）等于它的逆矩阵，并且要求状态变换由酉矩阵来表示，这就保证了得到所有可能结果的概率之和为1。同时量子电路(和量子计算机)的定义只允许局部幺正转换；也就是说，对固定数目的比特进行酉（幺正）变换。</p>
 <p data-pid="u9zUlOQI">值得注意的是：量子计算机的计算能力在本质上与图灵机等价，但在计算复杂度上可以优于图灵机（如果这也算是计算能力的话。）。现实中的量子计算机的计算能力可以在多项式时间内解决 BQP ，并没有想象中的那么强。</p>
 <p data-pid="Rn30KW7Y">但是，尽管目前可以通过结构与算法优化使计算能力不断提高，<b>但量子计算机的计算能力还是有真正的上限的：即布莱梅曼极限</b>（Bremermann's limit）。在量子物理框架下，我们宇宙中所有物质的计算能力都不可能超过每千克 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7Bc%5E%7B2%7D+%7D%7B%5Chbar+%7D+" alt="\frac{c^{2} }{\hbar } " eeimg="1"> bits/s（h为普朗克常数，c为光速）<b>这也是量子计算机真正无法逾越的计算速度极限。</b>而且你也不可能真正地达到该极限，因为所需能量会使你的计算机直接坍塌成一个黑洞。</p>
 <p data-pid="izTOZmFo">最后值得一提的是，只要对量子力学中算符的线性要求做些微的放宽，例如，温伯格引入的非线性算符（这些工作出现在温伯格试图研讨的所谓非线性量子力学中）得到允许，则我们可以在新型量子计算机上用多项式时间求解 PSPACE 完全问题（ NP 完全问题自然不在话下）。</p>
 <p data-pid="u2zMOLN7"><b>但是： </b>由于非线性的引入一定会同时容许超光速通信和违背热力学第二定律的结果，所以提议基本是不可行的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="XEj2jE22">D.相对论时间效应 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="av1mJeBK">在相对论中，不同物体参考系的时间流逝不一样，如果我们能让计算机参考系在时间流逝上快很多，那我们也变相得解决了这个问题。</p>
 <p data-pid="KxEQyvYQ">一台计算机留在地球上让它做一个复杂的计算问题，然后操作者登上一个航天器，加速到接近光速，一段时间后减速再返回地球。根据：</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-7a04a00281d930dc7d8abbcf6b0eebf6_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="124" data-rawheight="56" data-original-token="v2-7a04a00281d930dc7d8abbcf6b0eebf6" class="content_image" width="124">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="7AC0ZNHF"><img src="https://www.zhihu.com/equation?tex=%5CDelta+t" alt="\Delta t" eeimg="1">为地球计算机的时间，<img src="https://www.zhihu.com/equation?tex=%5CDelta+%5Ctau+" alt="\Delta \tau " eeimg="1">为操作者的时间，c 为光速。 如果操作者可以找到电脑并且它还在运行的话，就可以知道那个复杂问题的答案了。</p>
 <p data-pid="GdoHouG9">不过这要使计算机进行指数级的加速，必须让速度指数级接近于光速，这也意味着所需要的能量指数级增长，而因为能量密度不可能大于黑洞，这也意味着计算机的大小必须指数级增长，某种程度上来说就是 EXPSPACE ，这是不可取的(建造指数级数量的计算机同时计算可达到同样效果)。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="ngTIGAiU">E. 封闭类时曲线计算机. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="82GSHiBm">依靠广义相对论中拥有闭合时间曲线的封闭类时曲线 (closed timelike curve, CTC) 时空来计算<b>—</b>给计算机配一台时间机器。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="3Bzjz729">在计算理论中，人们比较感兴趣的问题之一是，NP 问题，比如哈密尔顿回路问题（判断一个图是否有圈经过每个顶点恰好一次），是否可以在多项式时间内被解决。然而即使是引入了量子计算后，这个问题也一直悬而未决。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="C-ylXFEJ">20世纪后期，学者们开始探讨是否存在在计算能力上可以超越量子计算的模型以及它们的物理实现可能性。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="IkCwsH0b">物理学家 Deutsch 提出，如果我们在时间本身上做手脚呢？</p>
 <p data-pid="Y_NFPj0p">于是就有了利用封闭类时曲线来进行加速计算的提议。</p>
 <p data-pid="EoDi9bB7">但是，利用 closed timelike curve 来做时间旅行的话，就不得不面对一个悖论，即<b>祖父悖论。</b></p>
 <p data-pid="U8r9lhfB">目前解决祖父悖论的方法有很多，封闭类时曲线计算机采用的是这个（虽然有很多科学家并不认同这种解决方法。）：</p>
 <p data-pid="VkdYxiHa">你回到过去杀掉祖父的可能性为 50%，于是你祖父生下你的父母可能性也为 50%，这样你回到过去的可能性就是 50%，如此循环。于是你和你的祖父其实都是“存在”和“不存在”的叠加，可能性各是 50% （ <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B1%7D%7B2%7D" alt="\frac{1}{2}" eeimg="1"> ）。</p>
 <p data-pid="KUlkULAD">那么为什么是 50% 的可能性呢？试想，如果你有 1/3 （ <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B1%7D%7B3%7D" alt="\frac{1}{3}" eeimg="1"> ）的可能性回去杀掉祖父，那么他生下你父母的可能性就变为 2/3，于是你回到过去杀人的可能性就是 2/3（ <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B2%7D%7B3%7D" alt="\frac{2}{3}" eeimg="1"> ），而不是我们所假设的 1/3。这样就出现了因果不连续。大自然不允许这样的情况存在（出现悖论），所以它强迫你必须以 50% 的可能性存在。也就是说，如果你进行了“回到过去杀掉祖父”这一行动，那么大自然说，你的存在必然是 50% 的可能。在量子机制框架下，CTC是自洽的。简单的解释下，就是这个世界是个概率空间，以马尔可夫过程的方式进行运作，如果每次新的概率分布和原来的一样，马尔可夫过程的稳定分布则是一组解。那么，这样就可以避免祖父悖论了。没有任何矛盾。</p>
 <p data-pid="BQliwaah">（补充内容）也就是说，如果我们让 <img src="https://www.zhihu.com/equation?tex=%7C%5Cvarphi+%5Crangle+" alt="|\varphi \rangle " eeimg="1"> 为"更年轻"版载体粒子的初始态，让 <img src="https://www.zhihu.com/equation?tex=%5Chat%7B%5Crho+%7D" alt="\hat{\rho }" eeimg="1"> 为与其互动的"更老"版载体粒子的密度算符。然后进入一区域这两个粒子进行相互作用的联合密度算符是 ：</p>
 <p data-pid="KSD-EUQV"><img src="https://www.zhihu.com/equation?tex=%7C%5Cvarphi+%5Crangle+%5Clangle%5Cvarphi+%7C%5Cotimes+%5Chat%7B%5Crho+%7D" alt="|\varphi \rangle \langle\varphi |\otimes \hat{\rho }" eeimg="1"></p>
 <p data-pid="1dSwP82K">而两粒子在相互作用后的密度算符为： <img src="https://www.zhihu.com/equation?tex=U%5Cleft+%28+%7C%5Cvarphi+%5Crangle+%5Clangle%5Cvarphi+%7C%5Cotimes+%5Chat%7B%5Crho+%7D+%5Cright+%29U%5E%7B%5Cdagger+%7D" alt="U\left ( |\varphi \rangle \langle\varphi |\otimes \hat{\rho } \right )U^{\dagger }" eeimg="1"></p>
 <p data-pid="wrSkRYXg">而量子一致性条件要求, 当它离开交互区域时, 更年轻版的粒子的密度算子(符)与它进入交互区域时的更老版相同：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-7e6731c604aaf202520870def8bed2d8_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="205" data-rawheight="23" data-original-token="v2-7e6731c604aaf202520870def8bed2d8" class="content_image" width="205">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="1fzrJJd7">这个 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B1%7D%7B2%7D+" alt="\frac{1}{2} " eeimg="1">为 Fixed-point，即不动点。这个不动点确保了自然的运行依然符合因果定律。而且大自然会以某种神奇的机制自动的寻找这个“不动点”，以使整个系统因果连续（历史自治）。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="n-PGuBXI">封闭类时曲线计算机具体的计算原理是这个："莎士比亚戏剧"。</p>
 <p data-pid="Bcpl-V8H">一个人抄下莎士比亚全集，然后回到过去将其交给莎士比亚本人。</p>
 <p data-pid="eN90t9Oc">于是莎士比亚全集就这么凭空产生了。</p>
 <p data-pid="xXzXNedM">原因是，为了保证“那个人”能够“阅读到”莎士比亚全集（否则他不可能知道有这么个东西），它必须足够出名。而既然他已经带着它回到过去，那么为了维护因果连续，大自然这个系统为我们“写”了一个足够出名的东西出来。这个东西就是莎士比亚全集，即不动点。</p>
 <p data-pid="-teNMT8P">当然，系统同时也曾经尝试过无数其他的“作品”，甚至一些不成话的乱码。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="KAeEGZ76">这样一台计算机，能够随时进行指向过去的时间旅行。并且，它能够利用我前面提到的封闭类时曲线（CTC）来解决一些一般情况下非常难以解决的问题。</p>
 <p data-pid="RFsFo8na">具体地，比如说“大数分解”问题。</p>
 <p data-pid="cQ_zo0k8">首先，我得给它一个大数，并期望它输出这个数的任一个因数（除了1）。一般来说，普通计算机也许会在运行100万年以后给出答案（如果它一直不死机），而封闭类时曲线计算机却能在短短1秒钟之内（也许更短）给出答案。</p>
 <p data-pid="LD1RlBq0">它怎样工作呢？首先，在输入数据 A 之后，它记下这个时刻 t ，同时，它得到了一个神秘的输入数据 x。然后它检查“ x 是否是 A 的因数 ”。如果不是，则 x = x+1，同时如果 x &gt; A ，则 x = 2。之后输出 x，并利用封闭类时曲线进行时间旅行回到 t 时刻，将 x 输入自身。</p>
 <p data-pid="uYStgvSM">很明显，这是一个循环，只不过这个循环运行在时间上。而大自然为了维护因果连续，会不断的做这个循环，寻找这个让因果连续和历史自治的不动点，即 "x 是 A 的因数" ；直到输入的 x 与输出的 x 相同为止，即直到 x 确实是 A 的因数为止。所以在我们看来，这台电脑会在1秒钟内直接输出我们想要的 x。</p>
 <p data-pid="8-h56ua8">这就相当于是这个时间机器的时间循环帮我们计算了所有可能性，在一秒钟内的不断循环计算之内给出了答案。也就是说，如果封闭类时曲线存在，计算机可以“强迫”自然去解决复杂的组合问题，仅为了让宇宙的历史保持一致(比如，去阻止类似祖父悖论这样的东西的出现)。而且在这些复杂的组合问题里面就包括了 PSPACE（包括 PSPACE -complete ， NP 类型，也包括了 NP-complete ），甚至可能包涵图灵不可计算问题。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="--Acy-sV">另外，记<img src="https://www.zhihu.com/equation?tex=P_%7BCTC%7D+" alt="P_{CTC} " eeimg="1"> , 为允许封闭类时曲线的多项式时间可计算的问题。<img src="https://www.zhihu.com/equation?tex=BQP_%7BCTC%7D+" alt="BQP_{CTC} " eeimg="1"> 是结合量子计算机时多项式时间可计算的问题。它们俩能解决地的计算问题级别是等价的：都可以解决PSPACE。</p>
 <p data-pid="3QpaO0R3">如果 Deutsch 的封闭类时曲线可以允许计算任意长度的字符串，则封闭类时曲线计算机可以判定停机问题。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="WHm6MhHk">P.S. 补充说明，以上的 CTC 计算机的计算原理和计算能力是基于 Deutsch 的模型。除此之外，学术界还存在着其他解决祖父悖论的方法，在此之上提出了另一种 CTC 计算机模型。</p>
 <p data-pid="ArTFcGMR">2009年，另一位物理学家 Seth Lloyd 给出了利用另一种 CTC 模型进行计算的方法，该模型中封闭类时曲线的存在是基于量子态隐形传输和事后选择（post-selection）算法。与 Deutsch 的封闭类时曲线不同的是，Deutsch 的模型会导致相关性破坏效应，即时间旅行者从 Deutsch 的 CTC 出来进入的宇宙，与他在未来的退出（即他之前所在的那个宇宙）无关。相比之下,后选择 CTC 保持了相关性,这样时间旅行者回到他记忆中的同一个宇宙。</p>
 <p data-pid="6tdm81fw">Seth Lloyd 的模型解决祖父悖论的方式如下：</p>
 <p data-pid="lqHVF-ll">运用 Post-selection 算法能够确保某一特定类型的量子信息态进行隐形传输，而将其他量子信息过滤掉。只有经“后选择”算法认定传输前后能自相一致的量子信息态，才有资格得到这种“通行证”，进行隐形传输，形成一个自治、不产生矛盾的环境状态。而且 Post-selection 会决定只有有限类型的量子态能被远距传输，即在远距传输前原始物体的量子态也被局限了，由于时间旅行的结果属于有限概率，祖父悖论将不可能发生。</p>
 <p data-pid="NxbLRHvx">但是，Seth Lloyd 的模型会削弱封闭类时曲线的计算能力。在 Deutsch 模型中，无论是配经典图灵机还是量子图灵机，都可以解决全部 PSPACE。而在 Seth Lloyd 模型中，配经典图灵机只可以解决 <img src="https://www.zhihu.com/equation?tex=BPP_%7Bpath%7D" alt="BPP_{path}" eeimg="1"> ，配量子图灵机可以解决 PP。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UNgOaRo_">F.我们熟知的神经网络：前提是具有无限精度。 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="pnJZgzP9">在 H. Siegelmann 的框架下，同步演化的处理器连接成的有限大小的神经网络由处理器的同步网络组成，其架构由一个一般性的有向图描述。输入字符通过 M 个输入通道传输，每次传一个。输出端是一个字符流，每个字符由 p 个值表示。图的节点称为神经元。每个神经元把一个单变量函数作用到所有神经元的激活值和外部输入的仿射组合上，以此来更新自己的激活值。</p>
 <p data-pid="D31bz4Tp">具体地，更新方式是：</p>
 <p data-pid="-q9qdQzP"><img src="https://www.zhihu.com/equation?tex=x_i%28t%2B1%29+%3D+%5Csigma%5Cleft%28%5Csum_%7Bj%3D1%7D%5EN+a_%7Bij%7D+x_j%28t%29+%2B+%5Csum_%7Bj%3D1%7D%5EM+b_%7Bij%7D+u_j%28t%29+%2B+c_i%5Cright%29%5C%2C%5C%2C%2C%5C%2C%5C%2Ci%3D1%2C2%2C3%2C..." alt="x_i(t+1) = \sigma\left(\sum_{j=1}^N a_{ij} x_j(t) + \sum_{j=1}^M b_{ij} u_j(t) + c_i\right)\,\,,\,\,i=1,2,3,..." eeimg="1"></p>
 <p data-pid="FqeVM73T">其中 <img src="https://www.zhihu.com/equation?tex=x_%7Bj%7D" alt="x_{j}" eeimg="1"> 为激活函数 （function of the activations）； <img src="https://www.zhihu.com/equation?tex=u_%7Bj%7D" alt="u_{j}" eeimg="1"> 为输入； <img src="https://www.zhihu.com/equation?tex=a_%7Bij%7D%2Cb_%7Bij%7D%2Cc_%7Bi%7D" alt="a_{ij},b_{ij},c_{i}" eeimg="1"> 为神经网络的权重。</p>
 <p data-pid="kqCbn7ya">其中 <img src="https://www.zhihu.com/equation?tex=%5Csigma" alt="\sigma" eeimg="1"> 为饱和线性函数： <img src="https://www.zhihu.com/equation?tex=%5Csigma%28x%29+%3D+%5Cbegin%7Bcases%7D+0+%5Cquad+%5Ctext%7B+if+%7D+%5C%2C%5C%2C%5C%2C+x+%3C+0%5C%5C+x+%5Cquad+%5Ctext%7B+if+%7D%5C%2C%5C%2C%5C%2C+0%5Cle+x%5Cle+1%5C%5C+1+%5Cquad+%5Ctext%7B+if+%7D+%5C%2C%5C%2C%5C%2C+x%3E1+%5Cend%7Bcases%7D" alt="\sigma(x) = \begin{cases} 0 \quad \text{ if } \,\,\, x < 0\\ x \quad \text{ if }\,\,\, 0\le x\le 1\\ 1 \quad \text{ if } \,\,\, x>1 \end{cases}" eeimg="1"></p>
 <p data-pid="QGFk82GB"><b>注意，在这里， <img src="https://www.zhihu.com/equation?tex=a_%7Bij%7D%2Cb_%7Bij%7D%2Cc_%7Bi%7D" alt="a_{ij},b_{ij},c_{i}" eeimg="1"> 都为实数而不是有理数；</b></p>
 <p data-pid="QOkETJ2t">具有实权重的神经网络将拥有超越图灵机的计算能力。</p>
 <p data-pid="qESOYNwW">可知：实权重神经网络是一个 <b><i>nonuniform </i></b>模型，它可以在多项式时间内判定 <img src="https://www.zhihu.com/equation?tex=%5Ctextrm%7BP+%2F+poly%7D" alt="\textrm{P / poly}" eeimg="1"> ;</p>
 <p data-pid="-i_Do6WW">然而目前权重神经网络是不可能做到的，因为现实中存在热力学制约和量子基本单位的制约；其实更主要的是热力学层面的限制。</p>
 <p data-pid="1W2Hn7Zr">P.S. 在生物大脑中，神经元之间的信号传递靠离子通道；当缩小神经元，可产生电信号的离子通道也会减少，噪声则会随之增多（由于离子通道太小，仅凭 thermal vibration 便可轻松打开或关闭这些通道；开或关完全是随机的，于是神经噪音便产生了）；特别地：当轴突直径为 150 至 200 纳米时，它们已经会产生大量的噪音了。</p>
 <p data-pid="lg5BMxzx">存在噪音的神经网络无限精度是不可能的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="cNNAyMxU">G.无限时间图灵机. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="PWEVQlzj">由 Joel Hamkins 和 Andy Lewis 提出。作为芝诺机的泛化模型，可以在计算任务时间内执行超限数计算步骤（例如 <img src="https://www.zhihu.com/equation?tex=%5Comega+" alt="\omega " eeimg="1">.<img src="https://www.zhihu.com/equation?tex=%5Comega+" alt="\omega " eeimg="1">+1...2<img src="https://www.zhihu.com/equation?tex=%5Comega+" alt="\omega " eeimg="1">...<img src="https://www.zhihu.com/equation?tex=%5Comega+%5E%7B2%7D+" alt="\omega ^{2} " eeimg="1">...<img src="https://www.zhihu.com/equation?tex=%5Comega+%5E%7B%5Comega+%7D+" alt="\omega ^{\omega } " eeimg="1">...<img src="https://www.zhihu.com/equation?tex=%5Cvarepsilon+_%7B0%7D+" alt="\varepsilon _{0} " eeimg="1">...）。在限定的超限序数时间内, 计算机的组态是根据所有之前的组态定义的。当机器进入一个特殊的极限状态（limit-state）时,操作带的方格将取其如下数值：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <div class="highlight">
  <pre><code class="language-text">0, if the square has settled down to 0
1, if the square has settled down to 1
1, if the square alternates between 0 and 1 unboundedly often</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="-QMAL5ZI">读写头被放回第一个操作带方格上, 然后机器从这个极限状态继续它的计算。如果在某一时刻没有 appropriate step 来执行，则该机器停机。因此, 它可以在有限的计算步骤内停机, 或无限计算步骤内停机, 或继续在超限序数时间内运行, 永不停机。</p>
 <p data-pid="BCK-qjwP">无限时间图灵机可以用 <img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"> 步骤来计算任何递归可枚举函数, 通过将其操作带上的第一个方格设置为 0, 然后开始计算函数。如果 f（n）=1 ，则第一方格字符再设置为1。具体地，如果 f（n）=1，经过<img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"> 步骤计算后其第一方格数值保留为1； 如果 f（n）=0，经过<img src="https://www.zhihu.com/equation?tex=%5Comega" alt="\omega" eeimg="1"> 步骤计算后其第一方格数值保留为0。类似的方法也计算任何递归可枚举实数。由于无限时间图灵机在计算过程中可以使用它们的全部方格, 因此，它们接受无限输入时 , 也可以产生无限输出。</p>
 <p data-pid="0qj2_OAZ">更具体地拓展，无限时间图灵机可以用 <img src="https://www.zhihu.com/equation?tex=n%5C%2C%5Ccdot%5C%2C%5Comega" alt="n\,\cdot\,\omega" eeimg="1"> 计算步骤计算 <img src="https://www.zhihu.com/equation?tex=%5CSigma_%7Bn%7D%5E%7B0%7D%5Ccup%5CPi_%7Bn%7D%5E%7B0%7D" alt="\Sigma_{n}^{0}\cup\Pi_{n}^{0}" eeimg="1"> ;</p>
 <p data-pid="2yjkcIoo">一个 relation <img src="https://www.zhihu.com/equation?tex=+%5Ctriangleleft+%5Csubseteq+A%5Ctimes+A" alt=" \triangleleft \subseteq A\times A" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BOrd%7D%5Cleft%28+A+%5Cright%29%3D%5Comega" alt="\mathrm{Ord}\left( A \right)=\omega" eeimg="1"> 可以编码一个 <img src="https://www.zhihu.com/equation?tex=x%5Cin%5Cmathbb%7BR%7D" alt="x\in\mathbb{R}" eeimg="1"> 而这样对于第 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28%5Clangle+n%2Ck+%5Crangle+%5Cright%29" alt="\left(\langle n,k \rangle \right)" eeimg="1"> 位比特来说</p>
 <p data-pid="KCImTt_E"><img src="https://www.zhihu.com/equation?tex=%7B%5Cdisplaystyle+x%3D%7B%5Cbegin%7Bcases%7D1%2C%26%7B%5Ctext%7Bif+%7D%7D%5C%2Cn%5Ctriangleleft+k%7B%5Ctext%7B+holds+%7D%7D%2C%5C%5C0%2C%26%7B%5Ctext%7Botherwise.%7D%7D%5Cend%7Bcases%7D%7D%7D+" alt="{\displaystyle x={\begin{cases}1,&amp;{\text{if }}\,n\triangleleft k{\text{ holds }},\\0,&amp;{\text{otherwise.}}\end{cases}}} " eeimg="1"></p>
 <p data-pid="Qi5eXBke"><img src="https://www.zhihu.com/equation?tex=%5Cleft%28%5Clangle.+%2C+.%5Crangle+%5Cright%29" alt="\left(\langle. , .\rangle \right)" eeimg="1"> 是一个 bijective pairing function， <img src="https://www.zhihu.com/equation?tex=n%2Ck%5Cin+A" alt="n,k\in A" eeimg="1"> ，如果 x 对应与一个良序（well-ordering） <img src="https://www.zhihu.com/equation?tex=+%5Ctriangleleft+" alt=" \triangleleft " eeimg="1"> 。则可定义良序集（set of well-ordering） <img src="https://www.zhihu.com/equation?tex=WO" alt="WO" eeimg="1"> , 而 <img src="https://www.zhihu.com/equation?tex=%5CPi_%7B1%7D%5E%7B1%7D" alt="\Pi_{1}^{1}" eeimg="1"> 可以图灵归约至 <img src="https://www.zhihu.com/equation?tex=WO" alt="WO" eeimg="1"> 而任何的 reducing computable function 是无限时间图灵机可判定的，因为 <img src="https://www.zhihu.com/equation?tex=WO" alt="WO" eeimg="1"> 是无限时间可判定的。所以 <img src="https://www.zhihu.com/equation?tex=%5CPi_%7B1%7D%5E%7B1%7D" alt="\Pi_{1}^{1}" eeimg="1"> 同样是无限时间可判定的。</p>
 <p data-pid="fPbLdd88">结论： <img src="https://www.zhihu.com/equation?tex=%5CPi_%7B1%7D%5E%7B1%7D" alt="\Pi_{1}^{1}" eeimg="1"> 是无限时间图灵机可判定的，同样 <img src="https://www.zhihu.com/equation?tex=%5CSigma_%7B1%7D%5E%7B1%7D" alt="\Sigma_{1}^{1}" eeimg="1"> 也是无限时间可判定的。</p>
 <p data-pid="b1P-bKoS">无限时间图灵机是图灵机计算时间延长至超限序数的自然延伸。该模型需要在完全连续的（不存在最小时间单位）的时间里进行计算，然而在现实中不可能做到，因为这样该机的读写头的速度会违背相对论速度极限亦或无限长度计算时间。</p>
 <p data-pid="5B080G4H">P.S. 无限时间图灵机更多的是作为可执行 supertask 的机器的“抽象描述”。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="UTiaye6l">H.模糊图灵机.（Fuzzy Turing Machine） <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="goomkbjI">模糊图灵机会采用基于模糊逻辑的模糊算法，可以在“不经意间”解决经典图灵机不能解决的“停机问题”。由 Wiedermann 提出并证明了该类型图灵机可以解决不可判定问题，允许非递归函数的计算。</p>
 <p data-pid="0aAYsaHv">模糊图灵机的计算本身只要求一个大概的分布，而不要求精确值。精确并不是必须的，从而整个计算过程并不要求离散化，至少对输入不作要求，只要在输出的时候离散化到某几个特定范畴。这样的话，由于计算精度要求带来的约束就可以放宽。</p>
 <p data-pid="467OBRcu">具体地，一个具有单向磁带的非确定性模糊图灵机是一个九元组（nonuple）：</p>
 <p data-pid="-nM-b_Dn"><img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BF%7D%3D%28Q%2CT%2CI%2C%5CDelta%2C%E2%90%A3%5C%2C%5C%2C%2Cq_%7B0%7D%2Cq_%7Bf%7D%2C%5Cmu%2C%2A%29" alt="\mathscr{F}=(Q,T,I,\Delta,␣\,\,,q_{0},q_{f},\mu,*)" eeimg="1"></p>
 <p data-pid="zgseEmHi">其中：Q 是有限状态集；T 是有限符号集；I 是一个输入符号集，其中 <img src="https://www.zhihu.com/equation?tex=I%5Csubseteq+T" alt="I\subseteq T" eeimg="1"> ; <img src="https://www.zhihu.com/equation?tex=%5CDelta" alt="\Delta" eeimg="1"> 是一个转移关系（transition relation）并且它是 <img src="https://www.zhihu.com/equation?tex=Q%5Ctimes+T%5Ctimes+Q%5Ctimes+T%5Ctimes%5Cleft%5C%7B+L%2CN%2CR+%5Cright%5C%7D" alt="Q\times T\times Q\times T\times\left\{ L,N,R \right\}" eeimg="1"> 的子集，机器所采取的每一个操作都与一个元素 <img src="https://www.zhihu.com/equation?tex=%5Cdelta%5Cin%5CDelta" alt="\delta\in\Delta" eeimg="1"> 相关联； <img src="https://www.zhihu.com/equation?tex=%E2%90%A3+%5C%2C%5Cin+T+%E2%A7%B5+I" alt="␣ \,\in T ⧵ I" eeimg="1"> 是一个空符号（blank symbol）； <img src="https://www.zhihu.com/equation?tex=q_%7B0%7D" alt="q_{0}" eeimg="1"> 为初始态； <img src="https://www.zhihu.com/equation?tex=q_%7Bf%7D" alt="q_{f}" eeimg="1"> 为末态；* 是一个 t-norm.</p>
 <p data-pid="ebSPesW3">如果 <img src="https://www.zhihu.com/equation?tex=%5Cmu" alt="\mu" eeimg="1"> 是一个从 <img src="https://www.zhihu.com/equation?tex=Q%5Ctimes+T" alt="Q\times T" eeimg="1"> 至 <img src="https://www.zhihu.com/equation?tex=Q%5Ctimes+T+%5Ctimes%5Cleft%5C%7B+L%2CN%2CR+%5Cright%5C%7D" alt="Q\times T \times\left\{ L,N,R \right\}" eeimg="1"> 的部分函数 （partial function）而 T 是一个 Q 的模糊子集，则该模型变为确定性模糊图灵机。</p>
 <p data-pid="j2-Rm0GU">模糊图灵机所接受的模糊语言的模糊集定义如下：</p>
 <p data-pid="tMridAqR"><img src="https://www.zhihu.com/equation?tex=L%28%5Cmathscr%7BF%7D%29%3D%5Cleft%5C%7B+%28w%2Ce%28w%29%29+%7C+w%5C%2C+%5Cmathrm%7Bis%5C%2C%5C%2Caccepted%5C%2C%5C%2Cby%5C%2C%5C%2C%5Cmathscr%7BF%7D%5C%2C%5C%2Cwith%5C%2C%5C%2Cplausibility%5C%2C%5C%2Cdegree%7D%5C%2C%5C%2Ce%28w%29%5Cright%5C%7D" alt="L(\mathscr{F})=\left\{ (w,e(w)) | w\, \mathrm{is\,\,accepted\,\,by\,\,\mathscr{F}\,\,with\,\,plausibility\,\,degree}\,\,e(w)\right\}" eeimg="1"></p>
 <p data-pid="SZ-AfOKs">以 <img src="https://www.zhihu.com/equation?tex=%5CPhi" alt="\Phi" eeimg="1"> 来表示模糊图灵机可计算的 t-norms；并且： <img src="https://www.zhihu.com/equation?tex=%5CPhi%3D%5CPi_%7B1%7D%5E%7B0%7D%5Ccup+%5CSigma_%7B1%7D%5E%7B0%7D" alt="\Phi=\Pi_{1}^{0}\cup \Sigma_{1}^{0}" eeimg="1"> .</p>
 <p data-pid="ue54Nqr4">（P.S. 原先被替换的内容可以在 “模糊图灵机的逼近性与通用性”找到）</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="KcKSG8N-">I.广义相对论中的 Malament-Hogarth 时空。 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="LTr7UTsA">这些时空拥有一条奇怪的世界线，世界线的本征时间 （proper time）是无限的，但时空中存在一个 event p ，沿着世界线发生的所有事件都可以包涵于 event p 中的过去有限区间中。这个 event p 称为 Malament-Hogarth event 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="tSDmpSj3">一个标准的 Malament-Hogarth 时空模型是这样的：</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-bff9c0957e2aa43f7818f6c7c60dc3f4_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="479" data-rawheight="317" data-original-token="v2-eaaeb86c85ad6f4280135029938ef31c" data-default-watermark-src="https://pic1.zhimg.com/50/v2-cb73c853209713f930d422d1acbbbfce_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="479" data-original="https://picx.zhimg.com/v2-bff9c0957e2aa43f7818f6c7c60dc3f4_r.jpg?source=1940ef5c">
  <figcaption>
   Toy Malament-Hogarth spacetimes
  </figcaption>
 </figure>
 <p data-pid="f4PJAS_K">首先，在 Minkwski 时空 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+%5CRe+%5E%7B4%7D+%2C%5Ceta+_%7Bab%7D+%5Cright%29+" alt="\left( \Re ^{4} ,\eta _{ab} \right) " eeimg="1">，考虑一个紧致集 （compact set）C 且 <img src="https://www.zhihu.com/equation?tex=C%5Csubset+M" alt="C\subset M" eeimg="1">；选定一个位于 M 上的标量场 （scalar field）Ω ，位于紧致集 C 之外且 Ω=1；时空中存在一个 point r 属于紧致集 C，在接近 point r 时，Ω 迅速变为无限。</p>
 <p data-pid="Wu9CXp5u">则时空 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+%5CRe+%5E%7B4%7D+-r%2C%5COmega+%5E%7B2%7D+%5Ceta+_%7Bab%7D+%5Cright%29+" alt="\left( \Re ^{4} -r,\Omega ^{2} \eta _{ab} \right) " eeimg="1"> 是一个 Malament-Hogarth 时空。</p>
 <p data-pid="LZazmESA">时空中的任何类时曲线在接近 point r 时本征时间将变为无限（图中的 <img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B1%7D+" alt="\gamma _{1} " eeimg="1">），而一条类时曲线在接近时空的 endpoint p 时则它的本征时间却是有限的（图中的 <img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B2%7D+" alt="\gamma _{2} " eeimg="1">），而在 <img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B1%7D+" alt="\gamma _{1} " eeimg="1"> 上发生的所有事件都已经成为过去。</p>
 <p data-pid="w_yqk0v9">即：在 时空 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+M%2Cg+%5Cright%29" alt="\left( M,g \right)" eeimg="1"> 中，M 为连贯四维豪斯多夫 <img src="https://www.zhihu.com/equation?tex=C%5E%7B%5Cinfty+%7D+" alt="C^{\infty } " eeimg="1"> 流形，g 为洛伦兹度规：</p>
 <p data-pid="n7ua5ZF8"><b>I. </b>如果存在类时半曲线 （timelike half-curve）<img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B1%7D+%5Csubset+M" alt="\gamma _{1} \subset M" eeimg="1"> ；</p>
 <p data-pid="aksUXTx4"><b>II.</b>存在一个 event point p，其中：</p>
 <p data-pid="hpTFlHmm"><img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7Bevent%5C%2C+%5C%2C+point%5C%2C+%5C%2C%7D+p%5Cin+M" alt="\mathrm{event\, \, point\, \,} p\in M" eeimg="1"> , <img src="https://www.zhihu.com/equation?tex=%5Cint_%7B%5Cgamma_%7B1%7D%7D%5E%7B%7Dd%5Ctau%3D%5Cinfty" alt="\int_{\gamma_{1}}^{}d\tau=\infty" eeimg="1"> , <img src="https://www.zhihu.com/equation?tex=%5Cgamma_%7B1%7D%5Csubset+I%5E%7B-%7D%5Cleft%28+p+%5Cright%29" alt="\gamma_{1}\subset I^{-}\left( p \right)" eeimg="1"></p>
 <p data-pid="xe6oO2rH">其中 <img src="https://www.zhihu.com/equation?tex=%5Cgamma_%7B1%7D%5Csubset+I%5E%7B-%7D%5Cleft%28+p+%5Cright%29" alt="\gamma_{1}\subset I^{-}\left( p \right)" eeimg="1"> 表示为 p 的过去区间。则它为 Malament-Hogarth 时空。此外：</p>
 <p data-pid="ida5T8sZ">还存在一条未来定向类时半曲线 ( future-directed timelike half curve) ：</p>
 <p data-pid="4oRiKIxD"><img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B2%7D+%5Csubset+M" alt="\gamma _{2} \subset M" eeimg="1"></p>
 <p data-pid="GJdK_QI2"><b>III.</b>存在一个 event point q ，其中：</p>
 <p data-pid="1JaaiTHs"><img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7Bevent%5C%2C+%5C%2C+point%5C%2C+%5C%2C%7D+q%5Cin+I%5E%7B-%7D%5Cleft%28+p+%5Cright%29" alt="\mathrm{event\, \, point\, \,} q\in I^{-}\left( p \right)" eeimg="1"> ， <img src="https://www.zhihu.com/equation?tex=%5Cint_%7B%5Cgamma_%7B2%7D%5Cleft%28q%2Cp+%5Cright%29%7D%5E%7B%7Dd%5Ctau%3C%5Cinfty" alt="\int_{\gamma_{2}\left(q,p \right)}^{}d\tau<\infty" eeimg="1"></p>
 <p data-pid="odE9ZEFe">于是有了以下的提议：</p>
 <p data-pid="ndKrZT38">让一台计算机（图灵机）沿着类时曲线 <img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B1%7D+" alt="\gamma _{1} " eeimg="1"> 移动，由于它的本征时间是无限的，图灵机就有时间来进行无限步骤的计算过程。而一个观测者则沿着类时曲线 <img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B2%7D+" alt="\gamma _{2} " eeimg="1"> 移动，时间是有限的，当观测者到达 p 时，图灵机的无限计算也已经完成了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="-dodC0k9">更正一下，Malament-Hogarth 时空不是单一的时空结构，事实上它是<b>一类</b>特殊时空结构的统称。</p>
 <p data-pid="Ova8zzad">它们包括：</p>
 <p data-pid="nNkGi9dk">I. anti-de Sitter 时空</p>
 <p data-pid="f3cHnC4N">II. Reissner-Nordström 时空 （RN 黑洞中）</p>
 <p data-pid="shg4-zgc">III.Kerr-Newman 时空 （ 克尔-纽曼黑洞中）</p>
 <p data-pid="MZmdjWSp">IV.一个"卷起来"的 Minkowski 时空（补充说明，该 Malament-Hogarth 时空中的时间维被卷了起来，形成封闭类时曲线。）</p>
 <p data-pid="NSJnOciJ">这些时空相当于是把Malament-Hogarth 时空塑造成一台时空版的无限机器。使得计算机器任意的无限枚举都可以在一个常数时间内完成。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eYMEApZV">Malament-Hogarth 时空的时空结构允许超计算能力逐级递增，利用这些时空结构，</p>
 <p data-pid="VB30clF9">数学家 Mark Hogarth 把 Malament-Hogarth 时空构造成一个叫 SAD -计算机 （SAD machine）的非图灵计算机，它们各部分依次能判定不可解度不同的集合。</p>
 <p data-pid="IpiEQEzl">简要地讲，在 Malament-Hogarth 时空中进行操作，<img src="https://www.zhihu.com/equation?tex=%5Cgamma_%7B1%7D+" alt="\gamma_{1} " eeimg="1"> 为在无限世界线上运行的图灵机（记作 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTM_%7B%5Cinfty%7D%7D" alt="\mathrm{TM_{\infty}}" eeimg="1"> ），<img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B2%7D+" alt="\gamma _{2} " eeimg="1"> 为观测者。</p>
 <p data-pid="IbUheDla">它可以判定任何的任一如下关系形式 ：</p>
 <p data-pid="C_7-eXJX"><img src="https://www.zhihu.com/equation?tex=S%28z%29%3D+%5Cexists+xR%5Cleft%28+x%2Cz+%5Cright%29+" alt="S(z)= \exists xR\left( x,z \right) " eeimg="1"> 或者 <img src="https://www.zhihu.com/equation?tex=S%5Cleft%28+z+%5Cright%29+%3D+%5Cforall+xR%5Cleft%28+x%2Cz+%5Cright%29+" alt="S\left( z \right) = \forall xR\left( x,z \right) " eeimg="1"> ，其中 R 是递归关系。上述方式就相当于构造了一台 <img src="https://www.zhihu.com/equation?tex=SAD_%7B1%7D+" alt="SAD_{1} " eeimg="1"> 计算机。</p>
 <p data-pid="d72_8BVK">在 Malament-Hogarth 时空的操作区域为 <img src="https://www.zhihu.com/equation?tex=O_%7Bi%7D+%2Ci%3D1%2C2%2C3%2C...n..." alt="O_{i} ,i=1,2,3,...n..." eeimg="1"> ，则 ：</p>
 <p data-pid="W3WflE5V"><b>I.</b> <img src="https://www.zhihu.com/equation?tex=+O_%7Bi%7D+%5Csubset+I%5E%7B-%7D+%5Cleft%28+O_%7Bi%2B1%7D+%5Cright%29+" alt=" O_{i} \subset I^{-} \left( O_{i+1} \right) " eeimg="1"> ； <b>II. <img src="https://www.zhihu.com/equation?tex=O_%7Bi+%7D+%5Csubset+I%5E%7B-%7D+%5Cleft%28+p+%5Cright%29+" alt="O_{i } \subset I^{-} \left( p \right) " eeimg="1"></b> 。</p>
 <p data-pid="KQker2sk">在 Malament-Hogarth 时空区域中重复 <img src="https://www.zhihu.com/equation?tex=SAD_%7B1%7D+" alt="SAD_{1} " eeimg="1"> 操作，<img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B1%7D+" alt="\gamma _{1} " eeimg="1"> 为一台 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTM_%7B%5Cinfty%7D%7D" alt="\mathrm{TM_{\infty}}" eeimg="1"> 来判定 <img src="https://www.zhihu.com/equation?tex=%5Cforall+yR%28i%2Cy%29" alt="\forall yR(i,y)" eeimg="1"> , 然后另外一台 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTM_%7B%5Cinfty%7D%7D" alt="\mathrm{TM_{\infty}}" eeimg="1"> 来收集各部分结果判定 <img src="https://www.zhihu.com/equation?tex=%5Cexists+x%5Cforall+yR%28x%2Cy%29" alt="\exists x\forall yR(x,y)" eeimg="1"> 。<img src="https://www.zhihu.com/equation?tex=%5Cgamma+_%7B2%7D+" alt="\gamma _{2} " eeimg="1">为观测者，收集结果。</p>
 <p data-pid="js2M90Ou">最终构造了 <img src="https://www.zhihu.com/equation?tex=SAD_%7B2%7D+" alt="SAD_{2} " eeimg="1"> 计算机。它可以判定：</p>
 <p data-pid="JWe1c0qP"><img src="https://www.zhihu.com/equation?tex=S_%7B2%7D+%5Cleft%28+x_%7B3%7D+%5Cright%29+%3D%5Cforall+x_%7B%7D%5Cexists+yR%5Cleft%28+x%2Cy+%5Cright%29+%3D%5Cforall+x_%7B1%7D+%5Cexists+x_%7B2%7D+R%5Cleft%28+x_%7B1%7D+%2Cx_%7B2%7D+%2Cx_%7B3%7D+%5Cright%29+" alt="S_{2} \left( x_{3} \right) =\forall x_{}\exists yR\left( x,y \right) =\forall x_{1} \exists x_{2} R\left( x_{1} ,x_{2} ,x_{3} \right) " eeimg="1"></p>
 <p data-pid="90BNjJ_9">或者</p>
 <p data-pid="knyohtei"><img src="https://www.zhihu.com/equation?tex=S_%7B2%7D%5E%7B%27%7D%5Cleft+%28+x_%7B3%7D+%5Cright+%29%3D%5Cexists+x%5Cforall+yR%5Cleft+%28+x%2Cy+%5Cright+%29%3D%5Cexists+x_%7B1%7D%5Cforall+x_%7B2%7DR%5Cleft+%28+x_%7B1%7D+%2Cx_%7B2%7D%2Cx_%7B3%7D%5Cright+%29" alt="S_{2}^{'}\left ( x_{3} \right )=\exists x\forall yR\left ( x,y \right )=\exists x_{1}\forall x_{2}R\left ( x_{1} ,x_{2},x_{3}\right )" eeimg="1"></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="btoyIRPL">重复 <img src="https://www.zhihu.com/equation?tex=SAD_%7B2%7D+" alt="SAD_{2} " eeimg="1"> 操作，得到<img src="https://www.zhihu.com/equation?tex=SAD_%7B3%7D+" alt="SAD_{3} " eeimg="1"> 计算机；重复 <img src="https://www.zhihu.com/equation?tex=SAD_%7B3%7D+" alt="SAD_{3} " eeimg="1"> 操作，得到 <img src="https://www.zhihu.com/equation?tex=SAD_%7B4%7D+" alt="SAD_{4} " eeimg="1"> 计算机 <b>...</b></p>
 <p data-pid="j9e3GlzR">最终，重复所有的操作后。可得到如下递归关系：</p>
 <p data-pid="waPw_tKV"><img src="https://www.zhihu.com/equation?tex=S_%7Bn%2B1%7D%5Cleft%28+x_%7Bn%2B1%7D+%5Cright%29%3D%5Cforall+x_%7B1%7D+%5Cexists+x_%7B2%7D...%5Cforall+x_%7Bn-1%7D%5Cexists+x_%7Bn%7D+R%5Cleft%28x_%7B1%7D+%2C...%2Cx_%7Bn%2B1%7D%5Cright%29" alt="S_{n+1}\left( x_{n+1} \right)=\forall x_{1} \exists x_{2}...\forall x_{n-1}\exists x_{n} R\left(x_{1} ,...,x_{n+1}\right)" eeimg="1"></p>
 <p data-pid="qbXW6HbY">或</p>
 <p data-pid="s02vvDu9"><img src="https://www.zhihu.com/equation?tex=S_%7Bn%2B1%7D%5E%7B%27%7D%5Cleft%28+x_%7Bn%2B1%7D+%5Cright%29%3D%5Cexists+x_%7B1%7D%5Cforall+x_%7B2%7D...%5Cexists+x_%7Bn-1%7D+%5Cforall+x_%7Bn%7DR%5Cleft%28x_%7B1%7D+%2C...%2Cx_%7Bn%2B1%7D%5Cright%29" alt="S_{n+1}^{'}\left( x_{n+1} \right)=\exists x_{1}\forall x_{2}...\exists x_{n-1} \forall x_{n}R\left(x_{1} ,...,x_{n+1}\right)" eeimg="1"></p>
 <p data-pid="6bKEpF5r">于是，我们得到了一台 <img src="https://www.zhihu.com/equation?tex=SAD_%7Bn%7D+" alt="SAD_{n} " eeimg="1"> 时空计算机.</p>
 <p data-pid="IxDiKvXG">在<img src="https://www.zhihu.com/equation?tex=SAD_%7Bn%7D+" alt="SAD_{n} " eeimg="1"> 时空中：</p>
 <p data-pid="5WO-SXf_">I. 当 n=1时，为 Malament-Hogarth 时空 ；</p>
 <p data-pid="tj89ZI9I">II. 当 n &gt;1 时， <img src="https://www.zhihu.com/equation?tex=SAD_%7Bn%7D+" alt="SAD_{n} " eeimg="1"> 时空计算机由 i 台 <img src="https://www.zhihu.com/equation?tex=SAD_%7Bn-1%7D+" alt="SAD_{n-1} " eeimg="1"> 计算机“串联”构成；</p>
 <p data-pid="BZAs7XaU">III.<img src="https://www.zhihu.com/equation?tex=SAD_%7B1%7D+" alt="SAD_{1} " eeimg="1"> 计算机可以判定克林算数层级中的 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7B1%7D%5E%7B0%7D+%5Ccup+%5CPi+_%7B1%7D%5E%7B0%7D+" alt="\Sigma _{1}^{0} \cup \Pi _{1}^{0} " eeimg="1"> 层级；<img src="https://www.zhihu.com/equation?tex=SAD_%7B2%7D+" alt="SAD_{2} " eeimg="1"> 计算机可以判定 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7B2%7D%5E%7B0%7D+%5Ccup+%5CPi+_%7B2%7D%5E%7B0%7D+" alt="\Sigma _{2}^{0} \cup \Pi _{2}^{0} " eeimg="1"> 层级；<img src="https://www.zhihu.com/equation?tex=SAD_%7B3%7D+" alt="SAD_{3} " eeimg="1"> 计算机可以判定 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7B3%7D%5E%7B0%7D+%5Ccup+%5CPi+_%7B3%7D%5E%7B0%7D+" alt="\Sigma _{3}^{0} \cup \Pi _{3}^{0} " eeimg="1"> 层级；...；而最终 <img src="https://www.zhihu.com/equation?tex=SAD_%7Bn%7D+" alt="SAD_{n} " eeimg="1"> 计算机可以判定 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7Bn+%7D%5E%7B0%7D+%5Ccup+%5CPi+_%7Bn%7D%5E%7B0%7D+" alt="\Sigma _{n }^{0} \cup \Pi _{n}^{0} " eeimg="1"> 层级。</p>
 <p data-pid="72fD6AlG">结论：</p>
 <p data-pid="2swmF6k_"><b>I. </b><img src="https://www.zhihu.com/equation?tex=%5Cmathbf%7BSAD%7D_%7Bn%7D" alt="\mathbf{SAD}_{n}" eeimg="1"> 可以判定 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7Bn+%7D%5E%7B0%7D+%5Ccup+%5CPi+_%7Bn%7D%5E%7B0%7D+" alt="\Sigma _{n }^{0} \cup \Pi _{n}^{0} " eeimg="1"> ；</p>
 <p data-pid="U4dOd4Wd"><b>II. </b><img src="https://www.zhihu.com/equation?tex=%5Cmathbf%7BSAD%7D_%7Bn%7D" alt="\mathbf{SAD}_{n}" eeimg="1"> 可以映射至算数层级的每一层；SAD machines 可以判定完整的算数层级。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="bQtKX-MI">最终，把所有操作全部 "串连" 在一起。相当于构造了 AD ( Arithmetical sentence deciding ) machine。</p>
 <p data-pid="cj485OUA">AD machine 可以精确地求解 <img src="https://www.zhihu.com/equation?tex=%5Caleph+_%7B0%7D+" alt="\aleph _{0} " eeimg="1"> 函数和判定 Arithmetic 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="B5P-xOWF">P.S. 对 Kerr 时空进行操作步骤如图所示：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-527f6ad168041427a4e860781af909b1_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="648" data-rawheight="470" data-original-token="v2-527f6ad168041427a4e860781af909b1" class="origin_image zh-lightbox-thumb" width="648" data-original="https://picx.zhimg.com/v2-527f6ad168041427a4e860781af909b1_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="kvD-uXrn">首先，对黑洞时空世界线（位于克尔-纽曼黑洞的赤道平面的轨道）运行的图灵机 （Orbiting Machine）进行设置计算任务。</p>
 <p data-pid="PyCYUzsX">接着，图灵机开始无穷无尽的计算任务。计算任务的计算步骤与计算时间为无限。计算机将会经历无限数量于观测者的本征时间。</p>
 <p data-pid="TkXVOYUU">然后，观测者（操作人员）（Falling Observer）进入内视界， Malament-Hogarth event 发生，“图灵无限计算任务”这一事件在 Malament-Hogarth event 的有限时间内被观测者（操作人员）所经过。（观测者的这一路径只会用掉有限的本征时间。）</p>
 <p data-pid="keJ7fWvF">接着，观测者穿过 Malament-Hogarth event 并从内视界离开黑洞，最终观测者离开黑洞时，图灵机的无限计算任务也已经完成。在观测者的参考系来看就相当于是图灵机在有限时间内完成了无限多次的计算步骤。</p>
 <p data-pid="Oe0vocas">最后，在图灵机确认完成计算任务（停机）后发送计算结果给观测者，观测者收到计算结果后，（操作人员）发出终止指令。计算完成。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="T4pEIDMd">Malament-Hogarth 时空具体可以干些什么呢？</p>
 <p data-pid="uYtnWyxy">答：如果 Malament-Hogarth 时空存在且计算操作可以实现，则它可以实现超级任务（Supertask）！</p>
 <p data-pid="hp-c1UaC">超级任务（Supertask），是芝诺悖论的现代变体。指的是有限时间内完成无限多次操作序列的任务。比如说 π 的最后一位数字；汤姆逊灯；等等。</p>
 <p data-pid="w8SHYKhT">完成该任务的机器称为 infinite machine 。</p>
 <p data-pid="-i7zj594">目前主流的认识是：超级任务是不可能完成的， infinite machine 不存在。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="2EHFtWkq">不过，在 Malament-Hogarth 时空中，在有限时间内完成无限多次操作的过程，理论上是可以完成的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="TgbJZZFL">J.芝诺机（Zeno Mchine） <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="uQYUXAP7">该模型使用<img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B1%7D%7B2%5E%7Bn%7D+%7D+" alt="\frac{1}{2^{n} } " eeimg="1">的时间来完成算法的第n步。可以在有限的时间内完成无限的运算步骤。举个例子，一种算法第一步需要0.5s，第二步需要0.25s，第三步需要0.125s，<b>...</b>在1秒钟之后，这段无穷步骤的算法就可以完成。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="61zv94k1">另外经典图灵机的“停机问题”就可以在芝诺机上由如下的算法给出解答：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <div class="highlight">
  <pre><code class="language-text">begin program
  write 0 on the first position of the output tape;
  begin loop
    simulate 1 successive step of the given Turing machine on the given input;
    if the Turing machine has halted, then write 1 on the first position of the output tape and break out of loop;
  end loop
end program</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="oaXl5g2Z">该算法的另一种形式：</p>
 <div class="highlight">
  <pre><code class="language-text">begin 
write 1 to the first cell of the tape (output)
 i ← 1
 while i &gt; 0 do
    run given TM m for given input n for i steps 
         if m halts then
            write 0 to the first cell of the tape
            i ← i + 1 
         end if 
    end while
 end</code></pre>
 </div>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="P-mPM943">P.S.该模型同样需要可以无限分割（连续）的时间，或者保证计算机器的计算步骤可以无限的加速。可惜我们的宇宙中造不出这样的计算机器。</p>
 <p data-pid="LIQMGKdD">虽然在量子理论的普朗克时间限制和相对论的光速限制下物理不允许这样的机器出现在现实世界。但是，在现有的理论，比如广义相对论，或许允许我们利用特殊的时空结构以另外一种方式——"计算机的无限计算步骤可以在另一个观察者有限的本征时间内完成"来达到同样的效果，即 Malament-Hogarth 时空。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="wWjiz2cp">K.Fast-growing constructs Oracle.</p>
 <p data-pid="wiL5NjZS">Dmytro Taranovsky 提出了一个传统非有限分析分支的有限模型，围绕一个配备一个具有以不可计算速率快速增加功能的增长函数作为谕示的图灵机，能够给出一个二阶算术的解答。</p>
 <p data-pid="D6ieQwn7">更为具体地：如果存在一个全函数 （total function）A 对于函数 B，且对于每一个自然数 n 来说总有 <img src="https://www.zhihu.com/equation?tex=B%5Cleft%28+n+%5Cright%29%5Cgeq+A%5Cleft%28+n+%5Cright%29" alt="B\left( n \right)\geq A\left( n \right)" eeimg="1"> ，则会有一种语言 L 可由这台配有该 Oracle 的图灵机所识别，当且仅当 S 位于 L 中时该机器使用 B 作为一个谕示在输入 S 后停机。</p>
 <p data-pid="m4hqfevQ">由于这些谓词是用某些自然有限结构的性质来解释的，因此可以说它们是有限的。</p>
 <p data-pid="z6rHS993">结论：一台图灵机配 fast-growing sequence oracle 能力等价于 <img src="https://www.zhihu.com/equation?tex=%5CPi_%7B1%7D%5E%7B1%7D" alt="\Pi_{1}^{1}" eeimg="1"> 。</p>
 <p data-pid="dGgAZXb4">对于一个足够快速增长的序列 A，递归关系有一个通过 n 的无限下行路径（infinite descending path）当且仅当一个无限下行路径通过 n 以及然后通过一个<img src="https://www.zhihu.com/equation?tex=A%28max%28n%2Cm%29%29" alt="A(max(n,m))" eeimg="1"> 的自然数 ，其中 m 是递归定义关系的长度。根据 König's lemma ，如果关系是良基（well-found）的，那么 tree 是有限的，因此机器的搜索最终会发现关系是 well-found 的。相反的，对于每台机器和输入，机器对每一个 <img src="https://www.zhihu.com/equation?tex=+A%3A%E2%84%95%E2%86%92%E2%84%95+" alt=" A:ℕ→ℕ " eeimg="1"> 都有一个停机计算当且仅当机器接收的答案至少和 A 给出的答案一样大。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="cKDIKsaY">L. Active Element Machine <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="QjB-Rbqe">Michael Stephen Fiske 的 Active Element Machine 由被称为 Active Element （AE）的计算基元（computational primitives）组成。</p>
 <p data-pid="FHXMXRC-">Active Element 分为三类，分别是：输入，计算，输出。</p>
 <p data-pid="kgBt83SV">每个 AE 从其它 AE 接收信息；并将信息传送到其它的 AE 。现在引入对于整数（integers）集的拓展： <img src="https://www.zhihu.com/equation?tex=%5Cbar%7B%5Cmathbb%7BZ%7D%7D%3D%5Cleft%5C%7B+m%2BkdT%3Am%2Ck%5Cin+%5Cmathbb%7BZ%7D%3B%5C%2CdT%3A+%5Cmathrm%7Ba%5C%2C%5C%2Cfixed%5C%2C%5C%2C+infinitesimal%7D%5Cright%5C%7D" alt="\bar{\mathbb{Z}}=\left\{ m+kdT:m,k\in \mathbb{Z};\,dT: \mathrm{a\,\,fixed\,\, infinitesimal}\right\}" eeimg="1"></p>
 <p data-pid="6faWSQlt"><img src="https://www.zhihu.com/equation?tex=%5CGamma%2C%5CDelta%2C%5COmega" alt="\Gamma,\Delta,\Omega" eeimg="1"> 分别是输入，计算，输出 AE 的索引集 （index set）， <img src="https://www.zhihu.com/equation?tex=%5CGamma%5Ccap+%5COmega" alt="\Gamma\cap \Omega" eeimg="1"> 以及 <img src="https://www.zhihu.com/equation?tex=%5COmega+%5Ccap%5CDelta" alt="\Omega \cap\Delta" eeimg="1"> 可以为空集或非空集。</p>
 <p data-pid="3Rpa6QUr">整个机器架构定义为一个三元组： <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D%3D%5Cleft%28+%5Cmathscr%7BI%2CE%2CO%7D%5Cright%29" alt="\mathscr{M}=\left( \mathscr{I,E,O}\right)" eeimg="1"> ；包括一组输入 AE 。具体地：</p>
 <p data-pid="H4JeV0Yk"><img src="https://www.zhihu.com/equation?tex=+%5Cmathscr%7BI%7D%3D%5Cleft%5C%7B+E_%7Bi%7D%3Ai%5Cin%5CGamma+%5Cright%5C%7D%2C+%5Cmathscr%7BE%7D%3D%5Cleft%5C%7B+E_%7Bi%7D%3Ai%5Cin%5COmega%5Cright%5C%7D%2C+%5Cmathscr%7BO%7D%3D%5Cleft%5C%7B+E_%7Bi%7D%3Ai%5Cin%5CDelta%5Cright%5C%7D" alt=" \mathscr{I}=\left\{ E_{i}:i\in\Gamma \right\}, \mathscr{E}=\left\{ E_{i}:i\in\Omega\right\}, \mathscr{O}=\left\{ E_{i}:i\in\Delta\right\}" eeimg="1"></p>
 <p data-pid="V7lLbSoz">每个计算，输出 AE <img src="https://www.zhihu.com/equation?tex=E_%7Bi%7D" alt="E_{i}" eeimg="1"> 具有以下属性：</p>
 <p data-pid="2mrDjZsb">一个 threshold <img src="https://www.zhihu.com/equation?tex=%5Ctheta_%7Bi%7D" alt="\theta_{i}" eeimg="1">；一个 refractory period <img src="https://www.zhihu.com/equation?tex=r_%7Bi%7D%3E0" alt="r_{i}>0" eeimg="1"> ; 一组 pulse amplitudes ： <img src="https://www.zhihu.com/equation?tex=%5Cleft%5C%7BA_%7Bki%7D+%3Ak%5Cin%5CGamma+%5Ccup+%5COmega%5Cright%5C%7D" alt="\left\{A_{ki} :k\in\Gamma \cup \Omega\right\}" eeimg="1"> ; 一组 transmission times ： <img src="https://www.zhihu.com/equation?tex=%5Cleft%5C%7B%5Ctau+_%7Bki%7D%3E0%3Ak%5Cin+%5CGamma%5Ccup+%5COmega+%5Cright%5C%7D" alt="\left\{\tau _{ki}>0:k\in \Gamma\cup \Omega \right\}" eeimg="1"> ;</p>
 <p data-pid="0ol2EvSb">时间函数 <img src="https://www.zhihu.com/equation?tex=%5CPsi_%7Bi%7D%5Cleft%28+t+%5Cright%29%3D%5Ctextrm%7Bsup%7D%5Cleft%5C%7B+s%3As%3C1%3Bg_%7Bi%7D%5Cleft%28+s+%5Cright%29+%3D1%5Cright%5C%7D" alt="\Psi_{i}\left( t \right)=\textrm{sup}\left\{ s:s<1;g_{i}\left( s \right) =1\right\}" eeimg="1"> 表示上次触发 AE <img src="https://www.zhihu.com/equation?tex=E_%7Bi%7D" alt="E_{i}" eeimg="1"> 的时间； <img src="https://www.zhihu.com/equation?tex=g_%7Bi%7D%5Cleft%28+s+%5Cright%29+" alt="g_{i}\left( s \right) " eeimg="1"> 是 AE <img src="https://www.zhihu.com/equation?tex=E_%7Bi%7D" alt="E_{i}" eeimg="1"> 的输出函数；</p>
 <p data-pid="umyUqP05">一个二进制输出函数 <img src="https://www.zhihu.com/equation?tex=g_%7Bi%7D%5Cleft%28+t+%5Cright%29" alt="g_{i}\left( t \right)" eeimg="1"> 用来确定 <img src="https://www.zhihu.com/equation?tex=E_%7Bi%7D" alt="E_{i}" eeimg="1"> 是否会在时间 t 被触发，则：</p>
 <p data-pid="YULY7vC1"><img src="https://www.zhihu.com/equation?tex=%7B%5Cdisplaystyle+g_%7Bi%7D%5Cleft%28+t+%5Cright%29%3D%7B%5Cbegin%7Bcases%7D1%2C%26%7B%5Ctext%7Bif+%7D%7D%5C%2C%5Csum_%7B%7D%5E%7B%7D%7BA_%7Bki%7D%5Cleft%28+t+%5Cright%29%3E%5Ctheta_%7Bi%7D%2Ct%5Cgeq+%5CPsi+_%7Bi%7D%5Cleft%28+t+%5Cright%29%2Br_%7Bi%7D%7D%7B%5Ctext%7B+holds%7D%7D%3B%5C%5C0%2C+%26%7B%5Ctext%7B%7D%7Dt%3C%5CPsi+_%7Bi%7D%5Cleft%28+t+%5Cright%29%2Br_%7Bi%7D%5Cend%7Bcases%7D%7D%7D+" alt="{\displaystyle g_{i}\left( t \right)={\begin{cases}1,&amp;{\text{if }}\,\sum_{}^{}{A_{ki}\left( t \right)>\theta_{i},t\geq \Psi _{i}\left( t \right)+r_{i}}{\text{ holds}};\\0, &amp;{\text{}}t<\Psi _{i}\left( t \right)+r_{i}\end{cases}}} " eeimg="1"> ；</p>
 <p data-pid="dh9By55v">定义 <img src="https://www.zhihu.com/equation?tex=W_%7Bki%7D%5Cleft%28+t+%5Cright%29%3D%5Cleft%5C%7B+s%3A%5Ctextrm%7Bactive+element%7D%5C%2C+E_%7Bi%7D%5C%2C%5Ctextrm%7Bfired+at+time%7D%5C%2Cs%5C%2C%5Ctextrm%7Band%7D%5C%2C0%5Cleq+t-s-%5Ctau_%7Bki%7D%3C%5Comega+_%7Bki%7D%5Cright%5C%7D" alt="W_{ki}\left( t \right)=\left\{ s:\textrm{active element}\, E_{i}\,\textrm{fired at time}\,s\,\textrm{and}\,0\leq t-s-\tau_{ki}<\omega _{ki}\right\}" eeimg="1"></p>
 <p data-pid="cUMLT8Zs"><img src="https://www.zhihu.com/equation?tex=W_%7Bki%7D%5Cleft%28+t+%5Cright%29" alt="W_{ki}\left( t \right)" eeimg="1"> 中的元素个数以 <img src="https://www.zhihu.com/equation?tex=%5Cleft%7C+W_%7Bki%7D%5Cleft%28+t+%5Cright%29+%5Cright%7C" alt="\left| W_{ki}\left( t \right) \right|" eeimg="1"> 表示，若 <img src="https://www.zhihu.com/equation?tex=W_%7Bki%7D%5Cleft%28+t+%5Cright%29%3D%5Cemptyset" alt="W_{ki}\left( t \right)=\emptyset" eeimg="1"> 则 <img src="https://www.zhihu.com/equation?tex=%5Cleft%7C+W_%7Bki%7D%5Cleft%28+t+%5Cright%29+%5Cright%7C%3D0" alt="\left| W_{ki}\left( t \right) \right|=0" eeimg="1"> ；</p>
 <p data-pid="XczOMtvu">一组输入函数 <img src="https://www.zhihu.com/equation?tex=%5Cleft%5C%7B+%5Cphi_%7Bki%7D%3Ak%5Cin%5CGamma+%5Ccup+Q+%5Cright%5C%7D" alt="\left\{ \phi_{ki}:k\in\Gamma \cup Q \right\}" eeimg="1"> ，输入函数值的计算方式为： <img src="https://www.zhihu.com/equation?tex=%5Cphi_%7Bki%7D%5Cleft%28+t+%5Cright%29%3D%5Cleft%7C+W_%7Bki%7D+%5Cleft%28+t+%5Cright%29%5Cright%7CA_%7Bki%7D%5Cleft%28+t%5Cright%29" alt="\phi_{ki}\left( t \right)=\left| W_{ki} \left( t \right)\right|A_{ki}\left( t\right)" eeimg="1"></p>
 <p data-pid="wkmvrv42">pulse widths，refractory period，transmission times 为正整数；pulse amplitudes 和 thresholds 为整数；代表这些函数参数的时间 t 为 <img src="https://www.zhihu.com/equation?tex=%5Cbar%7B%5Cmathbb%7BZ%7D%7D" alt="\bar{\mathbb{Z}}" eeimg="1"> 的一个元素。</p>
 <p data-pid="jepSSNos">由于 AEM 能够在执行其程序时更改其体系结构，并且使用来自环境中的随机比特，AEM 可以表示 <img src="https://www.zhihu.com/equation?tex=%5Cleft%5B+0%2C1+%5Cright%5D" alt="\left[ 0,1 \right]" eeimg="1"> 中的任意一个实数。</p>
 <p data-pid="7rU7XJQs">任意一类语言 L 且 <img src="https://www.zhihu.com/equation?tex=L%5Csubseteq%5Cleft%5C%7B+0%2C1+%5Cright%5C%7D%5E%7B%5Cast%7D" alt="L\subseteq\left\{ 0,1 \right\}^{\ast}" eeimg="1"> 都可以被 AEM 所识别。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="iiJTZLqu">M. Self-similar cellular automata <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="ymzYgBIf">设想在一个特殊的宇宙中，该宇宙支持着时空的无限可分性。</p>
 <p data-pid="Spu4EyMC">目前，“时空可无限分割”这一假设属性已经被用于探讨超越图灵计算的提议，比如 Zeno Machine；这个模型是基于图灵机模型拓展而来。那么，有一个问题是：基于“时空的无限可分性”这一属性，其他的可计算模型是否可以拥有超越图灵机的计算能力呢？</p>
 <p data-pid="BHGLEtv9">答案是肯定的。</p>
 <p data-pid="TBP3Tn1q">Martin Schaller 和 K. Svozil 给出了基于这一属性的元胞自动机（cellular automata）的构架。</p>
 <p data-pid="lbDeWm7P">普通元胞自动机的基本结构是由胞体在空间和时间的均匀镶嵌所决定的。如下图所示：</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-4b1f6b9e51aea13079e7a09ff897ad65_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="478" data-rawheight="338" data-original-token="v2-eb43e091cdc20391094198a3f58c4526" data-default-watermark-src="https://picx.zhimg.com/50/v2-9d86081b1db27a4cf9218fcfc30734fe_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="478" data-original="https://picx.zhimg.com/v2-4b1f6b9e51aea13079e7a09ff897ad65_r.jpg?source=1940ef5c">
  <figcaption>
   元胞自动机的演化图示
  </figcaption>
 </figure>
 <p data-pid="t9CexS5q">而对于 Self-similar cellular automata 作为一个自动机：无限多个胞体在一维晶格上运行。同一胞体的每两次更新之间的大小和时间根据其在晶格中的位置而变化。</p>
 <p data-pid="u53FuOCB">对于每个胞体 j ，大小为： <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B1%7D%7B2%5E%7Bj%7D%7D" alt="\frac{1}{2^{j}}" eeimg="1"> ；两次更新之间的时间与胞体大小成正比。</p>
 <p data-pid="cqKj-Yhp">同时自动机所在的晶格是嵌入至整个 <img src="https://www.zhihu.com/equation?tex=%5Cmathbb%7BR%7D" alt="\mathbb{R}" eeimg="1"> 中：对于起始胞体 j 来说 <img src="https://www.zhihu.com/equation?tex=j%5Cmapsto+2-%5Cfrac%7B1%7D%7B2%5E%7Bj-1%7D%7D" alt="j\mapsto 2-\frac{1}{2^{j-1}}" eeimg="1"> ；这样整个晶格被映射至 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+-%5Cinfty%2C2+%5Cright%29" alt="\left( -\infty,2 \right)" eeimg="1"> ；而胞体 0 占据区间 <img src="https://www.zhihu.com/equation?tex=%5B0%2C1%29" alt="[0,1)" eeimg="1"> 。整个机器如下图所示：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-ac315384dea51fa7473bdbfd1bb6c5d6_720w.jpg?source=1940ef5c" data-size="normal" data-rawwidth="584" data-rawheight="409" data-original-token="v2-4610f8c98f85bb69c5b22a41b60217f0" data-default-watermark-src="https://pic1.zhimg.com/50/v2-b29d754917f0b292152887d3bd5d699f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="584" data-original="https://picx.zhimg.com/v2-ac315384dea51fa7473bdbfd1bb6c5d6_r.jpg?source=1940ef5c">
  <figcaption>
   一个 Self-similar cellular automata 的演化；横为时间，纵为 cells
  </figcaption>
 </figure>
 <p data-pid="0hISZuGz">接下来：</p>
 <p data-pid="qnt_wxpA">一个 Self-similar cellular automata 是一个三元组 ： <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D%3D%5Cleft%28+S%2Cf_%7Bc%7D%2Cf_%7Bd%7D+%5Cright%29" alt="\mathscr{A}=\left( S,f_{c},f_{d} \right)" eeimg="1"> ；S 为有限状态集；后两项为特定规则 （local rule）。每个胞体都有状态集中的一个状态，cell j 会在时间 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7Bk%7D%7B2%5E%7Bj%7D%7D" alt="\frac{k}{2^{j}}" eeimg="1"> 更新自己的状态（k 为一个整数）。在任何给定的时间,自动机的的配置是一个映射 <img src="https://www.zhihu.com/equation?tex=c%3A%5Cmathbb%7BZ%7D%5Crightarrow+S" alt="c:\mathbb{Z}\rightarrow S" eeimg="1"> 它指定所有细胞的状态。另外，cell j 会在时间 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B2k%7D%7B2%5E%7Bj%7D%7D%3D%5Cfrac%7Bk%7D%7B2%5E%7Bj-1%7D%7D" alt="\frac{2k}{2^{j}}=\frac{k}{2^{j-1}}" eeimg="1"> 与自己的左邻 cell 同时进行再次转换。这种转换称为 coupled ，一个胞体进行 coupled 时颜色为灰色。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eU4o0mb7">下面利用该自动机来构造一个可以进行超计算的机器。</p>
 <p data-pid="_LIZP4Gs">对于一台任意图灵机 M，这台自动机利用一个静态构成的 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D_%7BM%7D%3D%5Cleft%28S%2Cf_%7Bc%7D%2Cf_%7Bd%7D%2C+%5Csquare+%5Cright%29" alt="\mathscr{A}_{M}=\left(S,f_{c},f_{d}, \square \right)" eeimg="1"> 来模拟 M。</p>
 <p data-pid="rGwnWLQs">一个集合 ： <img src="https://www.zhihu.com/equation?tex=T%3D%5Cleft%28+Q%5Ctimes+%5Cleft%5C%7B+%5Ctriangleleft+%2C%5Ctriangleright+%5Cright%5C%7D+%5Cright%29%5Ccup%5CGamma" alt="T=\left( Q\times \left\{ \triangleleft ,\triangleright \right\} \right)\cup\Gamma" eeimg="1"> ；而自动机的状态集 S 为： <img src="https://www.zhihu.com/equation?tex=S%3DT%5Ccup%5Cleft%28+T%5Ctimes%5Cleft%5C%7B+%5Cblacktriangleright+%5Cright%5C%7D+%5Cright%29%5Ccup%5Cleft%5C%7B+%5Csquare+%2C+%5Cblacksquare+%2C%5Cdiamond+%5Cright%5C%7D" alt="S=T\cup\left( T\times\left\{ \blacktriangleright \right\} \right)\cup\left\{ \square , \blacksquare ,\diamond \right\}" eeimg="1"> 。位于状态集 Q 内的 q，使用 <img src="https://www.zhihu.com/equation?tex=q%5E%7B%5Ctriangleleft+%7D" alt="q^{\triangleleft }" eeimg="1"> 表示 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+q%2C%5Ctriangleleft+%5Cright%29" alt="\left( q,\triangleleft \right)" eeimg="1"> ; <img src="https://www.zhihu.com/equation?tex=q%5E%7B%5Ctriangleright+%7D" alt="q^{\triangleright }" eeimg="1"> 表示 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+q%2C+%5Ctriangleright+%5Cright%29" alt="\left( q, \triangleright \right)" eeimg="1"> 。</p>
 <p data-pid="_MEyv1um"><img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D_%7BM%7D" alt="\mathscr{A}_{M}" eeimg="1"> 的 local rules 由 block transformations 指定， <img src="https://www.zhihu.com/equation?tex=x_%7B%5Cblacktriangleright+%7D" alt="x_{\blacktriangleright }" eeimg="1"> 表示位于 <img src="https://www.zhihu.com/equation?tex=T%5Ctimes%5Cleft%5C%7B+%5Cblacktriangleright+%5Cright%5C%7D+" alt="T\times\left\{ \blacktriangleright \right\} " eeimg="1"> 中的一个元素 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+x%2C+%5Cblacktriangleright+%5Cright%29" alt="\left( x, \blacktriangleright \right)" eeimg="1"> ; <img src="https://www.zhihu.com/equation?tex=x%5Cin+T%3Ba%2Cb%5Cin%5CGamma%3Bq%2Cp%5Cin+Q" alt="x\in T;a,b\in\Gamma;q,p\in Q" eeimg="1"></p>
 <p data-pid="L8yKfHZ-">定义机器的 block transformations ：</p>
 <p data-pid="e_Hu2zmn"><img src="https://www.zhihu.com/equation?tex=%5Cbegin%7Bmatrix%7D+%5Cblacksquare+x+%5Cmapsto%5Cblacksquare+x_%7B%5Cblacktriangleright+%7D%5C%2C+%5Ctextrm%7Bif%7D%5C%2Cx%5Cneq+q%5E%7B%5Ctriangleleft+%7D+%5C%2C%26x%5Csquare+%5Cmapsto%5Cdiamond+x+%5C%2C+%5Ctextrm%7Bif%7D%5C%2C+x+%5Cneq+q%5E%7B%5Ctriangleright+%7D%5C%5C+x_%7B%5Cblacktriangleright%7D+%5Cdiamond+%5Cmapsto%5Cdiamond+x%5C%2C%26q%5E%7B%5Ctriangleright+%7D+%5Csquare+%5Cmapsto+q%5E%7B%5Ctriangleright+%7DB_%7B%5Cblacktriangleright+%7D+%5C%5C+a%5C%2Cb+%5Cmapsto+a%5C%2Cb_%7B%5Cblacktriangleright%7D+%26+B_%7B%5Cblacktriangleright+%7D%5Csquare%5Cmapsto+%5Cdiamond+B%5C%5C+q%5E%7B%5Ctriangleleft+%7Da+%5Cmapsto+q%5E%7B%5Ctriangleleft+%7Da_%7B%5Cblacktriangleright+%7D+%26+%5Cblacksquare+%5Cdiamond+%5Cmapsto+%5Cdiamond+%5Cblacksquare+%5C%5C+a%5C%2Cq%5E%7B%5Ctriangleright+%7D+%5Cmapsto+a%5C%2Cq_%7B%5Cblacktriangleright+%7D%5E%7B%5Ctriangleright+%7D+%26+%5Cend%7Bmatrix%7D" alt="\begin{matrix} \blacksquare x \mapsto\blacksquare x_{\blacktriangleright }\, \textrm{if}\,x\neq q^{\triangleleft } \,&amp;x\square \mapsto\diamond x \, \textrm{if}\, x \neq q^{\triangleright }\\ x_{\blacktriangleright} \diamond \mapsto\diamond x\,&amp;q^{\triangleright } \square \mapsto q^{\triangleright }B_{\blacktriangleright } \\ a\,b \mapsto a\,b_{\blacktriangleright} &amp; B_{\blacktriangleright }\square\mapsto \diamond B\\ q^{\triangleleft }a \mapsto q^{\triangleleft }a_{\blacktriangleright } &amp; \blacksquare \diamond \mapsto \diamond \blacksquare \\ a\,q^{\triangleright } \mapsto a\,q_{\blacktriangleright }^{\triangleright } &amp; \end{matrix}" eeimg="1"></p>
 <p data-pid="hun6XsSA">接下来：</p>
 <p data-pid="8Hq6NA3o"><img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D_%7BM%7D" alt="\mathscr{A}_{M}" eeimg="1"> 使用配置 <img src="https://www.zhihu.com/equation?tex=%5Cblacksquare+q_%7B0%7D%5E%7B%5Ctriangleright+%7D%5Cdiamond+a_%7B1%7D%5Cdiamond+a_%7B2%7D...%5Cdiamond+a_%7Bn%7D%5Cdiamond+" alt="\blacksquare q_{0}^{\triangleright }\diamond a_{1}\diamond a_{2}...\diamond a_{n}\diamond " eeimg="1"> 来模拟在输入 <img src="https://www.zhihu.com/equation?tex=a_%7B1%7Da_%7B2%7D...a_%7Bn%7D" alt="a_{1}a_{2}...a_{n}" eeimg="1"> 上运行的图灵机。 <img src="https://www.zhihu.com/equation?tex=Q%5Ctimes%5Cleft%5C%7B+%5Ctriangleleft+%2C%5Ctriangleright+%5Cright%5C%7D" alt="Q\times\left\{ \triangleleft ,\triangleright \right\}" eeimg="1"> 中的一个符号充当图灵机的读写头的作用，面向左 <img src="https://www.zhihu.com/equation?tex=%5Ctriangleleft+" alt="\triangleleft " eeimg="1"> 或右 <img src="https://www.zhihu.com/equation?tex=%5Ctriangleright" alt="\triangleright" eeimg="1"> ，从而指示接下来扫描左侧还是右侧的操作带上的符号。通过每个带上符号和读写头两个状态 <img src="https://www.zhihu.com/equation?tex=x" alt="x" eeimg="1"> 和 <img src="https://www.zhihu.com/equation?tex=x_%7B%5Cblacktriangleright+%7D" alt="x_{\blacktriangleright }" eeimg="1"> 的 stop-and-go 同步形式实现可控转换。转换由左分隔符 <img src="https://www.zhihu.com/equation?tex=%5Cblacksquare+" alt="\blacksquare " eeimg="1"> 开始；如果与符号 x 相邻则 block transformations 中的 <img src="https://www.zhihu.com/equation?tex=%5Cblacksquare+x+%5Cmapsto%5Cblacksquare+x_%7B%5Cblacktriangleright+%7D%5C%2C+%5Ctextrm%7Bif%7D%5C%2Cx%5Cneq+q%5E%7B%5Ctriangleleft+%7D+%5C%2C" alt="\blacksquare x \mapsto\blacksquare x_{\blacktriangleright }\, \textrm{if}\,x\neq q^{\triangleleft } \," eeimg="1"> 会将 x 转换为 <img src="https://www.zhihu.com/equation?tex=x_%7B%5Cblacktriangleright+%7D" alt="x_{\blacktriangleright }" eeimg="1"> 并且它向右移动一格变回 x 并与 <img src="https://www.zhihu.com/equation?tex=%5Cdiamond+" alt="\diamond " eeimg="1"> 交换位置。如果 <img src="https://www.zhihu.com/equation?tex=x%2Cy%5Cin+T" alt="x,y\in T" eeimg="1"> 且两个符号相邻，则右边符号被触发为状态 <img src="https://www.zhihu.com/equation?tex=y_%7B%5Cblacktriangleright+%7D" alt="y_{\blacktriangleright }" eeimg="1"> 。如果它们其中一个位于带上；另一个作为图灵机读写头的作用，则自动机利用余下的 block transformations:</p>
 <p data-pid="2abVvbg-"><img src="https://www.zhihu.com/equation?tex=%5Cbegin%7Bmatrix%7D+%5Cmathrm%7BIf%7D%5C%2C%5Cdelta+%28q%2Ca%29%3D%28p%2Cb%2CR%29+%26+%5Cmathrm%7BIf%7D%5C%2C%5Cdelta+%28q%2Ca%29%3D%28p%2Cb%2CL%29+%5C%5C+q%5E%7B%5Ctriangleright+%7Da%5Cmapsto+bp_%7B%5Cblacktriangleright+%7D%5E%7B%5Ctriangleright+%7D+%26+q%5E%7B%5Ctriangleright+%7Da%5Cmapsto+p%5E%7B%5Ctriangleleft+%7Db_%7B%5Cblacktriangleright%7D%5C%5C+aq%5E%7B%5Ctriangleleft+%7D%5Cmapsto+bp_%7B%5Cblacktriangleright+%7D%5E%7B%5Ctriangleright+%7D+%26+aq%5E%7B%5Ctriangleleft+%7D%5Cmapsto+p%5E%7B%5Ctriangleleft+%7Db_%7B%5Cblacktriangleright+%7D+%5Cend%7Bmatrix%7D" alt="\begin{matrix} \mathrm{If}\,\delta (q,a)=(p,b,R) &amp; \mathrm{If}\,\delta (q,a)=(p,b,L) \\ q^{\triangleright }a\mapsto bp_{\blacktriangleright }^{\triangleright } &amp; q^{\triangleright }a\mapsto p^{\triangleleft }b_{\blacktriangleright}\\ aq^{\triangleleft }\mapsto bp_{\blacktriangleright }^{\triangleright } &amp; aq^{\triangleleft }\mapsto p^{\triangleleft }b_{\blacktriangleright } \end{matrix}" eeimg="1"></p>
 <p data-pid="vTfp7Odx">来模拟在图灵机上的一个计算步骤。</p>
 <p data-pid="-FqpeeIu">最终结论： <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D_%7BM%7D" alt="\mathscr{A}_{M}" eeimg="1"> 停机时间会在少于 4 个时间单位当且仅当图灵机 M 在输入 w 上停机；如果 M 不停机则 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BA%7D_%7BM%7D" alt="\mathscr{A}_{M}" eeimg="1"> 会在 4 个时间单位时进入配置 <img src="https://www.zhihu.com/equation?tex=%5Cdiamond+%5E%7B%5Cinfty%7D" alt="\diamond ^{\infty}" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="ZKqXetC_">N.极限递归 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="e7lUYNxI">由 Gold 提出的极限递归理论中图灵停机问题可以在一个有限时间里得到判定结果，不过我们不能知道这个结果在确切何时取得，于是大部分学者认为在无限长时间后才能取得结果。</p>
 <p data-pid="8Nnx4-dy">更具体地：如果一个函数 P 是一个极限递归谓词，则满足一个广义递归函数 f 对于每一个 <img src="https://www.zhihu.com/equation?tex=%28x_%7B1%7D%EF%BC%8C...%EF%BC%8Cx_%7Bn%7D%29" alt="(x_{1}，...，x_{n})" eeimg="1"> 当且仅当</p>
 <p data-pid="GglE8O9w"><img src="https://www.zhihu.com/equation?tex=P%5Cleft%28+x_%7B1%7D+%2C...%2Cx_%7Bn%7D%5Cright%29%5CLongleftrightarrow+%5Clim_%7By+%5Crightarrow+%5Cinfty%7D%7Bf%5Cleft%28+x_%7B1%7D+%2C...%2Cx_%7Bn%7D%2Cy%5Cright%29%7D%3D1" alt="P\left( x_{1} ,...,x_{n}\right)\Longleftrightarrow \lim_{y \rightarrow \infty}{f\left( x_{1} ,...,x_{n},y\right)}=1" eeimg="1"></p>
 <p data-pid="43anoFD4"><img src="https://www.zhihu.com/equation?tex=%5Cneg+P%5Cleft%28+x_%7B1%7D+%2C...%2Cx_%7Bn%7D%5Cright%29%5CLongleftrightarrow+%5Clim_%7By+%5Crightarrow+%5Cinfty%7D%7Bf%5Cleft%28+x_%7B1%7D+%2C...%2Cx_%7Bn%7D%2Cy%5Cright%29%7D%3D0" alt="\neg P\left( x_{1} ,...,x_{n}\right)\Longleftrightarrow \lim_{y \rightarrow \infty}{f\left( x_{1} ,...,x_{n},y\right)}=0" eeimg="1"></p>
 <p data-pid="MHESAHd9">其中：</p>
 <p data-pid="Gw_FVhyr"><img src="https://www.zhihu.com/equation?tex=%5Clim_%7By+%5Crightarrow+%5Cinfty%7D%7Bf%5Cleft%28+x_%7B1%7D%2C...%2Cx_%7Bn%7D+%2Cy%5Cright%29%7D%3Dk%5Coverset%7B%5Cunderset%7B%5Cmathrm%7Bdef%7D%7D%7B%7D%7D%7B%3D%7D%5Cexists+y+%5Cforall+z%5Cleft%28+z%5Cgeq+y+%5Crightarrow+f%5Cleft%28+x_%7B1%7D%2C...%2Cx_%7Bn%7D+%2Cz%5Cright%29%3Dk%5Cright%29" alt="\lim_{y \rightarrow \infty}{f\left( x_{1},...,x_{n} ,y\right)}=k\overset{\underset{\mathrm{def}}{}}{=}\exists y \forall z\left( z\geq y \rightarrow f\left( x_{1},...,x_{n} ,z\right)=k\right)" eeimg="1"></p>
 <p data-pid="cqplppXT">而极限递归谓词 P 位于 <img src="https://www.zhihu.com/equation?tex=%5CDelta_%7B2%7D%5E%7B0%7D" alt="\Delta_{2}^{0}" eeimg="1"> 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="pGA9UjCB">O.波计算机</p>
 <p data-pid="9ehBZAB5">在物理学家费曼的演讲《The Character of Physical Law》中提及，对于物理现象的计算机仿真时，即使做了全面离散化也不保证仿真的有效性，从而所谓有限自然假说的初衷无法满足。在实数域上可以存在无限多不可计算的连续函数，并且求导和积分不保持可计算性。那么描述某个物理体系的微分方程完全可以有一个不可计算的解，不满足“总能用有限步运算逼近到充分的精度”的条件。上世纪80年代，文献 Advances in mathematics 39,215-239（1981）中：机械波的存在遵循着三维波动方程（wave equation）：</p>
 <p data-pid="FVMe19Z_"><img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B%5Cpartial%5E2+u%7D%7Bd+x%5E%7B2%7D%7D%2B%5Cfrac%7B%5Cpartial%5E2+u%7D%7B%5Cpartial+y%5E2%7D%2B%5Cfrac%7B%5Cpartial%5E2u+%7D%7B%5Cpartial+z%5E2%7D-%5Cfrac%7B%5Cpartial%5E2u+%7D%7B%5Cpartial+t%5E2%7D%3D0" alt="\frac{\partial^2 u}{d x^{2}}+\frac{\partial^2 u}{\partial y^2}+\frac{\partial^2u }{\partial z^2}-\frac{\partial^2u }{\partial t^2}=0" eeimg="1"></p>
 <p data-pid="ReNL93l_">而为了使该波动方程具有唯一的解，这个唯一解 u 将由两个初始条件（initial conditions）所决定：</p>
 <p data-pid="uruP528U">当 t = 0 时 ： <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7B%5Cpartial+u%7D%7B%5Cpartial+t%7D%5Cleft%28+x%2Cy%2Cz%2C0+%5Cright%29%3D0" alt="\frac{\partial u}{\partial t}\left( x,y,z,0 \right)=0" eeimg="1"> 和 <img src="https://www.zhihu.com/equation?tex=u%5Cleft%28+x%2Cy%2Cz%2C0+%5Cright%29" alt="u\left( x,y,z,0 \right)" eeimg="1"></p>
 <p data-pid="vhs2TrEP">而初始条件可由一个图灵可计算函数 f 所对应： <img src="https://www.zhihu.com/equation?tex=u%5Cleft%28+x%2Cy%2Cz%2C0+%5Cright%29%3Df%5Cleft%28+x%2Cy%2Cz+%5Cright%29" alt="u\left( x,y,z,0 \right)=f\left( x,y,z \right)" eeimg="1"></p>
 <p data-pid="Sq2_rem9">但在 t 时刻后，f 在波动方程中的解 <img src="https://www.zhihu.com/equation?tex=u%5Cleft%28+x%2Cy%2Cz%2Ct+%5Cright%29" alt="u\left( x,y,z,t \right)" eeimg="1"> 不可计算，且该解的数值 <img src="https://www.zhihu.com/equation?tex=u%5Cleft%28+0%2C0%2C0%2C1+%5Cright%29" alt="u\left( 0,0,0,1 \right)" eeimg="1"> 是一个不可计算的实数。</p>
 <p data-pid="MKef-ebV">即：可以用机械波构造出了初始条件可计算，但解一般不可计算的一个范例。曾被提议制造利用机械波为计算介质进行超计算的波计算机。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="jRpLnHDO">Q.超递归算法（Super-recursive algorithm）. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="W2bAl2S8">由 Mark Burgin 提出，并在此基础上提出好几种新的计算模型（例如Gold提出的极限递归就是其中之一。）。他的论述依赖于对算法更广泛的定义， 这种定义上的扩展使得一些归纳性图灵机包含的不可计算函数变得可计算。并且 Mark Burgin 相信他的超递归算法理论可用于反证丘奇-图灵论题。不过这种对邱奇-图灵论题的解读与计算机科学的常规解读不同，把超递归算法归于邱奇-图灵意义上的算法的这种看法并未受到计算领域的广泛接受。</p>
 <p data-pid="f_zMaMxi">Mark Burgin 的归纳图灵机 （inductive Turing Machine）与经典图灵机类似，与之不同的是在于它们决定输出的方式(即:，计算的结果)。在它的操作过程中，一个归纳机器在连续的方格上打印符号，这些符号构成了计算结果的符号序列。有时，如果机器进入了它的停机状态，它就会停止运转，就像一台普通图灵机一样。然而，有些情况下，机器实际上并没有停止，但这并不能阻止机器给出结果。</p>
 <p data-pid="9IuDLhIQ">所以：对于任意图灵机 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> ，有一个归纳图灵机 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> ， <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 可以计算与 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> 相同的函数。</p>
 <p data-pid="wngBQCzf">归纳图灵机有三个部件组成： hardware, software, infware. 接受的语言是一个三元组 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+L_%7Bi%7D+%2CL_%7Bw%7D%2CL_%7Bo%7D%5Cright%29" alt="\left( L_{i} ,L_{w},L_{o}\right)" eeimg="1"> 且 <img src="https://www.zhihu.com/equation?tex=+L_%7Bi%7D+%5Cne+L_%7Bw%7D%5Cne+L_%7Bo%7D+%5Cne+L_%7Bi%7D" alt=" L_{i} \ne L_{w}\ne L_{o} \ne L_{i}" eeimg="1"> 。</p>
 <p data-pid="EfyRxG81">特别地， <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 是一个归纳图灵机，它包含一个通用图灵机 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BU%7D" alt="\mathscr{U}" eeimg="1"> 作为子程序。给定一个图灵机 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> 的字符串 u 和一个 description <img src="https://www.zhihu.com/equation?tex=D%5Cleft%28+%5Cmathscr%7BT%7D+%5Cright%29" alt="D\left( \mathscr{T} \right)" eeimg="1"> 。 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 使用 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BU%7D" alt="\mathscr{U}" eeimg="1"> 来模拟输入 u 运行的 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> 。在操作过程中， <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 在输出磁带上写入一个 0 。如果 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BU%7D" alt="\mathscr{U}" eeimg="1"> 停机，意味着 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> 在输入 u 上停机： <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 写入1。现在 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BM%7D" alt="\mathscr{M}" eeimg="1"> 的计算结果等于 1 如果 <img src="https://www.zhihu.com/equation?tex=%5Cmathscr%7BT%7D" alt="\mathscr{T}" eeimg="1"> 停机，否则等于0。</p>
 <p data-pid="U3puWvqP">更重要的是：一个关系 <img src="https://www.zhihu.com/equation?tex=Y%5Cin+%5CPi_%7Bn%7D%5E%7B0%7D%5Ccup+%5CSigma_%7Bn%7D%5E%7B0%7D" alt="Y\in \Pi_{n}^{0}\cup \Sigma_{n}^{0}" eeimg="1"> 都存在一个 n 阶归纳图灵机使得可以判定 Y 。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="NRS0vdKj">R.量子引力计算机</p>
 <p data-pid="2B8rcQnM">著名的数学物理学家罗杰<b>·</b>彭罗斯 ( Roger Penrose ) 走出了更加大胆的一步，他推测量子引力不可能用普通计算机或者量子计算机来模拟，即使有可以任你处置的无限的时间和内存。彭罗斯认为应把模拟量子引力的问题归入逻辑学家阿兰.图灵( Alan Turing )和库尔特·科德尔( Kurt Godel )在1930年代所研究的一类问题中，这些问题里有的比 NP 完全问题还要难解--比如确定一个给定的计算机程序是否会停止运行的问题( 比如说“停机问题” )。</p>
 <p data-pid="BoobSfDt">最新的量子引力学的进展好像支持一个相反的结论，即它们暗示一台标准的量子计算机甚至可以模拟量子引力过程，比如黑洞的形成与消失。最值得一提的是源自弦理论的 Ads/CFT 对偶 ，它断定了两种看起来极为不同的理论之间的“对偶性”。对偶的一边是反德西特空间( Anti de Sitter )理论:它是关于一个假想宇宙的一个理论，这个假想宇宙有一个负的宇宙常数，它导致整个宇宙被一个反射边界所包围。而另一边则是共场理论( Conformal Field Theory ):一个没有引力，只存在于 AdS 空间的边界上的“普通”量子场理论。Ads/CFT 对偶原理已有压倒性的(虽非确凿的)证据指出，任何关于在 AdS 空间中是什么情况的问题都可以转化为关于 CFT 的一个“相当的”问题，反之亦然。</p>
 <p data-pid="BWZq_cXH">这就意味着，如果我们想在AdS空间中模拟量子引力现象，我们就可能可以先把这个问题转化到CFT 那一边，然后在量子计算机中模拟这个 CFT ，最后再将结果转化回 AdS 中。这其中最关键的一点是，因为 CFT 不包括引力，在量子计算机中模拟它的难度就“仅仅”是相对简单的如何在量子计算机中模拟量子场论的问题。更广义地说，我们能从 AdS/CFT 中所了解到的是，即便量子引力论看起来“疯狂”--即使它包括了非定域性、虫洞及其他的新奇事物--它也可能有一个更加“驯服”的与之对偶的叙述方式。(要让这成为可能， AdS 与 CFT 描述之间的转化需要在计算上是高效的--也有可能有些情形下它没办法高效。)</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="2WPPS3on">S. Coupled Turing Machines <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="2oHl2OMi">该模型也由 Copeland 和 Sylvan 提出。这是在计算过程中拥有一个或多个输入通道来提供输入的计算模型。这一输入可以以机器的字母表中的一个符号的形式写在机器的操作带的第一个方格上。这个方格是为特殊的输入而保留，不能由读写头写入。与谕示机一样, 特定的输入序列决定了 Coupled Turing Machines 可以执行的功能。例如，如果模型有一个又一个的 <img src="https://www.zhihu.com/equation?tex=%5Ctau" alt="\tau" eeimg="1"> 位输入，则该模型可以计算所有其他的递归可枚举函数。</p>
 <p data-pid="2vIce-j5">具体地：设一个数 <img src="https://www.zhihu.com/equation?tex=u%5Cin%5Cmathbb%7BR%7D" alt="u\in\mathbb{R}" eeimg="1"> 是一个位于 <img src="https://www.zhihu.com/equation?tex=%5Cleft%5C%7B+0%2C1+%5Cright%5C%7D" alt="\left\{ 0,1 \right\}" eeimg="1"> 之间的一个不可计算实数，且形式为： <img src="https://www.zhihu.com/equation?tex=0.a_%7B1%7Da_%7B2%7Da_%7B3%7D..." alt="0.a_{1}a_{2}a_{3}..." eeimg="1"></p>
 <p data-pid="XJWtAPta">Coupled Turing Machine 的输入通道在 T 的操作带的一个方格上写入符号，输入数据流中的第一个符号是 <img src="https://www.zhihu.com/equation?tex=a_%7B1%7D" alt="a_{1}" eeimg="1"> ，第二个符号是 <img src="https://www.zhihu.com/equation?tex=a_%7B2%7D" alt="a_{2}" eeimg="1"> ，依此类推。当每一个符号被写入时，CTM 可以执行一些微不足道的计算，例如：乘以2；并将结果写在操作带的某些指定的方格上。</p>
 <p data-pid="A75FPNdu">所以：一个 CTM 可以计算出比通用图灵机更多的东西。</p>
 <p data-pid="7ZauXUHs">P.S 被换下来的 Asynchronous Networks [1] 和 Error Prone [2] 模型可查阅：</p>
 <blockquote data-pid="eC8bBym5">
  [1] Copeland and Sylvan , Beyond the universal Turing machine. <i>Australasian Journal of Philosophy 77, 1 (1999), 44–66.</i>
  <br>
  [2] Toby Ord , Hypercomputation:computing more than the Turing barrier 
  <br><i><a href="https://link.zhihu.com/?target=https%3A//arxiv.org/abs/math/0209332" class=" wrap external" target="_blank" rel="nofollow noreferrer">available version</a></i>
 </blockquote>
 <p class="ztext-empty-paragraph"><br></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="8QiTaE-G">在计算理论历史上，也有人提出过量子版本的 hypercomputation 模型。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="NFFNHqF4">T.量子模型. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="aY-zQOyn">1990年，Norton 探讨了 Supertask 在量子领域实现的可能性。他考虑了一个具有无限晶格点阵（Infinite lattice）的交互谐振子（Harmonic oscillators）系统。如下图所示：</p>
 <p class="ztext-empty-paragraph"><br></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-1b19237865dc74d04cee2c5339ca238b_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1000" data-rawheight="81" data-original-token="v2-1b19237865dc74d04cee2c5339ca238b" class="origin_image zh-lightbox-thumb" width="1000" data-original="https://pica.zhimg.com/v2-1b19237865dc74d04cee2c5339ca238b_r.jpg?source=1940ef5c">
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="00tgVo8d">Norton 假设每两个谐振子之间的 spring 都具有相同张力以及相同的系统运动方程解，Norton 发现它可以自发地在有限的时间内产生无限连续的振荡。利用这个系统作为模型, Norton 制造了一个类似 Supertask 的谐振子量子晶格点阵。</p>
 <p data-pid="P60rmPkx">以一个无限晶格点阵的 2 维量子系统作起始，其每一个谐振子都具有一个基态 <img src="https://www.zhihu.com/equation?tex=%7C%5Cphi+%5Crangle" alt="|\phi \rangle" eeimg="1"> 和一个激发态 <img src="https://www.zhihu.com/equation?tex=%7C%5Cchi+%5Crangle" alt="|\chi \rangle" eeimg="1"> 。考虑粒子们的 basis vectors， 其向量集 （Collection of vectors）：</p>
 <p data-pid="lDFfeQeE"><img src="https://www.zhihu.com/equation?tex=+%7C0%5Crangle%3D+%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes...+" alt=" |0\rangle= |\phi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes... " eeimg="1"></p>
 <p data-pid="b-57CNrO"><img src="https://www.zhihu.com/equation?tex=%7C1%5Crangle%3D+%7C%5Cchi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes..." alt="|1\rangle= |\chi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes..." eeimg="1"></p>
 <p data-pid="fkedNwIP"><img src="https://www.zhihu.com/equation?tex=%7C2%5Crangle%3D+%7C%5Cphi%5Crangle%5Cotimes%7C%5Cchi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes..." alt="|2\rangle= |\phi\rangle\otimes|\chi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes..." eeimg="1"></p>
 <p data-pid="zZfVe3w3"><img src="https://www.zhihu.com/equation?tex=%7C3%5Crangle%3D+%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cchi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes..." alt="|3\rangle= |\phi\rangle\otimes|\phi\rangle\otimes|\chi\rangle\otimes|\phi\rangle\otimes..." eeimg="1"></p>
 <p data-pid="JCqw2URZ"><img src="https://www.zhihu.com/equation?tex=%7C4%5Crangle%3D+%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cphi%5Crangle%5Cotimes%7C%5Cchi%5Crangle%5Cotimes..." alt="|4\rangle= |\phi\rangle\otimes|\phi\rangle\otimes|\phi\rangle\otimes|\chi\rangle\otimes..." eeimg="1"></p>
 <p data-pid="mF1KSPi5">......</p>
 <p data-pid="yAByiCpD">之后 Norton 得到了这交互系统薛定谔方程的微分形式：</p>
 <p data-pid="H3Vqk57r"><img src="https://www.zhihu.com/equation?tex=i%5Cfrac%7BdC_%7B0%7D%7D%7Bdt%7D%3D0+%2C...%2C%5C%2C%5C%2C%5C%2Ci%5Cfrac%7BdC_%7Bn%7D%7D%7Bdt%7D%3DC_%7Bn%7D%2Bia%5Cleft%28+C_%7Bn-1%7D-C_%7Bn%2B1%7D+%5Cright%29%2C..." alt="i\frac{dC_{0}}{dt}=0 ,...,\,\,\,i\frac{dC_{n}}{dt}=C_{n}+ia\left( C_{n-1}-C_{n+1} \right),..." eeimg="1"></p>
 <p data-pid="3fqOm-z2">Norton 争辩说, 他的解决方案中在无限晶格中的所有节点开始由基态转变为激发态的时间是有限的。</p>
 <p data-pid="NqQnc3Qx">Norton 的量子 Supertask 需要一个非标准（Non-standard）的量子系统，因为他所提出的动力学演化不是幺正（unitary）的, 即使它服从一个微分方程形式的薛定谔方程的波函数空间中。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="PynoNAkv">U. 量子模型二. <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="jUwzYGlX">如果我们不断地监控一个量子系统, 比如一个不稳定的原子, 会发生什么？预测的效果是系统不会改变, 即使它是一个不稳定的原子，也会迅速衰变。</p>
 <p data-pid="ZGN4xw7z">1977年，Misra 和 Sudarshan 提出对一个芝诺式 supertask 的系统进行“精确监测”。假设一个不稳定的原子是根据某种幺正演化定律（law of unitary evolution ） <img src="https://www.zhihu.com/equation?tex=U_%7Bt%7D" alt="U_{t}" eeimg="1"> 而演化的。假设我们衡量的原子是否已经发生衰变是遵循芝诺二分法的回归形式。即我们在时间 <img src="https://www.zhihu.com/equation?tex=t" alt="t" eeimg="1"> 进行测量；而后在时间 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7Bt%7D%7B2%7D" alt="\frac{t}{2}" eeimg="1"> 进行测量；接着在时间 <img src="https://www.zhihu.com/equation?tex=%5Cfrac%7Bt%7D%7B4%7D" alt="\frac{t}{4}" eeimg="1"> 进行测量，等等。让 <img src="https://www.zhihu.com/equation?tex=E" alt="E" eeimg="1"> 为粒子初始未衰变状态的射影（projection）。在 supertask 的每个阶段找到原子未衰变阶段然后对应于每个序列：</p>
 <p data-pid="tgYL1s4l"><img src="https://www.zhihu.com/equation?tex=EU_%7B%5Cfrac%7Bt%7D%7B2%5E%7Bn%7D%7D%7DE%2C%5Cleft+%28n+%5Cgeq+0+%5Cright+%29" alt="EU_{\frac{t}{2^{n}}}E,\left (n \geq 0 \right )" eeimg="1"></p>
 <p data-pid="4OQR79kQ">Misra 和 Sudarshan 使用此序列作为一种模型进行连续测量，假设上面的序列收敛于一个算子： <img src="https://www.zhihu.com/equation?tex=T%5Cleft+%28+t+%5Cright+%29%3DE" alt="T\left ( t \right )=E" eeimg="1"> 而这样做的所有时间大于或等于零。然后在固定时间 t=0 对原子进行连续观测。他们从这个假设证明, 对于大多数合理的量子系统, 如果初始状态在 <img src="https://www.zhihu.com/equation?tex=%5Ctextrm%7BTr%7D%5Cleft+%28+%5Crho+E+%5Cright+%29%3D1" alt="\textrm{Tr}\left ( \rho E \right )=1" eeimg="1"> 的意义上是未衰变的，那么原子在任意给定时间间隔 <img src="https://www.zhihu.com/equation?tex=%5Cleft+%5B+0%2C1+%5Cright+%5D" alt="\left [ 0,1 \right ]" eeimg="1"> 中衰变的概率等于零。也就是说, 持续的监测意味着原子不会衰变。</p>
 <p data-pid="zzIJL_nA">同时意味着，如果我们可以连续地测量一个不稳定原子以观察它是否仍然处于初始状态，则始终能发现该原子处于初始状态。</p>
 <p data-pid="k1df2kUy">这个提议引发了大量的反响。Ghirardi 等人和 Pati 反对这样的芝诺式量子测量模型，因为它与量子理论的其他特征，如时间-能量不确定关系（time-energy uncertainty relations）相抵触。不过 Bokulish 认为，这种 Supertask 仍然可以进行：当满足对系统的测量（measurement ）与系统的幺正演化（unitary evolution）相交换且 E 为其能量本征态的投影（projection）。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="nfQEwkmx">V. Hypertask 模型 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="qXkTH9QX">Miha Habič 对原有的 Hamkins 无限时间图灵机进行拓展，得到了一个新的计算模型并在计算能力上与原有的无限时间图灵机进行比较。</p>
 <p data-pid="uwcw3fFP">与无限时间图灵机不同的是 Miha 模型会使用一个 “基数状态”（cardinal state）取代了“极限状态”。并且机器在 <img src="https://www.zhihu.com/equation?tex=%5Ckappa" alt="\kappa" eeimg="1"> 阶段 （stage <img src="https://www.zhihu.com/equation?tex=%5Ckappa" alt="\kappa" eeimg="1"> ）时允许 <img src="https://www.zhihu.com/equation?tex=%5Ckappa" alt="\kappa" eeimg="1"> 是一个<b>不可数</b>的无穷基数并执行以下操作：机器读写头位于第一个方格上；机器位于基数状态，操作带每一个方格的数值为前一个方格数值的极限上界 （lim sup）。</p>
 <p data-pid="Ecv0GlUk">定义机器的可计算函数都位于 Cantor space <img src="https://www.zhihu.com/equation?tex=2%5E%7B%5Comega%7D" alt="2^{\omega}" eeimg="1"> 上。接下来：</p>
 <p data-pid="s7aq3Mme">该机器可判定无限时间图灵机的停机问题。</p>
 <p data-pid="mJKuWzeO">ITTM 的停机问题： <img src="https://www.zhihu.com/equation?tex=0%5E%7B%5Cblacktriangledown+%7D%3D%5Cleft%5C%7B+%5Cleft%28+p%2Cx+%5Cright%29%3B%5Cvarphi_%7Bp%7D+%5Cleft%28+x+%5Cright%29%5Cdownarrow%5Cright%5C%7D" alt="0^{\blacktriangledown }=\left\{ \left( p,x \right);\varphi_{p} \left( x \right)\downarrow\right\}" eeimg="1"></p>
 <p data-pid="aBvtN3cQ">一个 stabilization problem ： <img src="https://www.zhihu.com/equation?tex=S%3D%5Cleft%5C%7B+%5Cleft%28+p%2Cx+%5Cright%29%3B+%5Cmathrm%7Bthe%5C%2C%5C%2Coutput%5C%2C%5C%2Cof%5C%2C%5C%2C%7D%5Cvarphi_%7Bp%7D%5Cleft%28+x+%5Cright%29%5Cmathrm%7Bstabilizes%7D%5Cright%5C%7D" alt="S=\left\{ \left( p,x \right); \mathrm{the\,\,output\,\,of\,\,}\varphi_{p}\left( x \right)\mathrm{stabilizes}\right\}" eeimg="1"></p>
 <p data-pid="_2ZBPTCg"><img src="https://www.zhihu.com/equation?tex=0%5E%7B%5Cblacktriangledown+%7D" alt="0^{\blacktriangledown }" eeimg="1"> 可简化为 S 的可判定性：给定一个程序 p 和一个输入 x ，同时构造一个类似与 p 的新程序 p' 可在完成 p 的各项指令后定义一个特定单元方格格式（称作 flag）；程序 p 会在 x 上停机当且仅当 p' 在 x 上稳定。</p>
 <p data-pid="KU-zelEt">同时 S 也是可判定的，考虑一个算法：一对 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+p%2Cx+%5Cright%29" alt="\left( p,x \right)" eeimg="1"> 它会模拟 <img src="https://www.zhihu.com/equation?tex=%5Cvarphi_%7Bp%7D%5Cleft%28+x+%5Cright%29" alt="\varphi_{p}\left( x \right)" eeimg="1"> 和每次模拟输出变化的特定单元格格式。当到达一个基数状态时，如果 flag 显示为 1，则输出 “No”，显示为 0 则输出 “Yes”。这个算法可判定 S。</p>
 <p data-pid="DABekzFS">接下来：</p>
 <p data-pid="4L7HiTsQ">机器的可计算函数都会在时间 <img src="https://www.zhihu.com/equation?tex=%5Caleph_%7B%5Comega_%7B1%7D%7D" alt="\aleph_{\omega_{1}}" eeimg="1"> 内停机，也就是说，在它的计算任务内至多可以执行的计算步骤总数为 <img src="https://www.zhihu.com/equation?tex=%5Caleph_%7B%5Comega_%7B1%7D%7D" alt="\aleph_{\omega_{1}}" eeimg="1">。这是一个相当大的不可数基数了。</p>
 <p data-pid="HXVkX0k6">在一个有限任务序列中可以执行<b>不可数无穷</b>数量的操作步骤，则称它为<b>超任务 </b>（Hypertask）。如果是可数无穷，为超级任务（Supertask）。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="8beLkrXJ">不过即使把计算任务步骤拓展到不可数无穷，虽然模型计算能力得到了提升，但并不显著。</p>
 <p data-pid="d5HuD1km">结论：该模型与配了 <img src="https://www.zhihu.com/equation?tex=0%5E%7B%5Cblacktriangledown+%7D" alt="0^{\blacktriangledown }" eeimg="1"> 谕示的无限时间图灵机在能力上是等价的。</p>
 <p data-pid="UCfTi20F">想象一下给无限时间图灵机配一个跳跃算子（jump-operator）黑箱：它可以把一个实数写在一个特殊带上，然后一个 <img src="https://www.zhihu.com/equation?tex=x%5E%7B%5Cbigtriangledown+%7D" alt="x^{\bigtriangledown }" eeimg="1"> jump 出现在另一条特殊带上。</p>
 <p data-pid="Ozk_m1YL">这种情况下可看做配了 <img src="https://www.zhihu.com/equation?tex=0%5E%7B%5Cblacktriangledown+%7D" alt="0^{\blacktriangledown }" eeimg="1"> 的无限时间谕示机。<b>然而</b>，它的计算能力仍然位于 <img src="https://www.zhihu.com/equation?tex=%5CDelta_%7B2%7D%5E%7B1%7D" alt="\Delta_{2}^{1}" eeimg="1"> 内。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="eFw6BJ61">W. 快子模型 <img src="https://www.zhihu.com/equation?tex=%5Cclubsuit" alt="\clubsuit" eeimg="1"></p>
 <p data-pid="33OiEwdW">在相对论中，一个基本事实是： <img src="https://www.zhihu.com/equation?tex=E%5E%7B2%7D-p%5E%7B2%7D%3Dm%5E%7B2%7D" alt="E^{2}-p^{2}=m^{2}" eeimg="1"> 。</p>
 <p data-pid="S2S8Aofe">E 是一个物体的能量, p 是它的动量, m 是它的静质量,我们就称之为“质量”。其中光速 <img src="https://www.zhihu.com/equation?tex=c%3D1" alt="c=1" eeimg="1"> 。</p>
 <p data-pid="gDs2Ak4f">具有质量的普通物质，处于光锥之内，速度小于光速；</p>
 <p data-pid="b_afR4F0">若 <img src="https://www.zhihu.com/equation?tex=E%5E%7B2%7D%3Dp%5E%7B2%7D" alt="E^{2}=p^{2}" eeimg="1"> ：零质量物质，存在光锥之上，速度等于光速；</p>
 <p data-pid="C0inOOIq">但理论上还存在另外一种情况，速度大于光速的物质：快子（tachyon）。</p>
 <p data-pid="1wkJDd72">单个快子的波函数满足描述自旋零粒子的一般方程即 Klein-Gordon quation： <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+%5Csquare+%2Bm%5E%7B2%7D%5Cright%29%5Cvarphi%3D0" alt="\left( \square +m^{2}\right)\varphi=0" eeimg="1"> .</p>
 <p data-pid="Q8GQ8uqr">其中 <img src="https://www.zhihu.com/equation?tex=%5Csquare" alt="\square" eeimg="1"> 是达朗伯算符 （d'Alembertian），其 3+1 维形式为：</p>
 <p data-pid="Fp4umS7G"><img src="https://www.zhihu.com/equation?tex=%5Csquare%3D%5Cfrac%7B%5Cpartial%5E%7B2%7D%7D%7B%5Cpartial+t%5E%7B2%7D%7D-%5Cfrac%7B%5Cpartial%5E%7B2%7D%7D%7B%5Cpartial+x%5E%7B2%7D%7D-%5Cfrac%7B%5Cpartial%5E%7B2%7D%7D%7B%5Cpartial+y%5E%7B2%7D%7D-%5Cfrac%7B%5Cpartial%5E%7B2%7D%7D%7B%5Cpartial+z%5E%7B2%7D%7D" alt="\square=\frac{\partial^{2}}{\partial t^{2}}-\frac{\partial^{2}}{\partial x^{2}}-\frac{\partial^{2}}{\partial y^{2}}-\frac{\partial^{2}}{\partial z^{2}}" eeimg="1"> ；</p>
 <p data-pid="QSbrGW-S">不同之处在于快子的 <img src="https://www.zhihu.com/equation?tex=m%5E%7B2%7D" alt="m^{2}" eeimg="1"> 是负的，所以质量为虚数。</p>
 <p data-pid="khECJL9R">虽然目前在实验上还没有观测到快子态, 但是相对论在理论上给出了其存在的可能性。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="80UCgVSU">Takaaki Musha 探讨了基于快子的计算模型是否会拥有超越图灵机的能力。</p>
 <p data-pid="b5S-_XS7">首先，Feynmann 定义了计算过程中每一步所需的能量为：</p>
 <p data-pid="N7KLVxlT"><img src="https://www.zhihu.com/equation?tex=per+%5C%2C%5C%2Cstep%3D2k_%7BB%7DT%5Cfrac%7Bf-b%7D%7Bf%2Bb%7D" alt="per \,\,step=2k_{B}T\frac{f-b}{f+b}" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=k_%7BB%7D" alt="k_{B}" eeimg="1"> 为玻尔兹曼常数，T 为温度，f 为计算正向速率，b为逆向速率。假设在计算过程中没有能量供应以及参数 f 和 b 是固定的，则无限次计算步骤可表示为：</p>
 <p data-pid="gzN1Dzjf"><img src="https://www.zhihu.com/equation?tex=E_%7B1%7D%3DkE_%7B0%7D%2C...%2CE_%7Bn%2B1%7D%3DkE_%7Bn%7D%2C..." alt="E_{1}=kE_{0},...,E_{n+1}=kE_{n},..." eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=E_%7B0%7D%3Dk_%7BB%7D%7BT%7D%EF%BC%8Ck%3D%5Cfrac%7B2%28f-b%29%7D%7Bf%2Bb%7D" alt="E_{0}=k_{B}{T}，k=\frac{2(f-b)}{f+b}" eeimg="1"></p>
 <p data-pid="6fckj3Cr"><img src="https://www.zhihu.com/equation?tex=E_%7Bn%7D" alt="E_{n}" eeimg="1"> 为第 n 步计算的能量。从上面得到 <img src="https://www.zhihu.com/equation?tex=E_%7Bn%7D%3Dk%5E%7Bn%7DE_%7B0%7D" alt="E_{n}=k^{n}E_{0}" eeimg="1"> ,然后每一个计算步骤的能量损失为： <img src="https://www.zhihu.com/equation?tex=%5CDelta+E_%7Bn%7D%3DE_%7Bn-1%7D-E_%7Bn%7D%3D%5Cleft%28+1-k+%5Cright%29k%5E%7Bn-1%7DE_%7B0%7D" alt="\Delta E_{n}=E_{n-1}-E_{n}=\left( 1-k \right)k^{n-1}E_{0}" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=n%5Cgeq1" alt="n\geq1" eeimg="1"> 。</p>
 <p data-pid="6qdQuNUM">而一个平均能量为 <img src="https://www.zhihu.com/equation?tex=%5CDelta+E" alt="\Delta E" eeimg="1"> 的量子系统演化出一个正交态（orthogonal state）的时间 <img src="https://www.zhihu.com/equation?tex=%5CDelta+t" alt="\Delta t" eeimg="1"> 至少为 ：</p>
 <p data-pid="7HVtvwbE"><img src="https://www.zhihu.com/equation?tex=%5CDelta+t%3D%5Cfrac%7B%5Cpi+%5Chbar%7D%7B2%5CDelta+E%7D" alt="\Delta t=\frac{\pi \hbar}{2\Delta E}" eeimg="1"> ， 设置 <img src="https://www.zhihu.com/equation?tex=E%3D%5CDelta+E_%7Bi%7D" alt="E=\Delta E_{i}" eeimg="1"> ， 则无限计算步骤的总能量就等于 <img src="https://www.zhihu.com/equation?tex=E_%7B0%7D" alt="E_{0}" eeimg="1"> 。</p>
 <p data-pid="7jNIMR3q">这样无限计算步骤所需要的总时间为：</p>
 <p data-pid="5Og5iAxn"><img src="https://www.zhihu.com/equation?tex=T%3D%5Csum_%7Bi%3D1%7D%5E%7B%5Cinfty%7D%7B%5CDelta+t_%7Bn%7D%7D%3D%5Cfrac%7B%5Cpi+%5Chbar%7D%7B2E_%7B0%7D%7D%5Csum_%7Bi%3D1%7D%5E%7B%5Cinfty%7D%7B%5Cfrac%7B1%7D%7B%5Cleft%28+1-k+%5Cright%29k%5E%7Bn-1%7D%7D%7D" alt="T=\sum_{i=1}^{\infty}{\Delta t_{n}}=\frac{\pi \hbar}{2E_{0}}\sum_{i=1}^{\infty}{\frac{1}{\left( 1-k \right)k^{n-1}}}" eeimg="1"></p>
 <p data-pid="eNU-X1oN">不过如果仅仅是这样的话，上式在满足 <img src="https://www.zhihu.com/equation?tex=0%3Ck%3C1" alt="0<k<1" eeimg="1"> 时，无限步骤计算需要无限的时间。</p>
 <p data-pid="Miig7LoD">现在引入快子。</p>
 <p data-pid="4R9B7mlP">相对论关系对于快子也是有效的，即使是一个虚质量 <img src="https://www.zhihu.com/equation?tex=i+%5Ccdot%5C%2Cm_%7B0%7D" alt="i \cdot\,m_{0}" eeimg="1"> ; 于是得到了新形式： <img src="https://www.zhihu.com/equation?tex=E%3D%5Cfrac%7Bm_%7B0%7Dc%5E%7B2%7D%7D%7B%5Csqrt%7B%5Cleft%28+%5Cfrac%7Bv%7D%7Bc%7D+%5Cright%29%5E%7B2%7D-1%7D%7D%5C%2C%5C%2C%5C%2C%5C%2C%5C%2C%5C%2Cp%3D%5Cfrac%7Bm_%7B0%7Dv%7D%7B%5Csqrt%7B%5Cleft%28+%5Cfrac%7Bv%7D%7Bc%7D+%5Cright%29%5E%7B2%7D-1%7D%7D" alt="E=\frac{m_{0}c^{2}}{\sqrt{\left( \frac{v}{c} \right)^{2}-1}}\,\,\,\,\,\,p=\frac{m_{0}v}{\sqrt{\left( \frac{v}{c} \right)^{2}-1}}" eeimg="1"></p>
 <p data-pid="Oljgnt05"><b>然而不确定性关系对于快子也是有效的</b>，定义新的时间-能量不确定性关系：</p>
 <p data-pid="z7xtU9ts"><img src="https://www.zhihu.com/equation?tex=%5CDelta+E%5CDelta+t%5Capprox+%5Cfrac%7B%5Chbar%7D%7B%5Cfrac%7Bv%7D%7Bc%7D%5Cleft%28+%5Cfrac%7Bv%7D%7Bc%7D-1+%5Cright%29%7D" alt="\Delta E\Delta t\approx \frac{\hbar}{\frac{v}{c}\left( \frac{v}{c}-1 \right)}" eeimg="1"></p>
 <p data-pid="fQZkx_aU">快子的量子计算系统所需要的总时间就变成了：</p>
 <p data-pid="QSbY5UUn"><img src="https://www.zhihu.com/equation?tex=T%3D%5Cfrac%7B%5Cpi+%5Chbar%7D%7B2E_%7B0%7D%7D%5Csum_%7Bi%3D1%7D%5E%7B%5Cinfty%7D%7B%5Cfrac%7B1%7D%7B%5Cbeta_%7Bn%7D%5Cleft%28+%5Cbeta_%7Bn%7D-1+%5Cright%29%5Cleft%28+1-k+%5Cright%29k%5E%7Bn-1%7D%7D%7D" alt="T=\frac{\pi \hbar}{2E_{0}}\sum_{i=1}^{\infty}{\frac{1}{\beta_{n}\left( \beta_{n}-1 \right)\left( 1-k \right)k^{n-1}}}" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=%5Cbeta_%7Bn%7D%3D%5Csqrt%7B1%2B%5Cfrac%7Bm_%7B0%7D%5E%7B2%7Dc%5E%7B4%7D%7D%7B2%5E%7Bkn%7DE_%7B0%7D%5E%7B2%7D%7D%7D" alt="\beta_{n}=\sqrt{1+\frac{m_{0}^{2}c^{4}}{2^{kn}E_{0}^{2}}}" eeimg="1"></p>
 <p data-pid="YOmtPvD_">结论：T 在满足 <img src="https://www.zhihu.com/equation?tex=0%3Ck%3C1" alt="0<k<1" eeimg="1"> 时将会收敛于某个有限值。这意味着无限的计算步骤可以</p>
 <p data-pid="9YXGyCqy">使用快子在有限的时间内完成。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="J0R_K8GW">物理学家 Deutsch 所设想的 “终极超计算模型” ，即<b>存在一台可以仿真所有其他物理系统的通用仿真机 。</b>这是一个未定的假说：CTD原理 （<b>Church–Turing–Deutsch principle</b> ）。如果该论题为真，那么计算机的计算能力一定是存在上限的，虽然说上限不一定是图灵机。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="_XevPsxN">除此之外，超计算模型还有很多很多，例如概率图灵机，无限状态图灵机，等等等等。这里不再一一列举了。</p>
 <p data-pid="JGiaIOJd">P.S. 这里的的超计算模型介绍是不太严谨的，如有错误，请多包涵。仅仅是高度科普高度口水化的介绍。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="A8i177gl">不过，对于任何一台谕示机，无论所带谕示的谕示能力多么强大，都存在其自身谕示不能判定，必须由更高一阶的谕示机才能判定的停机问题。通过添加能力越来越强的“谕示”来让经典图灵机不断突破计算能力限制，而谕示机的停机问题的层级为原先谕示机的层级的图灵跳跃（Turing jump），是一种顺序关系，于是得到一个<img src="https://www.zhihu.com/equation?tex=0%5E%7B%5Cleft%28+n+%5Cright%29+%7D+" alt="0^{\left( n \right) } " eeimg="1"> n为超穷序数的超穷层级，称为<b>图灵度层级（不可解度）</b>。</p>
 <p data-pid="iVg_yHXV">经典图灵机可以计算的可判定问题位于最最底层，是最最简单的层级，记作0。</p>
 <p data-pid="wrcLpiIc">除了0以外的全部层级都是不可计算的不可判定问题。而且层级越高，问题越难。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="B0eV40uS">另外，在一个关于自然数的逻辑公式 P(x) 中，只有一个自由变元 x ，那么，使这个公式成立的所有值组成的集合为 P(x) 定义的自然数集。在这其中没有量词的命题被称为零阶命题，而有量词的命题，它们开头必定由存在量词和全称量词交错组成，这样交错的段数，就是命题的阶数。对于一个 n 阶命题，如果它的开头是存在量词，我们就称它为 n 阶存在命题，反之则是 n 阶全称命题。</p>
 <p data-pid="d5H1Bn2S">在这些这些类别的命题能定义的自然数集中，0阶命题定义的自然数集组成的集合称为 <img src="https://www.zhihu.com/equation?tex=%5CDelta+_%7B0%7D%5E%7B0%7D+" alt="\Delta _{0}^{0} " eeimg="1">，而将 n 阶存在命题和 n 阶全称命题定义的自然数集组成的集合分别称为 <img src="https://www.zhihu.com/equation?tex=%5CSigma+_%7Bn%7D%5E%7B0%7D" alt="\Sigma _{n}^{0}" eeimg="1"> 和 <img src="https://www.zhihu.com/equation?tex=%5CPi+_%7Bn%7D%5E%7B0%7D+" alt="\Pi _{n}^{0} " eeimg="1">，这些集合组成了一个向上无限绵延的层级，每一层都是自然数集组成的集合，阶数越高，命题能定义的自然数集也越多，表达能力也越强。这就是除了图灵度以外可以判定一个计算机器计算能力的另一个层级：<b>克林算术层级（Kleene arithmetical hierarchy）</b>；</p>
 <p data-pid="Y0d9fuLX">在算术层级中：</p>
 <p data-pid="ULG36RH7"><img src="https://www.zhihu.com/equation?tex=%5CSigma_%7Bn%7D%5E%7B0%7D%3D%5Cexists+x_%7B1%7D%5Cforall+x_%7B2%7D...%5Cexists+x_%7Bn%7DR%5Cleft%28+x_%7B1%7D...x_%7Bn%7D+%5Cright%29" alt="\Sigma_{n}^{0}=\exists x_{1}\forall x_{2}...\exists x_{n}R\left( x_{1}...x_{n} \right)" eeimg="1"><img src="https://www.zhihu.com/equation?tex=%5CPi_%7Bn%7D%5E%7B0%7D%3D%5Cforall+x_%7B1%7D%5Cexists+x_%7B2%7D...%5Cforall+x_%7Bn%7DR%5Cleft%28+x_%7B1%7D...x_%7Bn%7D+%5Cright%29" alt="\Pi_{n}^{0}=\forall x_{1}\exists x_{2}...\forall x_{n}R\left( x_{1}...x_{n} \right)" eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=%5CDelta_%7Bn%7D%5E%7B0%7D%3D%5CSigma_%7Bn%7D%5E%7B0%7D%5Ccap+%5CPi_%7Bn%7D%5E%7B0%7D" alt="\Delta_{n}^{0}=\Sigma_{n}^{0}\cap \Pi_{n}^{0}" eeimg="1"></p>
 <p data-pid="l6bh9B_I">一个关系 <img src="https://www.zhihu.com/equation?tex=R%5Cin+%5CPi_%7Bn%7D%5E%7B0%7D" alt="R\in \Pi_{n}^{0}" eeimg="1"> 则 <img src="https://www.zhihu.com/equation?tex=%5Cbar%7BR%7D%5Cin+%5CSigma_%7Bn%7D%5E%7B0%7D" alt="\bar{R}\in \Sigma_{n}^{0}" eeimg="1"> ;</p>
 <p data-pid="Tz8_lId3">一个关系 <img src="https://www.zhihu.com/equation?tex=R%5Cin+%5CSigma_%7Bn%2B1%7D%5E%7B0%7D" alt="R\in \Sigma_{n+1}^{0}" eeimg="1"> 则满足在 <img src="https://www.zhihu.com/equation?tex=%5CSigma_%7Bn%7D%5E%7B0%7D" alt="\Sigma_{n}^{0}" eeimg="1"> 中是递归可枚举的。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="-ja4WEv5">至于基于超算模型的计算机能否在我们的宇宙中制造，也就是超计算的物理实现可能性，我们目前无法得知，因为：</p>
 <p data-pid="nikIzvMG">I. "丘奇-图灵" 论题 （Church-Turing thesis）</p>
 <p data-pid="hZkKRnKY">首先是弱化的论题版本：想象一个理想化的人类，不限制时间和内存资源(纸和笔)，图灵曾描述实施的那种理想化的计算——即根据某些类型的正式规则使用纸笔计算并声称：任何这样的算法，在原则上可以由这样一个理想化的人类代理来执行，实际上是通过一个合适的图灵机程序进行的。</p>
 <p data-pid="TrpRMTdL">大多数学者说到 Church-Turing thesis 时会想到的弱化的版本。目前至少这弱形式的Church-Turing 包括数学上的各种正式的可计算模型：包括图灵机；修改和扩展的图灵机：如 multi-tape 图灵机等等，但也包括基于理想化版本的基本编程语言的机器比如说 C++ 或者其他的计算机语言。所有这些形式的可计算性的概念都被证明是等价的——它们都可以相互模拟——这使我们认为我们已经正确地捕获了一个关于可计算能力的概念。它相对来说没有太大争议。</p>
 <p data-pid="5Y4NK4tD">然而还存在着强化版本：强"丘奇-图灵论题 "。它断言不仅是所有理想化的纸笔计算程序和算法程序都可由图灵机模拟，原则上在我们的物质世界的计算，包括物理系统都可由图灵机模拟。</p>
 <p data-pid="HhX7qJkn">我们并不知道这个论题是否真正地对我们所处的宇宙的计算能力造成制约。如果论题为真；那么是否可在我们的宇宙构造 hypercomputation 的答案就是否定的。</p>
 <p data-pid="zO9xR_LJ">就目前来说，我们能实际运用的计算模型都严格等价于经典图灵机。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="acrRcKJL">II. 目前物理上的限制.</p>
 <ul>
  <li data-pid="Aq1OwYB-">量子物理框架下的布莱梅曼极限（Bremermann's limit）；</li>
  <li data-pid="T4mLA_tS">贝肯斯坦界限（Bekenstein Bound）：量子物理框架下一个质量为 m 半径为 R 的球体所能储存的最多信息量为 I 则 <img src="https://www.zhihu.com/equation?tex=+%7B%5Cdisplaystyle+I%5Cleq+%7B%5Cfrac+%7B2%5Cpi+cRm%7D%7B%5Chbar+%5Cln+2%7D%7D%7D" alt=" {\displaystyle I\leq {\frac {2\pi cRm}{\hbar \ln 2}}}" eeimg="1"> ；该上限使得真正处理实数的计算机（如 Blum–Shub–Smale machine 和 Real computer）不可实现，即便是在没有热噪声的假想环境里也不例外。</li>
  <li data-pid="SpJbrB-a">热力学极限，再加上大脑中的各种电信号，环境中的噪音，使得无限神经网络不可实现。</li>
  <li data-pid="PcEgpJoE">数学对象并不一定总可以在物理上找到对应。目前在所有的 Hypercomputation 模型中绝大部分都只是只能在数学上成立的"数学机器"，在物理上是无法实现的。</li>
  <li data-pid="gBYqhmqD">几乎所有的候选量子引力（quantum gravity）模型都希望时空是离散的，这是个很大的麻烦。</li>
 </ul>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="LPsaEGCS">III. 潜在的物理模型及障碍.</p>
 <p data-pid="C2OYKCUp">不过并不是所有的超计算模型都只能在数学上存在，已经有部分模型在物理上找到了对应对象。</p>
 <p data-pid="qDiNSECu">它们的实现在物理上是可能的。</p>
 <p data-pid="_-nJrwOI">不过这些模型学术界对它们是否能真正地在物理上突破图灵屏障至今存在质疑和争议。比如说：</p>
 <p data-pid="HTaRrTbd">SAD machine：</p>
 <ul>
  <li data-pid="jkVupbYw">它所需要的 Malament-Hogarth 时空只是单纯在广义相对论框架下得出的结果，并未考虑量子引力。因此我们不知道量子引力是否会对时空结构本身造成破坏。</li>
  <li data-pid="Y1NqDGz4">计算机中的热噪音，Malament-Hogarth 时空的蓝移问题会导致其噪音被放大而掩盖通讯信号。而计算机为抵抗噪音造成的耗散不可避免，这将导致计算机需要无限大的能量维持运作，这是非常不现实的。因此要让 Malament-Hogarth 时空的超计算确实可行，计算机中就不能存在热噪音。</li>
  <li data-pid="loPCiT1c">霍金辐射. 这也是我为什么不希望霍金辐射真正存在的根本原因。存在霍金辐射的黑洞会最终导致黑洞蒸发消失。而从黑洞形成到消失的时间为： <img src="https://www.zhihu.com/equation?tex=+%7B%5Cdisplaystyle+t_%7B%5Cmathrm+%7B%7D+%7D%3D%7B%5Cfrac+%7B5120%5Cpi+G%5E%7B2%7DM_%7B0%7D%5E%7B3%7D%7D%7B%5Chbar+c%5E%7B4%7D%7D%7D%7D+" alt=" {\displaystyle t_{\mathrm {} }={\frac {5120\pi G^{2}M_{0}^{3}}{\hbar c^{4}}}} " eeimg="1"> 。这会导致计算机的无限计算还没完成黑洞就消失了。因此超级任务无法完成。</li>
 </ul>
 <p data-pid="C96mjE1p">封闭类时曲线计算：</p>
 <ul>
  <li data-pid="bxeHhb_D">封闭类时曲线计算机所需要的可以进行时间旅行的类时闭曲线时空的特殊时空结构在数学上是可能的。但如果在正能量条件普世的条件下现实的物理系统就不允许它的出现和存在。除非自然规律允许负能量的物质出现。</li>
  <li data-pid="k5LCBxyI">封闭类时曲线可以明确的计算能力的问题判定范围是全部 PSPACE 。即使用一个 Polynomial - size 字符串，封闭类时曲线计算机可以在多项式时间内准确判定全部PSPACE。但进一步放宽条件可得到一个新的计算能力范围 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BComputable_%7BCTC%7D%7D+" alt="\mathrm{Computable_{CTC}} " eeimg="1"> ，可以证明 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BComputable_%7BCTC%7D%7D+%3D%5CDelta_%7B2%7D%5E%7B0%7D" alt="\mathrm{Computable_{CTC}} =\Delta_{2}^{0}" eeimg="1"> 。不过这不代表它真的就"一定可以解决" 。因为这需要任意长度字符串的计算在封闭类时曲线中得到允许 （这代表需要无限宽的输入通道）才有可能真正做到。</li>
  <li data-pid="NL3peWw1">面对这类不可计算问题时，计算机所拥有的符合自治性结果将不再唯一；面对自治性结果不唯一的情况时，大自然将会让封闭类时曲线计算机从所有的自治性结果中选择令整体冯·诺依曼熵最大的结果。不过这是一个坏消息，因为直觉上计算机的电路板被烧穿，整个机器崩溃会带来更高的冯·诺依曼熵。当计算机对"机器崩溃，直接坏掉。"和"吐出该问题的判定结果。"的选择可能性时，封闭类时曲 线计算机更有可能会选择前者<b>......</b></li>
 </ul>
 <p data-pid="L1gmyURi">机械波计算：</p>
 <ul>
  <li data-pid="GcnvKun0">波计算机所利用的不可计算机械波，即通过构造了一个可计算函数，其导数是非递归不可计算函数。再对其结果进行扩展，构造出一组特殊的偏微分方程，在某个特定的初始值下，某个时刻 t 后的解不可计算。 但该偏微分方程组可作为某个物理系统的演化函数。 这个系统理论上可以以机械波进行对应。当然，这个系统是否可以利用人为实验构造出来就另当别论了。</li>
 </ul>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="neBFXsTd">IV.如果宇宙不是一台图灵机。</p>
 <ul>
  <li data-pid="p5zp6QZJ">非常感谢 <a class="member_mention" href="https://www.zhihu.com/people/1e05d95f3b74c5874aec866c350c0641" data-hash="1e05d95f3b74c5874aec866c350c0641" data-hovercard="p$b$1e05d95f3b74c5874aec866c350c0641">@锥管</a> 的回答。他给出了永远不会因霍金辐射的影响而蒸发的黑洞质量下限： <img src="https://www.zhihu.com/equation?tex=M_0%5Cge%5Cfrac%7Bc%5E6%7D%7B16%5Cpi+%5Csigma+G%5E2+T_0%5E4+t_0%7D%5Capprox3.5%5Ctimes+10%5E%7B27%7DM_%7B%5Codot%7D+" alt="M_0\ge\frac{c^6}{16\pi \sigma G^2 T_0^4 t_0}\approx3.5\times 10^{27}M_{\odot} " eeimg="1"></li>
 </ul>
 <p data-pid="n8pcvsg4">这个超大质量黑洞由于不再受到霍金辐射的影响（即使它是真实的物理现象），所以在计算机无限计算中因为黑洞不会消失而不影响计算。因此利用它构造 hypercomputer 是可能的。</p>
 <ul>
  <li data-pid="rQtkD598">正如费曼在他的演讲中所表达的困惑，一个描述某个物理体系的微分方程完全可以有一个不可计算的解，不满足“总能用有限步运算逼近到充分的精度”的条件。换言之，有效的数值解都不会存在（更不用说解析解了）。</li>
 </ul>
 <p data-pid="8-b3gBRA">引用恩里科 · 费米的一句话：</p>
 <blockquote data-pid="Y2O3bV-4">
  <b><i>圣经中并没有说过一切大自然的定律都可以用线性方程来表示。</i></b>
 </blockquote>
 <p data-pid="bJuVmt0o">同理没有解析解的非线性方程，数值近似是有力的武器——但是那同时也就不知不觉假设了算法可解性，一个同样是“圣经里”没有的假设。</p>
 <p data-pid="vkFZRMI5">用于构造不可计算机械波的方式，说明理论上我们可以通过构造出一个物理系统，让其演化出的物理系统可以计算一个图灵不可计算函数。 理论上超越图灵机的函数在物理上是可以存在的。</p>
 <p data-pid="f-a5ge7P"><b>是否可以说，存在着一部分物理体系，它们无法用图灵机的有限步运算步骤进行模拟和重现，即不可计算的物理现象。也就是说，物理定律不是图灵可计算的。</b></p>
 <ul>
  <li data-pid="NzIlpbql">另外，如果我们的万物理论（Theory of everything）是基于弦理论的 M-theory 的话，会有一个不可思议的结果：M-theory 具有 T-对偶性（T-duality）:采用弦论把一个维度包进一个半径为 R 的圆圈中，在采用另外一个弦论把一个维度包进一个半径为 1/R 的圆圈中，两者对比是完全等价的。</li>
 </ul>
 <p data-pid="DgTpPWLM">即使让 R 变得非常小，甚至小于普朗克长度，也成立。因为在普朗克尺度时空会呈现出泡沫状，而远大于和远小于普朗克尺度的时空则会是平滑的，二者完全一致。如果它最终是正确的，也就意味着，小于普朗克距离和大于的所遵循的物理学相等。弦论最小的普朗克距离以内，也可以有一个完整的宇宙。同理，我们也可以利用场论而非数字化结构来描述整个宇宙。从这点看，宇宙也不是一台图灵机，物理系统也不是一个计算机程序。</p>
 <ul>
  <li data-pid="xcRAHiRY">Pour-EI 等人除了构造不可计算的波动方程之外，还证明了在可分希尔伯特空间中（很重要，用于模拟物理现象）：</li>
 </ul>
 <p data-pid="pcp7Wodn">存在一个有效的确定有界自伴算子（determined bounded self-adjoint operator） <img src="https://www.zhihu.com/equation?tex=T%3AH%5Crightarrow+H" alt="T:H\rightarrow H" eeimg="1"> 其特征值序列是不可计算的。并且其范数（norm）是一个不可计算实数。</p>
 <p data-pid="9KoCbuVX">这是否证明了“我们的宇宙具有不可计算的属性。”就仁者见仁，智者见智了。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <ul>
  <li data-pid="zHhBcNiP">Arkady Bolotin 认为构成量子理论的数学基础本身涵盖了不可计算性且无法避免。</li>
 </ul>
 <p data-pid="IY46uhxB">量子力学中使用了一个无限可分的希尔伯特空间，线性算子作用于其中。希尔伯特空间 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 的可分性（separable）意味着 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 承认一个标准正交基（orthonormal basis），它由一个可数的向量族组成。而向量族 <img src="https://www.zhihu.com/equation?tex=%5Cleft%5C%7B+%7C%5CPhi_%7Bn%7D%5Crangle+%5Cequiv+%7Cn%5Crangle_%7Bn%5Cin%5Cmathbb%7BN%7D+%7D+%5Cright%5C%7D" alt="\left\{ |\Phi_{n}\rangle \equiv |n\rangle_{n\in\mathbb{N} } \right\}" eeimg="1"> 满足正交化（orthonormalization）关系： <img src="https://www.zhihu.com/equation?tex=%5Cforall+m%2Cn%5Cin%5Cmathbb%7BN%7D%3A%5Clangle+m%7Cn%5Crangle+%3D%5Cdelta_%7Bmn%7D" alt="\forall m,n\in\mathbb{N}:\langle m|n\rangle =\delta_{mn}" eeimg="1"> 以及闭包（closure）关系：</p>
 <p data-pid="BqgawUw6"><img src="https://www.zhihu.com/equation?tex=%5Csum_%7Bn%3D1%7D%5E%7B%5Cinfty%7D%7B%7Cx%5Crangle+%5Clangle+n%7C%3D%5Cmathbb%7B1%7D_%7B%5Cinfty%7D%7D%5C%2C%5C%2C%5C%2C+%5Cleft%28+A%5Cright%29" alt="\sum_{n=1}^{\infty}{|x\rangle \langle n|=\mathbb{1}_{\infty}}\,\,\, \left( A\right)" eeimg="1"> ，</p>
 <p data-pid="M6UKpBfM">为 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 的标准正交基。而后可分希尔伯特空间 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 的 <img src="https://www.zhihu.com/equation?tex=%7C%5CPhi%5Crangle+" alt="|\Phi\rangle " eeimg="1"> 可拓展为： <img src="https://www.zhihu.com/equation?tex=%7C%5CPhi%5Crangle+%3D1_%7B%5Cinfty%7D%7C%5CPhi%5Crangle%3D%5Csum_%7Bn%3D1%7D%5E%7B%5Cinfty%7D%7B%7Cn%5Crangle%5Clangle+n%7C%5CPsi%5Crangle%7D" alt="|\Phi\rangle =1_{\infty}|\Phi\rangle=\sum_{n=1}^{\infty}{|n\rangle\langle n|\Psi\rangle}" eeimg="1"> 。</p>
 <p data-pid="NaTZP6ip">其中 <img src="https://www.zhihu.com/equation?tex=%5CPsi%5Cequiv%5Clangle+n%7C%5CPsi%5Crangle+%5Cin%5Cmathbb%7BC%7D" alt="\Psi\equiv\langle n|\Psi\rangle \in\mathbb{C}" eeimg="1"> 定义了 <img src="https://www.zhihu.com/equation?tex=%7C%5CPsi%5Crangle+" alt="|\Psi\rangle " eeimg="1"> 的 numerical representation。然后一个线性算子 L 在希尔伯特空间 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 中为线性映射： <img src="https://www.zhihu.com/equation?tex=L%3A%5Cmathcal%7BD%7D%5Cleft%28+L+%5Cright%29%5Crightarrow%5Cmathcal%7BH%7D%5C%2C%5C%2C+and%5C%2C+%5C%2C+%7C%5CPsi%5Crangle+%5Crightarrow+L%7C%5CPsi%5Crangle+" alt="L:\mathcal{D}\left( L \right)\rightarrow\mathcal{H}\,\, and\, \, |\Psi\rangle \rightarrow L|\Psi\rangle " eeimg="1"> 其中 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BD%7D%5Cleft%28+L+%5Cright%29" alt="\mathcal{D}\left( L \right)" eeimg="1"> 定义了算子的定义域。使用 <img src="https://www.zhihu.com/equation?tex=%5Cleft%28+A+%5Cright%29" alt="\left( A \right)" eeimg="1"> 任何线性算子 L 作用于无限可分希尔伯特空间 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> 都可以表示为： <img src="https://www.zhihu.com/equation?tex=L%3D1_%7B%5Cinfty%7DL1_%7B%5Cinfty%7D%3D%5Csum_%7Bm%2Cn%7D%5E%7B%5Cinfty%7D%7B%5Clangle+n%7CL%7Cm%5Crangle+%7Cn%5Crangle%5Clangle+m%7C%7D" alt="L=1_{\infty}L1_{\infty}=\sum_{m,n}^{\infty}{\langle n|L|m\rangle |n\rangle\langle m|}" eeimg="1"></p>
 <p data-pid="nnLQDnOo">其中 <img src="https://www.zhihu.com/equation?tex=L_%7Bmn%7D%5Cequiv%5Clangle+n%7CL%7Cm%5Crangle+%5Cin%5Cmathbb%7BC%7D" alt="L_{mn}\equiv\langle n|L|m\rangle \in\mathbb{C}" eeimg="1"> 定义 L 的 numerical representation。</p>
 <p data-pid="W_2Gw-OT">上述式用于在无限维希尔伯特空间 <img src="https://www.zhihu.com/equation?tex=%5Cmathcal%7BH%7D" alt="\mathcal{H}" eeimg="1"> representation 和 number-based representation之间进行转换。</p>
 <p data-pid="8ujwLnQh">Arkady Bolotin 亦认为一个人无法写下一个 numerical vector： <img src="https://www.zhihu.com/equation?tex=%5Coverrightarrow%7B%5CPsi_%7B%5Cinfty%7D%7D+%3D%5Cleft%28+%5CPsi_%7B1%7D+%2C...%2C%5CPsi_%7Bn%7D%2C..%5Cright%29" alt="\overrightarrow{\Psi_{\infty}} =\left( \Psi_{1} ,...,\Psi_{n},..\right)" eeimg="1"> 或者是一个 numerical matrix ： <img src="https://www.zhihu.com/equation?tex=%5Cmathbf%7BL_%7B%5Cinfty%7D%7D%3D%5Cleft%28+L_%7Bnm%7D+%5Cright%29_%7Bnm%7D%5E%7B%5Cinfty%7D" alt="\mathbf{L_{\infty}}=\left( L_{nm} \right)_{nm}^{\infty}" eeimg="1"> 。因为这些对象包含了无限数量的元素。此外，对这些数值对象的运算，比如说： <img src="https://www.zhihu.com/equation?tex=%7C%7C%5Coverrightarrow%7B%5CPsi_%7B%5Cinfty%7D%7D+%7C%7C%5E%7B2%7D%3D%5CSigma_%7Bn%3D1%7D%5E%7B%5Cinfty%7D%7C%5CPsi_%7Bn%7D%7C%5E%7B2%7D" alt="||\overrightarrow{\Psi_{\infty}} ||^{2}=\Sigma_{n=1}^{\infty}|\Psi_{n}|^{2}" eeimg="1"> 以及 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTr%7D%5Cleft+%28+%5Cmathbf%7BL_%7B%5Cinfty%7D%7D+%5Cright+%29%3D%5CSigma_%7Bn%3D1%7D%5E%7B%5Cinfty%7DL_%7Bnn%7D" alt="\mathrm{Tr}\left ( \mathbf{L_{\infty}} \right )=\Sigma_{n=1}^{\infty}L_{nn}" eeimg="1"> 可能需要进行无限求和（infinite summations）。更重要的是，任何试图将这些无限的向量和矩阵规成一个有限序列(以便使它们显式和对它们的运算都很明确)的尝试会立即导致与正则对易关系（canonical commutation relation，CCR）发生冲突：即量子力学中规范共轭量（ conjugate quantities）的基本关系。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="_5bCXiqm">对于物理系统确切地可计算函数与图灵机可计算函数之间是否可以画上等号的探讨还在继续，目前图灵机架构已经为可计算性给出了一个极限，然而至于对于物理来说这个可计算极限到底在哪里：牛顿经典物理学的连续时空是可以构造超越图灵机的机器的；广义相对论的特定时空也可以做到；然而量子理论却达不到要求。</p>
 <p data-pid="VgfYEYO-">正如 Konstantine Arkoudas 所写的：</p>
 <blockquote data-pid="j3xVt8Ht">
  ... 古典派学者的观点是：图灵可计算函数构成了物理可实现计算的最大类。如果超计算的拥护者声称图灵可计算函数并没有形成一个最大的物理可计算函数类，那么他们就应该指出哪些函数是物理可计算的。有以下三种可能性:
  <br>
  1. 任何地方都没有设置限制。所有的函数都是物理可计算的。
  <br>
  2. 这个限制是根据图灵机的极限(或者甚至可能是在图灵机之下)设置的。
  <br>
  3. 这限制是在上面两点之间的某个地方设置的。
  <br>
   第一种选择是物理泛可计算性，这是非常难以置信的，它将可计算性降低到无关紧要的程度。第二个选择反映了古典派学者的信念。因此，人们会得出结论，超计算的拥护者会提倡第三种选择 ... 注意，一个纯粹的数学模型，如 oracle machine ，coupled Turing Machine 等等，将不符合我们的要求。我们必须要知道哪些物理定律（以经验可证伪为准）会设法在所有的函数类中画出一条线（区分真正可计算与不可计算的），并且确切地知道这条线的准确位置。事实上，实现这种划分是超计算拥护者的一个重要愿望。...
 </blockquote>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="z2-5pr94">既然物理理论上允许不可计算的现象存在，在最乐观的情况下，可以用于制造突破现有计算设备根本限制,不受丘奇-图灵论题约束的强力装置：<b>超计算机（Hypercomputer），</b>完成跨越<b>图灵屏障（Turing's barrier）</b>。做到：</p>
 <ul>
  <li data-pid="j2YgFuUv">由不可计算的物理现象构成的 Hypercomputer 至少可以帮助我们完成一个经典图灵机做不好的任务：仿真它自己。因为经典图灵机的有限步运算无法给出有界连续变量的大多数取值，只能做近似模拟。而且不可计算性会导致初始条件<b>精确已知</b>时依然难以做长期预测，而可计算的混沌则会失去作用。单纯的混沌现象在不可计算现象面前根本就是小巫见大巫</li>
  <li data-pid="mu8QDu0Y">Hypercomputer 可以帮助我们访问图灵机不能访问的更高阶层的 arithmetical hierarchy和 degrees of unsolvability。解决图灵机不可判定问题。</li>
  <li data-pid="veEn5a2t">Hypercomputer 可以用来构建非递归枚举的形式系统。最重要的是，非递归枚举形式系统不受哥德尔不完备性的限制。</li>
 </ul>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="w7XQ5Trf">P.S.比如说 <b>True arithmetic ,</b>即把所有在<img src="https://www.zhihu.com/equation?tex=%28N%2C0%2C1%2C%2B%2C%2A%29" alt="(N,0,1,+,*)" eeimg="1">上成立的一阶语句抽取出来，令数论中的所有真命题组成一个集合，把里面所有的真命题当作公理。这样的形式系统既包涵了皮亚诺公理（足够强），又是自治完备的。自治性与完备性兼得且两不误。那么哥德尔不完备性对它无效。不过我们是没有办法构建这样强大的形式系统的，因为它们对于我们来说是不可计算的。由于它的不可计算性，其次是因为使用图灵机的话我们很可能无法在一个有限时间里获得它的公理 （因为它是非可枚举的。）。想要获得非可枚举形式系统中的公理，除非使用超计算。</p>
 <p data-pid="kwi9WOkv">具体的：True arithmetic 为所有在 Peano arithmetic <img src="https://www.zhihu.com/equation?tex=%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D" alt="{\displaystyle {\mathcal {N}}}" eeimg="1"> 中为真的一阶算术语句集合，记作 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 。并且 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 不是算术可定义的（arithmetically definable）。</p>
 <p data-pid="pclknnyG">令 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D_%7Bn%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}_{n}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 为 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 的子集，并且其只包含在算术层级中为 <img src="https://www.zhihu.com/equation?tex=%5CSigma_%7Bn%7D%5E%7B0%7D" alt="\Sigma_{n}^{0}" eeimg="1"> 或更低的语句（关系）。不过对于高于 <img src="https://www.zhihu.com/equation?tex=%5CSigma_%7Bn%7D%5E%7B0%7D" alt="\Sigma_{n}^{0}" eeimg="1"> 的关系来说 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D_%7Bn%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}_{n}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 是算术可定义的。并且： <img src="https://www.zhihu.com/equation?tex=%7B%5Cdisplaystyle+%7B%5Cmbox%7BTh%7D%7D%28%7B%5Cmathcal+%7BN%7D%7D%29%3D%5Cbigcup+_%7Bn%5Cin+%5Cmathbb+%7BN%7D+%7D%7B%5Cmbox%7BTh%7D%7D_%7Bn%7D%28%7B%5Cmathcal+%7BN%7D%7D%29%7D" alt="{\displaystyle {\mbox{Th}}({\mathcal {N}})=\bigcup _{n\in \mathbb {N} }{\mbox{Th}}_{n}({\mathcal {N}})}" eeimg="1"> 。</p>
 <p data-pid="UiRmG1S9">最重要的是， <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BTh%7D%28+%7B%5Cdisplaystyle+%7B%5Cmathcal+%7BN%7D%7D%7D%29" alt="\mathrm{Th}( {\displaystyle {\mathcal {N}}})" eeimg="1"> 的图灵度为 <img src="https://www.zhihu.com/equation?tex=0%5E%7B%28%5Comega%29%7D" alt="0^{(\omega)}" eeimg="1"> 。这表明，True arithmetic 是高阶不可计算的，且表达能力极其强大。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="zCawyfua">特别地，对于那些可能会在物理上得到实现的模型，Konstantine Arkoudas 也给出他的看待：</p>
 <blockquote data-pid="pIY8lGF-">
  ... 事实上，即使是一项非常严谨的数学结论证明了一些超计算模型提议与某些物理理论的原理是一致的 ... 然而这并没有任何实际意义，除非这种装置(或至少是它的一个原型)被建造并且成功测试之前，原因在于毕竟这是经验科学。
  <br>
  据我们所知，这种证据所依据的一些科学原理可能是错误的。可证伪性一直是科学理论接受的命运，没有任何理论可以作为这种命运的先天例外。第二，到目前为止，我们还没有关于真正正确的关于“万物理论”的物理理论 ... 
  <br>
  因为一个理论的兼容性参数可能会与另一个理论相冲突。也就是说，不与一个理论冲突的假设可能会对另一个理论产生问题。例如，旨在表明一些 Supertask 与广义相对论相容性的思想实验可能会违反量子力学或热力学的物理约束 ...
  <br>
  最后，所有的科学理论都提出了自身的理想化结构，而这种理想化的结构是否会真正与那些声称是超计算的奇异、精巧的装置构造和操作有关，还远不清楚。要证明一个理论上有争议的计算设备在物理上的合理性，唯一的方法就是建立一个原型。
 </blockquote>
 <p data-pid="eT-nXKbu">当然最悲观的可能性就是：这些不可计算现象仍然是不可能利用的。可实行的计算最终还是脱离不了图灵机的能力范围，图灵屏障仍旧无法跨越。那么还有一件事情是很值得做的：弄清楚这种异常背后的原因。</p>
 <p data-pid="26Tmk0LE">最新补充：某乎的公式编辑器终于修好了。</p>
 <p data-pid="t1oTnfQ8">对于部分内容进行修改和扩充</p>
 <p class="ztext-empty-paragraph"><br></p>
 <hr>
 <p data-pid="elhuxFRi">我们在超计算中失去了什么？</p>
 <p data-pid="NTmGzMk2">超计算的探讨给予了我们突破图灵屏障的可能性；但我们在追求这种神奇的可能性的过程中会不会在不经意之间失去了某些特别的东西呢？</p>
 <p data-pid="7HQbXrly">这是 da Costa 和 Doria 的看法：</p>
 <blockquote data-pid="fKj1Hg5Z">
  人们通常会从实际应用的角度来考虑有关超计算的困难。... 这意味着：我们验证了关于算术层级中语句的<i>标准模型 </i>的正确性。
  <br>
  因此，超计算允许我们沿着算术层级来判定相关语句——相对于关于算术的标准模型。
  <br>
  这可能被视为数学的贫乏。一个不实的理论，如 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BZFC%2B%5Cneg+Consis%28ZFC%29%7D" alt="\mathrm{ZFC+\neg Consis(ZFC)}" eeimg="1"> ，其中 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BConsis%28ZFC%29%7D" alt="\mathrm{Consis(ZFC)}" eeimg="1"> 是断言 ZFC 一致性的常用正式语句，<b>显然超出了超计算的范围</b>，本质上是因为它们的模型需要一种非标准算术。
  <br>
  然而，有人可能会反对说，像 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BZFC%2B%5Cneg+Consis%28ZFC%29%7D" alt="\mathrm{ZFC+\neg Consis(ZFC)}" eeimg="1"> 这样的理论太抽象，太脱离日常考虑。但在这里我们可以举一个理论的例子，它涉及到一个具体的问题，这可能需要非标准的数学模型来解释它。它非常简单：给定一个丢番图方程 <img src="https://www.zhihu.com/equation?tex=p%28x_%7B0%7D%2Cx_%7B1%7D%2C...%2Cx_%7Bk%7D%29%3D0" alt="p(x_{0},x_{1},...,x_{k})=0" eeimg="1"> ，对于算术的标准模型来说，它没有解：并且是正确的，而在 ZFC 中不能被证明也不能被证伪。然而，ZFC 有一个非标准算术模型，在这个模型中：这个方程确实有解。
  <br>
  ...
  <br>
  所以，重点是：我们可能会从超计算中得到很多关于算术的标准模型的东西，但是我们也可能会失去很多有趣的结果，这些结果依赖于算术的非标准模型。
 </blockquote>
 <p data-pid="EVRoeSUu">以此出发，得出以下的结果：</p>
 <p data-pid="nctqNHO-">ZFC + 基于 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BP%3DNP%7D" alt="\mathrm{P=NP}" eeimg="1"> 猜想的特殊关系式 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7B%5Cleft%5B++P%3DNP%5Cright%5D%5E%7B%5Cmathsf%7BF%7D%7D%7D" alt="\mathrm{\left[  P=NP\right]^{\mathsf{F}}}" eeimg="1"> 如果是一个 <img src="https://www.zhihu.com/equation?tex=%5Comega-" alt="\omega-" eeimg="1"> 一致理论，那么 <img src="https://www.zhihu.com/equation?tex=%5Cmathrm%7BZFC%2B%5BP%3DNP%5D%7D" alt="\mathrm{ZFC+[P=NP]}" eeimg="1"> 就是一致的。</p>
</body>