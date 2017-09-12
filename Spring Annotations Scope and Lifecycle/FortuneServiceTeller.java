package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceTeller implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You will win most of ur back-end volleys today";
	}

}
