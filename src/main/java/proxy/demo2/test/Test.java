package proxy.demo2.test;

import proxy.demo2.Car;
import proxy.demo2.CarLogProxy;
import proxy.demo2.CarTimeProxy;
import proxy.demo2.Moveable;

/**
 * 测试
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		Moveable timeProxy = new CarTimeProxy(car);
		Moveable logProxy = new CarLogProxy(timeProxy);
		logProxy.move();
	}
}
