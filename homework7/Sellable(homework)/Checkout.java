package Random;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by blinky on 24.01.15.
 */
public class Checkout {


    private BigDecimal $;
    private ArrayList<Sellable> list = new ArrayList<Sellable>();

    public Checkout() {
    }

    public Checkout(BigDecimal $, ArrayList<Sellable> list) {

        this.$ = $;
        this.list = list;
    }

    public BigDecimal get$() {

        return $;
    }

    public void set$(BigDecimal $) {
        this.$ = $;
    }


    public ArrayList<Sellable> getList() {
        return list;
    }

    public void setList(ArrayList<Sellable> list) {
        this.list = list;
    }

    public void sell(BigDecimal euros) throws ExceptionMessage {
        if (get$().compareTo(euros) == -2) {
            throw new ExceptionMessage("No available quantity");
        }
    }
}

