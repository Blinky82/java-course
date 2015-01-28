import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */

//Направете програма, която приема 20 думи и принтира на екрана думите които са въведени повече от един път.

public class words {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  ArrayList<String> words = new ArrayList<String>();
  
 for (int i = 0; i < 20; i++) {
   words.add(input.next());
  }
  Collections.sort(words);
  
  for (int i = 0; i < words.size() - 1; i++) {
    while (i<words.size() - 1 && words.get(i).equals(words.get(i + 1))) {
    System.out.println("Repeated word is: " + words.get(i));
    i++;
   }
}


