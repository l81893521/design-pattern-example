package singleton;
/**
 * 单例模式(饿汉模式)
 * 有些对象只需要一个就足够了
 * 保证整个应用程序事例只有一个
 * 什么是饿汉模式呢？
 * 意思就是，程序初始化的时候就已经加载了，想象成一个人很饿，一开始就吃了
 * 所以称之为饿汉模式
 * @author zhangjiawei
 *
 */
public class Singleton {
	//第一步，我们把构造方法私有化，避免外界通过new关键字来创建事例，或者创建多个事例
	private Singleton() {
	}
	
	//第二步，创建类的唯一事例，因为static关键字，所以类加载的时候，对象就会创建，而且是唯一的
	private static Singleton instance = new Singleton();
	
	//第三步，提供一个获取实例的方法
	public static Singleton getInstance(){
		return instance;
	}
}
