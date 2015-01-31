package Car;

public class SUV extends Car {

	private boolean isOffroad;

	public boolean isOffroad() {
		return isOffroad;
	}

	public void setOffroad(boolean isOffroad) {
		this.isOffroad = isOffroad;
	}

	public SUV(int price,boolean isOffroad) {
		super(price);
		this.isOffroad = isOffroad;
	}

}


