package Sellable;

public class Tv implements Sellable {

	private String brand;
	private int inches;
	private int price;


	public Tv(String brand, int inches) {
		this.brand = brand;
		this.inches = inches;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int getPrice() {
		return this.price*2;
	}	

}