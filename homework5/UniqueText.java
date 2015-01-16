package Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;

/**
 * Created by blinky on 16.01.15.
 */
public class UniqueText {

    public static void main(String[] args) {

        Set s = new HashSet();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text here: ");

        String text = sc.nextLine();

        for(int i=0; i<args.length;i++){
            if(!s.add(args[i]))
                System.out.println("Duplicate detected: " + args[i]);
        }

        System.out.println(s.size() + " distinct words detected : " + s );
    }
}

//    public static void main(String[] args) {
//
//
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter text here: ");
//
//    String text = sc.nextLine();
//
//    private String str;
//
//    Set<String> unique = new HashSet<String>(Arrays.asList(str.toLowerCase().split("[-.,:;?!~\\s]+")));
//
//    String[] words;
//    Set<String> uniqueWords = new HashSet<String>();
//    words = str1.split("[\\W]+ ");
//
//    for(int i = 0; i < words.length; i++)
//
//    {
//        uniqueWords.add(words[i]);
//
//        System.out.println(uniqueWords);
//    }
//}
//        }

