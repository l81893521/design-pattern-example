package observer.push.subject;

import java.util.ArrayList;
import java.util.List;

import observer.push.observer.Observer;


/**
 * 发布者，它知道订阅它的订阅者，并提供注册（添加）和删除订阅者的接口
 * @author zhangjiawei
 *
 */
public class WeatherSubject {
	
	/**
	 * 订阅者列表
	 * 用来保存注册的订阅者对象
	 */
	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 把订阅天气的人添加到订阅者列表中
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}
	/**
	 * 从订阅者列表中移除指定订阅者
	 * @param observer
	 */
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	/**
	 * 通知所有已经订阅天气的人
	 */
	protected void notifyObservers(String weatherContent){
		for(Observer o : observers){
			o.update(weatherContent);
		}
	}
}
