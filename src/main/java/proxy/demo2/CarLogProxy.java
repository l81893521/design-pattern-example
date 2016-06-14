package proxy.demo2;

/**
 * 用聚合的方式实现静态代理
 * @author zhangjiawei
 *
 */
public class CarLogProxy implements Moveable{
	
	/*
	 * 聚合的方式
	 * 持有一个car对象
	 */
	private Moveable moveable;
	
	/**
	 * 在构造car3的时候，初始化car
	 * @param car
	 */
	public CarLogProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}
	
	/**
	 * 在原有move的基础上
	 * 再增加日志记录功能
	 */
	public void move() {
		/*
		 * 前面加点料
		 */
		System.out.println("开始记录日志");
		/*
		 * 调用原装的car的行驶方法
		 */
		moveable.move();
		/*
		 * 后面加点料
		 */
		System.out.println("结束记录日志");
	}

}
