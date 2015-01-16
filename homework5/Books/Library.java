package Random;

import java.util.ArrayList;

/**
 * Created by blinky on 16.01.15.
 */
public class Library {

    private String name;
    private String address;
    private ArrayList<Book> topCollection = new ArrayList<Book>();

    public Library(String name, String address, ArrayList<Book> collection) {

        this.name = name;
        this.address = address;
        this.topCollection = collection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getTopCollection() {
        return topCollection;
    }

    public void setTopCollection(ArrayList<Book> topCollection) {
        this.topCollection = topCollection;
    }

    public void addABook(String name) {
        for (Book a : topCollection) {

            name.add();
            break;
        }
        }
    }
    public void removeBook(String name) {
        for(Book a : topCollection)
        {
                name.remove();
                break;
            }
        }

    @Override
    public String toString() {
        String total = "\n";
        for (int i = 0; i < topCollection.size(); i++) {
            Book a = topCollection.get(i).topCollection();
            total = total + a.toString();
        }
return total;
}
}