package Random;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by blinky on 24.01.15.
 */

//Направете програма, която приема 10 числа. 
//Подредете във възходящ ред всички четни числа в масив. 
//Подредете всички нечетни числа в нискодящ ред в друг масив

public class SortDigits {

    private int[] array;

    public static void main(String[] args) {

  int[] odd = new int[10];
  int[] even = new int[10];
  int currOddPos = 0;
  int currEvenPos = 0;
  Scanner in = new Scanner(System.in);
  int tmp = 0;
  
  for (int i = 0; i < 10; i++) {
   tmp = in.nextInt();
  
  if (tmp % 2 == 0) {
    even[currEvenPos] = tmp;
    currEvenPos++;
   } else {
    odd[currOddPos] = tmp;
    currOddPos++;
   }
  }

  Arrays.sort(odd);
  Arrays.sort(even);
  for(int i = 0; i < even.length/2; i++) {
 
      int temp = even[i];
      even[i] = even[even.length - i - 1];
      even[even.length - i - 1] = temp;
  }
  System.out.println("Odd numbers");
  for(int i = 0 ;i < currOddPos;i++) {

   System.out.println(odd[i]);
  }
  System.out.println("Even numbers");
  for(int i = 0;i < currEvenPos;i++) {
 
   System.out.println(even[i]);
  }
 }
}

