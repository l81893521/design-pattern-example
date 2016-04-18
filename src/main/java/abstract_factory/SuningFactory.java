package abstract_factory;

/**
 * 这是苏宁大商场
 * 里面有很大不同牌子的手机店铺，比如小米直营店，苹果专卖店，等等
 * @author zhangjiawei
 *
 */
public interface SuningFactory {
	
	/**
	 * 我们可以领取手机，至于是什么牌子？哪要看谁实现了这个接口咯
	 * @return
	 */
	Phone getPhone();
	
	/**
	 * 我们也可以领取平板电脑，什么牌子？还是要看谁实现了这个接口
	 * @return
	 */
	Pad getPad();
}
