package observer.java.subject;

import java.util.Observable;

/**
 * 具体的订阅对象
 * 负责把创建内容和通知订阅者
 * 使用java自带的观察者模式
 * 继承java.util.Observable
 * @author zhangjiawei
 *
 */
public class ConcreteWeatherSubject extends Observable{
	
	//通知内容 天气情况
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//通知之前，必须调用setChange
		this.setChanged();
		//通知所有订阅者,先用推的方式
		this.notifyObservers(weatherContent);
		//如果是拉的方式
//		this.notifyObservers();
		
		
	}
	
}
