/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 */
package com.extendss.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 *通过jdk创建动态代理
 */
public class SubjectProxy implements InvocationHandler{
	//被代理类对象
	private Object obj;
	public SubjectProxy(Object obj) {
		this.obj = obj;
	}
	//实现invoke方法，通过method反射拿到obj的对象
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("》》》》实现日志打印，或者其他操作");
		Object invoke = method.invoke(obj, args);//java反射机制执行目标对象方法
		System.out.println("》》》》实现日志打印，或者其他操作结束");
		return invoke;
	}
	/***
	 * 使用jdk创建代理类
	 * 
	 */
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		return  (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
}
