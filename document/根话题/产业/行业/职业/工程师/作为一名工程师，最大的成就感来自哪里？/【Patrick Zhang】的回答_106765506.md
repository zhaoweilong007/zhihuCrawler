# 作为一名工程师，最大的成就感来自哪里？
- 点赞数：5165
- 更新时间：2016年06月20日22时12分13秒
- 回答url：https://www.zhihu.com/question/46867946/answer/106765506
<body>
 <p data-pid="oRieuks4">我参与设计和施工的工程很多，已经无法统计和计数了。这些工程中，比较有名的有长江三峡工程，有首都机场T3航站楼工程、奥运会工程和核电工程，有多达11座城市的地铁工程，有青藏铁路工程，有若干家银行和移动公司的数据中心工程等等。</p>
 <figure>
  <img src="https://picx.zhimg.com/50/3897883607cdb7d7299eb9fd2e6fbb2f_720w.jpg?source=1940ef5c" data-rawwidth="720" data-rawheight="358" data-original-token="3897883607cdb7d7299eb9fd2e6fbb2f" class="origin_image zh-lightbox-thumb" width="720" data-original="https://picx.zhimg.com/3897883607cdb7d7299eb9fd2e6fbb2f_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="PXFvTFFs">不过，我最引为自豪的不是设计某工程，而是工程故障分析。原因很简单，故障分析最能体现个人技术水平。</p>
 <p data-pid="1197s7W5"><b>第一个例子：</b></p>
 <p data-pid="7z0uqus4">某日，某地的一座工厂内，低压配电柜发生严重故障，配电室设备基本烧毁，全厂的生产完全中断。</p>
 <p data-pid="X6KfEiFn">售后服务人员抵达现场，发现现场已经清理过了，关键证据没有了。于是把现场照片和10kV故障录波交给我，让我来分析事故原因。</p>
 <p data-pid="Bf9dAyh5">我根据录波记录，发现在发生故障时间段的数百毫秒时间内，首先出现两相的电压波形近乎重叠，另外一相与其它两相反相，接着重叠和反相现象消失；过了数十毫秒后，又来了数十毫秒的重叠和反相，且电流明显变大；再接着又消失；最后，出现了三相对称短路现象。根据电流幅值测算，可以知道低压侧的短路规模。六十毫秒后，断路器开断，电流均归零。</p>
 <figure>
  <img src="https://pica.zhimg.com/50/be70130849537b5fed37313c3cba4b33_720w.jpg?source=1940ef5c" data-rawwidth="574" data-rawheight="323" data-original-token="be70130849537b5fed37313c3cba4b33" class="origin_image zh-lightbox-thumb" width="574" data-original="https://pica.zhimg.com/be70130849537b5fed37313c3cba4b33_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="1RxJK4Bl">我告诉售后服务，应当是出现反相的那一相出现单相接地故障，继而引发系统出现三相短路事故，最终导致配电室发生严重电气火灾致使全站设备烧毁。</p>
 <p data-pid="qbJe1e2C">根据系统的母线槽和母线规格和长度，我计算和估计了低压开关柜中的事故发生点，并告诉售后服务应当如何去查找线索。经过努力，找到了关键线索，给出了事故结论。事后，用户也不得不承认我的分析是对的。</p>
 <p data-pid="Kx0NyjPz">原来，在我指出的故障点，有一台散热用的风机。电工在检修后安装时，不慎让风机碰到了系统母线，致使发生单相接地故障，最后导致三相短路和全厂停电事故。</p>
 <p data-pid="ekbFUeeM"><b>第二个例子：</b></p>
 <p data-pid="Spha-1fs">某日，海拔3600米的秘鲁铜矿发来邮件，也是整座配电室烧毁。对方要求解析事故原因，并提供了现场图片。</p>
 <p data-pid="cXltXdCf">我的第一想法是：由于配电室海拔高度高，很容易出现温升超标，可能是温升过热导致电器设备烧毁。但奇怪的是，按配电设备实际配置方案、开关柜柜体防护等级和母线降容看，完全满足要求。可见这第一想法是错误的。</p>
 <figure>
  <img src="https://pic1.zhimg.com/50/3e087e122ed309424f0f338228c25870_720w.jpg?source=1940ef5c" data-rawwidth="823" data-rawheight="567" data-original-token="3e087e122ed309424f0f338228c25870" class="origin_image zh-lightbox-thumb" width="823" data-original="https://picx.zhimg.com/3e087e122ed309424f0f338228c25870_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="nxJd4TJa">第二想法是：是否是某电器与主断路器之间的短路协调配合未做好，致使触头开断熔焊而致电气火灾。检索了配置方案中的短路协调方案，发现符合要求。</p>
 <p data-pid="INJV1mD4">第三个想法是：是否某仪器仪表不满足高原的工作条件，它的继电器触头出现电弧熔焊？要检查这个问题，一定要调取系统的控制原理图，以及仪器仪表的样本材料。</p>
 <p data-pid="BixVaXVk">最后我发现，一款无功功率补偿控制器的出口继电器不满足高海拔工作要求。我检索了烧毁后的开关柜图片，果然发现无功功率补偿回路的烧蚀情况尤为严重。</p>
 <p data-pid="umKb7gmp">但这里其实是存在问题的：无功功率控制器的电源属于控制回路，它上面安装了保险丝。若触头发生沾粘，保险丝会熔断。</p>
 <p data-pid="bLKRJwmE">带着疑问我再次仔细检索配电设备的图纸，发现控制回路的保护电器根本就不是熔断器，而是微型断路器。再仔细看图纸，这些微断居然都是20A的，而控制回路的电流一般是6A。当出现故障后，微断根本就无法去执行保护。</p>
 <p data-pid="dBaxrZl5">最后查清楚了，事故就是从控制器开始的。控制器中的继电器触头应当采用两个同类触头串联，但实际上只是采用一个触头执行控制。当触头因为无法熄弧而熔焊时，尽管电流已经超过给定值，但因为断路器的额定电流过大，断路器未执行保护。</p>
 <p data-pid="_7-eGi9Q"><b>第三个例子：</b></p>
 <p data-pid="6yIfWtPp">用PLC编写了成千上万套测控程序，向来没有什么问题。</p>
 <p data-pid="6yavxAgY">某日，某地铁站发来通知：地铁站电力测控系统死机，系统重启、虽然系统已经恢复，但近两百座地铁站内都安装了PLC，需要立即查清楚原因。</p>
 <p data-pid="6fHkloZ-">PLC执行了两项主要功能，一项是测控，一项是通信。检查了程序，什么纰漏也没有；检查外设，也没有问题。那么死机的原因到底是什么？</p>
 <p data-pid="RbVHoGWh">突然想到一个很隐蔽的方法：任何一款PLC都有用于检测的若干寄存器，这几个寄存器用机内电池来维持数据，即使停电也能保持信息。我用这几个寄存器来保存两个程序切换时的关键标识，看看死机的原因到底是什么。</p>
 <p data-pid="bmOXWPkP">无独有偶，某国内石油公司总部配电系统测控PLC也发生了类似现象，最奇怪的是，发生故障的时间都是周一上午某个时段。检查了程序和外设，依然没有任何问题。排障时，我也采用内部寄存器来保存切换标识，外部配套了示波器观察和记录PLC电源的波形。到了周一上午，故障终于现形了：原来这个时间段电源中出现大量干扰波，强烈的干扰信号扰乱了PLC的测控和通信切换，测控程序要长时间占用内存来处理外部中断，而通信也要占用内存来处理继保装置和电力仪表的紧急状况，两者争抢内存，最终导致PLC死机。</p>
 <p data-pid="hcRjr2tW">至于干扰波的来源是什么？没人说的清。估计是该单位内部某不为人知的部门在做什么事情，产生了强烈的谐波干扰信号吧。</p>
 <p data-pid="nrlN9hZs">将结果反馈给PLC的制造商（法国），这些浪漫之都的工程人员们，对这些紧急问题采取拖延政策。我们急他们不急。</p>
 <p data-pid="2HSfNpug">最后决定，将测控和通信分开，用两台PLC来各自独立执行。并会同售后服务把所有地铁站的PLC做了相同的处理措施，彻底地解决了问题。</p>
 <p data-pid="4S4eNbo8">从此以后，不管是什么工程，PLC的测控功能和通信一律分开，由两个独立的PLC各自完成。不管是何品牌的PLC，做法相同，避免再次出现类似现象。</p>
 <p data-pid="FTHfosMe"><b>第四个例子：</b></p>
 <p data-pid="V3UZ710x">某日，桌上的电话铃响起，售后服务告诉我，某地的一台1000kW电炉配套的75kW电动机烧毁了，检修人员发现，烧毁的原因是因为过载保护未动作。他们把资料发给我，让我仔细研究。</p>
 <p data-pid="WtZqriR4">我检查了配置方案，发现所有元器件都是按标准配置的，完全符合要求。那么过载保护未动作的原因是什么？</p>
 <p data-pid="J1OHW_QX">突然，我想到了电炉的问题。我打电话问售后服务：电炉控制电路也即调功器的晶闸管触发方式是什么？电机的电源是否与电炉同电源？</p>
 <p data-pid="u1nX0vpQ">回答是：晶闸管为过零触发，电机与电炉同电源，为一台1600kVA电炉变压器。</p>
 <p data-pid="JhBYja2I">结果就很明确了：晶闸管过零触发会产生频率为分数次的谐波，它会造成电机过热，电机的热保护应当常常动作才是。</p>
 <p data-pid="weh37XOC">我让售后服务去检查热继电器的整定值，发现整定值调整到最大值，完全起不到保护作用。询问了厂方技术人员，原来他们嫌热继电器老动作，影响生产，就故意把它的整定值调大了，最后酿成事故。</p>
 <p data-pid="8pdTRIOv">我给他们的建议是：加强电源的5次谐波滤波和抑制；将电机电源调整到其它变压器，不要与电炉变压器在一起；恢复热继电器的整定值到到正确值上。</p>
 <figure>
  <img src="https://pica.zhimg.com/50/671069037c646d6f184a3d8f2a2a1f77_720w.jpg?source=1940ef5c" data-rawwidth="757" data-rawheight="582" data-original-token="671069037c646d6f184a3d8f2a2a1f77" class="origin_image zh-lightbox-thumb" width="757" data-original="https://pica.zhimg.com/671069037c646d6f184a3d8f2a2a1f77_r.jpg?source=1940ef5c">
 </figure>
 <p data-pid="x_acyrzQ">总之，作为一名电气工程师，我觉得最重要的还是尊重知识和积累知识，用知识和经验来武装自己；遇事多思考，既能历练自己，也能从中获得快乐和满足。</p>
 <p data-pid="dGgcpl0q">ABB的一句口号很好：<b>知识就是力量</b>。</p>
 <figure>
  <img src="https://pic1.zhimg.com/50/3a6f896991b12fc4580ee29218b86e95_720w.jpg?source=1940ef5c" data-rawwidth="822" data-rawheight="557" data-original-token="3a6f896991b12fc4580ee29218b86e95" class="origin_image zh-lightbox-thumb" width="822" data-original="https://picx.zhimg.com/3a6f896991b12fc4580ee29218b86e95_r.jpg?source=1940ef5c">
 </figure>
</body>