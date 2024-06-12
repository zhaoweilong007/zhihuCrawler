# 为什么国际单位制下地球重力加速度的数值很接近圆周率的平方？
- 点赞数：6447
- 更新时间：2022年04月17日19时16分35秒
- 回答url：https://www.zhihu.com/question/21230794/answer/2443607415
<body>
 <p data-pid="4BAmaLpq">咦, 这是真的吗? 以前我都没注意到, 先验证一下看看是不是. 查询得知</p>
 <p data-pid="EyiosdiM"><img src="https://www.zhihu.com/equation?tex=g%3D9.8067%5C%2C%5Ctext%7Bm%2Fs%7D%5E2" alt="g=9.8067\,\text{m/s}^2" eeimg="1"></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-198c43cf2f40ce0562d1c72b35e01b34_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="1194" data-rawheight="592" data-original-token="v2-198c43cf2f40ce0562d1c72b35e01b34" data-default-watermark-src="https://picx.zhimg.com/50/v2-be86bd80c8e1081a3bdc33377f13768e_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1194" data-original="https://pic1.zhimg.com/v2-198c43cf2f40ce0562d1c72b35e01b34_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="ZJJl5qPn"><img src="https://www.zhihu.com/equation?tex=%5Cpi%5E2%3D9.8696" alt="\pi^2=9.8696" eeimg="1"></p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-c0d6e65382500caac50ee56a42cca6de_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="578" data-rawheight="190" data-original-token="v2-c0d6e65382500caac50ee56a42cca6de" data-default-watermark-src="https://picx.zhimg.com/50/v2-c0de693c7b04652e799f3a9eea06577f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="578" data-original="https://picx.zhimg.com/v2-c0d6e65382500caac50ee56a42cca6de_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="u8QLHrV7">还是有点接近, 有点接近啊.</p>
 <p data-pid="iG0LtpXP">为什么呢? 为什么呢?</p>
 <p data-pid="DDCxiTBP">我们看一下 <img src="https://www.zhihu.com/equation?tex=%5Ctext%7Bm%7D" alt="\text{m}" eeimg="1"> 是怎么定义的.</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-c01467e7ea7374f1dfc5152f8deba29f_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2384" data-rawheight="536" data-original-token="v2-c01467e7ea7374f1dfc5152f8deba29f" data-default-watermark-src="https://pic1.zhimg.com/50/v2-709febd67edf568bbefbb426ebcd5530_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2384" data-original="https://picx.zhimg.com/v2-c01467e7ea7374f1dfc5152f8deba29f_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="nX8K9YjM">咦, 查询发现 <img src="https://www.zhihu.com/equation?tex=%5Ctext%7Bm%7D" alt="\text{m}" eeimg="1"> 的定义好像在历史上改了很多次啊, 那么到底有哪些定义呢?</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-919f79b05c430804667d34b035ef1500_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="2948" data-rawheight="1038" data-original-token="v2-919f79b05c430804667d34b035ef1500" data-default-watermark-src="https://picx.zhimg.com/50/v2-04d14d89c0fb4953600ce54cc1356e71_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="2948" data-original="https://pic1.zhimg.com/v2-919f79b05c430804667d34b035ef1500_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="X_0s0OcI">继续查询, 发现 <img src="https://www.zhihu.com/equation?tex=%5Ctext%7Bm%7D" alt="\text{m}" eeimg="1"> 的第一个(最初的)定义是"半周期为 <img src="https://www.zhihu.com/equation?tex=1%5C%2C%5Ctext%7Bs%7D" alt="1\,\text{s}" eeimg="1"> 的钟摆的长度"</p>
 <p data-pid="kltraBt7">而单摆周期公式是</p>
 <p data-pid="-BjCoOt8"><img src="https://www.zhihu.com/equation?tex=T%3D2%5Cpi%5Csqrt%7B%5Cfrac%7BL%7D%7Bg%7D%7D" alt="T=2\pi\sqrt{\frac{L}{g}}" eeimg="1"></p>
 <p data-pid="72YzDnes">咦, 出现了 <img src="https://www.zhihu.com/equation?tex=g" alt="g" eeimg="1"> 有点意思, 有点意思呀.</p>
 <p data-pid="ChM30Fg4">根据公式, "半周期为 <img src="https://www.zhihu.com/equation?tex=1%5C%2C%5Ctext%7Bs%7D" alt="1\,\text{s}" eeimg="1"> 的钟摆的长度" 为 <img src="https://www.zhihu.com/equation?tex=L%3D%5Cfrac%7Bg%7D%7B%5Cpi%5E2%7D" alt="L=\frac{g}{\pi^2}" eeimg="1"></p>
 <p data-pid="wduY-b-V">而 <img src="https://www.zhihu.com/equation?tex=L" alt="L" eeimg="1"> 又被我们定义成了 <img src="https://www.zhihu.com/equation?tex=1%5C%2C%5Ctext%7Bm%7D" alt="1\,\text{m}" eeimg="1"> , 所以就有 <img src="https://www.zhihu.com/equation?tex=g%3D1%5C%2C%5Ctext%7Bm%7D%5Ctimes%5Cpi%5E2" alt="g=1\,\text{m}\times\pi^2" eeimg="1"></p>
 <p data-pid="o23z0QHb">所以在这种定义下, 重力加速度和 <img src="https://www.zhihu.com/equation?tex=%5Cpi%5E2" alt="\pi^2" eeimg="1"> 在数值上就是完全相等的了.</p>
 <p data-pid="_TNt08q8">咦, 但是我们在回答的开头计算出的两个值并不是完全相等啊,</p>
 <p data-pid="Ltn93iUh">为什么呢? 为什么呢?</p>
 <p data-pid="Pc4Epxt5">其实是因为虽然 <img src="https://www.zhihu.com/equation?tex=%5C%2C%5Ctext%7Bm%7D" alt="\,\text{m}" eeimg="1"> 的定义改了很多次, 但是每次改定义的时候都和上次的数值差不多但并不完全相等.</p>
 <p data-pid="5ZzJu0ua">所以到了今天, <img src="https://www.zhihu.com/equation?tex=%5Ctext%7Bg%7D" alt="\text{g}" eeimg="1"> 的数值就和 <img src="https://www.zhihu.com/equation?tex=%5Cpi%5E2" alt="\pi^2" eeimg="1"> 非常接近但并不完全相等了.</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-393a3d1cd9dbb5d75c142276d465d84c_720w.jpg?source=1940ef5c" data-caption="" data-size="normal" data-rawwidth="208" data-rawheight="134" data-original-token="v2-393a3d1cd9dbb5d75c142276d465d84c" data-default-watermark-src="https://pica.zhimg.com/50/v2-721906ed267d384196107ce00dd4b89a_720w.jpg?source=1940ef5c" class="content_image" width="208">
 </figure>
 <p></p>
</body>