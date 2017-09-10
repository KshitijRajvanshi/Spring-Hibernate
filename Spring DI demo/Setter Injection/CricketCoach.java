package com.spring.demo1;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("CricketCoach : Inside no-arg");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice spin bowling for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
