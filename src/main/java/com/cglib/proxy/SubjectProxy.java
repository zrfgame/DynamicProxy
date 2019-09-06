/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 */
package com.cglib.proxy;

import java.lang.reflect.Method;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 *通过jdk创建动态代理
 */
public class SubjectProxy implements MethodInterceptor{

	public Object intercept(Object arg0, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("》》》》》》》实现日志打印，或者其他操作"+method.getName());
		Object obj = methodProxy.invokeSuper(arg0, objects);
		System.out.println("》》》》》》》实现日志打印，或者其他操作结束"+method.getName());
		return obj;
	}
	
}
