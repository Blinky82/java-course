import java.util.Scanner;

/**
 * Created by blinky on 14.12.14.
 */

//Дефинирайте функция която приема 1 параметър - число и принтира на екрана "четно" 
//ако числото е четно и "нечетно" ако числото е нечетно. 
//Демонстрирайте действието на фукцията с няколкопримера.

public class numbers {

    public static void print(int number) {

  if (number % 2 == 0) {
   System.out.println("Четно");
  } else {
   System.out.println("Нечетно");
  }
 }

 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  System.out.println("Брой числа");
  
  int n = scanner.nextInt();
  int num;
  
  for (int i = 0; i < n; i++) {
   
   System.out.println("Вашето число");
   num = scanner.nextInt();
   print(num);
  }
}
