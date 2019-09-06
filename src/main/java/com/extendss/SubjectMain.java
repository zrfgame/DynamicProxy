/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
package com.extendss;


import com.extendss.proxy.SubjectProxy;
import com.extendss.subjectimpl.RealSubject;

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
		//新建代理类
		Subject proxy = new SubjectProxy(new RealSubject()).getProxy();
		proxy.send();

	}

}
