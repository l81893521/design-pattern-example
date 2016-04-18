package abstract_factory;

import abstract_factory.apple.AppleFactory;
import abstract_factory.xiaomi.XiaomiFactory;

/**
 * 抽象工厂模式测试类
 * @author zhangjiawei
 *
 */
public class Test {
	public static void main(String[] args) {
		
		/*
		 * 很轻松获取到appleFactory
		 * 通过appleFactory也很轻松拿到苹果产品的对象,如iphone,ipad等
		 */
		SuningFactory appleFactory = new AppleFactory();
		Phone iPhone = appleFactory.getPhone();
		Pad iPad = appleFactory.getPad();
		
		/*
		 * 很轻松获取到xiaomiFactory
		 * 同理我们使用xiaomiFactory很容易就拿到mi4,mipad等小米产品
		 */
		SuningFactory xiaomiFactory = new XiaomiFactory();
		Phone mi4 = xiaomiFactory.getPhone();
		Pad miPad = xiaomiFactory.getPad();
		
		/*
		 * 开机看看有没有坏
		 */
		iPhone.open();
		iPad.open();
		mi4.open();
		miPad.open();
	}
}
