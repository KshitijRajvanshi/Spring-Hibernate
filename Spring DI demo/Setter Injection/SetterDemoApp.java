package com.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args)
	{
		//load config file
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach obj = ctx.getBean("myCricketCoach", Coach.class);
		// call methods on bean
		System.out.println(obj.getDailyWorkout());
		
		// close the context 
		ctx.close();
	}

}
