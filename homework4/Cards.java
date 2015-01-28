import java.util.*;

/**
* Created by blinky on 05.01.15.
*/

//Направете програма която приема число от 1 до 52 и изкарва на 
//екрана на коя карта от тестето карти отговаря числото

public class Cards {

 public static void main(String[] args) {
  
  String[] suit = { "Spades", "Diamonds", "Clubs", "Hearts" };
  String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
    "Queen", "King", "Ace" };
  
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();

  System.out.println("Yout card is: " + rank[number % 13] + " " + suit[number / 13]);

 }
}
