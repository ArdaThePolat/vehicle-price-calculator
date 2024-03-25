package VehiclePriceCalculator;

public class Sedan extends Automobile {
	private String roofType;
	
	public Sedan() {
		super();
		this.roofType = "none";
	}
	
	public Sedan(Sedan aSedan) {
		super(aSedan);
		this.roofType = aSedan.roofType;
		setSpecialConsumptionTax(aSedan.getSpecialConsumptionTax());
	}
	
	public Sedan(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
			double valueAddedTax, double engineVolume, String roofType) {
		super(vehicleId, monthOfSale, cityOfSale, productionYear,  valueAddedTax, engineVolume);
		this.roofType = roofType;
		setSpecialConsumptionTax(calculateSpecialConsumptionTax());
		setTotalPrice(calculateTotalPrice());
	}
	
	private double calculateSpecialConsumptionTax() {
		return (getEngineVolume() * 0.2 * getRoofTypeValue()) / getProductionYearValue();
	}
	
	private double getRoofTypeValue() {
		switch(roofType) {
			case "regular":
				return 0.5;
			
			case "moonroof":
				return 0.6;
			
			case "sunroof": 
				return 0.8;
			
			default :
				return -1;
		}
		
	}
}
	
	
	


