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
		System.out.println("ZOOOOOOOOOOOOM!");
		System.out.println("This " + getType() + " " + getModel() + " can fly for: " + timeInFlight + " hours.");
	}
	@Override
	public void loadGuns() {
		System.out.println(getModel() + " LOADING THE 50...");
		System.out.println(" LOADING THE ROCKETS...");
		System.out.println(" LOADED AND READY TO STAGE");
	}
	@Override
	public void stageAircraft() {
		System.out.println(" MOVING TO STAGING AREA...");
		System.out.println(getModel() + " IS NOW STAGED AND READY FOR COMBAT");
		System.out.println();
	}


}
