package com.qa.pet;

public class Runner {

	public static void main(String[] args) {
		
		Dog bigDave = new Dog();
		Cat mrMeowington = new Cat();
		
		bigDave.makeNoise();
		bigDave.doThing();
		
		mrMeowington.makeNoise();
		mrMeowington.doThing();

	}

}
