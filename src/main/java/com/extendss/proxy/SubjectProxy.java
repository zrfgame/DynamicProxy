/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
package com.extendss.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 *ͨ��jdk������̬����
 */
public class SubjectProxy implements InvocationHandler{
	//�����������
	private Object obj;
	public SubjectProxy(Object obj) {
		this.obj = obj;
	}
	//ʵ��invoke������ͨ��method�����õ�obj�Ķ���
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��������ʵ����־��ӡ��������������");
		Object invoke = method.invoke(obj, args);//java�������ִ��Ŀ����󷽷�
		System.out.println("��������ʵ����־��ӡ������������������");
		return invoke;
	}
	/***
	 * ʹ��jdk����������
	 * 
	 */
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		return  (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
}
