package VehiclePriceCalculator;

public class PickupTruck extends Vehicle{
	private String cabType;
	private String truckBedType;
	private static final int BASE_PRICE = 250_000;
	
	public PickupTruck() {
		super();
		this.cabType = "none";
		this.truckBedType = "none";
	}
	
	public PickupTruck(PickupTruck aPickupTruck) {
		super(aPickupTruck);
		this.cabType = aPickupTruck.getCabType();
		this.truckBedType = aPickupTruck.getTruckBedType();
		setSpecialConsumptionTax(aPickupTruck.getSpecialConsumptionTax());
		setTotalPrice(aPickupTruck.getTotalPrice());
	}
	
	public PickupTruck(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
			double valueAddedTax, String cabType, String truckBedType) {
		super(vehicleId, monthOfSale, cityOfSale, productionYear, valueAddedTax);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
		setSpecialConsumptionTax(calculateSpecialConsumptionTax());
		setTotalPrice(calculateTotalPrice());
	}
	
	public String getCabType() {
		return cabType;
	}

	public String getTruckBedType() {
		return truckBedType;
	}
	
	private double calculateSpecialConsumptionTax() {
		return ((getTruckBedTypeValue() * super.getProductionYearValue()) / getCabTypeValue());
	}

	private double calculateTotalPrice() {
		return ((BASE_PRICE * (1 + (getSpecialConsumptionTax() * 0.6)) + (1 + getValueAddedTax()/100)));
	}
	
	private double getTruckBedTypeValue() {
		switch(truckBedType) {
			case "regular":
				return 0.5;
			case "tanker":
				return 0.8;
			case "trailer":
				return 1.0;
			default:
				return -1;
		}
	}
	
	private double getCabTypeValue() {
		switch(cabType) {
			case "regular":
				return 2.5;
			case "extended":
				return 2.8;
			case "crew":
				return 3;
			default:
				return -1;
		}
	}
	
	
	
	
}
