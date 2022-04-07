package com.dannielcervantes.zookeeper1;

public class Mammal {
	// member variables
	protected int energyLevel = 100;

	//constructor
	
	
	//getters/setters needs "this."?
	public int getEnergyLevel() {
		return this.energyLevel;		
	}
	
	
	
	//methods
	public void displayEnergy() {
		System.out.println("Energy level = " + this.getEnergyLevel());
	}




}

