package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");

	Coach myCoach = ctx.getBean("tennisCoach", Coach.class);
	
	System.out.println(myCoach.getDailyWorkout());
	System.out.println(myCoach.getFortune());

	
	ctx.close();
	}

}
