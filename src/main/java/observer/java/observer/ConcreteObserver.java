package observer.java.observer;

import java.util.Observable;
import java.util.Observer;

import observer.java.subject.ConcreteWeatherSubject;

/**
 * 这是一个具体的订阅者对象
 * 实现java自带的java.util.Observer接口的更新方法
 * 使自身内容和发布内容保持一致
 * @author zhangjiawei
 *
 */
public class ConcreteObserver implements Observer{
	
	//订阅者的名字，是谁收到了这个信息
	private String observerName;
	
	//天气内容，这个信息从发布者那里获取
	private String weatherContent;
	
	//提醒的内容
	private String remindThing;
	
	public void update(Observable o, Object arg) {
		//第一种是推的方式
		weatherContent = arg.toString();
		System.out.println("推的方式"+observerName+","+weatherContent+","+remindThing);
		//第二种是拉的方式
		weatherContent = ((ConcreteWeatherSubject)o).getWeatherContent();
		System.out.println("拉的方式"+observerName+","+weatherContent+","+remindThing);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	
	

}
