import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */

//Създайте програма, която изчислява бонус точки на база резултат от игра.
//Потребителят трябва да въведе своите точни в интервалa[1,;9].
//Ако точките са в интервала [1;3] Умножете ги по 5.
//Ако точките са в интервала [4;6] Умножете ги по 10.
//Ако точките са в интервала [7;9] Умножете ги по 50.
//Резултатът изведете на екрана.

class GameBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете вашите точки тук:");

        int x = scanner.nextInt();
        int y = 0;

            if (1 <= x && x <= 3) {
                y = x * 5;
                     } else if (4 <= x && x <= 7) {
                     y = x * 10;
                        } else if (7 <= x && x <= 9) {
                         y = x * 50;
                            }

        System.out.println("Вашият резултат е: "+y);

    }
}
