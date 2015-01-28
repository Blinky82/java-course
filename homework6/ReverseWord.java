package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 19.01.15.
 */

//Направете програма която приема дума и я извежда на екрана нейните букви в обратен ред.

public class ReverseWord {

    public static void main(String args[]) {
    
        String org, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word to reverse it: ");
        org = in.nextLine();

        int length = org.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + org.charAt(i);

        System.out.println("Reverse of entered string is: "+reverse);
    }

}
