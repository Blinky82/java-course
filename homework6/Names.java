package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 18.01.15.
 */
public class Names {

    public static void main(String[] args) {

        String peopleNames = new String();

        String[] names = {"George, Ann, Peter, Steve, Mary"};
        String x = "George is an advanced programmer";


        for (String string : names) {
            if (x.startsWith(string)) {
                System.out.println("The sentense starts with: ");
            } else if (x.endsWith(string)) {
                System.out.println("The sentense ends with: ");
            } else if (x.contains(string)) {
                System.out.println("The sentense contains: ");
            }


        }

    }
}
//        ArrayList<String> names = new ArrayList<String> ();
//
//        names.add("George");
//        names.add("Ann");
//        names.add("Peter");
//        names.add("Steve");
//        names.add("Mary");
//
//        String[]namesX  = {"George, Ann, Peter, Steve, Mary"};
//
//        for (String string : names)
//
//        boolean startsWith = example1.startsWith("George");
//
//        Scanner cs = new Scanner(System.in);
//        System.out.println( "Please enter a line of names: ");
