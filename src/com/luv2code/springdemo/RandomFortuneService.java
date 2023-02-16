package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"lucky", "badly", "nothing"};
		int randomInt = (int)Math.floor(Math.random() * (2 - 0 + 1) + 0);
		
		return fortunes[randomInt];
	}

}
