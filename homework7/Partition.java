package Random;

import java.util.Scanner;

/**
 * Created by blinky on 21.01.15.
 */
public class Partition {

    private static Scanner input;

    public static void main(String[] args) {

        int a, b, c;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first digit here: ");
        a = input.nextInt();

        System.out.println("Enter your second digit here: ");
        b = input.nextInt();

        try {

            c = a / b;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {

            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}


