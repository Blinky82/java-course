package Random;

/**
 * Created by blinky on 24.01.15.
 */

    public class Tv implements Sellable {

        private String brand;
        private int inches;

    public Tv() {
        this.brand = brand;
    }

    public  Tv (String brand, int inches) {
        brand = brand;
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
}


