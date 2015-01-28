package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashMap;

/**
 * Created by blinky on 16.01.15.
 */

//Направете програма, която приема текст и извежда на екрана всички думи, 
//подредени по азбучен ред. Думите, които се срещат поче от веднъж трябва 
//да бъдат изведени само един път

public class AlphabeticalWords {

    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter a line of text");

  String userInput = sc.nextLine();

  userInput = userInput.toLowerCase();

  userInput = userInput.replaceAll("\\W", " ");
  userInput = userInput.replaceAll("  ", " ");

  String[] tokens = userInput.split(" ");
  System.out.println(userInput);

  ArrayList<String> items = new ArrayList<String>();

  items.addAll(Arrays.asList(tokens));

  Collections.sort(items);
  ArrayList<String> writtenWords = new ArrayList<String>();
   
  for (int i = 0; i < items.size(); i++) {
     if (!writtenWords.contains(items.get(i))) {
    
    System.out.println(items.get(i));
    writtenWords.add(items.get(i));
   
   }
  }
}

