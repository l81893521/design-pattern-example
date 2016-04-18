package abstract_factory.xiaomi;

import abstract_factory.Pad;
import abstract_factory.Phone;
import abstract_factory.SuningFactory;

/**
 * 小米直营店，进驻苏宁大卖场{@link SuningFactory}
 * @author zhangjiawei
 *
 */
public class XiaomiFactory implements SuningFactory{
	
	/**
	 * 领取小米手机4一台
	 */
	public Phone getPhone() {
		return new Mi4();
	}
	
	/**
	 * 领取小米平板一台
	 */
	public Pad getPad() {
		return new MiPad();
	}

}
