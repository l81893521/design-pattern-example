package proxy.demo3.test;

import java.lang.reflect.Proxy;

import proxy.demo3.Car;
import proxy.demo3.Moveable;
import proxy.demo3.TimeHandler;

/**
 * 动态代理测试类
 * @author zhangjiawei
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		Class<?> clazz = car.getClass();
		
		Moveable moveable = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new TimeHandler(clazz));
		moveable.move();
		
	}

}
