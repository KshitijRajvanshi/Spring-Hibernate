package com.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args)
	{
		//load config file
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach obj = ctx.getBean("myCoach", Coach.class);
		// call methods on bean
		System.out.println(obj.getDailyWorkout());
		// close the context 
		ctx.close();
	}

}
