import java.util.Scanner;

/**
 * Created by blinky on 23.02.15.
 */
public class Substring {

    public static class SmallestSubstringContainingTheAlphabet {

        public static void smallestSubstringContainingTheAlphabet(String str) {

            char[] ch = str.toCharArray().clone();
            char temp;
            for (int i = 1; i < ch.length; i++) {

                for (int j = 0; j < ch.length - 1; j++) {

                    if(ch[j] > ch[j+1]) {

                        temp = ch[j];
                        ch[j] = ch[j+1];
                        ch[j+1] = temp;
                        if (ch[i - 1] == ch[i])
                        {
                            ch[i]='\0';
                            if (ch[i - 1] == ch[i])
                            {
                                ch[i]='\0';
                            }
                        }
                    }
                }
            }
            System.out.println(ch);
        }

        public static void main(String[] args) {

            String str;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter String:");
            str = sc.next().toLowerCase();

            smallestSubstringContainingTheAlphabet(str);
            sc.close();
        }
    }
}
