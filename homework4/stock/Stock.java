/**
 * Created by blinky on 05.01.15.
 */
public abstract class Stock {

    private double price;
    private boolean inStock;


    public Stock(double price , boolean inStock)

    {
        setPrice(price);
        setInStock(inStock);
    }

    public static void main(String[] args) {

        Stock meat = new Meat(false, "red", "1");
        Veggies veggies = new Veggies(true, "fresh", "2");
        Fruits fruits = new Fruits(false, "juicy", "3");
        Drinks drinks = new Drinks(true, "cold", "4");
        Deserts deserts = new Deserts(false, "sweet", "5");

    }

    public double getPrice()
    {
        return price;}
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public boolean getInStock()
    {
        return inStock;
    }
    public void setInStock(boolean inStock)
    {
        this.inStock=inStock;
    }
    public abstract void PrintStock();
}


