package factory.service.impl;

import factory.service.AppleStoreInteface;

public class IPad implements AppleStoreInteface{
	
	private static final double PRICE = 3000;

	public void sell() {
		System.out.println("成功售出一台IPad,价格为" + PRICE);
	}

}
