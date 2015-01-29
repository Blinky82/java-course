package Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
* Created by blinky on 25.01.15.
*/

//Направете програма, която приема 20 числа и намира тройката поредни числа с най-голяма сума.

public class TwentyArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] mass = new int[20];
        int maxSumStartIndext = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scan.nextInt();
            System.out.println(mass[i]);
        }

        for (int i = 2; i < mass.length; i++) {

            int currentSum = mass[i] + mass[i - 1] + mass[i - 2];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxSumStartIndext = i - 2;
            }
        }
        System.out.println("Max sum: " + maxSum + " " + mass[maxSumStartIndext]
                + " " + mass[maxSumStartIndext + 1] + " "
                + mass[maxSumStartIndext + 2]);

    }
}