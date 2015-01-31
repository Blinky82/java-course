/**
 * Created by blinky on 08.12.14.
 */

//Направете програма която принитра на конзолата всички карти 
//от стандартанта колода за игра. Подредете информацията в 13 реда и 4 колони

public class Cards {

    public static void main(String[] args) {

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
                "Q", "K", "A"};

        for (int j = 0; j < 4; j++)
            for (int i = 1; i <= cards.length; i++) {

                System.out.print(cards[i - 1] + " ");

                if ((i * cards.length + j) % 4 == 0) {
                    System.out.println();
                }
            }
    }
}





