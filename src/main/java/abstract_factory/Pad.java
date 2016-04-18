package abstract_factory;

/**
 * 平板电脑统一接口
 * 不同的平板电脑，他们都有一个共同的功能，就是开机
 * @author zhangjiawei
 *
 */
public interface Pad {
	
	/**
	 * 开机方法
	 */
	void open();
}
