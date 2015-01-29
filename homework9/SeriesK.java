package Random;

import java.util.Scanner;
import java.util.ArrayList;

//Направете програма която приема масив от 20 числа и едно число K.
//Намерете дали в масива има поредица, чията сума е K:
//{4, 3, 1, 4, 2, 5, 8}, K=11  {4, 2, 5}

/**
* Created by blinky on 28.01.15.
*/
public class SeriesK {

    public static void main(String[] args) {

        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int n = 20;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        System.out.println("SUm is: " + sum);
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == sum) {
                System.out.println("Number and index: " + arr[i] + " " + i);
            } else if (currSum > sum) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    System.out.println("First number, index and length: "
                            + arr[i] + " " + i + " " + (j - i + 1));
                } else if (currSum > sum) {
                    currSum = 0;
                    break;
                }

            }

        }
    }
}