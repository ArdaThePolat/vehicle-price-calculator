package VehiclePriceCalculator;

import java.util.ArrayList;

public class DisplayController {
	
	private SalesRecord salesRecord;
	
	public DisplayController() {
		this.salesRecord = new SalesRecord();		
	}
	
	public void displayVehicleList(int input) {
		switch(input) {
		
		case 1 :
			displayAllSoldVehicles();
			break;
		case 2 :
			displaySoldSedans();
			break;
		case 3 :
			displaySoldHatchbacks();
			break;
		case 4 :
			displaySoldMinivans();
			break;
		case 5 : 
			displaySoldPickupTrucks();
			break;
		case 6 :
			displaySoldBicycles();
			break;
		
		default :
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
	
	private void displaySoldSedans() {
		ArrayList<Sedan> soldSedans = salesRecord.getSoldSedans();
		
		for (Sedan aSedan : soldSedans) {
			String formattedTotalPrice = String.format("%.2f", aSedan.getTotalPrice());
			String formattedSCT = String.format("%.3f", aSedan.getSpecialConsumptionTax());
			
			System.out.println("Vehicle: Sedan Vehicle ID: "+ aSedan.getVehicleId()+
					" Month: "+ aSedan.getMonthOfSale() + " City: "+ aSedan.getCityOfSale()+
					" Production Year: "+ aSedan.getProductionYear()+ " SCT: " + formattedSCT);
			
			System.out.println("The total price paid for "+ aSedan.getVehicleId()+" is: " + 
					formattedTotalPrice +" TL");
		}
	}
	private void displaySoldHatchbacks() {
		ArrayList<Hatchback> soldHatchbacks = salesRecord.getSoldHatchbacks();
		
		for (Hatchback aHatchback: soldHatchbacks) {
			String formattedTotalPrice = String.format("%.2f", aHatchback.getTotalPrice());
			String formattedSCT = String.format("%.3f", aHatchback.getSpecialConsumptionTax());
			
			System.out.println("Vehicle: Hatchback Vehicle ID: "+ aHatchback.getVehicleId()+
					" Month: "+ aHatchback.getMonthOfSale() + " City: "+ aHatchback.getCityOfSale()+
					" Production Year: "+ aHatchback.getProductionYear()+ " SCT: " + formattedSCT);
			
			System.out.println("The total price paid for "+ aHatchback.getVehicleId()+" is: " + 
					formattedTotalPrice +" TL");
		}
	}
	
	private void displaySoldMinivans() {
		ArrayList<Minivan> soldMinivans = salesRecord.getSoldMinivans();
		
		for (Minivan aMinivan : soldMinivans) {
			String formattedTotalPrice = String.format("%.2f", aMinivan.getTotalPrice());
			String formattedSCT = String.format("%.3f", aMinivan.getSpecialConsumptionTax());
			
			System.out.println("Vehicle: Minivan Vehicle ID: "+ aMinivan.getVehicleId()+
					" Month: "+ aMinivan.getMonthOfSale() + " City: "+ aMinivan.getCityOfSale()+
					" Production Year: "+ aMinivan.getProductionYear()+ " SCT: " + formattedSCT);
			System.out.println("The total price paid for "+ aMinivan.getVehicleId()+" is: " + 
					formattedTotalPrice +" TL");
		}
	}
	
	private void displaySoldPickupTrucks() {
		ArrayList<PickupTruck> soldPickupTrucks= salesRecord.getSoldPickupTrucks();
		
		for (PickupTruck aPickupTruck : soldPickupTrucks) {
			String formattedTotalPrice = String.format("%.2f", aPickupTruck.getTotalPrice());
			String formattedSCT = String.format("%.3f", aPickupTruck.getSpecialConsumptionTax());
			
			System.out.println("Vehicle: PickupTruck Vehicle ID: "+ aPickupTruck.getVehicleId()+
					" Month: "+ aPickupTruck.getMonthOfSale() + " City: "+ aPickupTruck.getCityOfSale()+
					" Production Year: "+ aPickupTruck.getProductionYear()+ " SCT: " + formattedSCT);
			System.out.println("The total price paid for "+ aPickupTruck.getVehicleId()+" is: " + 
					formattedTotalPrice +" TL");
		}
	}
	private void displaySoldBicycles() {
		ArrayList<Bicycle> soldBicycles = salesRecord.getSoldBicycles();
		
		for (Bicycle aBicycle : soldBicycles) {
			String formattedTotalPrice = String.format("%.2f", aBicycle.getTotalPrice());
			String formattedSCT = String.format("%.3f", aBicycle.getSpecialConsumptionTax());
			
			System.out.println("Vehicle: Bicycle Vehicle ID: "+ aBicycle.getVehicleId()+
					" Month: "+ aBicycle.getMonthOfSale() + " City: "+ aBicycle.getCityOfSale()+
					" Production Year: "+ aBicycle.getProductionYear()+ " SCT: " + formattedSCT);
			System.out.println("The total price paid for "+ aBicycle.getVehicleId()+" is: " + 
					formattedTotalPrice +" TL");
		}
	}
	private void displayAllSoldVehicles() {
		displaySoldSedans();
		displaySoldHatchbacks();
		displaySoldMinivans();
		displaySoldPickupTrucks();
		displaySoldBicycles();
	}
}
