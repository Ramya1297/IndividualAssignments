package sj.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("around is invoked before actual method");
		Object obj=arg0.proceed();
		System.out.println("around ad again after actual mehtod");
		
		
		return obj;
	}

}
