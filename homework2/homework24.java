import java.util.Scanner;
/**
 * Created by blinky on 08.12.14.
 */
public class homework24 {

    public static void main(String[] args) {

        int a, b, c, d, e;

        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Въведете стойност за a:");
        a = input.nextInt();
        System.out.println("Въведете стойност за b:");
        b = input.nextInt();
        System.out.println("Въведете стойност за c:");
        c = input.nextInt();
        System.out.println("Въведете стойност за d:");
        d = input.nextInt();
        System.out.println("Въведете стойност за e:");
        e = input.nextInt();

        do {

            if (a > b && a > c && a > d && a > e && a > 0) {
                System.out.println("Най-голямоте число е:" + a);
            }

            if (b > a && b > c && b > d && b > e) {
                System.out.println("Най-голямоте число е:" + b);
            }
            if (c > a && c > b && c > d && c > e) {
                System.out.println("Най-голямоте число е:" + c);
            }

            if (d > a && d > b && d > c && d > e) {
                System.out.println("Най-голямоте число е:" + d);
            }

            if (e > a && e > b && e > c && e > d) {
                System.out.println("Най-голямоте число е:" + e);
            }
            break;
        }
        while(true);
    }
}