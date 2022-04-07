package com.dannielcervantes.zookeeper1;

public class Gorilla extends Mammal{
	// Attributes
	
	
	//Constructor 
	public Gorilla() {
		super();
	}
	
	
	//getters/setters
	
	
	//methods
	public void throwSomething() {
		System.out.println("*Throws poop*");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("*Eats bananas*");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("*Climbs treehouse*");
		energyLevel -= 10;
	}
	
}
