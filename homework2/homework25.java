import java.util.Scanner;

/**
 * Created by blinky on 09.12.14.
 */
public class homework25 {

    public static void main(String[] args) {

            int c, d, e;

            Scanner in = new Scanner(System.in);
            Scanner input = new Scanner(System.in, "UTF-8");

        int[] num = new int[5];

            System.out.println("Въведете " + 5 + " числа:");

            for (c = 0; c < 5; c++)
                num[c] = in.nextInt();

            for (c = 0; c < ( 5 - 1 ); c++) {
                for (d = 0; d < 5 - c - 1; d++) {
                    if (num[d] < num[d+1])
                    {
                        e       = num[d];
                        num[d]   = num[d+1];
                        num[d+1] = e;
                    }
                }
            }

            System.out.println("Подредба по големина:");

            for (c = 0; c < 5; c++)
                System.out.println(num[c]);
        }
    }