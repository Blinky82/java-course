package Random;

import java.util.Arrays;

/**
 * Created by blinky on 24.01.15.
 */
public class BucketSort {

    public static void sort(int[] a, int maxVal) {
        int [] bucket = new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }


    public static void main(String[] args) {
        int maxVal = 5;
        int [] data= {6,3,0,2,3,1,0,5,8,3,9,4};

        System.out.println("Before: " + Arrays.toString(data));
        sort(data,maxVal);
        System.out.println("After:  " + Arrays.toString(data));
    }
}

