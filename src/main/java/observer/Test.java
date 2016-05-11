package observer;

import observer.pull.observer.ConcreteObserver;
import observer.pull.subject.ConcreteWeatherSubject;

/**
 * 这个例子中，我们使用发布者(目标)和订阅者(观察者)来举例
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * 拉模型
		 */
		System.out.println("拉模型");
		//1 创建发布者
		ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();
		//2 创建订阅者
		ConcreteObserver mother = new ConcreteObserver();
		mother.setObserverName("妈");
		mother.setRemindThing("听说今天的天气很适合在家里睡觉哦！");
		
		ConcreteObserver father = new ConcreteObserver();
		father.setObserverName("爸");
		father.setRemindThing("听说今天的天气很适合在家和妈睡觉哦!");
		//3 注册订阅者
		weatherSubject.attach(mother);
		weatherSubject.attach(father);
		//4 发布者发布天气
		weatherSubject.setWeatherContent("天气晴朗，蓝天白云，气温25度");
		
		/*
		 * 推模型
		 */
		System.out.println("推模型");
		//1 创建发布者
		observer.push.subject.ConcreteWeatherSubject weatherSubject2 = new observer.push.subject.ConcreteWeatherSubject();
		//2 创建订阅者
		observer.push.observer.ConcreteObserver mother2 = new observer.push.observer.ConcreteObserver();
		mother2.setObserverName("妈");
		mother2.setRemindThing("听说今天的天气很适合在家里睡觉哦！");
		
		observer.push.observer.ConcreteObserver father2 = new observer.push.observer.ConcreteObserver();
		father2.setObserverName("爸");
		father2.setRemindThing("听说今天的天气很适合在家和妈睡觉哦!");
		//3 注册订阅者
		weatherSubject2.attach(mother2);
		weatherSubject2.attach(father2);
		//4 发布者发布天气
		weatherSubject2.setWeatherContent("天气晴朗，蓝天白云，气温25度");
		
		/*
		 * 使用java自带的观察者模式实现 
		 */
		System.out.println("使用java自带的观察者模式实现 ");
		//1 创建发布者
		observer.java.subject.ConcreteWeatherSubject weatherSubject3 = new observer.java.subject.ConcreteWeatherSubject();
		//2 创建订阅者
		observer.java.observer.ConcreteObserver mother3 = new observer.java.observer.ConcreteObserver();
		mother3.setObserverName("妈");
		mother3.setRemindThing("听说今天的天气很适合在家里睡觉哦！");
		
		observer.java.observer.ConcreteObserver father3 = new observer.java.observer.ConcreteObserver();
		father3.setObserverName("爸");
		father3.setRemindThing("听说今天的天气很适合在家和妈睡觉哦!");
		//3 注册订阅者
		weatherSubject3.addObserver(mother3);
		weatherSubject3.addObserver(father3);
		//4 发布者发布天气
		weatherSubject3.setWeatherContent("天气晴朗，蓝天白云，气温25度");
	}
}
