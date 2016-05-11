package observer.pull.observer;

import observer.pull.subject.WeatherSubject;

/**
 * 这是一个订阅者接口
 * 它有一个更新内容的方法，让发布者改变内容时候可以调用
 * @author zhangjiawei
 *
 */
public interface Observer {
	
	/**
	 * 更新的接口
	 * @param subject 发布者对象，方便获取发布者的信息
	 */
	public void update(WeatherSubject subject);
}
