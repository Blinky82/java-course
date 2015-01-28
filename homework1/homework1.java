 import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */

//Направете програма, която приема две числа с плаваща запетая съответно дължината и ширината на правоъгълник.
//Пресметнете лицето на дадния правоъгълник и я изведете на конзолата

public class homework1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Въведи дължина на правоъгърлника:");
            float a = scanner.nextFloat();

            System.out.println("Въведи ширина на правоъгърлника:");
            float b = scanner.nextFloat();

            double s = a * b;

            System.out.println("Лицето на правоъгълника е: ");
        }
    }
