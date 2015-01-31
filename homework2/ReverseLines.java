/**
 * Created by blinky on 08.12.14.
 */

//Направете програма, която принтира на екрана числата от 30 до 1 
//в обратен ред подредени в 5 реда и 6 колони

public class ReverseLines {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;
        int counter = 30;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                System.out.print(counter + " ");

                counter--;

            }

            System.out.println();
        }
    }
}
