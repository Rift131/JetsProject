package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;

public class JetsApplication {

	private Scanner userInput = new Scanner(System.in);
	private Airfield airfield = new Airfield();

	public JetsApplication() {

	}

	public static void main(String[] args) {
		// instantiate an instance of the app
		JetsApplication jA = new JetsApplication();
		// instantiate the airfield
		jA.airfield.airfieldPopulate();
		// private invoke a run method
		jA.run();

	}

	// run method
	public void run() {
		// invoke the airfield to populate from the text file
//		airfield.airfieldPopulate();

		// logic of the menu and try catches for inputs
		boolean validUserInput = false;
		while (!validUserInput) {
			int userMenuChoice;
			try {
				// display the menu to the user
				System.out.println("**********JETS MENU**********");
				System.out.println("* 1. List Fleet             *");
				System.out.println("* 2. Scramble All Jets      *");
				System.out.println("* 3. View Fastest Jet       *");
				System.out.println("* 4. View Longest Range Jet *");
				System.out.println("* 5. Launch Support Sorties *");
				System.out.println("* 6. Launch Strike Sorties  *");
				System.out.println("* 7. Acquire New Aircraft   *");
				System.out.println("* 8. Decomission Aircraft   *");
				System.out.println("* 9. Quit                   *");
				System.out.println("*****************************");
				System.out.println("\nPlease enter a number from the menu.");
				userMenuChoice = userInput.nextInt();
				userInput.nextLine();
				validUserInput = true;

				switch (userMenuChoice) {
				case 1:
					listFleet();
					break;
				case 2:
					flyAllJets();
					break;
				case 3:
					viewFastestJet();
					break;
				case 4:
					viewLongestRangeJet();
					break;
				case 5:
					launchSupportSortie();
					break;
				case 6:
					launchStrikeSortie();
					break;
				case 7:
					acquireNewAircraft();
					break;
				case 8:
					decomissionAircraft();
					break;
				case 9:
					quit();
					break;
				default:
					System.out.println("The number entered did not match the menu choices. Please try again.");
					run();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input.");
				userInput.nextLine();
				validUserInput = false;
				run();
			}
			// reset the boolean value for the next time the menu is invoked
			validUserInput = false;
			run();
		}

	}

	// list fleet methods
	private void listFleet() {
		// TODO Auto-generated method stub
		System.out.println(airfield.toString());
	}

	private void flyAllJets() {
		// TODO Auto-generated method stub
		airfield.scrambleAllJets();
	}
	private void viewFastestJet() {
		// TODO Auto-generated method stub
		//airfield.viewFastestJet();
		System.out.println(airfield.viewFastestJet().toString());
	}
	private void viewLongestRangeJet() {
		// TODO Auto-generated method stub
		//airfield.viewLongestRangeJet();
		System.out.println(airfield.viewLongestRangeJet().toString());
		
	}
	private void quit() {
		// TODO Auto-generated method stub

	}

	private void acquireNewAircraft() {
		// TODO Auto-generated method stub

	}

	private void decomissionAircraft() {
		// TODO Auto-generated method stub

	}

	private void launchStrikeSortie() {
		// TODO Auto-generated method stub

	}

	private void launchSupportSortie() {
		// TODO Auto-generated method stub

	}




	// fly all jets method

	// view fastest jet method

	// view jet with longest range method

	// load all cargo jets method (invoke cargo interface)

	// dogfight method (invoke the an interface specific to the ISR and fighter
	// aircraft)

	// method to add an aircraft to the ArrayList (sub-menu)

	// try catches for inputs that could break the data types expected

	// increment the count (see food truck)

	// method to delete an aircraft from the fleet (sub-menu)

	// decrement the count (see food truck)

	// method to quit

	// sysout closing message

	// close the scanner

	// sys.close

}
