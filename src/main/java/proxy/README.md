#proxy(代理模式)
##静态代理
* 代理和被代理对象在代理之前是确定的。他们都实现相同的接口或者继承相同的抽象类
* 由于组合由于继承，所以不推荐使用继承的方式来实现静态代理

###demo1
* [Car](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/Car.java)实现了定义move()方法的[Moveable](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/Moveable.java)接口
* 在此基础上，我们使用代理模式来加入记录行驶时间功能
* [使用继承的方式实现静态代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/CarTimeProxyByInheritance.java)
* [使用聚合的方式实现静态代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/CarTimeProxyByComposition.java)
* [测试入口](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo1/test/Test.java)

###demo2
* 此例去除了使用继承的方式实现静态代理
* [Car](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo2/Car.java)实现了定义move()方法的[Moveable](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo2/Moveable.java)接口
* [记录行驶时间代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo2/CarTimeProxy.java)
* [记录日志代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo2/CarLogProxy.java)
* [测试入口](https://github.com/l81893521/design-pattern-example/tree/master/src/main/java/proxy/demo2/test/Test.java)

##动态代理
###demo3(使用jdk动态代理)
* 使用jdk动态代理,动态创建出代理类,无需记录汽车日志单独创建一个类，记录火车日志又单独创建一个类
* [Car](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo3/Car.java)实现了定义move()方法的[Moveable](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo3/Moveable.java)接口
* [统一实现记录行驶时间](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo3/TimeHandler.java)
* [测试入口](https://github.com/l81893521/design-pattern-example/tree/master/src/main/java/proxy/demo3/test/Test.java)

###demo4(使用cglib动态代理)
* [cglib代理](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo4/CglibProxy.java)
* [测试入口](https://github.com/l81893521/design-pattern-example/blob/master/src/main/java/proxy/demo4/Test.java)
