/**
 * Created by blinky on 01.12.14.
 */


import java.util.Scanner;

class RazmianaStoinost
{
    public static void main(String args[])
    {
        int a=1, b=3, temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Преди: \nb = "+a+"\nb = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("След: \na = "+a+"\nb = "+b);
    }
}