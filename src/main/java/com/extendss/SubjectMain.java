/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com
 *SubjectMain.java
 */
package com.extendss;


import com.extendss.proxy.SubjectProxy;
import com.extendss.subjectimpl.RealSubject;

/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com
 *SubjectMain.java
 */
public class SubjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�½�������
		Subject proxy = new SubjectProxy(new RealSubject()).getProxy();
		proxy.send();

	}

}
