package proxy.demo1.test;

import proxy.demo1.Car;
import proxy.demo1.CarTimeProxyByComposition;
import proxy.demo1.CarTimeProxyByInheritance;
import proxy.demo1.Moveable;

/**
 * 测试
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("----------使用继承方式来实现静态代理----------");
		Moveable car2 = new CarTimeProxyByInheritance();
		car2.move();
		System.out.println("----------使用聚合方式实现静态代理----------");
		Moveable car3 = new CarTimeProxyByComposition(new Car());
		car3.move();
	}
}
