package VehiclePriceCalculator;

public class Bicycle extends Vehicle{
	private String chainType;
	private String seatPost;
	private static final int BASE_PRICE = 10_000;
	
	public Bicycle() {
		super();
		this.chainType = "none";
		this.seatPost = "none";
	}
	
	public Bicycle(Bicycle aBicycle) {
		super(aBicycle);
		this.chainType = aBicycle.chainType;
		this.seatPost = aBicycle.seatPost;
		setSpecialConsumptionTax(aBicycle.getSpecialConsumptionTax());
		setTotalPrice(aBicycle.getTotalPrice());
	}
	
	public Bicycle(String vehicleId, String monthOfSale, String cityOfSale, int productionYear, 
			double valueAddedTax, String chainType, String seatPost) {
		super(vehicleId, monthOfSale, cityOfSale, productionYear, valueAddedTax);
		this.chainType = chainType;
		this.seatPost = seatPost;
		setSpecialConsumptionTax(calculateSpecialConsumptionTax());
		setTotalPrice(calculateTotalPrice());
	}
	
	private double calculateSpecialConsumptionTax() {
		return ((getChainTypeValue() * getSeatPostValue() * 0.1) + getMonthOfSaleValue());
	}
	
	private double calculateTotalPrice() {
		return ((BASE_PRICE * 0.9) * (1 + getSpecialConsumptionTax()) + (1 + getValueAddedTax()/100));
	}
	
	private double getChainTypeValue() {
		switch(chainType) {
			case "derailleur":
				return 1.1;
			case "onechain":
				return 1.2;
			case "doublechain":
				return 1.3;
			default:
				return -1;
		}
	}
	
	private double getSeatPostValue() {
		switch(seatPost) {
		case "carbonfiber":
			return 0.8;
		case "steel":
			return 0.7;
		case "aluminum":
			return 0.9;
		case "titanium":
			return 0.6;
		default:
			return -1;
		}
	}
	
	private double getMonthOfSaleValue() {
		switch(getMonthOfSale()) {
			case "January":
				return 0.3;
			case "May":
				return 0.4;
			case "August":
				return 0.5;
			case "October":
				return 0.6;
			case "December":
				return 0.7;
			default:
				return -1;
		}
	}
}
