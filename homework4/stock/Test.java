package Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		Car[] cars = {

		new SUV(8100, true), new SUV(9500, true), new SUV(11000, false),
				new SUV(11500, true), new SUV(12000, false),
				new Automobile(4000, 3.5), new Automobile(4500, 4),
				new Automobile(5000, 4.5), new Automobile(5500, 5),
				new Automobile(6000, 5.5) };
		
		Arrays.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				System.out.println("Curr pricess: " + o1.getPricing() + " "
						+ o2.getPricing());
				if (o1.getPricing() <= o2.getPricing()) {
					System.out.println("Kur");
					return -1;
				}
				return 1;
			}
		});
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Current car's price: " + i + " "
					+ cars[i].getPricing());
		}
	}

}
