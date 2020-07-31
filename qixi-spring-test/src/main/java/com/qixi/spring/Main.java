package com.qixi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhengNC
 * @date 2020/7/30 18:32
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		MyBean myBean = (MyBean) context.getBean("myBean");

		System.out.println(myBean.getA());
	}
}
