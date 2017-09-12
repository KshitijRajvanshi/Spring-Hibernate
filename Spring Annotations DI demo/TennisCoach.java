package com.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
