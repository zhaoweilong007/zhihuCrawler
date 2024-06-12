# 基金定投一定赚钱吗？
- 点赞数：5358
- 更新时间：2019年03月21日19时02分26秒
- 回答url：https://www.zhihu.com/question/35163926/answer/628774714
<body>
 <p data-pid="SYkAJWp-">为了回答这个问题，我专门用Python写了个程序，花了我好几个小时，眼睛累死，不过我觉得值得。</p>
 <p data-pid="2czwp6DM">看到问题下方有不少热心答主都有举例，但多数是自己假定的数据（比如假定某些时刻某基金净值是多少），或者拿上证指数、沪深300和上证50作为基金的代用变量来证明，甚至有直接拿起笔在纸上画图演示的，这种认真，值得称赞！</p>
 <p data-pid="Q2LOcGGi">但我没发现有人真的拿市场上的基金去做backtesting，大概是因为数据难以获取？</p>
 <p data-pid="KuqzjnUh"><b>今天，我就以实证的角度，拿全市场的公募基金来检测一下定投到底赚不赚钱。</b></p>
 <p data-pid="2BXGxZXJ">首先，我们来看看定投<b>股票型基金</b>的效果。</p>
 <p data-pid="kGIXTc4I">我从Wind数据库中获取了1177只股票型基金的证券代码、基金简称、公司简称和2017年初-2018年末的两年的净值等数据。</p>
 <p data-pid="qA9K6zgY">经过数据清洗（剔除一些NAN等等），满足这两年都有完整数据的股票型基金共655只。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-dec789c7b698d97fc76aecf42f98f7ff_720w.jpg?source=1940ef5c" data-rawwidth="206" data-rawheight="30" data-size="normal" data-original-token="v2-dec789c7b698d97fc76aecf42f98f7ff" class="content_image" width="206">
  <figcaption>
   清洗后的股票型基金Dataframe的行和列
  </figcaption>
 </figure>
 <p data-pid="V2TazwnD">这个量拿来说明问题，足够了。</p>
 <p data-pid="rI0xK5Dj"><b>我们先来观察2017年定投股票型基金的结果。</b></p>
 <p data-pid="RSTOT5LV">假设从2017年1月开始，每月初定投10000元人民币，直到2017年12月（总共投入12万），分别去投这655只基金，结果到底如何？</p>
 <p data-pid="SzYb14Y_"><b>此处省略100行代码，为了方便演示，最终我把数据输出到了Excel。</b></p>
 <p data-pid="Nvqw0a8g">在2017年还算可以的行情下，每月定投1万到股票型基金，绝大多数是实现盈利的。2017年末，测试的655只基金定投中，<b>有529只的累积资金是高于12万的，占比80.76%</b>。最好的有161725.OF、159928.OF、512600.OF等。以下为累积资金排行前30。</p>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-e48a617fc7f332014f8646b1605c3389_720w.jpg?source=1940ef5c" data-rawwidth="565" data-rawheight="559" data-size="normal" data-original-token="v2-4cf824c84e6a9888c121019067e2700f" data-default-watermark-src="https://pic1.zhimg.com/50/v2-9481c8c0734c0732b4ffefd386b1b93c_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="565" data-original="https://picx.zhimg.com/v2-e48a617fc7f332014f8646b1605c3389_r.jpg?source=1940ef5c">
  <figcaption>
   2017年股票型基金定投累积资金前30名
  </figcaption>
 </figure>
 <p data-pid="2VtDDHzs">累积资金低于12万的有126只，以下为倒数10名。</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-45751bbb11a31ced6f3aa9bd2895655f_720w.jpg?source=1940ef5c" data-rawwidth="565" data-rawheight="199" data-size="normal" data-original-token="v2-7c7381e7e34567341402c73c46512d96" data-default-watermark-src="https://pic1.zhimg.com/50/v2-dd4142ab2a7dd7d4e54d48ef5c729ec1_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="565" data-original="https://pica.zhimg.com/v2-45751bbb11a31ced6f3aa9bd2895655f_r.jpg?source=1940ef5c">
  <figcaption>
   2017年股票型基金定投累积资金后10名
  </figcaption>
 </figure>
 <figure data-size="normal">
  <img src="https://pica.zhimg.com/50/v2-648cb7a254d58ef53ce5516419de1370_720w.jpg?source=1940ef5c" data-rawwidth="1119" data-rawheight="358" data-size="normal" data-original-token="v2-7d72d0a742387f147961fc49a187c8d0" data-default-watermark-src="https://picx.zhimg.com/50/v2-fc237c6629d940dbe120339cbc4866ab_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1119" data-original="https://pic1.zhimg.com/v2-648cb7a254d58ef53ce5516419de1370_r.jpg?source=1940ef5c">
  <figcaption>
   2017股票型基金定投年末累计资金分布
  </figcaption>
 </figure>
 <p data-pid="jYWEAyFL">由直方图可知，<b>2017年末累计资金多数分布在124164-136764的区间，收益率在3.47%-13.97%的区间，而2017年上证指数的收益率6.56%。</b></p>
 <p data-pid="MqG6aoiB">排名前30的定投累积资金月度走势如何？</p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-efe91b48a7f38b8532aaf3de88c742cf_720w.jpg?source=1940ef5c" data-rawwidth="1096" data-rawheight="507" data-size="normal" data-original-token="v2-ae002b06fa873bd46b802bc0347ba5e5" data-default-watermark-src="https://pica.zhimg.com/50/v2-8cb792eb8f7fc73a3d5796928d474d4f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="1096" data-original="https://picx.zhimg.com/v2-efe91b48a7f38b8532aaf3de88c742cf_r.jpg?source=1940ef5c">
  <figcaption>
   前30定投累积资金曲线（月频）
  </figcaption>
 </figure>
 <p data-pid="aVlTPkGQ"><b>定投以上基金中的佼佼者，基本在9月-10月的时候累积资金就能超过12万了。</b></p>
 <p data-pid="BsRgghQT">接下来看2018年的情况。同样假定每月定投10000元。</p>
 <p data-pid="gfsrpRHj">我们知道，<b>2018年权益类基本全军覆没，那么在2018年定投会获得什么收益呢？</b></p>
 <p data-pid="U9Fl3MPD">结果令人唏嘘，<b>定投655只基金，没有一只累积资金超过12万。</b></p>
 <p data-pid="eKp7vjmX">还是来看一下排名前30的定投。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-03a28f9deab2f55d4ba44444adef4db7_720w.jpg?source=1940ef5c" data-rawwidth="626" data-rawheight="559" data-size="normal" data-original-token="v2-5f92a7d80f3db8eeeffb659ced70a905" data-default-watermark-src="https://picx.zhimg.com/50/v2-52662bf1d2efc5b219ea5c7ef79e69f5_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="626" data-original="https://pica.zhimg.com/v2-03a28f9deab2f55d4ba44444adef4db7_r.jpg?source=1940ef5c">
  <figcaption>
   2018年股票型基金定投累积资金前30名
  </figcaption>
 </figure>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-ef24f254465ff96ef44d1167e0d9ad83_720w.jpg?source=1940ef5c" data-rawwidth="626" data-rawheight="199" data-size="normal" data-original-token="v2-2da0ef84e545b0ddaa4671d1e52fcbfb" data-default-watermark-src="https://picx.zhimg.com/50/v2-f2859d5786685ba60867309a2c4649b5_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="626" data-original="https://pic1.zhimg.com/v2-ef24f254465ff96ef44d1167e0d9ad83_r.jpg?source=1940ef5c">
  <figcaption>
   2018年股票型基金定投累积资金后10名
  </figcaption>
 </figure>
 <p data-pid="jfLVJjFA">垫底的定投更加惨不忍睹，12万投进去，最终只剩下7、8万。</p>
 <figure data-size="normal">
  <img src="https://pic1.zhimg.com/50/v2-babf6a402010c77481ef0d541ffd4541_720w.jpg?source=1940ef5c" data-rawwidth="830" data-rawheight="420" data-size="normal" data-original-token="v2-4427cf1256a014b36adbb0ae4868b5d6" data-default-watermark-src="https://picx.zhimg.com/50/v2-1054a7c70c508ee212c39b5fe1c0676b_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="830" data-original="https://picx.zhimg.com/v2-babf6a402010c77481ef0d541ffd4541_r.jpg?source=1940ef5c">
  <figcaption>
   2018股票型基金定投年末累积资金分布
  </figcaption>
 </figure>
 <p data-pid="NSqhSB7S">绝大多数定投年末累积资金处于95189-103989的区间，收益率在[-20.68% , -13.34%]，2018年上证指数跌幅达-24.59%。</p>
 <p data-pid="8uziUMqs"><b>那么如果做两年定投呢？</b>从2017年初到2018年末，每月定投10000元，共定投24万。</p>
 <p data-pid="adlHpS5k"><b>结果是，定投655只基金，没有一只最终累积资金超过24万。</b></p>
 <figure data-size="normal">
  <img src="https://picx.zhimg.com/50/v2-15f90ae4249210e9c8e29f6cc9c18ffe_720w.jpg?source=1940ef5c" data-rawwidth="766" data-rawheight="402" data-size="normal" data-original-token="v2-5cd19f769f01535c682ca2ead5985af3" data-default-watermark-src="https://pica.zhimg.com/50/v2-c9d6b23345bd24e6de1bdec2cd618c0f_720w.jpg?source=1940ef5c" class="origin_image zh-lightbox-thumb" width="766" data-original="https://picx.zhimg.com/v2-15f90ae4249210e9c8e29f6cc9c18ffe_r.jpg?source=1940ef5c">
  <figcaption>
   2017-2018股票型基金定投年末累积资金分布
  </figcaption>
 </figure>
 <p class="ztext-empty-paragraph"><br></p>
 <p data-pid="BegVv1lD">其他几大类基金（债券型、混合型、货币等）也是同样的道理，就不做回测了。</p>
 <p data-pid="UksXKl_w">基金定投到底赚不赚钱，最大的因素当属择时，即对市场行情（你所选择的大类资产的表现）的判断，牛市和熊市的定投表现截然不同。如果预期未来股市有比较好的行情，定投股票型基金当然是不错的选择，否则，可以考虑放货币基金、纯债基金或一级债基。第二大因素是基金的选择，同属权益类，也有不同题材、行业、板块的基金，通过对行业轮动的判定和热点的关注，结合基金管理人、基金经理的过往业绩，构建自己的基金评价体系，以此选择优异的基金做定投，才能在大类资产配置基础上获得Alpha。</p>
 <p></p>
</body>