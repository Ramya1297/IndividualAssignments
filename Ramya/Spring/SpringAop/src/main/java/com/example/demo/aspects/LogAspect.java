package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Before(value="execution (* com.example.demo.service.EmployeeService.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint jp,String name,String empId) {
		System.out.println("before method "+jp.getSignature());
		System.out.println("creating emp "+name +"  "+empId);
	}
	
	

}
