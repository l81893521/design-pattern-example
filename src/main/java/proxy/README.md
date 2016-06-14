#proxy(代理模式)
##静态代理
* 代理和被代理对象在代理之前是确定的。他们都实现相同的接口或者继承相同的抽象类
* 由于组合由于继承，所以不推荐使用继承的方式来实现静态代理

###demo1
* [Car](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/Car.java)接口实现了定义了move()方法的[Moveable](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/Moveable.java)接口
* 在此基础上，我们使用代理模式来加入记录行驶时间功能
* [使用继承的方式实现静态代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/CarTimeProxyByInheritance.java)
* [使用聚合的方式实现静态代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/CarTimeProxyByComposition.java)
* [测试入口](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/test/Test.java)



##远程代理
###定义
* 为不同的地理对象，提供局域网代表对象

##虚拟代理
###定义
* 根据需要将资源很大的对象进行延迟，真正需要的时候进行创建

##保护代理
###定义
* 控制对一个对象的访问权限

##智能引用代理
###定义
* 提供对目标对象一些额外的服务
* 静态代理
	* 代理和被代理对象在代理之前是确定的。他们都实现相同的接口或者继承相同的抽象类
* 动态代理