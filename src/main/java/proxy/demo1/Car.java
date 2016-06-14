package proxy.demo1;

import java.util.Random;

public class Car implements Moveable{

	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
