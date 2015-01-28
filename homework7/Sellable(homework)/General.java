package Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;

public class General {
	public static void main(String[] args) {

		ArrayList<Sellable> sell = new ArrayList<Sellable>();

		Tv sharp = new Tv("Samsung",51);
		Mobile lenovo = new Mobile();
		Laptop aser = new Laptop();

		sell.add(sharp);
		sell.add(lenovo);
		sell.add(aser);

		Checkout checkout = new Checkout(new BigDecimal(120), sell);

		try {
			BigDecimal m$1 = new BigDecimal(150);
			checkout.sell(m$1);
			System.out.println("You have made your order!");

		} catch (ExceptionMessage e) {
			System.out.println("There is an error during your process!");

		} finally {
			System.out.println("The process is over!");
		}

		try {
			BigDecimal m$2 = new BigDecimal(368);
			checkout.sell(m$2);
			System.out.println("Succesfully. You have made your order!");

		} catch (ExceptionMessage e) {
			System.out.println("There is an error during your process!");

		} finally {
			System.out.println("The process is over!");
		}
	}
}
