package proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现jdk动态代理接口
 * @author zhangjiawei
 *
 */
public class TimeHandler implements InvocationHandler{
	
	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	
	/**
	 * 实现invoke方法
	 * @param proxy 被代理的对象
	 * @param method 被代理对象的方法
	 * @param args 被代理对象方法的参数
	 * @return 调用这个方法的返回值
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 前面加点料
		 * 记录行驶时间
		 */
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		/*
		 * 利用反射调用方法
		 */
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		/*
		 * 后面加点料
		 * 记录行驶时间
		 */
		System.out.println("汽车结束行驶,汽车行驶时间:" + (endTime - startTime) + "毫秒");
		return null;
	}

}
