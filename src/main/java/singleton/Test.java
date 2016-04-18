package singleton;

/**
 * 这个测试例子，我们分别测试了饿汉模式和懒汉模式
 * 那他们有什么区别呢？
 * 饿汉模式：它加载类时比较慢，因为加载类的时候，需要去创建类的实例。但是在运行的时候，我们去获取对象的速度比较快。还有一个就是线程安全的。
 * 懒汉模式：它在加载类的时候比较快，因为加载类的时候并不需要去创建对象。但是在运行的时候，获取对象的速度比较慢，因为当第一个用户去调用它获取实例化方法的时候
 * 它才会去创建实例，但是第二个用户调用，速度就一样了，因为不需要重新实例化对象。懒汉模式是线程不安全的。
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建对象，我们是通过new 关键字来创建的，每new一个对象，都是一个新的对象
//		new Singleton();
//		new Singleton();
		
		//饿汉模式
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一个实例");
		}
		
		//懒汉模式
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if(s3 == s4){
			System.out.println("s3和s4是同一个实例");
		}
	}
}
