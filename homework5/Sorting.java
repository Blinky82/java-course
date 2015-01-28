package Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by blinky on 16.01.15.
 */

//Направете програма, която приема първо размер на integer масив, 
//а след това и цислата на масива.  Сортирайте масива и го изведете на екрана

    public class Sorting {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the nubmer of digits: ");

            int x=sc.nextInt();
            int[]array=new int[x];

            for (int i = 0; i < x; i++) {

                System.out.println("Enter " +( i+1) + " digit here: ");
                array[i]=sc.nextInt();
            }

            Arrays.sort(array);

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+ " ");
            }
        }
    }
