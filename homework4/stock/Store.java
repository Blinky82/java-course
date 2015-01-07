import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blinky on 05.01.15.
 */
public class Store {

        private String name;
        private String location;
        private ArrayList stock = new ArrayList();
        public Store() {
        }
        public ArrayList getStock() {
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
        public static void main(String[] args) {
            Store local = new store();
            local.setName("Sofia");
            local.getStock().add(new Veggies(true, "fresh", "2"));

            Scanner in = new Scanner(System.in);
            System.out.println("Stock: ");

            veggies veggiesName = new veggiesName();
            String vegname = null;

            veggiesName = in.nextLine();
            veggies.setType(veggiesName;
        }
        public void available(stock toadd) {
            stock.add(toadd);
        }


}

