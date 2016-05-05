package strategy;

import strategy.strategies.impl.SpeedUpWithEngine;

public class SkyCar extends Car{
	
	public SkyCar() {
		super();
		super.setSpeedUpStrategy(new SpeedUpWithEngine());
	}

	@Override
	public void color() {
		System.out.println("蓝色");
	}

}
