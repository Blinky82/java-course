package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
* Created by blinky on 25.01.15.
*/

//Направете програма, която приема 2 масива от конзолата и извежда броя на съвпадащи числа.

public class Arrays {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int firstArrLen = input.nextInt();
        int secondArrLen = input.nextInt();

        int[] firstArr = new int[firstArrLen];
        int[] secondArr = new int[secondArrLen];

        for (int i = 0; i < firstArrLen; i++) {
            firstArr[i] = input.nextInt();
        }
        for (int i = 0; i < secondArrLen; i++) {
            secondArr[i] = input.nextInt();
        }
        int counter = 0;

        for (int i = 0; i < firstArrLen; i++) {
            for (int j = 0; j < secondArrLen; j++) {
                if (firstArr[i] == secondArr[j]) {
                    counter++;
                }
            }
        }
        System.out.println("Count of repeating numbers " + counter);

    }
}
