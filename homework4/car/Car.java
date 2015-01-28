package Car;

import java.util.Arrays;
import java.util.Comparator;

//Дефинирайте клас Car с единствено поле цена. 
//Създайте клас Automobile който наследява Car и съдържа допълнително поле за разход на гориво.  
//Създайте клас SUV който налседява Car  и съдържа boolean поле дали джипа е високопроходим.  
//Създайте масив от тип Car и въведете в него 5 коли и 5 джипа. Сортирайте масива по цена на конкретната кола. 

public class Car {

	protected int pricing;

	public Car() {
		this.pricing = 0;
	}

	public Car(int pricing) {
		setPricing(pricing);
	}

	public int getPricing() {
		return pricing;
	}

	public void setPricing(int pricing) {
		this.pricing = pricing;
	}
}
