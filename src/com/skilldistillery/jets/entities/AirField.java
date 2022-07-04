package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
				if (type.equals("UFO")) {
					fleet.add(new UFO(type, model, speed, range, price));
				} else if (type.equals("Fighter")) {
					fleet.add(new Fighter(type, model, speed, range, price));
				} else if (type.equals("Passenger")) {
					fleet.add(new Passenger(type, model, speed, range, price));
				}

			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void displayAircraft() {
		int counter = 1;
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(counter + ": " + fleet.get(i));
			counter++;
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
			if (speed < jet.getSpeed()) {
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
			if (range < jet.getRange()) {
				range = jet.getRange();
				longRange = jet.getModel();
			}
		}
		System.out.println(
				"The aircraft with the longest range is " + longRange + " which can fly for " + range + " miles!");
	}

	public void combatReady() {
		for (Jet jet : fleet) {
			if (jet instanceof CombatReady) {
				((Fighter) jet).loadGuns();
				((Fighter) jet).stageAircraft();
			}
		}
	}

	public void enterWarpSpeed() {
		for (Jet jet : fleet) {
			if (jet instanceof WarpSpeed) {
				((UFO) jet).prepForWarp();
				((UFO) jet).engageWarp();
			}
		}
	}

	public void addaircraft(Scanner scanner) {
		System.out.println("Choose the type of aircraft UFO, Fighter or Passenger");
		String userType = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the aircrafts Model.");
		String userModel = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the aircrafts speed.");
		double userSpeed = scanner.nextDouble();
		System.out.println("Enter the aircrafts range.");
		int userRange = scanner.nextInt();
		System.out.println("Enter the aircrafts price.");
		long userPrice = scanner.nextLong();
		if (userType.equals("UFO")) {
			fleet.add(new UFO(userType, userModel, userSpeed, userRange, userPrice));
		} else if (userType.equals("Fighter")) {
			fleet.add(new Fighter(userType, userModel, userSpeed, userRange, userPrice));
		} else if (userType.equals("Passenger")) {
			fleet.add(new Passenger(userType, userModel, userSpeed, userRange, userPrice));
		}
	}

	public void deleteAircraft(Scanner scanner) {
		System.out.println("Enter the number of the Aircraft you would like to delete.");
		int aircraftToBeDeleted = scanner.nextInt();
		fleet.remove(aircraftToBeDeleted - 1);
	}
}
