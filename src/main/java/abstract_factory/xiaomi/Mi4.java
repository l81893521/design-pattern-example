package abstract_factory.xiaomi;

import abstract_factory.Phone;

/**
 * 小米手机
 * @author zhangjiawei
 *
 */
public class Mi4 implements Phone{
	
	/**
	 * 实现了{@link Phone}接口的开机方法
	 */
	public void open() {
		System.out.println("小米4开机成功");
	}

}
