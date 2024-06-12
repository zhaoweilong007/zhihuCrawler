# 机器学习该怎么入门？
- 点赞数：5196
- 更新时间：2015年07月05日17时07分14秒
- 回答url：https://www.zhihu.com/question/20691338/answer/53910077
<body>
 <p data-pid="1XccRwPn">好东西不敢独享，转载一发。</p>
 <p data-pid="xlEyoneY">正在学习林轩田的机器学习基石和吴恩达的机器学习，感觉讲的还不错，数学基础还是蛮重要的。</p>
 <blockquote data-pid="xTdGoiUL">
  <p data-pid="rwBbW5hL"><a href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a></p>
  <p data-pid="FbTgDQ0j">感谢贡献者： tang_Kaka_back@新浪微博</p>
  <p data-pid="JZZwIPdJ">欢迎补充指正，转载请保留原作者和原文链接。 本文是 <a href="https://link.zhihu.com/?target=http%3A//ml.memect.com/" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习日报</a>的一个专题合集，欢迎订阅：请给<a href="mailto:hao@memect.com?subject=%E8%AE%A2%E9%98%85%E6%9C%BA%E5%99%A8%E5%AD%A6%E4%B9%A0%E6%97%A5%E6%8A%A5%20from%20guide">hao@memect.com</a>发邮件，标题＂订阅机器学习日报＂。</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E5%259F%25BA%25E6%259C%25AC%25E6%25A6%2582%25E5%25BF%25B5" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>基本概念
  <p data-pid="Cy1Atqz1"><a href="https://link.zhihu.com/?target=http%3A//zh.wikipedia.org/zh/%25E6%259C%25BA%25E5%2599%25A8%25E5%25AD%25A6%25E4%25B9%25A0" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习</a> 机器学习是近20多年兴起的一门多领域交叉学科，涉及概率论、统计学、逼近论、凸分析、算法复杂度理论等多门学科。机器学习理论主要是设计和分析一些让计算机可以自动“学习”的算法。机器学习算法是一类从数据中自动分析获得规律，并利用规律对未知数据进行预测的算法。因为学习算法中涉及了大量的统计学理论，机器学习与统计推断学联系尤为密切，也被称为统计学习理论。算法设计方面，机器学习理论关注可以实现的，行之有效的学习算法。</p>
  <p data-pid="5zwk_vwq">下面从微观到宏观试着梳理一下机器学习的范畴：一个具体的算法，领域进一步细分，实战应用场景，与其他领域的关系。</p>
  <p data-pid="YJLnLZJB">图1: 机器学习的例子：NLTK监督学习的工作流程图 (source: <a href="https://link.zhihu.com/?target=http%3A//www.nltk.org/book/ch06.html" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://www.</span><span class="visible">nltk.org/book/ch06.html</span><span class="invisible"></span></a>)</p>
  <p data-pid="rrqoTb7g">图2: 机器学习概要图 by Yaser Abu-Mostafa (Caltech) (source: <a href="https://link.zhihu.com/?target=http%3A//work.caltech.edu/library/181.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">Map of Machine Learning (Abu-Mostafa)</a>)</p>
  <p data-pid="WWIPf-J3">图3: 机器学习实战：在python scikit learn 中选择机器学习算法 by Nishant Chandra (source: <a href="https://link.zhihu.com/?target=http%3A//n-chandra.blogspot.com/2013/01/picking-machine-learning-algorithm.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">In pursuit of happiness!: Picking the right Machine Learning Algorithm</a>)</p>
  <p data-pid="saNVim5N">图4: 机器学习和其他学科的关系： 数据科学的地铁图 by Swami Chandrasekaran (source: <a href="https://link.zhihu.com/?target=http%3A//nirvacana.com/thoughts/becoming-a-data-scientist/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Becoming a Data Scientist</a>)</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E5%2585%25A5%25E9%2597%25A8%25E6%2594%25BB%25E7%2595%25A5" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>入门攻略
  <p data-pid="NQq754z0">大致分三类： 起步体悟，实战笔记，行家导读</p>
  <ul>
   <li data-pid="7vqmB_hM">
    <p data-pid="jJ6gH6a_"><a href="https://link.zhihu.com/?target=http%3A//www.guokr.com/post/512037/" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习入门者学习指南 @果壳网</a> (2013) 作者 <a href="https://link.zhihu.com/?target=http%3A//www.guokr.com/group/i/0373595356/" class=" wrap external" target="_blank" rel="nofollow noreferrer">白马</a> -- [起步体悟] 研究生型入门者的亲身经历</p></li>
   <li data-pid="Po_pAjhy">
    <p data-pid="H-mOt2lH"><a href="https://link.zhihu.com/?target=http%3A//ourcoders.com/thread/show/2837/" class=" wrap external" target="_blank" rel="nofollow noreferrer">有没有做机器学习的哥们？能否介绍一下是如何起步的 @ourcoders</a> -- [起步体悟] 研究生型入门者的亲身经历，尤其要看<a href="https://link.zhihu.com/?target=http%3A//ourcoders.com/user/show/25895/reyoung/" class=" wrap external" target="_blank" rel="nofollow noreferrer">reyoung</a>的建议</p></li>
   <li data-pid="5O1XjpOr">
    <p data-pid="-9X0YSSz"><a href="https://link.zhihu.com/?target=http%3A//www.cnblogs.com/tornadomeet/tag/%25E6%259C%25BA%25E5%2599%25A8%25E5%25AD%25A6%25E4%25B9%25A0/" class=" wrap external" target="_blank" rel="nofollow noreferrer">tornadomeet 机器学习 笔记</a> (2013) -- [实战笔记] 学霸的学习笔记，看看小伙伴是怎样一步一步地掌握“机器学习”</p></li>
   <li data-pid="9VBEGTEL">
    <p data-pid="H07PEx6-"><a href="https://link.zhihu.com/?target=https%3A//machinelearningmastery.com/machine-learning-roadmap-your-self-study-guide-to-machine-learning/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Machine Learning Roadmap: Your Self-Study Guide to Machine Learning</a> (2014) Jason Brownlee -- [行家导读] 虽然是英文版，但非常容易读懂。对Beginner,Novice,Intermediate,Advanced读者都有覆盖。</p>
    <ul>
     <li data-pid="aMSsk2ee"><a href="https://link.zhihu.com/?target=http%3A//machinelearningmastery.com/a-tour-of-machine-learning-algorithms/" class=" wrap external" target="_blank" rel="nofollow noreferrer">A Tour of Machine Learning Algorithms</a> （2013） 这篇关于机器学习算法分类的文章也非常好</li>
     <li data-pid="GmPsavrJ"><a href="https://link.zhihu.com/?target=http%3A//machinelearningmastery.com/best-machine-learning-resources-for-getting-started/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Best Machine Learning Resources for Getting Started</a>（2013） 这片有中文翻译 <a href="https://link.zhihu.com/?target=http%3A//blog.jobbole.com/56256/" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习的最佳入门学习资源 @伯乐在线</a> 译者 <a href="https://link.zhihu.com/?target=http%3A//www.jobbole.com/members/linwenhui/" class=" wrap external" target="_blank" rel="nofollow noreferrer">programmer_lin</a></li>
    </ul></li>
   <li data-pid="5eE6eXtc">
    <p data-pid="JcvVpuLW">门主的几个建议</p>
    <ul>
     <li data-pid="KOr9WY00">既要有数学基础，也要编程实践</li>
     <li data-pid="d3gG1OBH">别怕英文版，你不懂的大多是专业名词，将来不论写文章还是读文档都是英文为主</li>
     <li data-pid="4ULZ-lC3">[我是小广告][我是小广告]订阅机器学习日报，跟踪业内热点资料。</li>
    </ul></li>
  </ul><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E6%259B%25B4%25E5%25A4%259A%25E6%2594%25BB%25E7%2595%25A5" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>更多攻略
  <ul>
   <li data-pid="AL07w1JT"><a href="http://www.zhihu.com/question/20691338" class="internal">机器学习该怎么入门 @知乎</a> (2014)</li>
   <li data-pid="1ELYM6Ll"><a href="https://link.zhihu.com/?target=http%3A//www.quora.com/Whats-the-easiest-way-to-learn-machine-learning" class=" wrap external" target="_blank" rel="nofollow noreferrer">What's the easiest way to learn machine learning @quora</a> (2013)</li>
   <li data-pid="5Oxx6zU-"><a href="https://link.zhihu.com/?target=http%3A//www.quora.com/What-is-the-best-way-to-study-machine-learning" class=" wrap external" target="_blank" rel="nofollow noreferrer">What is the best way to study machine learning @quora</a> (2012)</li>
   <li data-pid="h1zjYdHV"><a href="https://link.zhihu.com/?target=http%3A//www.quora.com/Is-there-any-roadmap-for-learning-Machine-Learning-ML-and-its-related-courses-at-CMU" class=" wrap external" target="_blank" rel="nofollow noreferrer">Is there any roadmap for learning Machine Learning (ML) and its related courses at CMU Is there any roadmap for learning Machine Learning (ML) and its related courses at CMU</a>(2014)</li>
  </ul><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E8%25AF%25BE%25E7%25A8%258B%25E8%25B5%2584%25E6%25BA%2590" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>课程资源
  <p data-pid="fBhCTMdJ">Tom Mitchell 和 Andrew Ng 的课都很适合入门</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E5%2585%25A5%25E9%2597%25A8%25E8%25AF%25BE%25E7%25A8%258B" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>入门课程<a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%232011-tom-mitchellcmu%25E6%259C%25BA%25E5%2599%25A8%25E5%25AD%25A6%25E4%25B9%25A0" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>2011 Tom Mitchell(CMU)机器学习
  <p data-pid="q__CGdVG"><a href="https://link.zhihu.com/?target=http%3A//www.cs.cmu.edu/~tom/10701_sp11/lectures.shtml" class=" wrap external" target="_blank" rel="nofollow noreferrer">英文原版视频与课件PDF</a> 他的《机器学习》在很多课程上被选做教材，有中文版。</p>
  <ul>
   <li data-pid="UN_HhXeW">Decision Trees</li>
   <li data-pid="uojmyzZL">Probability and Estimation</li>
   <li data-pid="zqH796zW">Naive Bayes</li>
   <li data-pid="A6vU9Pom">Logistic Regression</li>
   <li data-pid="We6h0KAG">Linear Regression</li>
   <li data-pid="50pJ2uDz">Practical Issues: Feature selection，Overfitting ...</li>
   <li data-pid="STYlFxqj">Graphical models: Bayes networks, EM，Mixture of Gaussians clustering ...</li>
   <li data-pid="06xhogWS">Computational Learning Theory: PAC Learning, Mistake bounds ...</li>
   <li data-pid="iLpgRg-G">Semi-Supervised Learning</li>
   <li data-pid="fclf1wws">Hidden Markov Models</li>
   <li data-pid="_F0pGK54">Neural Networks</li>
   <li data-pid="Zb-vYASR">Learning Representations: PCA, Deep belief networks, ICA, CCA ...</li>
   <li data-pid="eUeYluQo">Kernel Methods and SVM</li>
   <li data-pid="lPZw_ZQv">Active Learning</li>
   <li data-pid="vO80PERW">Reinforcement Learning 以上为课程标题节选</li>
  </ul><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%232014-andrew-ng-stanford%25E6%259C%25BA%25E5%2599%25A8%25E5%25AD%25A6%25E4%25B9%25A0" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>2014 Andrew Ng (Stanford)机器学习
  <p data-pid="xYTwNT6Y"><a href="https://link.zhihu.com/?target=https%3A//www.coursera.org/course/ml" class=" wrap external" target="_blank" rel="nofollow noreferrer">英文原版视频</a> 这就是针对自学而设计的，免费还有修课认证。“老师讲的是深入浅出，不用太担心数学方面的东西。而且作业也非常适合入门者，都是设计好的程序框架，有作业指南，根据作业指南填写该完成的部分就行。”（参见白马同学的入门攻略）"推荐报名，跟着上课，做课后习题和期末考试。(因为只看不干，啥都学不会)。" (参见reyoung的建议）</p>
  <ol>
   <li data-pid="7myt0B5o">Introduction (Week 1)</li>
   <li data-pid="U6HaQUyq">Linear Regression with One Variable (Week 1)</li>
   <li data-pid="M6CI1Nxe">Linear Algebra Review (Week 1, Optional)</li>
   <li data-pid="S80DlGQf">Linear Regression with Multiple Variables (Week 2)</li>
   <li data-pid="2ddWXr7W">Octave Tutorial (Week 2)</li>
   <li data-pid="GTJ5Zkfd">Logistic Regression (Week 3)</li>
   <li data-pid="mMaRhIGP">Regularization (Week 3)</li>
   <li data-pid="2Rhz5LHP">Neural Networks: Representation (Week 4)</li>
   <li data-pid="nt5unJ6a">Neural Networks: Learning (Week 5)</li>
   <li data-pid="p5nttNU8">Advice for Applying Machine Learning (Week 6)</li>
   <li data-pid="f-T5oDtQ">Machine Learning System Design (Week 6)</li>
   <li data-pid="WV49Xum_">Support Vector Machines (Week 7)</li>
   <li data-pid="mdZGDOjq">Clustering (Week 8)</li>
   <li data-pid="ly42uYtd">Dimensionality Reduction (Week 8)</li>
   <li data-pid="RINUz3QS">Anomaly Detection (Week 9)</li>
   <li data-pid="lZN-8w5s">Recommender Systems (Week 9)</li>
   <li data-pid="Wvr7K-dA">Large Scale Machine Learning (Week 10)</li>
   <li data-pid="RWfW7ONe">Application Example: Photo OCR</li>
   <li data-pid="EVYHLvDD">Conclusion</li>
  </ol><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E8%25BF%259B%25E9%2598%25B6%25E8%25AF%25BE%25E7%25A8%258B" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>进阶课程
  <p data-pid="YG7xwD12"><strong>2013年Yaser Abu-Mostafa (Caltech) Learning from Data</strong> -- 内容更适合进阶 <a href="https://link.zhihu.com/?target=http%3A//work.caltech.edu/lectures.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">课程视频,课件PDF@Caltech</a></p>
  <ol>
   <li data-pid="sF4U_0BO">The Learning Problem</li>
   <li data-pid="3097l3MG">Is Learning Feasible?</li>
   <li data-pid="uKlKIuhx">The Linear Model I</li>
   <li data-pid="aSxAUiaA">Error and Noise</li>
   <li data-pid="w0tFuIge">Training versus Testing</li>
   <li data-pid="dUkLV9Tp">Theory of Generalization</li>
   <li data-pid="_i-wXMzr">The VC Dimension</li>
   <li data-pid="a4EfgiXw">Bias-Variance Tradeoff</li>
   <li data-pid="Kl3ny0XU">The Linear Model II</li>
   <li data-pid="Wh70pskw">Neural Networks</li>
   <li data-pid="OK-pgttl">Overfitting</li>
   <li data-pid="eLGnrfPF">Regularization</li>
   <li data-pid="oBZPSN90">Validation</li>
   <li data-pid="N2mwko1o">Support Vector Machines</li>
   <li data-pid="9HiE6ID0">Kernel Methods</li>
   <li data-pid="yjL_oKCd">Radial Basis Functions</li>
   <li data-pid="Ivd78iW0">Three Learning Principles</li>
   <li data-pid="0SNwX5pL">Epilogue</li>
  </ol>
  <p data-pid="hk8mb05o"><strong>2014年 林軒田(国立台湾大学) 機器學習基石 (Machine Learning Foundations)</strong> -- 内容更适合进阶，華文的教學講解 <a href="https://link.zhihu.com/?target=https%3A//www.coursera.org/course/ntumlone" class=" wrap external" target="_blank" rel="nofollow noreferrer">课程主页</a></p>
  <p data-pid="9McfLeT0">When Can Machines Learn? [何時可以使用機器學習] The Learning Problem [機器學習問題] -- Learning to Answer Yes/No [二元分類] -- Types of Learning [各式機器學習問題] -- Feasibility of Learning [機器學習的可行性]</p>
  <p data-pid="vj7Heym8">Why Can Machines Learn? [為什麼機器可以學習] -- Training versus Testing [訓練與測試] -- Theory of Generalization [舉一反三的一般化理論] -- The VC Dimension [VC 維度] -- Noise and Error [雜訊一錯誤]</p>
  <p data-pid="MvwjyLrM">How Can Machines Learn? [機器可以怎麼樣學習] -- Linear Regression [線性迴歸] -- Linear `Soft' Classification [軟性的線性分類] -- Linear Classification beyond Yes/No [二元分類以外的分類問題] -- Nonlinear Transformation [非線性轉換]</p>
  <p data-pid="r7V4wDy5">How Can Machines Learn Better? [機器可以怎麼樣學得更好] -- Hazard of Overfitting [過度訓練的危險] -- Preventing Overfitting I: Regularization [避免過度訓練一：控制調適] -- Preventing Overfitting II: Validation [避免過度訓練二：自我檢測] -- Three Learning Principles [三個機器學習的重要原則]</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E6%259B%25B4%25E5%25A4%259A%25E9%2580%2589%25E6%258B%25A9" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>更多选择
  <p data-pid="aNCH6VyB"><strong>2008年Andrew Ng CS229 机器学习</strong> -- 这组视频有些年头了，主讲人这两年也高大上了.当然基本方法没有太大变化，所以课件PDF可下载是优点。 <a href="https://link.zhihu.com/?target=http%3A//v.163.com/special/opencourse/machinelearning.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">中文字幕视频@网易公开课</a> | <a href="https://link.zhihu.com/?target=https%3A//www.youtube.com/playlist%3Flist%3DPLA89DCFA6ADACE599" class=" wrap external" target="_blank" rel="nofollow noreferrer">英文版视频@youtube</a> |<a href="https://link.zhihu.com/?target=http%3A//cs229.stanford.edu/materials.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">课件PDF@Stanford</a></p>
  <p data-pid="YIIIEntJ">第1集.机器学习的动机与应用 第2集.监督学习应用.梯度下降 第3集.欠拟合与过拟合的概念 第4集.牛顿方法 第5集.生成学习算法 第6集.朴素贝叶斯算法 第7集.最优间隔分类器问题 第8集.顺序最小优化算法 第9集.经验风险最小化 第10集.特征选择 第11集.贝叶斯统计正则化 第12集.K-means算法 第13集.高斯混合模型 第14集.主成分分析法 第15集.奇异值分解 第16集.马尔可夫决策过程 第17集.离散与维数灾难 第18集.线性二次型调节控制 第19集.微分动态规划 第20集.策略搜索</p>
  <p data-pid="MH-bQdU5"><strong>2012年余凯(百度)张潼(Rutgers) 机器学习公开课</strong> -- 内容更适合进阶 <a href="https://link.zhihu.com/?target=http%3A//wenku.baidu.com/course/view/49e8b8f67c1cfad6195fa705" class=" wrap external" target="_blank" rel="nofollow noreferrer">课程主页@百度文库</a> ｜ <a href="https://link.zhihu.com/?target=http%3A//bigeye.au.tsinghua.edu.cn/DragonStar2012/download.html" class=" wrap external" target="_blank" rel="nofollow noreferrer">课件PDF@龙星计划</a></p>
  <p data-pid="F7E2lHwn">第1节Introduction to ML and review of linear algebra, probability, statistics (kai) 第2节linear model (tong) 第3节overfitting and regularization(tong) 第4节linear classification (kai) 第5节basis expansion and kernelmethods (kai) 第6节model selection and evaluation(kai) 第7节model combination (tong) 第8节boosting and bagging (tong) 第9节overview of learning theory(tong) 第10节optimization in machinelearning (tong) 第11节online learning (tong) 第12节sparsity models (tong) 第13节introduction to graphicalmodels (kai) 第14节structured learning (kai) 第15节feature learning and deeplearning (kai) 第16节transfer learning and semi supervised learning (kai) 第17节matrix factorization and recommendations (kai) 第18节learning on images (kai) 第19节learning on the web (tong)</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E8%25AE%25BA%25E5%259D%259B%25E7%25BD%2591%25E7%25AB%2599" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>论坛网站<a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E4%25B8%25AD%25E6%2596%2587" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>中文
  <p data-pid="GYMpIIga"><a href="https://link.zhihu.com/?target=http%3A//www.52ml.net/" class=" wrap external" target="_blank" rel="nofollow noreferrer">我爱机器学习</a> 我爱机器学习</p>
  <p data-pid="sd7avadO"><a href="https://link.zhihu.com/?target=http%3A//www.mitbbs.com/bbsdoc/DataSciences.html" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://www.</span><span class="visible">mitbbs.com/bbsdoc/DataS</span><span class="invisible">ciences.html</span><span class="ellipsis"></span></a> MITBBS－ 电脑网络 - 数据科学版</p>
  <p data-pid="pnF5v4qb"><a href="https://link.zhihu.com/?target=http%3A//www.guokr.com/group/262/" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习小组</a> 果壳 &gt; 机器学习小组</p>
  <p data-pid="uPwQCEyn"><a href="https://link.zhihu.com/?target=http%3A//cos.name/cn/forum/22" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://</span><span class="visible">cos.name/cn/forum/22</span><span class="invisible"></span></a> 统计之都 » 统计学世界 » 数据挖掘和机器学习</p>
  <p data-pid="-xycCXHr"><a href="https://link.zhihu.com/?target=http%3A//bbs.byr.cn/%23%21board/ML_DM" class=" wrap external" target="_blank" rel="nofollow noreferrer">北邮人论坛-北邮人的温馨家园</a> 北邮人论坛 &gt;&gt; 学术科技 &gt;&gt; 机器学习与数据挖掘</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E8%258B%25B1%25E6%2596%2587" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>英文
  <p data-pid="URuQ4r8h"><a href="https://link.zhihu.com/?target=https%3A//github.com/josephmisiti/awesome-machine-learning" class=" wrap external" target="_blank" rel="nofollow noreferrer">josephmisiti/awesome-machine-learning · GitHub</a> 机器学习资源大全</p>
  <p data-pid="c_uqhaC2"><a href="https://link.zhihu.com/?target=http%3A//work.caltech.edu/library/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Machine Learning Video Library</a> Caltech 机器学习视频教程库，每个课题一个视频</p>
  <p data-pid="QMEtjRy3"><a href="https://link.zhihu.com/?target=http%3A//www.kdnuggets.com/" class=" wrap external" target="_blank" rel="nofollow noreferrer">Analytics, Data Mining, and Data Science</a> 数据挖掘名站</p>
  <p data-pid="6pnlAW-7"><a href="https://link.zhihu.com/?target=http%3A//www.datasciencecentral.com/" class=" external" target="_blank" rel="nofollow noreferrer"><span class="invisible">http://www.</span><span class="visible">datasciencecentral.com/</span><span class="invisible"></span></a> 数据科学中心网站</p><a class=" wrap external" href="https://link.zhihu.com/?target=http%3A//ml.memect.com/article/machine-learning-guide.html%23%25E4%25B8%259C%25E6%258B%2589%25E8%25A5%25BF%25E6%2589%25AF" target="_blank" rel="nofollow noreferrer">机器学习入门资源不完全汇总</a>东拉西扯
  <p data-pid="7EU6iziA">一些好东西，入门前未必看得懂，要等学有小成时再看才能体会。</p>
  <p data-pid="Ct32Mu4t"><a href="https://link.zhihu.com/?target=http%3A//en.wikipedia.org/wiki/Machine_learning%23Machine_learning_and_data_mining" class=" wrap external" target="_blank" rel="nofollow noreferrer">机器学习与数据挖掘的区别</a></p>
  <ul>
   <li data-pid="xLfhI2hw">机器学习关注从训练数据中学到已知属性进行预测</li>
   <li data-pid="zeXyW84z">数据挖掘侧重从数据中发现未知属性</li>
  </ul>
  <p data-pid="KGtpXVDD"><a href="https://link.zhihu.com/?target=http%3A//www.quora.com/What-are-some-good-machine-learning-jokes" class=" wrap external" target="_blank" rel="nofollow noreferrer">Dan Levin, What is the difference between statistics, machine learning, AI and data mining?</a></p>
  <ul>
   <li data-pid="BgJG6-hb">If there are up to 3 variables, it is statistics.</li>
   <li data-pid="27iVqgqj">If the problem is NP-complete, it is machine learning.</li>
   <li data-pid="Dm735et1">If the problem is PSPACE-complete, it is AI.</li>
   <li data-pid="LaltikS_">If you don't know what is PSPACE-complete, it is data mining.</li>
  </ul>
  <p data-pid="BbDRAKZW">几篇高屋建瓴的机器学习领域概论, 参见<a href="https://link.zhihu.com/?target=http%3A//machinelearningmastery.com/best-machine-learning-resources-for-getting-started/" class=" wrap external" target="_blank" rel="nofollow noreferrer">原文</a></p>
  <ul>
   <li data-pid="qHhlGzgW"><a href="https://link.zhihu.com/?target=http%3A//www.cs.cmu.edu/~tom/pubs/MachineLearning.pdf" class=" wrap external" target="_blank" rel="nofollow noreferrer">The Discipline of Machine Learning</a>Tom Mitchell 当年为在CMU建立机器学习系给校长写的东西。</li>
   <li data-pid="QQU90XB9"><a href="https://link.zhihu.com/?target=http%3A//homes.cs.washington.edu/~pedrod/papers/cacm12.pdf" class=" wrap external" target="_blank" rel="nofollow noreferrer">A Few Useful Things to Know about Machine Learning</a> Pedro Domingos教授的大道理，也许入门时很多概念还不明白，上完公开课后一定要再读一遍。</li>
  </ul>
  <p data-pid="Y_FHX5vJ">几本好书</p>
  <ul>
   <li data-pid="4vjZrFii">李航博士的《统计学习方法》一书前段也推荐过，给个<a href="https://link.zhihu.com/?target=http%3A//book.douban.com/subject/10590856/" class=" wrap external" target="_blank" rel="nofollow noreferrer">豆瓣的链接</a></li>
  </ul>
 </blockquote>
</body>