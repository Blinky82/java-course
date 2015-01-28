package Random;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by blinky on 24.01.15.
 */

//Направете програма, която приема 30 числа и намира всички тройки еднакви числа.

public class TripleDigits {

    public static void printAllTriple(int[] a) {
  int N = a.length;
  for (int i = 0; i < N; i++) {
   for (int j = i + 1; j < N; j++) {
    for (int k = j + 1; k < N; k++) {
     if (a[i]== a[j]&&a[j]==a[k]&&a[i] == a[k]) {
      System.out.println(a[i] + " " + a[j] + " " + a[k]);
     }
    }
   }
  }
 }
 public static void main(String[] args) {
  
  System.out.println("Enter numbers: ");
  Scanner in=new Scanner(System.in);
  int n=30;
  int []arr=new int [n];
  
  for(int i = 0;i < n;i++) {
  
   arr[i]=in.nextInt();
  }
  printAllTriple(arr);
 }
}
