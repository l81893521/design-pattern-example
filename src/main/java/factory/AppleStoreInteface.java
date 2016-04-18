package factory;

/**
 * 一个模拟苹果商店
 * 售卖不同的苹果产品：IPhone,IPad,Macbook等统一接口
 * 不同的产品来实现这个接口，并实现{@link #sell()}方法
 * @author zhangjiawei
 *
 */
public interface AppleStoreInteface {
	/**
	 * 一个售卖的方法
	 */
	void sell();
}
