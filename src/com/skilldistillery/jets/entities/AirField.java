package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();

	public void makeFleet(String file) {
//		String file = "jets.txt";

		try (BufferedReader bufIn = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] split = line.split(",");
				String type = split[0];
				String model = split[1];
				double speed = Double.parseDouble(split[2]);
				int range = Integer.parseInt(split[3]);
				long price = Long.parseLong(split[4]);
				if(type.equals("UFO")) {
					fleet.add(new UFO(type, model, speed, range, price));
				}else if(type.equals("Fighter")) {
					fleet.add(new Fighter(type, model, speed, range, price));
				}else if(type.equals("Passenger")) {
					fleet.add(new Passenger(type, model, speed, range, price));
				}
			}
		}

		catch (IOException e) {
			System.err.println(e);
		}

	}
	public void displayAircraft() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i));
			
			}
	}
	public void fly() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}
	public void fastestJet() {
		String fastJet = "";
		double speed = 0;
		for (Jet jet : fleet) {
			if(speed < jet.getSpeed()) {
				speed = jet.getSpeed();
				fastJet = jet.getModel();
			}
		}
		System.out.println("The fastest aircraft is: " + fastJet + " which can travel at: " + speed + " MPH!");
	}
	public void longestRange() {
		String longRange = "";
		double range = 0;
		for (Jet jet : fleet) {
			if(range < jet.getRange()) {
				range = jet.getRange();
				longRange = jet.getModel();
			}
		}
		System.out.println("The aircraft with the longest range is " + longRange + " which can fly for " + range + " miles!");
	}
	
	public void combatReady() {
		for (Jet jet : fleet) {
			if(jet instanceof CombatReady) {
				((Fighter) jet).loadGuns();
				((Fighter) jet).stageAircraft();
			}
		}
	}
	public void enterWarpSpeed() {
		for (Jet jet : fleet) {
			if(jet instanceof WarpSpeed) {
				((UFO) jet).prepForWarp();
				((UFO) jet).engageWarp();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
