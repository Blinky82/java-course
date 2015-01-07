import java.util.*;

/**
* Created by blinky on 05.01.15.
*/
public class Cards {

    public static void main(String[] args) {

        int[] deck = new int[52];
        String[] suit = {"Diamonds", "Spades", "Clubs", "Hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int s = suit.length; // s - suit - боя
        int r = rank.length; // r - rank - карта

        int x = s * r;

        String[] Deck = new String[x];

        for (int i = 0; i < s; i++)

        {
            for (int j = 0; j < r; j++) {
                Deck[(r * i) + j] = r[j] + "от" + s[i];
            }

            for (int i = 0; i < x; i++)

                System.out.println(deck[i]);

            Scanner scan = new Scanner(System.in);

            int y;

            System.out.println("Напишете цифра: ");
            y = scan.nextInt();
            y = y - 1;

            System.out.println("Вашата карта е: " + deck[y]);
        }

    }
}