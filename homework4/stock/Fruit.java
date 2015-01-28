package Stock;

/**
 * Created by blinky on 05.01.15.
 */
public class Fruit extends Stock {

	private String type;
	private String region;

	public Fruit(String type, String region, double price, boolean inStock) {
        super(price,inStock);
        setType(type);
        setRegion(region);
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public void PrintStock() {
		// TODO Auto-generated method stub
		System.out.println("Freshest fruits in the world");
	}

}