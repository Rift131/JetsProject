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
				System.out.println("\n");
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
					decomissionAircraftMenu();
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
		// airfield.viewFastestJet();
		System.out.println("FASTEST AIRCRAFT: " + airfield.viewFastestJet().toString());
	}

	private void viewLongestRangeJet() {
		// TODO Auto-generated method stub
		// airfield.viewLongestRangeJet();
		System.out.println("GREATEST RANGE AIRCRAFT: " + airfield.viewLongestRangeJet().toString());

	}

	private void launchSupportSortie() {
		// TODO Auto-generated method stub
		airfield.launchSupportSorties();
	}

	private void launchStrikeSortie() {
		// TODO Auto-generated method stub
		airfield.launchStrikeSorties();
	}

	private void acquireNewAircraft() {
		String type = userSetType();
		String model = userSetModel();
		String tailNumber = userSetTailNumber();
		double speed = userSetSpeed();
		int range = userSetRange();
		long price = userSetPrice();

		airfield.acquisitionNewAircraft(type, model, tailNumber, speed, range, price);
	}

	private String userSetType() {
		// list the variables the user will assign
		String usersType = "";

		// TODO Auto-generated method stub
		boolean validUserInput = false;
		while (!validUserInput) {
			int userMenuChoice = 0;
			try {
				System.out.println("\n");
				System.out.println("*******ACFT TYPE CHOICES*****");
				System.out.println("* 1. Bomber                 *");
				System.out.println("* 2. Fighter                *");
				System.out.println("* 3. Tanker                 *");
				System.out.println("* 4. ISR                    *");
				System.out.println("* 5. Cargo                  *");
				System.out.println("* 6. General Jet Aircraft   *");
				System.out.println("* 7. Return to Main Menu    *");
				System.out.println("* 8. Quit                   *");
				System.out.println("*****************************");
				System.out.println("\nPlease enter a number from the menu.");

				userMenuChoice = userInput.nextInt();
				userInput.nextLine();
				validUserInput = true;

				switch (userMenuChoice) {
				case 1:
					usersType = "Bomber";
					break;
				case 2:
					usersType = "Fighter";
					break;
				case 3:
					usersType = "Tanker";
					break;
				case 4:
					usersType = "ISR";
					break;
				case 5:
					usersType = "Cargo";
					break;
				case 6:
					usersType = "General Jet Aircraft";
					break;
				case 7:
					run();
					break;
				case 8:
					quit();
					break;
				default:
					System.out.println("The number entered did not match the menu choices. Please try again.");
					acquireNewAircraft();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input.");
				userInput.nextLine();
				validUserInput = false;
				acquireNewAircraft();
			}
		}
		// reset the boolean value for the next time the menu is invoked
		validUserInput = false;
		return usersType;
	}

	private String userSetModel() {
		String usersModel = "";
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the model of the aircraft.");
				usersModel = userInput.nextLine();
				validUserInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input.");
				userInput.nextLine();
				validUserInput = false;
				userSetModel();
			}
		}
		return usersModel;
	}

	private String userSetTailNumber() {
		String usersTailNumber = "";
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the tail number of the aircraft.");
				usersTailNumber = userInput.nextLine().trim();
				validUserInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input.");
				userInput.nextLine();
				validUserInput = false;
				userSetModel();
			}
		}
		return usersTailNumber;
	}

	private double userSetSpeed() {
		double usersSpeed = 0;
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the speed of the aircraft.");
				usersSpeed = userInput.nextDouble();
				validUserInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input.");
				userInput.nextLine();
				validUserInput = false;
				userSetSpeed();
			}
		}
		return usersSpeed;
	}

	private int userSetRange() {
		int usersRange = 0;
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the range of the aircraft.");
				usersRange = userInput.nextInt();
				validUserInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a whole number.");
				userInput.nextLine();
				validUserInput = false;
				userSetRange();
			}
		}
		return usersRange;
	}

	private long userSetPrice() {
		long usersPrice = 0;
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the price of the aircraft (numbers only).");
				usersPrice = userInput.nextLong();
				validUserInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a whole number.");
				userInput.nextLine();
				validUserInput = false;
			}
		}
		return usersPrice;
	}

	private void decomissionAircraftMenu() {
		// TODO Auto-generated method stub

		// try / catch && instanceof to check if an instance of what the user wants to
		// delete (specific concrete class) exists (.getSimpleName())
		boolean validUserInput = false;
		while (!validUserInput) {
			int userMenuChoice;
			try {
				// display the menu to the user
				System.out.println("\n");
				System.out.println("******DECOMISSION MENU*******");
				System.out.println("* 1. Review Aircraft List   *");
				System.out.println("* 2. Decomission Aircraft   *");
				System.out.println("* 3. Return to Main Menu    *");
				System.out.println("* 4. Quit                   *");
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
					decommissionAcft();
					break;
				case 3:
					run();
					break;
				case 4:
					quit();
					break;
				default:
					System.out.println("The number entered did not match the menu choices. Please try again.");
					run();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid menu selection entry.");
				userInput.nextLine();
				validUserInput = false;
				decomissionAircraftMenu();
			}
			// reset the boolean value for the next time the menu is invoked
			validUserInput = false;
			decomissionAircraftMenu();
		}
	}

	private void decommissionAcft() {
		String usersDecomissionInput = "";
		boolean validUserInput = false;
		while (!validUserInput) {
			try {
				System.out.println("Please enter the tail number of the aircraft to decommission.");
				usersDecomissionInput = userInput.nextLine().trim();
				boolean validTailNumber = airfield.tailNumberExists(usersDecomissionInput);
				if (validTailNumber) {
					airfield.decomissionAcft(usersDecomissionInput);
					validUserInput = true;
				} else {
					System.out.println("Tail Number not recognized. Please try again.");
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a whole number.");
				userInput.nextLine();
				validUserInput = false;
			}
		}
		validUserInput = false;
		decomissionAircraftMenu();
	}

	private void quit() {
		// TODO Auto-generated method stub
		System.out.println("Jets program closing");
		userInput.close();
		System.exit(0);
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
