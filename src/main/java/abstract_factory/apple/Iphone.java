package abstract_factory.apple;

import abstract_factory.Phone;

/**
 * 苹果手机
 * @author zhangjiawei
 *
 */
public class Iphone implements Phone{
	
	/**
	 * 实现了{@link Phone}接口的开机方法
	 */
	public void open() {
		System.out.println("iphone开机成功");
	}

}
