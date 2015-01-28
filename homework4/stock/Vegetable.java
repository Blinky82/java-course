package Stock;

public class Vegetable extends Stock {

	private String type;
	private String gmo;

	public Vegetable(boolean inStock, int price, String type, String gmo) {

		super(price, inStock);

		setType(type);
		setGmo(gmo);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGmo() {
		return gmo;
	}

	public void setGmo(String country) {
		this.gmo = country;
	}

	@Override
	public void PrintStock() {
		System.out.println("Most delicious vegetables in the world");

	}
}