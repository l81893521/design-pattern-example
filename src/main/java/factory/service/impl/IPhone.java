package factory.service.impl;

import factory.service.AppleStoreInteface;

public class IPhone implements AppleStoreInteface{
	
	private static final double PRICE = 5000;

	public void sell() {
		System.out.println("成功售出一台IPhone,价格为" + PRICE);
	}

}
