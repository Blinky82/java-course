/**
 * Created by blinky on 30.11.14.
 */

import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        String string;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first digit:");

        int a = scanner.nextInt();
        System.out.println("The digit is:"+ a);
        System.out.print("Enter value b:");

        int b = scanner.nextInt();
        System.out.println("The digit is:"+ b);
        System.out.println("Enter value:");

        String = scanner.next();
        System.out.println("The value is:"+ String);

        boolean s = String.length()>10;
        System.out.println("Does the value less than 10: "+s);
        if (a>b){
            System.out.println("The digit a is bigger than b");
        }
        else System.out.println("The digit b is bigger than a");

        boolean cEqualsB = a == b;
        System.out.print(" c == b : ");
        System.out.println(cEqualsB);

        if(b >= -100 && b <15){
            System.out.println("The digit is between [-100;15)");
        } else
            System.out.println("The digit is not between [-100;15)");

        int c;
        c = a % b;
        System.out.print("a % b =");
        System.out.println(c);

        boolean result = c> 10 || b<88;
        System.out.print(" i>10 || b<88 :"+ result );
    }
}
