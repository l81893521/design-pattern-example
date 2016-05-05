package strategy.strategies.impl;

import strategy.strategies.SpeedUpStrategy;
/**
 * 实现了加速策略接口
 * 这个实现方法我们使用螺旋桨来加速
 * 这个接口可以支持各种使用螺旋桨加速的汽车
 * 例如。。。。。。
 * @author zhangjiawei
 *
 */
public class SpeedUpWithPropeller implements SpeedUpStrategy{

	public void go() {
		System.out.println("我用螺旋桨加速");
	}

}
