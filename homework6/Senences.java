package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blinky on 18.01.15.
 */
public class Senences {

    public static void main(String[] args) {
        String sentance = "Програмист малко съм аз";

        String[] parts = sentance.split(" |,|!");



        for (int j = parts.length - 1; j >= 0; j--){

            System.out.println(parts[j]);
        }
    }
}
