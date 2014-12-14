import java.util.Scanner;

/**
 * Created by blinky on 14.12.14.
 */
public class numbers {

    public static void print(int number){

        Scanner x=new Scanner(System.in);
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Изпълнение на функцията:");

        int n=x.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println(" ");
            System.out.println("Вашето число");
            number=x.nextInt();

            if(number % 2 == 0){
                System.out.println("Четно");
            }
            else{
                System.out.println("Нечетно");
            }
        }
    }
}
