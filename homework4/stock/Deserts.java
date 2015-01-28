package Stock;

/**
 * Created by blinky on 05.01.15.
 */
public class Deserts extends Stock {

	private String type;
	private boolean sugarfree;

	public Deserts(String type, boolean sugarfree, double price, boolean inStock) {
		super(price, inStock);
		setType(type);
		setSugarfree(sugarfree);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSugarfree() {
		return sugarfree;
	}

	public void setSugarfree(boolean sugarfree) {
		this.sugarfree = sugarfree;
	}

	@Override
	public void PrintStock() {
		System.out.println("Sweetest deserts in the world");

	}
}