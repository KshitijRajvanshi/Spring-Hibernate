package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach myCoach = ctx.getBean("tennisCoach", Coach.class);
		Coach ourCoach = ctx.getBean("tennisCoach", Coach.class);

		
		boolean res = (myCoach == ourCoach);
		System.out.println("Pointing to same object: "+ res);
		
		ctx.close();

	}

}
