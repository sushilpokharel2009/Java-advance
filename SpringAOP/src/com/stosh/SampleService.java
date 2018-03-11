package com.stosh;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class SampleService {
	
	@Before("execution(public void doTransaction*(..))")	
	public void verifyUserBeforeDoTransaction() {
		System.out.println("write logic here to Verify the user before doing transaction----------->>");
	}
	
	
	@After("execution(public void doTransaction*(..))")
		public void printMessageAfterTransaction() {
			System.out.println("Write logic here to print message after transaction--------->>");
	}
}
