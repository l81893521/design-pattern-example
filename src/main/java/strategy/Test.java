package strategy;

public class Test {
	
	public static void main(String[] args) {
		Car car = new SkyCar();
		car.color();
		car.speedUp();
		car.brake();
		
		Car car2 = new WaterCar();
		car2.color();
		car2.speedUp();
		car2.brake();
		
		Car car3 = new SpaceCar();
		car3.color();
		car3.speedUp();
		car3.brake();
	}
}
