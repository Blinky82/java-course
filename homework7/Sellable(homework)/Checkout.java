package Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by blinky on 24.01.15.
 */
public class Checkout {

	private BigDecimal sum;
	private ArrayList<Sellable> list = new ArrayList<Sellable>();

	public Checkout() {
	}

	public Checkout(BigDecimal sum, ArrayList<Sellable> list) {

		this.sum = sum;
		this.list = list;
	}

	public BigDecimal getSum() {

		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public ArrayList<Sellable> getList() {
		return list;
	}

	public void setList(ArrayList<Sellable> list) {
		this.list = list;
	}

	public void sell(BigDecimal euros) throws ExceptionMessage {
		if (getSum().compareTo(euros) < 0) {
			throw new ExceptionMessage("No available quantity");
		}
	}
}
