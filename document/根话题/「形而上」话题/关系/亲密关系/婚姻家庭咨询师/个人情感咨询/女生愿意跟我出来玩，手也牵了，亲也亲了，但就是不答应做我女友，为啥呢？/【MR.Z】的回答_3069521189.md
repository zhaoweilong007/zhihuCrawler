# 女生愿意跟我出来玩，手也牵了，亲也亲了，但就是不答应做我女友，为啥呢？
- 点赞数：22063
- 更新时间：2023年07月12日13时42分40秒
- 回答url：https://www.zhihu.com/question/604170915/answer/3069521189
<body>
 <p data-pid="w5pjjIoh">你好，关于您的问题：文件为什么您有执行和读写权限却显示拒绝访问。</p>
 <p data-pid="ZMDeG-4D">我的猜测是此时有进程正在使用这个文件，因此为了避免写入冲突，您不能在此刻使用这个文件。</p>
 <p data-pid="NeYkrpXR">我提供一些解决办法，您可以试着根据文件查找这个进程的PID，并试着终止这个进程，以便恢复您对文件的访问。如果进程无法被终止，我猜测它可能是重要进程，因此建议放弃您的读写计划。</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="jQZiDnhw">/*</p>
 <p data-pid="dFjWg5-2">一夜之间突然飙了一万多赞是什么情况啊啊啊</p>
 <p data-pid="I5EYLweG">有大佬翻牌了吗？</p>
 <p data-pid="afLmIqK9">我是不是梦游的时候买赞了》</p>
 <p data-pid="vnBLBX12">知乎能买这玩意的吗？</p>
 <p data-pid="d9K6dpXh">这不科学啊……</p>
 <p data-pid="5ylOXuBt">没有吧.....</p>
 <p data-pid="mL5Aj1tw">*/</p>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="g7MO2Osh">再更一段，在日版系统中可以通过抓住句柄的方法并迫使文件暂时拒绝其他进程访问的方法来达成分时复用。</p>
 <p data-pid="qUl1uWzJ">但是这是一种很不优雅的做法，可能的结果是文件损坏。偶尔其他进程会发现你的存在，这可能会抛出不可预测的错误。</p>
 <p data-pid="oeLjkYhF">正如前面说到过的，这是一种不优雅的方法，但是您可以尝试SSDT Hook等技术尝试隐藏/伪装自己，祝您写入愉快。</p>
</body>