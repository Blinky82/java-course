/**
 * Created by blinky on 05.01.15.
 */
public class Drinks extends Stock {

    private String alcohol;
    private boolean hot;

    public Drinks() {

    }

    public Drinks(String alcohol, boolean hot, double price, boolean inStock) {
        super.inStock = inStock;
        super.price = price;
        setAlcohol(alcohol);
        setHot(hot);
    }
    public String getAlcohol() {
        return alcohol;
    }
    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }
    public boolean isHot() {
        return hot;
    }
    public void setHot(boolean hot) {
        this.hot = hot;
    }
    @Override
    public void StockOut() {
        System.out.printf(
                "The alcohol is: %s , the price: %d$ , in Stock: %b , is it hot drink: %s .",
                this.alcohol, super.price, super.inStock, this.hot);
    }
}