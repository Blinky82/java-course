
import java.util.Arrays;
import java.util.Comparator;

public class Car {

    protected int pricing;

    public Car() {
        this.pricing = 0;
    }

    public Car(int pricing) {
        setPricing(pricing);
    }

    public static void main(String[] args) {
        car[] cars = {

                new SUV(8100,true),
                new SUV(9500,true),
                new SUV(11000,false),
                new SUV(11500,true),
                new SUV(12000,false),
                new Automobile(4000,3.5),
                new Automobile(4500,4),
                new Automobile(5000,4.5),
                new Automobile(5500,5),
                new Automobile(6000,5.5),

                Sort(cars);
        };
    }
    public int getPricing() {
        return pricing;
    }
    public void setPricing(int pricing) {
        this.pricing = pricing;
    }
    private static void Sort(car[] cars){
    }
}
}
