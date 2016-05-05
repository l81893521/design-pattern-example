package strategy;

import strategy.strategies.impl.SpeedUpWithAir;

public class SpaceCar extends Car{
	
	public SpaceCar() {
		super.setSpeedUpStrategy(new SpeedUpWithAir());
	}

	@Override
	public void color() {
		System.out.println("我是黑色");
	}

}
