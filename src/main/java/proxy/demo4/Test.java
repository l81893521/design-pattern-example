package proxy.demo4;

public class Test {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Train train = (Train)proxy.getProxy(Train.class);
		train.move();
	}
}
