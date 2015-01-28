package Stock;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blinky on 05.01.15.
 */

//Дефинирайте абсрактен клас Stock който съдържа информация за артикул в магазин - 
//цена и boolean поле дали е наличн. Реализирайте класове за месо, зеленчуци, плодове, 
//напитки и десерти с поне по 2 уникални полета, който характеризират артикула

public class Store {

	private String name;
	private String location;
	private ArrayList<Stock> stock = new ArrayList<Stock>();

	public Store() {
	}

	public ArrayList<Stock> getStock() {
		return stock;
	}

	public Store(String name, String location) {
		setName(name);
		setLocation(location);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void addStock(Stock toadd) {
		stock.add(toadd);
	}

}
