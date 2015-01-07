/**
 * Created by blinky on 05.01.15.
 */
public class Deserts extends Stock {

    private String type;
    private boolean sugarfree;
    public deserts() {
    }
    public deserts(String type, boolean sugarfree, double price, boolean inStock) {
        super.inStock = inStock;
        super.price = price;
        setType(type);
        setSugarfree(sugarfree);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isSugarfree() {
        return sugarfree;
    }
    public void setSugarfree(boolean sugarfree) {
        this.sugarfree = sugarfree;
    }
    @Override
    public void StockOut() {
        System.out.printf(
                "The type is: %s , the price is: %d$ , in Stock: %b , Sugare free: %s .",
                this.type, super.price, super.inStock, this.sugarfree);
    }
}