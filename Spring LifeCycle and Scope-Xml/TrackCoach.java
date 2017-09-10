package com.spring.demo1;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	public TrackCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5kms.";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: " + fortuneService.getFortune();
	}

	public void initMyStuff()
	{
		System.out.println("Init method");
	}
	public void destroyMyStuff()
	{
		System.out.println("Destroy method");

	}
}
