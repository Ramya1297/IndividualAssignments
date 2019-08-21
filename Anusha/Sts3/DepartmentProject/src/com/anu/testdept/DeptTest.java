package com.anu.testdept;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.anu.dept.Emp;

public class DeptTest {
	public static void main(String args[])
	{
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("deptbean.xml"));
		Emp e1= (Emp) factory.getBean("emp");
		//HelloBean b2=(HelloBean) factory.getBean("bean1");
		//System.out.println(b1==b2);
		e1.namedept();
	}

}
