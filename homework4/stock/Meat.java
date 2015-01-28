package Stock;

/**
 * Created by blinky on 05.01.15.
 */
public class Meat extends Stock {

	private String type;
	private String location;

	public Meat(String type, String location, double price, boolean inStock) {
		super(price, inStock);
		setType(type);
		setLocation(location);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void PrintStock() {
		System.out.println("Cheapest meat in the world");

	}

}