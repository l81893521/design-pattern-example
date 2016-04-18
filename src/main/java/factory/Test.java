package factory;

/**
 * 工厂模式
 * @author zhangjiawei
 *
 */
public class Test {
	
	public static void main(String[] args) {
		/*
		 * 通过new关键字来创建不同对象
		 */
//		AppleStoreInteface iphone = new IPhone();
//		iphone.sell();
//		AppleStoreInteface ipad = new IPad();
//		ipad.sell();
		
		/*
		 * 使用工厂来创建不同对象
		 * 请查看
		 * 		DigitalFactory.getDigital(String key)
		 * 		DigitalFactory.getDigitalByClassName(String className)
		 *		DigitalFactory.getDigitalByClass(Class<?> clazz)
		 * 方法
		 */
//		AppleStoreInteface iphone = DigitalFactory.getDigital("iphone");
//		iphone.sell();
//		AppleStoreInteface ipad = DigitalFactory.getDigital("ipad");
//		ipad.sell();
		
//		AppleStoreInteface iphone = DigitalFactory.getDigitalByClassName(IPhone.class.getName());
//		iphone.sell();
//		AppleStoreInteface ipad = DigitalFactory.getDigitalByClassName(IPad.class.getName());
//		ipad.sell();
		
		AppleStoreInteface iphone = DigitalFactory.getDigitalByClass(IPhone.class);
		iphone.sell();
		AppleStoreInteface ipad = DigitalFactory.getDigitalByClass(IPad.class);
		ipad.sell();
		AppleStoreInteface macbook = DigitalFactory.getDigitalByClass(Macbook.class);
		macbook.sell();
	}
	
	

}
