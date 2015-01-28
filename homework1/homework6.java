import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */

//Класическото тесте карти се състои от 13 различни вида карти съответно 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. 
//Направете програма която приема от конзолата 1 символ и принтира "Валидна карта" 
//ако символът представлява валидна карта и съответно "Невалидна карта" ако символът 
//не представлява валидна карта 

public class homework6 {

    public static void main(String args[]) {

  String[] vid = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
    "Q", "K", "A" };
  Scanner in = new Scanner(System.in);

  System.out.println("Въведи произволна карта: ");
  String inputCard = in.next();

  for (int i = 0; i < vid.length; i++) {
   if (vid[i].equalsIgnoreCase(inputCard)) {
    System.out.println("Валидна карта:");
    return;
   }
  }
  System.out.println("Невалидна карта");
 }
}
