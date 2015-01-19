/**
 * Created by blinky on 30.11.14.
 */

import java.util.Scanner;

public class ConsoleRoomScanner;

public class task2 {

    public static void main(){

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Enter first digit here:");
        int a = input.nextInt();

        System.out.println("Enter second digit here:");
        int b = input.nextInt();

        System.out.println("Enter third digit here:");
        int c = input.nextInt();


        if (a > b && a > c)
            System.out.println("a is biggest digit");

        if (b > a && b > c)
            System.out.println("b is the biggest digit");

        if (c > a && c > b)
            System.out.println("c is the biggest digit");

        if (a < b && a < c)
            System.out.println("a is smallest digit");

        if (b < a && b < c)
            System.out.println("b is the smallest digit");

        if (c < a && c < b)
            System.out.println("c is the smallest digit");

    }
}
