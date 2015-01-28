package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 19.01.15.
 */

//Направете програма която извлича от подаден текст всички изречения които съдържат дадена дума.

public class FindWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text here: ");
        String sentence = scan.nextLine();

        System.out.println("Enter your word here: ");

        String word = scan.nextLine();
        scan.close();
  
        int counter = 0;
        String[] words = sentence.split("\\s+");

    for (int i = 0; i < words.length; i++) {
   
     if (words[i].toLowerCase().contains(word.toLowerCase())) {
     counter++;
   }
  }
  System.out.println("The sentence contains your word: " + word + " - "
    + counter);
        }
    }
}
