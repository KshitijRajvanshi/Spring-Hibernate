package com.spring.demo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String [] stmt = {"Beware of the rain", "Journey is a good reward", "Healthy eating is good"};
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int idx = myRandom.nextInt(stmt.length);
		
		String fortune =  stmt[idx];
		return fortune;
	}

}
