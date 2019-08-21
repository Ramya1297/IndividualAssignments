package com.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("method "+ mi.getMethod().getName());
		System.out.println("method arguments "+ Arrays.toString(mi.getArguments()));
		try {
			Object result=mi.proceed();
			System.out.println("while return");
			return result;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("exception....");
	throw e;
		}
		//return null;
	}

}
