package Random;

import java.util.Scanner;

/**
 * Created by blinky on 29.01.15.
 */

//Направете програма, която приема едно число и обръща неговите цифри в обратен ред.

public class ReverseNumber {

        public static void main(String args[]) {

            int number;
            int reverser = 0;

            System.out.println("Enter your number: ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

            while( number != 0 ) {

                reverser = reverser * 10;
                reverser = reverser + number%10;
                number = number/10;
            }

            System.out.println("Reverse of entered number is " + reverser);
        }
    }


