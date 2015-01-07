/**
 * Created by blinky on 06.01.15.
 */

import java.util.Scanner;
public class WordsInSentence {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Your sentence: ");

            String words = in.nextLine();
            System.out.print("The words in your sentence are " + countWords(words));
        }
        public static int countWords(String words){
            int res=0;

            for (int i=0;i<=words.length()-1;i++)
            {
                if (words.charAt(i) == ' '|| words.charAt(i) == ',' || words.charAt(i)==':' )
                {
                    res++;
                }
            }
            return res;
        }
    }
