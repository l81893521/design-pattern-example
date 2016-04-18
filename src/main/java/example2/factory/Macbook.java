package example2.factory;

public class Macbook implements AppleStoreInteface{
	
	private static final double PRICE = 8000;

	public void sell() {
		System.out.println("成功售出一台Macbook,价格为" + PRICE);
	}

}
