package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your Back-hand volleys";
	}

}
