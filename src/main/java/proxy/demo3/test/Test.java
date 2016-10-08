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
		/*
		 * 动态生成代理类
		 * @param loader 类加载器
		 * @param interfaces 实现的接口
		 * @param h 实现的处理器
		 * @return 动态产生的代理对象
		 */
		Moveable moveable = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new TimeHandler(car));
		moveable.move();
		
	}

}
