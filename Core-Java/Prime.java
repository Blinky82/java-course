import java.util.*;

/**
 * Created by blinky on 20.02.15.
 */
public class primesInAnInterval {

    public static int main(String[] args) {

        Scanner n = new Scanner(System.in);

            int n1, n2, i, j, flag;

        System.out.println("Enter two numbers(intevals): ");

            int n1 = n.nextInt();
            int n2 = n.nextInt();

            for (i = n1 + 1; i < n2; ++i) {
                flag = 0;
                for (j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("%d ", i);
                }
            }
            return 0;
        }

}
