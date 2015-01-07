/**
 * Created by blinky on 05.01.15.
 */
public class Fruits extends Stock {


    private String type;
    private String region;


    public Fruits() {

    }

    public Fruits(String type, String region, double price, boolean inStock) {
        super.InStock = inStock;
        super.price = price;
        setType(type);
        setRegion(region);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    @Override
    public void StockOut() {
        System.out.printf(
                "The type is: %s , The price is: %d$ , In Stock: %b , Region: %s .",
                this.type, super.price, super.inStock, this.region);
    }
}