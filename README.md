#设计模式
	什么是设计模式，设计模式是一种概念性，思想上的知识。是通过别人的总结，得到大家的认同，可以使我们的代码更加清晰，更加易懂，更加健壮，重用性更高的实现方式。
	在java中，基本设计模式大概又23种，在后面的例子中，我们会对它进行一一的讲解
	就好像孙子兵法，三十六计，是别人经验的一个总结。
##singleton(单例模式):
	在程序中，很多情况下我们只需要一个对象，比如说配置文件，日志对象等等
	像操作日志的对象，如果多个事例同时操作一个日子文件，很明显一定会有问题
	所以日志对象，在整个应用中，我们只需要一个
	那怎么才能令整个应用只有一个日志对象呢，那就是使用单例模式
	单例模式中通常分为懒汉式和饿汉式
##factory(工厂模式)
	工厂模式是用来干什么的呢？
	就是用来实例化对象，用工厂方法代理new操作
	工厂模式包括了工厂方法模式和抽象工厂模式
	抽象工厂模式就是工厂方法模式的扩展
	那什么情况下适合工厂模式？
		1.有一组类似的对象需要被创建
		2.在编码时不能预见需要创建哪种类的实力
		3.系统需要考虑扩展性，不依赖与产品类实例如何被创建，组合和表达的细节.
##abstract_factory(抽象工厂模式)
	抽象工厂模式其实是对工厂模式的一个扩展
	通过理解完factory的例子之后
	如果我们再对手机进行不同品牌的划分，每个品牌也有不同的手机型号，平板电脑型号，应该怎么做？
##template_method(模板方法模式)
	什么是模板方法模式？
	模板方法模式又称之为好莱坞模式（什么是好莱坞模式？google吧）
	模板方式就是把固定的算法(或者业务的顺序)定义到一个骨架或者框架当中,其中一些存在不同的地方，交给不同的子类去实现
	也就是说子类可以替换掉父类的可变逻辑，但不能改变整体逻辑结构
	好比说，我们打算从一台饮料机，购买一瓶饮料，我们大致分为4部
		1.投币
		2.选择饮料
		3.下落饮料
		4.找钱
	当然这4步的顺序不能改变，如果改变，我们就无法购买饮料了。所以我们定义好一个骨架，去固定这4步的顺序
	从这4步里面，我们发现1,3,4部是不变的，投币的口之后一个，下落饮料的通道也只有一条，找钱的窗口也之后一个
	但是第2部，我们会发现选择的饮料的按钮会有多个，不同的按钮代表不同的饮料
	这就是模板方法模式了
	至于代码怎么写？请看template_method
##strategy(策略模式)
	什么是策略模式？
	策略模式将可变的部分从程序中抽象分离成算法接口，在该接口下分别封装一系列算法实现
	在Effective Java书中，有一个人写了一段话:Favor composition over inheritance
	意思就是复合(组合)优于继承
	什么是composition?好比说一辆车(Car)它拥有(has-a)轮胎(tire)
##observer(观察者模式)
	什么是观察者模式？
	观察者模式又被称为发布(publish)-订阅(subscribe)模式
	它定义对象间的一种一对多的依赖关系。当一个对象的状态发生改变的时候，所有依赖于它的对象都得到通知并被自动更新
	比如说:
	小明，小王，小陈（订阅者）它们很关注天气的变化，它们订阅了天文台（发布者）的天气自动通知业务
	那么这个时候，天气一旦发生变化，天文台（发布者）就会马上通知小明，小王和小陈（订阅者）
	一般情况下，观察者模式分为以下两种
	推模型和拉模型
##chain(责任链模式)
	责任链模式听起来可能比较模糊，没错，在我们日常代码中不会写类似责任链模式的代码
	但是无论前端工程师后者后端工程师，其实每天都在接触责任链模式
	什么是责任链模式?
	就是将接收者对象连成一条链，并在该链上传递请求，知道有一个接收者对象处理它
	通过这种方法，避免发送者和接收者之间的耦合

##proxy(代理模式)
### 定义
* 为其他对象提供一种代理以控制对这个对象的访问。
* 代理对象起到了中介作用，可以去掉功能服务或增加额外的服务
* [详情查看](https://github.com/l81893521/design-pattern-example/tree/master/src/main/java/proxy)

##adaptor(适配器模式)待续
	适配器模式将一个类的接口，转换成客户期望的另外一个接口。使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
	生活中的适配器：
		我们的android充电接口没办法给iphone充电，但是我们用一个iphone充电的适配器套在安装充电接口上，就可以给iphone充电了