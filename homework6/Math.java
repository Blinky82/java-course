package Random;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 18.01.15.
 */
public class Math {

    public void main(String[] args) {


        String brackets = "4 * (5 - 2) + 6/(2 * (2 + 15))";
        char ch = brackets.charAt(brackets.indexOf('('));
        char ch2 = brackets.charAt(brackets.indexOf(')'));
        int count = 0;

        for (int i = 0; i < brackets.length(); i++) {

            if (brackets.charAt(i) % 2 == 1 && ch == ch2) {
                count = count + 1;
                System.out.println("The formula is correct");

            } else {
                System.out.println("The formula is wrong");

            }
        }
    }
}


