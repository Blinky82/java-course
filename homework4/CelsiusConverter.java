import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */
public class CelsiusConverter {

    public static void main(String[] args) {

        float temp;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperatue in Fahrenheit");
        temp = in.nextInt();

        temp = ((temp - 32)*5)/9;

        System.out.println("Temperatue in Celsius = " + temp);
    }
}


