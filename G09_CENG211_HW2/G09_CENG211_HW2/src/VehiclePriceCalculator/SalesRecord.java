package VehiclePriceCalculator;

import java.util.ArrayList;
import FileAccess.FileIO;

public class SalesRecord {
	
	private ArrayList<ArrayList<String>> lines;
	
	public SalesRecord() {
		lines = FileIO.readCsvFile("HW2_SoldVehicles.csv");
	}
	
	public ArrayList<Sedan> getSoldSedans(){
		ArrayList<Sedan> soldSedans = new ArrayList<Sedan>();
		
		for(ArrayList<String> line : lines) {
			String vehicleId = line.get(0);
			
			if(vehicleId.startsWith("S")) {
				String monthOfSale = line.get(1);
				String cityOfSale = line.get(2);
				int productionYear = Integer.parseInt(line.get(3));
				String roofType = line.get(4);
				double engineVolume = Double.parseDouble(line.get(5));
				double valueAddedTax = Double.parseDouble(line.get(6));
				
				soldSedans.add(new Sedan(vehicleId, monthOfSale, cityOfSale, 
						productionYear, valueAddedTax, engineVolume, roofType));
			}
		}
		
		return soldSedans;
	
	}
	
	public ArrayList<Hatchback> getSoldHatchbacks(){
		ArrayList<Hatchback> soldHatchbacks = new ArrayList<Hatchback>();
		
		for(ArrayList<String> line : lines) {
			String vehicleId = line.get(0);
			
			if(vehicleId.startsWith("H")) {
				String monthOfSale = line.get(1);
				String cityOfSale = line.get(2);
				int productionYear = Integer.parseInt(line.get(3));
				String cityMode = line.get(4);
				double engineVolume = Double.parseDouble(line.get(5));
				double valueAddedTax = Double.parseDouble(line.get(6));
				
				soldHatchbacks.add(new Hatchback(vehicleId, monthOfSale, cityOfSale, 
						productionYear, valueAddedTax, engineVolume, cityMode));
			}
		}
		
		return soldHatchbacks;
	}
	
	public ArrayList<Minivan> getSoldMinivans(){
		ArrayList<Minivan> soldMinivans = new ArrayList<Minivan>();
		
		for(ArrayList<String> line : lines) {
			String vehicleId = line.get(0);
			
			if(vehicleId.startsWith("M")) {
				String monthOfSale = line.get(1);
				String cityOfSale = line.get(2);
				int productionYear = Integer.parseInt(line.get(3));
				int numberOfSeats = Integer.parseInt(line.get(4));
				double engineVolume = Double.parseDouble(line.get(5));
				double valueAddedTax = Double.parseDouble(line.get(6));
				
				soldMinivans.add(new Minivan(vehicleId, monthOfSale, cityOfSale, 
						productionYear, valueAddedTax, engineVolume, numberOfSeats)); 	
			}
		}
		
		return soldMinivans;
	}
	
	public ArrayList<PickupTruck> getSoldPickupTrucks(){
		ArrayList<PickupTruck> soldPickupTrucks = new ArrayList<PickupTruck>();
		
		for(ArrayList<String> line : lines) {
			String vehicleId = line.get(0);
			
			if(vehicleId.startsWith("P")) {
				String monthOfSale = line.get(1);
				String cityOfSale = line.get(2);
				int productionYear = Integer.parseInt(line.get(3));
				String cabType = line.get(4);
				String truckBedType = line.get(5);
				double valueAddedTax = Double.parseDouble(line.get(6));
				
				soldPickupTrucks.add(new PickupTruck(vehicleId, monthOfSale, cityOfSale, 
						productionYear, valueAddedTax, cabType, truckBedType)); 
			}
		}
		
		return soldPickupTrucks;
	}
	
	public ArrayList<Bicycle> getSoldBicycles(){
		ArrayList<Bicycle> soldBicycles = new ArrayList<Bicycle>();
		
		for(ArrayList<String> line : lines) {
			String vehicleId = line.get(0);
			
			if(vehicleId.startsWith("B")) {
				String monthOfSale = line.get(1);
				String cityOfSale = line.get(2);
				int productionYear = Integer.parseInt(line.get(3));
				String chainType = line.get(4);
				String seatPost = line.get(5);
				double valueAddedTax = Double.parseDouble(line.get(6));
				
				soldBicycles.add(new Bicycle(vehicleId, monthOfSale, cityOfSale, 
						productionYear, valueAddedTax, chainType, seatPost)); 
			}
		}
		
		return soldBicycles;
	}
}
