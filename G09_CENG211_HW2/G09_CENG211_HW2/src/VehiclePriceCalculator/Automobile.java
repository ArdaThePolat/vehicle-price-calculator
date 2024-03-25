package VehiclePriceCalculator;

public class Automobile extends Vehicle {
	private double engineVolume;
	private static final int BASE_PRICE = 200_000;
	
	public Automobile() {
		super();
		this.engineVolume = -1.0;
	}
	
	public Automobile(Automobile anAutomobile) {
		super(anAutomobile);
		this.engineVolume = anAutomobile.engineVolume;
		setTotalPrice(anAutomobile.getTotalPrice());
	}
	

	public Automobile(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
						double valueAddedTax, double engineVolume) {
		
		super(vehicleId, monthOfSale,  cityOfSale,  productionYear, valueAddedTax);
		this.engineVolume = engineVolume;
	}
	
	public double getEngineVolume() {
		return engineVolume;
	}
	
	public double calculateTotalPrice() {
		return (BASE_PRICE * (1 + getSpecialConsumptionTax() * 0.8) + (1 + getValueAddedTax()/100));
	}
}
