package VehiclePriceCalculator;

public class Hatchback extends Automobile{
	private String cityMode;
	
	public Hatchback(){
		super();
		this.cityMode = "none";
	}
	
	public Hatchback(Hatchback aHatchback){
		super(aHatchback);
		this.cityMode = aHatchback.cityMode;
		setSpecialConsumptionTax(aHatchback.getSpecialConsumptionTax());
		//setTotalPrice(aHatchback.getTotalPrice());
	}
	
	public Hatchback(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
					double valueAddedTax, double engineVolume, String cityMode){
		super(vehicleId, monthOfSale, cityOfSale, productionYear, valueAddedTax, engineVolume);
		this.cityMode = cityMode;
		setSpecialConsumptionTax(calculateSpecialConsumptionTax());
		setTotalPrice(calculateTotalPrice());
	}
	
	private double calculateSpecialConsumptionTax() {
		return (getEngineVolume() * 0.3 * getProductionYearValue() + getCityModeValue());
	}

	private double getCityModeValue() {
		switch(cityMode) {
		
			case "yes":
				return 0.15;
			
			case "no":
				return 0.1;
			
			default:
				return -1;
		}
		
	}
}
