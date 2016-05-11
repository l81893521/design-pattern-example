package observer.push.observer;

/**
 * 这是一个具体的订阅者对象，实现更新方法，使自身内容和发布内容保持一致
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
	
	/**
	 * 主要任何是，让自己的信息(订阅者)和发布者同步
	 */
	public void update(String weatherContent) {
//		weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName+","+weatherContent+","+remindThing);
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
