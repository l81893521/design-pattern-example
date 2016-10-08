package proxy.demo4;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		//设置创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	/**
	 * 拦截所有目标类方法调用
	 * @param obj 目标类的事例
	 * @param method 目标方法的反射对象
	 * @param args 方法的参数
	 * @param proxy 代理类的实例
	 */
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		/*
		 * 前面加点东西
		 */
		System.out.println("日志开始...");
		//代理类调用父类的方法
		proxy.invokeSuper(obj, args);
		/*
		 * 后面加点东西
		 */
		System.out.println("日志结束...");
		return null;
	}

}
