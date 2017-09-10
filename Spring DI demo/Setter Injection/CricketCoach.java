package com.spring.demo1;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String teamName;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		System.out.println("CricketCoach : setTeamName");
		this.teamName = teamName;
	}


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
