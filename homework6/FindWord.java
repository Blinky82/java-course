package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 19.01.15.
 */
public class FindWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text here:");
        String sentence = scan.nextLine();

        System.out.println("Enter your word here: ");

        String word = scan.nextLine();
        scan.close();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].replaceAll("[^\\w]", "");

            String[] splitSentence = new String[0];

            if (splitSentence[i].toLowerCase().contains(word.toLowerCase())) {

                System.out.println("The sentence contains your word: "
                        + splitSentence[i]);

            }
        }
    }
}