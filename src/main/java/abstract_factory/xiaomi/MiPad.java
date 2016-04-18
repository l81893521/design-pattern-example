package abstract_factory.xiaomi;

import abstract_factory.Pad;

/**
 * 小米平板电脑
 * @author zhangjiawei
 *
 */
public class MiPad implements Pad{
	
	/**
	 * 实现了{@link Pad}接口的开机方法
	 */
	public void open() {
		System.out.println("米pad开机成功");
	}

}
