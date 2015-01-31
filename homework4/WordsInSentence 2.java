import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */

public class WordsInSentence {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.next();
        String tmp;

        for (int i = 0; i < 5; i++) {
            tmp = in.next();
            if (!word.contains(tmp)) {

                System.out.println("Word does not contain " + tmp);
            }
        }

        System.out.println("All symbols are contained");

    }
}
