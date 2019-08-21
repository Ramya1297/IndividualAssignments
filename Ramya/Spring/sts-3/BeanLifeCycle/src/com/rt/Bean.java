package com.rt;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean,DisposableBean{
int counter;

public int getCounter() {
	return counter;
}

public void setCounter(int counter) {
	this.counter = counter;
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	counter++;
	System.out.println("its destroy"+counter);
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	counter++;
	System.out.println("its after prop set"+counter);

}
public void init() {
	counter++;
	System.out.println("its init"+counter);	
}
public void teardown() {
	counter++;
	System.out.println("its teardown"+counter);
}
}
