package proxy.demo1;

/**
 * 使用继承的方式来实现静态代理
 * @author zhangjiawei
 *
 */
public class CarTimeProxyByInheritance extends Car{
	@Override
	public void move() {
		/*
		 * 在前面加点料
		 */
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		/*
		 * 还是调用car的行驶方法
		 */
		super.move();
		/*
		 * 在后面加点料
		 */
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶,汽车行驶时间:" + (endTime - startTime) + "毫秒");
	}
}
