package Random;

/**
* Created by blinky on 21.01.15.
*/
public abstract class Book extends Bookstore implements Readable, Fillable, Sellable {


    public Book() {
    }

    public Book(int printout, int wordCount, int sale) {
        super();

        @Override
        public void fill(int printout){

            printout = printout * 3;
            System.out.println(printout);

        }

        @Override
        public void read(String sentences){

            sentences = sentences / 3;

            System.out.println(sentences);
        }

        @Override
        public void sell(int sale){

            sale = sale * 10;

            System.out.println(sale);


        }

    }
}