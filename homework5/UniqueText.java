package Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;

/**
 * Created by blinky on 16.01.15.
 */

//Направете програма, която приема текст и извежда на екрана всички думи, 
//които са уникални (срещат се само веднъж).

public class UniqueText {

   public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      HashMap<String, Integer> wordsM = new HashMap<String, Integer>();
      String tmp = sc.nextLine();
      String[] arr = tmp.split(" ");
  
  for (int i = 0; i < arr.length; i++) {

    if (!wordsM.containsKey(arr[i])) {
    wordsM.put(arr[i], 1);
   } else {
    wordsM.put(arr[i], wordsM.get(arr[i]) + 1);
   }

  }
  for (Map.Entry<String, Integer> entry : wordsM.entrySet()){
   if(entry.getValue()==1){
    
    System.out.println(entry.getKey() + " - " + entry.getValue());
   }
  }
 }
}

