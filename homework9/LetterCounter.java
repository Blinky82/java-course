package Random;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.*;

/**
* Created by blinky on 29.01.15.
*/

//Направете програма която приема дума от конзолата и извежда номера на всяка нейна буква.

public class LetterCounter {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter your word here: ");
        String word = str.nextLine();
        str.close();

        System.out.println("The word is " + str);

        char[] lettercount = word.toCharArray();
        int theNumbers = 1;

        for (int k = 0; k < lettercount.length; k++) {

//            if (Character.isLetter(str.lettercountAt(k))) {
//                char[] chars = new char[str.charAt(k)];
//                lettercount[chars[k] - 'a']++;
//            }
//
//        }

//              System.out.println("A = " + lettercount[0] + " B = " + lettercount[1]);

            System.out.println("Number of: '%c' is %d. ", lettercount[k], theNumbers);
            theNumbers++;
        }
    }
}
