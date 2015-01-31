/**
 * Created by blinky on 01.12.14.
 */

//Дефинирайте две int променливи със стойности съответно 1 и 3. 
//Опитайте се да размените техните стойности.

import java.util.Scanner;

public class ChangeValue {

    public static void main(String args[]) {
        
        int a = 1, b = 3, temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Преди: \nb = "+a+"\nb = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("След: \na = "+a+"\nb = "+b);
    }
}
