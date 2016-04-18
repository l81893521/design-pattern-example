package abstract_factory.apple;

import abstract_factory.Pad;

/**
 * 苹果平板电脑
 * @author zhangjiawei
 *
 */
public class Ipad implements Pad{
	
	/**
	 * 实现了{@link Pad}接口的开机方法
	 */
	public void open() {
		System.out.println("ipad开机成功");
	}

}
