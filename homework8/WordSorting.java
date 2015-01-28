package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by blinky on 24.01.15.
 */
public class WordSorting {

    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  String sentence = scan.nextLine();
  String[] words = sentence.split("\\s+");
  Arrays.sort(words);
  
  for(String tmp : words){
   System.out.println(tmp);
  }
 }
}
