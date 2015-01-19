package Random;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by blinky on 19.01.15.
 */
public class UpperCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your sentence here: ");

        String sentence = scan.nextLine();
        System.out.println("Type a single word from the sentence you want to see in uppercase: ");
        String changeCase = scan.nextLine();
        scan.close();

        String result = changeCase.toUpperCase(Locale.forLanguageTag(changeCase));

        if (sentence.contains(changeCase)) {

            System.out.println(result);
        }
    }
}
