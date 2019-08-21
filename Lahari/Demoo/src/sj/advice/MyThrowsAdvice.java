package sj.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("After throwS");
	}

}
