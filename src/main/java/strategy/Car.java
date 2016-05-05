package strategy;

import strategy.strategies.SpeedUpStrategy;

/**
 * 超类，所有车都要实现此类
 * 抽象了车的行为：加速和刹车
 * 
 * 策略模式，强调的是组合（多用组合，少用继承）
 * 例如一辆车，它由各种不同的部件组装而成
 * 如果我们通过继承来完成，很明显是不灵活的，比如汽车继承了轮胎，万一有的汽车没有轮胎呢？
 * 什么是组合，想象一下如果一辆汽车，每一个部件都是由一个策略接口来组合，而每一个策略接口都有不同的实现
 * 这种情况，组装一台变形金刚出来，还算事吗？
 * @author zhangjiawei
 *
 */
public abstract class Car {
	
	/**
	 * 1.组合：在父类中组合策略接口
	 */
	private SpeedUpStrategy speedUpStrategy;
	
	/**
	 * 2.同时提供set方法，让不用的策略接口实现子类可以注入进来
	 * @param speedUpStrategy
	 */
	public void setSpeedUpStrategy(SpeedUpStrategy speedUpStrategy) {
		this.speedUpStrategy = speedUpStrategy;
	}
	
	/**
	 * 3.提供加速的接口
	 * 由加速策略接口，执行它的走起操作
	 */
	public void speedUp(){
		speedUpStrategy.go();
	}

	

	/**
	 * 颜色,不用的车，颜色不一样
	 */
	public abstract void color();
	
	/**
	 * 通用行为:刹车
	 */
	public void brake(){
		System.out.println("刹车...");
	}
	
	
}
