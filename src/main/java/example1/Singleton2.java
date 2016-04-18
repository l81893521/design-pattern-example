package example1;

/**
 * 单例模式(懒汉模式)
 * 饿汉模式与懒汉模式的却别在于
 * 懒汉模式它只有当第一个用户调用它的实例化方法，它才会实例化
 * 想象成一个人很懒，你不踢他一脚，他就不动
 * 所以我们称之为懒汉模式
 * @author zhangjiawei
 *
 */
public class Singleton2 {
	
	//第一步，我们把构造方法私有化，避免外界通过new关键字来创建事例，或者创建多个事例
	private Singleton2(){
	}
	
	//第二步，创建类的唯一事例，但是不把它实例化
	private static Singleton2 instance;
	
	//第三步，提供一个用于获取实例的方法
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
}
