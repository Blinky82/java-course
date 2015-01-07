public class Automobile extends car {

    private int fuel;

    public Automobile(){
        this.fuel = 0;
    }
    public Automobile(int fuel,int pricing) {
        super.pricing=pricing;
        setFuel(fuel);
    }
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void carFuel(){
        System.out.println("Fuel exhausting is : %d. \n Price: %d liters per 100 kilometers", this.fuel,super.price);
    }
}