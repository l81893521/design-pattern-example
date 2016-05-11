package observer.pull.subject;

/**
 * 具体的订阅对象
 * 负责把创建内容和通知订阅者
 * @author zhangjiawei
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject{
	
	//天气内容的信息
	private String weatherContent;
	
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		//先设置值，再通知，可以查看Test.java的:触发通知的时机注释
		this.weatherContent = weatherContent;
		//天气更新了，要通知所有订阅天气的人，我们调用父类的方法
		this.notifyObservers();
	}
	
}
