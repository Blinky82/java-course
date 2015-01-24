package Random;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blinky on 24.01.15.
 */
public class TripleDigits {

    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    ArrayList<String> lines = new ArrayList<String>();

    public static void printAllTriple(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
}
