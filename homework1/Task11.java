import java.util.Scanner;

/**
 * Created by blinky on 30.11.14.
 */


public class task {

   public static void main(String[] args) {

  int a;
  int b;

  Scanner input = new Scanner(System.in);

  System.out.println("Въведете стойност за a:");
  a = input.nextInt();
  System.out.println("Въведете стойност за b:");
  b = input.nextInt();

  if (b <= a) {
   System.out.println("Невалиден вход");
  }

  for (int n = a; n < b; n++) {

   if (n % 3 == 0) {
    System.out.println(n);
   }
  }
}
