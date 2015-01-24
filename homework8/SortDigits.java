package Random;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by blinky on 24.01.15.
 */

public class SortDigits {

    private int[] array;

    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        String text = in.nextLine();
        in.close();

        System.out.println("Array before sorting: " + Arrays.toString(array));

        Arrays.sort(array);}

    public void setArray(int[] array) {
        this.array = array;
        {

            System.out.printf("Array after sorting in ascending order: %s%n", Arrays.toString(array));


//    public static int binarySearch(long[] a, long key) {
//        int bottom = 0;
//        int top = a.length - 1;
//
//        while (bottom <= top) {
//            int mid = bottom + (top - bottom) / 2;
//            if (key < a[mid]) top = mid - 1;
//            else if (key > a[mid]) bottom = mid + 1;
//            else return mid;
//        }
//        return -1;
        }
    }

}


