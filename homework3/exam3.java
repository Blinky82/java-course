import java.util.Scanner;

/**
 * Created by blinky on 14.12.14.
 */
public class exam3 {

    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Вкарайте число от 10 до 30 000:");
        int digit=x.nextInt();

        if(digit >= 10 && digit <= 30000){
            y(digit);

            System.out.println(y(digit));
        }
        else{
            System.out.println("Числото е извън интервала 10-30 000:");
        }
    }
    public static int y(int digit){
        if(digit == 0 )
            return 0;
        else
        {
            return digit+y(digit-1);
        }
    }


}