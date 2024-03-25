package VehiclePriceCalculator;

public class Minivan extends Automobile{
	private int numberOfSeats;
	
	public Minivan() {
		super();
		this.numberOfSeats = -1;
	}
	
	public Minivan(Minivan aMinivan) {
		super(aMinivan);
		this.numberOfSeats = aMinivan.numberOfSeats;
		setSpecialConsumptionTax(aMinivan.getSpecialConsumptionTax());
		//setTotalPrice(aMinivan.getTotalPrice());
	}
	
	public Minivan(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
					double valueAddedTax, double engineVolume, int numberOfSeats) {
		super(vehicleId, monthOfSale, cityOfSale, productionYear, valueAddedTax, engineVolume);
		this.numberOfSeats = numberOfSeats;
		setSpecialConsumptionTax(calculateSpecialConsumptionTax());
		setTotalPrice(calculateTotalPrice());
	}
	
	private double calculateSpecialConsumptionTax() {
		return ((0.6 * getProductionYearValue()) / (getEngineVolume() + getNumberOfSeatsValue()));
	}
	
	private double getNumberOfSeatsValue() {
		switch(numberOfSeats) {
			case 4:
				return 0.1;
			case 5:
				return 0.4;
			case 6:
				return 0.6;
			case 7:
				return 0.8;
			default:
				return -1;
		}
	}

}
