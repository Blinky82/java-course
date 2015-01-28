package Car;

public class Automobile extends Car {
	private double fuelConsumption;
	
	public Automobile(int fuelConsumption) {
		super();
		this.fuelConsumption = fuelConsumption;
	}
	public Automobile(int price,double fuelConsumption) {
		super(price);
		this.fuelConsumption = fuelConsumption;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

}
