package com.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach myCoach = ctx.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		
		ctx.close();
		

	}

}
