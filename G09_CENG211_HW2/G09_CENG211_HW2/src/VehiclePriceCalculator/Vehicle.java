package VehiclePriceCalculator;

public class Vehicle {
	private String vehicleId;
	private String monthOfSale;
	private String cityOfSale;
	private int productionYear;
	private double valueAddedTax;
	private double specialConsumptionTax;
	private double totalPrice;
	
	
	public Vehicle() {
		this.vehicleId = "none";
		this.monthOfSale = "none";
		this.cityOfSale = "none";
		this.productionYear = -1;
		this.valueAddedTax = -1;
		this.specialConsumptionTax = -1;
		this.totalPrice = -1;
	}
	
	public Vehicle(Vehicle aVehicle) {
		this.vehicleId = aVehicle.vehicleId;
		this.monthOfSale = aVehicle.monthOfSale;
		this.cityOfSale = aVehicle.cityOfSale;
		this.productionYear = aVehicle.productionYear;
		this.valueAddedTax = aVehicle.valueAddedTax;
	}

	public Vehicle(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
					double valueAddedTax) {
		this.vehicleId = vehicleId;
		this.monthOfSale = monthOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear = productionYear;
		this.valueAddedTax = valueAddedTax;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	
	public double getSpecialConsumptionTax() {
		return specialConsumptionTax;
	}

	public void setSpecialConsumptionTax(double specialConsumptionTax) {
		this.specialConsumptionTax = specialConsumptionTax;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getMonthOfSale() {
		return monthOfSale;
	}
	
	public String getCityOfSale() {
		return cityOfSale;
	}
	
	public int getProductionYear() {
		return productionYear;
	}
	
	public double getValueAddedTax() {
		return valueAddedTax;
	}
	
	protected double getProductionYearValue() {
		if(getProductionYear() <= 2008 && getProductionYear()>= 2001) 
			return 1.0;
		
		else if(getProductionYear() >= 2012 && getProductionYear() <= 2017) 
			return 1.2;
		
		else if(getProductionYear() >= 2018 && getProductionYear() <= 2022)
			return 1.6;
		
		else return -1;
	}
}

