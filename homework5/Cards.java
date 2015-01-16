package Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/**
 * Created by blinky on 16.01.15.
 */
public class Cards {

    public static void main(String[] args) {
        int[] cards = new int[52];

        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King" };

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> hand = new ArrayList<String>();

        for( int i = 0; i < cards.length; i++)
        {
            cards[i] = i;
        }
        for( int i = 0; i < cards.length; i++)
        {
            int index = (int)(Math.random() * cards.length);
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
        System.out.println("Your hand of 5 cards is:");

        for( int i = 0; i < 5; i++)
        {
            String card = (ranks[cards[i] % 13]+" of "+suits[cards[i] / 13]);
            System.out.println(card);
            hand.add(ranks[cards[i] % 13]);
        }
        for(String p:hand)
        {
            if(map.get(p)==null)
            {
                map.put(p, 1);
            }
            else
            {
                Integer tmp = map.get(p);
                map.put(p, tmp+1);
            }
        }

        System.out.println("Your hand is: "+map);
        System.out.println("\nYou hold:");
        Set<String> handKeys = map.keySet();

        for (String card : handKeys)

        {
            int count = map.get(card);
            if(count==4)

            {
                System.out.printf("%s : %d -> Box.\n", card, count);
                break;
            }
            else if (count==3)
            {
                System.out.printf("%s : %d -> Set.\n", card, count);
                break;
            }
            while (count==2)
            {
                System.out.printf("%s : %d -> Pair.\n", card, count);
                break;
            }
            System.out.println("Good hand");
        }
    }
}
