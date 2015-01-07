/**
 * Created by blinky on 05.01.15.
 */
public class Veggies extends Stock {
}

    private String type;
    private String gmo;
    public Veggies() {
    }
    public Veggies (boolean inStock, int price, String type, String gmo) {
        super.InStock = inStock;
        super.price = price;
        ;
        setType(type);
        setGmo(gmo);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getGmo() {
        return gmo;
    }
    public void setCountry(String country) {
        this.gmo = country;
    }
    @Override
    public void StockOut() {
        System.out.printf(
                "Type: %s , Price: %d$ , In Stock: %b , It is GMO: %s .",
                this.type, super.price, super.inStock, this.gmo);
    }
}