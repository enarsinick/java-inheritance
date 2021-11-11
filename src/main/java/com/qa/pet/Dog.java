package com.qa.pet;

public class Dog extends Pet {
	
	@Override
	public void makeNoise() {
		System.out.println("I'm a dog, awoooooooooooooooooo!");
	}

	@Override
	public void doThing() {
		System.out.println("I just took a massive shit on the carpet.");
	}

}
