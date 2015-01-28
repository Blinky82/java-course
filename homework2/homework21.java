import java.util.Scanner;

/**
 * Created by blinky on 08.12.14.
 */

//Направете програма, която приема от конзолата 2 числа a и b ( б > а) 
//и изкарва на екрана всички числа от а до б които се делят на 3 без остатък.

public class homework21 {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Въведете стойност за a:");
        a = input.nextInt();
        System.out.println("Въведете стойност за b:");
        b = input.nextInt();

        for(int n = 0; a < b; a++) {

            if (a % 3 == 0) {
                System.out.println(a);
            }
        }

    }
}
