package proxy.demo3;

import java.util.Random;

/**
 * 汽车
 * 实现Moveable接口模拟汽车行驶
 * @author zhangjiawei
 *
 */
public class Car implements Moveable{
	
	/**
	 * 模拟汽车行驶
	 */
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
