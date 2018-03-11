package com.stosh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestApp testApp = (TestApp) ac.getBean("ta");
				testApp.doTransaction();
//				testApp.printMessage();
	}

}
