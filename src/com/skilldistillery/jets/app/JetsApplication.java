package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {
	List<Jet> aircraft;
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.run();
	}
	public void run() {
		AirField field = new AirField();
		JetImpl implementJet = new JetImpl();
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		boolean keepGoing = true;
		field.makeFleet("jets.txt");

		while(keepGoing) {
		System.out.println("---PLEASE MAKE A SELECTION---");
		System.out.println("1. List entire fleet.");
		System.out.println("2. Fly all aircraft.");
		System.out.println("3. View the fastest aircraft.");
		System.out.println("4. View the aircraft with the longest range.");
		System.out.println("5. MAKE FIGHTERS COMBAT READY");
		System.out.println("6. ENTER LUDICROUS SPEED");
		System.out.println("7. Add an aircraft to the fleet.");
		System.out.println("8. Remove an aircraft from the fleet.");
		System.out.println("9. QUIT");
		userChoice = scanner.nextInt();
		
		switch (userChoice) {
		case 1:
			field.displayAircraft();
			break;
		case 2:
			field.fly();
			break;
		case 3:
			field.fastestJet();
			break;
		case 4:
			field.longestRange();
			break;
		case 5:
			field.combatReady();
			break;
		case 6:
			field.enterWarpSpeed();
			break;
		case 7:
			field.addaircraft(scanner);
			break;
		case 8:
			field.displayAircraft();
			field.deleteAircraft(scanner);
			break;
		case 9:
			System.out.println("Thank you, have a good day!");
			keepGoing = false;
			break;
			}
		}
	}
}
