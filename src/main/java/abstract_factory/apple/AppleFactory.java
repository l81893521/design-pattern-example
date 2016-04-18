package abstract_factory.apple;

import abstract_factory.Pad;
import abstract_factory.Phone;
import abstract_factory.SuningFactory;

/**
 * 苹果专卖店进驻苏宁大卖场{@link SuningFactory}
 * @author zhangjiawei
 *
 */
public class AppleFactory implements SuningFactory{
	
	/**
	 * 领取苹果手机一台
	 */
	public Phone getPhone() {
		return new Iphone();
	}
	
	/**
	 * 领取苹果平板电脑一台
	 */
	public Pad getPad() {
		return new Ipad();
	}

}
