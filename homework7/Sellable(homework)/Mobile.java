package Sellable;

public class Mobile implements Sellable {

	private String ios;
	private String color;
	private int price;

	public Mobile() {
	}

	public Mobile(String ios, String color) {
		this.ios = ios;
		this.color = color;
	}

	public String getIos() {
		return ios;
	}

	public void setIos(String ios) {
		this.ios = ios;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price*3;
	}
}