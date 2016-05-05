package strategy.strategies.impl;

import strategy.strategies.SpeedUpStrategy;

/**
 * 实现了加速策略接口
 * 这个实现方法我们是使用引擎加速来实现
 * 这个接口可以支持各种使用引擎加速的汽车
 * 比如：大众，本田，丰田等等
 * @author zhangjiawei
 *
 */
public class SpeedUpWithEngine implements SpeedUpStrategy{

	public void go() {
		System.out.println("我用引擎加速");
	}

}
