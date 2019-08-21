package com.aspect;

import org.springframework.aop.ThrowsAdvice;

public class MyThrow implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e)throws Throwable{
		System.out.println("Throw exception captured");
	}
}
