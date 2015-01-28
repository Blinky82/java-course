package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 18.01.15.
 */
public class Senences {

    public static void main(String[] args) {
      // String sentеnce =
     // "Програмист малко съм аз. Тествам парсване на изреченията? Мне! Не мога да тествам това.";

       System.out.println("Напиши изречение");
       Scanner input = new Scanner(System.in);
       String sentеnce = input.nextLine();

       System.out.println("Напиши дума");
       String wordToFind = input.next();
       String[] parts = sentеnce.split("[.!?]");
 
    for (int j = 0; j < parts.length; j++) {
       if(parts[j].contains(wordToFind))
   
        System.out.println(parts[j]);
  }
}

