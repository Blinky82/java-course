package Random;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by blinky on 19.01.15.
 */

//Направете програма която приема дума а след това текст. 
//Изведете на екрана текста като замениете всяко срещане на 
//думата с нейният вариянт в uppercase

public class UpperCase {

    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  System.out.println("Type a single word from the sentence you want to see in uppercase: ");
  String sentence = scan.nextLine();
   
  System.out.println("Type your sentence here: ");
  String changeCase = scan.nextLine();
  System.out.println(sentence.replaceAll(changeCase,
    changeCase.toUpperCase()));
  scan.close();

 }
}
