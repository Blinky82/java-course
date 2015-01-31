import java.util.Scanner;
import java.util.Random;

/**
 * Created by blinky on 14.12.14.
 */

//Дефинирайте фунцкия която приема 3 параметъра - цели числа и ги умножава едно с друго. 
//Извикайте функцията 20 пъти с рандом генерирани параметри. 
//Изведете резултата на екрана

public class Parameters {

    public static void print(int a, int b, int c) {

        System.out.println(a + " " + b + " " + c);
        System.out.println("Multiplied numers: " + a b c);
    }

    public static void main(String[] args) {
        Random rn = new Random();

        for (int i = 0; i < 20; i++) {
            print(rn.nextInt(100), rn.nextInt(100), rn.nextInt(100));

        }
    }
}

