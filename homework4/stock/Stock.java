package Stock;

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

    public double getPrice()
    {
        return price;
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
