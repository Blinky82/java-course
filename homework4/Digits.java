/**
 * Created by blinky on 06.01.15.
 */

import java.util.Scanner;

public class Digits {



        public static void main (String args[])

        {
            int digits;
        System.out.print("Enter a number = ");

        Scanner in = new Scanner(System.in);
        int[] digits = in.nextInt();

    }

    for (int i = 0; i < digits.length; i++)
    {
        digits[i] = in.nextInt();
    }
    in.close();
    arr(digits);
}
    public static void arr(int[] array) {
        int x = 0, start = 0, num = array[0];
        boolean counter = true;
        int[] last = new int[array.length];
        int y = 0, last = 0;
        while (counter) {
            if (num < array[x + 1]) {
                start = x + 1;
                y++;
                num = array[x + 1];
            } else if (array[x] >= array[x + 1]) {
                num = array[x + 1];
                if (y > last) {
                    for (int j = 0; j < y + 1; j++) {
                        last[j] = array[start - y];
                        start++;
                    }
                    last = y;
                }
                y = 0;
            }
            x++;
            if (x == array.length - 1) {
                counter = false;
            }
        }
        for (int k = 0; k < last + 1; k++) {
            System.out.printf("%d ", last[k]);
        }
    }
}