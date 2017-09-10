package com.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args)
	{
		//load config file
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		CricketCoach obj = ctx.getBean("myCricketCoach", CricketCoach.class);
		// call methods on bean
		System.out.println(obj.getDailyWorkout());
		System.out.println(obj.getDailyFortune());
		System.out.println(obj.getTeamName());
		System.out.println(obj.getEmailAddress());

		
		// close the context 
		ctx.close();
	}

}
