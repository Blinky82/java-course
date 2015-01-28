package Sellable;

public class Laptop implements Sellable {

	private int usb;
	private int HHD;
	private int price;

	public Laptop(int usb) {
		this.usb = usb;
	}

	public Laptop(int hHD, int usb) {
		HHD = hHD;
		this.usb = usb;
	}

	public Laptop() {

	}

	public int getHHD() {
		return HHD;
	}

	public void setHHD(int hHD) {
		HHD = hHD;
	}

	public int getUSB() {
		return usb;
	}

	public void setUSB(int usb) {
		this.usb = usb;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;

	}

	@Override
	public int getPrice() {
		return this.price * 4;
	}
}