package Random;

import java.util.Scanner;


/**
 * Created by blinky on 19.01.15.
 */
public class WordsCounter {


    private static void main(Scanner in) {

        Scanner input;

        System.out.println("Enter a string here: ");
        String input = in.nextLine();


        System.out.println("Error -- You must enter a sentence!");
        System.out.println("Enter a words here: ");
        input = in.nextLine();

        String[] wordArr = input.split(" |,|\\?|!|\\.");
    }



    public static int getWordCount(String input) {

        int wordCount = 0;


        for (i = 0; i <= input.length() - 1; i++) {

        }

        if (input.charAt(i) == ' ') {

            wordCount++;
        }


        return wordCount;


        System.out.println("The number of words in the string is: " + wordCount);

    }

}