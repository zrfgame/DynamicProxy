/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com
 *SubjectMain.java
 */
package com.cglib;



import com.cglib.proxy.SubjectProxy;
import com.extendss.subjectimpl.RealSubject;

import net.sf.cglib.proxy.Enhancer;

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
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealSubject.class);//�̳б�������
		enhancer.setCallback(new SubjectProxy());//���ûص�
		RealSubject realSubject = (RealSubject) enhancer.create();//���ɴ������
		realSubject.send();

	}

}
