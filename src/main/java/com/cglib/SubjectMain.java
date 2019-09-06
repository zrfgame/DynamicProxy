/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
package com.cglib;



import com.cglib.proxy.SubjectProxy;
import com.extendss.subjectimpl.RealSubject;

import net.sf.cglib.proxy.Enhancer;

/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
public class SubjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealSubject.class);//继承被代理类
		enhancer.setCallback(new SubjectProxy());//设置回调
		RealSubject realSubject = (RealSubject) enhancer.create();//生成代理对象
		realSubject.send();

	}

}
