import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by blinky on 01.12.14.
 */
public class homework1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in, "UTF-8");

            System.out.println("Въведи дължина на правоъгърлника:");
            double a = input.nextInt();

            System.out.println("Въведи ширина на правоъгърлника:");
            double b = input.nextInt();

            double s = a * b;

            System.out.println("Лицето на правоъгълника е:");
        }
    }