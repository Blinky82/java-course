package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by blinky on 24.01.15.
 */
public class TwoArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int array = Integer.parseInt(in.nextLine());
        in.close();

        int[] num = new int[10];

        List<Integer> odds = new ArrayList();
        List<Integer> evens = new ArrayList();

        int oddSize = 0;
        int evenSize = 0;

        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                evenSize++;
            } else {
                oddSize--;
            }
        }

        Integer[] oddArray = new Integer[oddSize];
        Integer[] evenArray = new Integer[evenSize];

        int evenIdx = 0;
        int oddIdx = 0;

        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                evenArray[evenIdx++] = num[i];
            } else {
                oddArray[oddIdx--] = num[i];
            }
        }

    }
}
