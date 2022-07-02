package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady{
	public Fighter() {
		super();
	}
	public Fighter(String type, String model, double speed, int range, long price) {
		
	}
	@Override
	public void fly() {
		double timeInFlight;
		timeInFlight = getRange() / getSpeed();
		System.out.println("This " + getType() + " " + getModel() + "can fly for: " + timeInFlight + " hours.");
	}

	

}
