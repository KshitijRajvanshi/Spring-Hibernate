package com.spring.demo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	//Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	/* For constructor injection
	 * @Autowired
	 * public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}*/
	
	
	
	public TennisCoach()
	{
		System.out.println("Inside default constructor for TennisCoach");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Inside destroy method");
	}
	
	// For setter injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your Back-hand volleys";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	

}
