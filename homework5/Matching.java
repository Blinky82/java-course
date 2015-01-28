package Random;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by blinky on 16.01.15.
 */

//Направете програма, която приема 20 думи и показва по колко пъти се среща всяка една от тях.

public class Matching {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> wordsM = new HashMap<String, Integer>();
    String tmp;
  
  for (int i = 0; i < 20; i++) {

   System.out.println("Enter " + (i + 1) + " a word here!");
   tmp = sc.next();
   
   if (!wordsM.containsKey(tmp)) {
    wordsM.put(tmp, 1);
   } else {
    wordsM.put(tmp, wordsM.get(tmp) + 1);
   }

  }

  System.out.println(wordsM);
 }
}

