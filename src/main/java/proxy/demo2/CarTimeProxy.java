package proxy.demo2;

/**
 * 用聚合的方式实现静态代理
 * @author zhangjiawei
 *
 */
public class CarTimeProxy implements Moveable{
	
	/*
	 * 聚合的方式
	 * 持有一个car对象
	 */
	private Moveable moveable;
	
	/**
	 * 在构造car3的时候，初始化car
	 * @param car
	 */
	public CarTimeProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}
	
	/**
	 * 在原有move的基础上
	 * 再增加记录行驶时间功能
	 */
	public void move() {
		/*
		 * 前面加点料
		 */
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		/*
		 * 调用原装的car的行驶方法
		 */
		moveable.move();
		/*
		 * 后面加点料
		 */
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶,汽车行驶时间:" + (endTime - startTime) + "毫秒");
	}

}
