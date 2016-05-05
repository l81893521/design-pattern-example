package strategy;

import strategy.strategies.impl.SpeedUpWithPropeller;

public class WaterCar extends Car{
	
	public WaterCar() {
		super();
		super.setSpeedUpStrategy(new SpeedUpWithPropeller());
	}

	@Override
	public void color() {
		System.out.println("绿色");
	}

}
