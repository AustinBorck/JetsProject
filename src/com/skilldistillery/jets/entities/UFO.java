package com.skilldistillery.jets.entities;

public class UFO extends Jet implements WarpSpeed{
	public UFO() {
		super();
	}
	public UFO(String type, String model, double speed, int range, long price) {
		
	}
	@Override
	public void fly() {
		double timeInFlight;
		timeInFlight = getRange() / getSpeed();
		System.out.println("ZIIIPPPPP!");
		System.out.println("This " + getType() + " " + getModel() + " can fly for: " + timeInFlight + " hours.");
	}
	@Override
	public void prepForWarp() {
		System.out.println(getModel() + " PREPPING FOR LUDICROUS SPEED...");
		System.out.println(" FASTEN ALL SEATBELTS! CLOSE ALL SHOPS IN THE MALL!");
		System.out.println(" LUDICROUS IS PREPPED AIRCRAFT READY TO LAUNCH");
		
	}
	@Override
	public void engageWarp() {
		System.out.println(" BRRRRRRRRRRRRRRR ZOOOOOOM! AIRCRAFT HAS GONE TO PLAID!");
		System.out.println(" LUDICROUS SPEED SUCCESSFUL, NICE WORK CAPTAIN. ");
		System.out.println();
		
	}
	
	
}
