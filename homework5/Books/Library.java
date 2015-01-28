package Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Created by blinky on 16.01.15.
 */
public class Library {

	private String name;
	private String address;
	private HashMap<Book, Integer> topCollection = new HashMap<Book, Integer>();

	public Library(String name, String address) {

		this.name = name;
		this.address = address;
		this.topCollection = new HashMap<Book, Integer>();
	}

	public Library(String name, String address,
			HashMap<Book, Integer> collection) {

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

	public HashMap<Book, Integer> getTopCollection() {
		return topCollection;
	}

	public void setTopCollection(HashMap<Book, Integer> topCollection) {
		this.topCollection = topCollection;
	}

	public void addABook(Book book) {
		if (topCollection.containsKey(book)) {
			topCollection.put(book, topCollection.get(book) + 1);
		} else {
			topCollection.put(book, 1);
		}
	}

	public void removeBook(Book book) {
		if (topCollection.containsKey(book)) {
			if (topCollection.get(book) == 1) {
				topCollection.remove(book);
			} else {
				topCollection.put(book, topCollection.get(book) - 1);
			}
		}
	}

	public void printBooks() {
		for (Entry<Book, Integer> entry : topCollection.entrySet()) {
			System.out.println(entry.getKey() + " - count: " + entry.getValue());
		}
	}

	@Override
	public String toString() {
		String total = "\n";
		return total;
	}

	public static void main(String[] args) {
		Book tmp = new Book("asd","me" ,100 );
		Library library = new Library("Biblioteka", "Tuka");
		library.addABook(tmp);
		library.printBooks();
		library.addABook(tmp);
		library.printBooks();	
		library.addABook(tmp);
		library.printBooks();
		library.addABook(tmp);
		library.printBooks();
	
		library.removeBook(tmp);
		library.printBooks();
	
	}
}
