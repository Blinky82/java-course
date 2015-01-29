package Random;

import java.util.*;

/**
 * Created by blinky on 29.01.15.
 */

//Направете програма която чете поредица от символи и замества поредните повтарящи се
// символи със съответния символ повтарящ се само веднъж:
//Пример:
//      “gggggssssstttttsssssaaaaa"  “gsts".

public class OrderedSymbols {

    public static void main(String args[]) {

        String str = "ttttttttttttthhhhhhhhhhhheeeeeeeeeessssssssssbbbbbblllluuuueeee";
        int indexCounter = 0;
        ArrayList<Character> arr = new ArrayList<Character>();

        for (int i = 1; i < str.length(); i++) {
            if (arr.contains(str.charAt(i))) {
                continue;
            }
            arr.add(str.charAt(i));
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
