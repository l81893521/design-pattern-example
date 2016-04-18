package abstract_factory;

/**
 * 手机统一接口
 * 不同的手机，他们都有一个共同的功能，就是开机
 * @author zhangjiawei
 *
 */
public interface Phone {
	
	/**
	 * 开机方法
	 */
	void open();
}
