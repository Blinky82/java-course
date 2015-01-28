import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */

//Направете програма, която приема 3 цели числа. 
//Изведете на конзолата дали може да бъде бъде образуван триъгълник с дължини на страните съответни 3 числа.

public class homework2 {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  int s1;
  int s2;
  int s3;

  System.out.print("Въведете първата страна на триъгълника: ");
  s1 = input.nextInt();

  System.out.print("Въведете втората страна на триъгълника: ");
  s2 = input.nextInt();

  System.out.print("Въведете третата страна на триъгълника: ");
  s3 = input.nextInt();

  if (s1 + s2 <= s3) {
   System.out.print("Тези стойности не могат да сформират триъгълник");
  } else if (s1 + s3 <= s2) {
   System.out.print("Тези стойности не могат да сформират триъгълник");
  } else if (s2 + s3 <= s1) {
   System.out.print("Тези стойности не могат да сформират триъгълник");
  } else
   System.out.print("Тези стойности могат да сформират триъгълник");

 }
}
