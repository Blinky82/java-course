import java.util.Scanner;

/**
 * Created by blinky on 14.12.14.
 */
public class symmetric {

    public static void main(String[] args) {
        sym();
    }
    public static void sym() {

        for (int i = 0; i < 1000; i++) {

            if(i < 10 || i % 10 == i / 10){
                System.out.print(i + " ,");
            }
            else if(i > 100 && i % 10 == i / 100 ){
                System.out.print(i + " ,");
            }
        }
    }

}
