/**
* Created by blinky on 08.12.14.
*/
public class homework23 {

    public static void main(String[] args) {

        char[] cards = "0AKQJT98765432AKQJT98765432AKQJT98765432AKQJT98765432".toCharArray(); //T stays for 10 card
        for(int i = 1; i < cards.length; i++)
        {
            System.out.print(cards[i] + " ");
            if (i%4==0)
            {
                System.out.println();
            }
        }
    }
}






