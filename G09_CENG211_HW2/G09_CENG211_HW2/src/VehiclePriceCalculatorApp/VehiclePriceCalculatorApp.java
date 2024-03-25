package VehiclePriceCalculatorApp;

import java.util.Scanner;

import VehiclePriceCalculator.DisplayController;

public class VehiclePriceCalculatorApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DisplayController displayer = new DisplayController();
		
		System.out.println("Please press,\n"
				+ "1 to see all sold vehicles list\n"
				+ "2 to see sold sedan list\n"
				+ "3 to see sold hatchback list\n"
				+ "4 to see sold minivan list\n"
				+ "5 to see sold pickup truck list\n"
				+ "6 to see sold bicycle list");
		
		System.out.print("Please enter your choice: ");
		
		displayer.displayVehicleList(scanner.nextInt());
	}

}
