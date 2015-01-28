package Book;

import java.util.ArrayList;

/**
 * Created by blinky on 16.01.15.
 */

//Направете клас книга с име, автор и брой страници. Направете клас библиотека, 
//който съдържа полета за име, адрес, и колекция от книги.  
//Книгите в библиотеката могат да имат няколко копия. 
//Направете метод, който добавя книга(копие). 
//Направете метод, който премахва книга(копие). 
//Направете метод който връща броя на всички книги(копия) в библиотеката. 
//Подберете подходящите структури от данни за реализация на задачата

public class Book {

	private String name;
	private String author;
	private int pages;

	public Book(int id, String title, String author) {
		this.name = name;
		this.pages = pages;
		this.author = author;
	}

	public Book(String bookName, String author, int pages) {

		this.name = bookName;
		this.author = author;
		this.pages = pages;

	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "\nTitle: " + name + "\nAuthor: " + author + "\npages: " + pages;

	}
}
