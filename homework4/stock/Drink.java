package Stock;

/**
 * Created by blinky on 05.01.15.
 */
public class Drink extends Stock {

	private String alcohol;
	private boolean hot;

	public Drink(String alcohol, boolean hot, double price, boolean inStock) {
		super(price, inStock);
		setAlcohol(alcohol);
		setHot(hot);
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

	@Override
	public void PrintStock() {
		System.out.println("Cheapest alcochol in the world");

	}
}