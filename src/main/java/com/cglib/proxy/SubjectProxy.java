/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
package com.cglib.proxy;

import java.lang.reflect.Method;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 *ͨ��jdk������̬����
 */
public class SubjectProxy implements MethodInterceptor{

	public Object intercept(Object arg0, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("��������������ʵ����־��ӡ��������������"+method.getName());
		Object obj = methodProxy.invokeSuper(arg0, objects);
		System.out.println("��������������ʵ����־��ӡ������������������"+method.getName());
		return obj;
	}
	
}
