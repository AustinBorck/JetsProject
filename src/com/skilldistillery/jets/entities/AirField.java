package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();

	public void makeFleet() {
//		String file = "jets.txt";

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] split = line.split(",");
				String type = split[0];
				String model = split[1];
				double speed = Double.parseDouble(split[2]);
				int range = Integer.parseInt(split[3]);
				long price = Long.parseLong(split[4]);
				if(split[0].equals("UFO")) {
					fleet.add(new UFO(type, model, speed, range, price));
				}else if(split[0].equals("Fighter")) {
					fleet.add(new Fighter(type, model, speed, range, price));
				}else if(split[0].equals("Passenger")) {
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
}
