package Random;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by blinky on 23.01.15.
 */
public class ArrayTenSearch {

    public static void main(String[] args) {

        int[] array = new int[10];
        int first = 0;
        int numbers;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        numbers = Integer.parseInt(in.nextLine());
        in.close();

        for (int i = 0; i < array.length; i++) {
            Scanner scan = null;
            array[i] = scan.nextInt();

        }

        Arrays.sort(array);
        System.out.println("Enter the nember you want: ");
        Scanner scan = null;
        int digit = scan.nextInt();
        scan.close();

        while (first <= last) {

            if (array[middle] < digit) {

                first = middle + 1;

            } else if (array[middle] == digit) {

                System.out.format("The next number is %d", digit, middle);
                break;

            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("The digit doesn't not exist in the typed numbers!");
        }
    }
}


