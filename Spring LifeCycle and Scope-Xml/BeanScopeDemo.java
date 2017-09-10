package com.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach myCoach = ctx.getBean("myCoach",Coach.class);
		Coach ourCoach = ctx.getBean("myCoach",Coach.class);

		Boolean res = (myCoach == ourCoach);
		
		System.out.println(res);
		System.out.println(myCoach);
		System.out.println(ourCoach);
		
		ctx.close();
		


	}

}
