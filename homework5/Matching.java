package Random;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by blinky on 16.01.15.
 */
public class Matching {

    public static void main(String[] args) {


        String[] words = new String[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0, i < words.length;, i++){

            System.out.println("Enter " + (i + 1) + " a word here!");
            words[i] = sc.nextLine();

        }

        HashMap<String, String> wordsM = new HashMap<String, String>();

        for(String  matching : words){

            String counter = wordsM.get(matching);

            if(counter == null);

            wordsM.put(matching, counter +1);
        }

        System.out.println(wordsM);
    }
}

