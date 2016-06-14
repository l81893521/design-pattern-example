package proxy.demo1;

/**
 * 测试
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("----------使用继承方式来实现代理----------");
		Moveable car2 = new Car2();
		car2.move();
		System.out.println("----------使用聚合方式实现代理----------");
		Moveable car3 = new Car3(new Car());
		car3.move();
	}
}
