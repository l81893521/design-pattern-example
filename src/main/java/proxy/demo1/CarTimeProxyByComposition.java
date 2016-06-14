package proxy.demo1;

/**
 * 用聚合的方式实现静态代理
 * 继承，直接实现接口
 * @author zhangjiawei
 *
 */
public class CarTimeProxyByComposition implements Moveable{
	
	/*
	 * 聚合的方式
	 * 持有一个car对象
	 */
	private Moveable moveable;
	
	/**
	 * 在构造car3的时候，初始化car
	 * @param car
	 */
	public CarTimeProxyByComposition(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

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
