package com.stosh.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s = (Student) ac.getBean("s1");
//		System.out.println(s.getStudentName());
//		System.out.println(s.getStudentAddress());
//		System.out.println(s.getTh().getTeacherName());
		int x = 5;
		System.out.println(x);
		x = 6;
		System.out.println();
		
		s.setStudentName("Tim Dunn");
		s.setStudentAddress("Dallas");
		
		

		System.out.println("After you set different data--------->>>>");
		
		
//		System.out.println(s.getStudentName());
//		System.out.println(s.getStudentAddress());
//		System.out.println(s.getTh().getTeacherName());
//		
		
		System.out.println("S1 new----------------->>>>>");
		
		Student st = (Student) ac.getBean("s1");
		System.out.println(st.getStudentName());
		System.out.println(st.getStudentAddress());
		
		
		
		System.out.println("Teacher------------------->>>>");
		Teacher te = (Teacher) ac.getBean("t1");
		System.out.println(te.getTeacherName());
	}

}
