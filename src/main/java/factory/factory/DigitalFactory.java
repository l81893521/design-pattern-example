package factory.factory;

import factory.service.AppleStoreInteface;
import factory.service.impl.IPad;
import factory.service.impl.IPhone;
import factory.service.impl.Macbook;

/**
 * 电子工厂
 * 我们使用这个工厂统一管理对象，而不需要客户手动去new对象
 * @author zhangjiawei
 *
 */
public class DigitalFactory {
	
	/**
	 * 根据传入的字符串来创建不同的方法
	 * 但是这样有一个缺点，就是每当增加一个种类型的对象，都需要手动增加一个else if
	 * @param key 
	 * @return
	 */
	public static AppleStoreInteface getDigital(String key){
		if(key.equals("iphone")){
			return new IPhone();
		}else if (key.equals("ipad")) {
			return new IPad();
		}else if (key.equals("macbook")) {
			return new Macbook();
		}
		return null;
	}
	
	/**
	 * 使用java的反射机制，通过传入的类名来创建不同的对象
	 * 好处是无论你增加多少个类，这个工厂都无需修改代码
	 * 缺点是调用方，容易传错类名
	 * @param className
	 * @return
	 */
	public static AppleStoreInteface getDigitalByClassName(String className){
		try {
			return (AppleStoreInteface) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 还是使用java反射机制，把需要创建的对象的class传入，即可
	 * @param clazz
	 * @return
	 */
	public static AppleStoreInteface getDigitalByClass(Class<?> clazz){
		try {
			return (AppleStoreInteface) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
