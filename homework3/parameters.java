import java.util.Scanner;

import java.util.Random;

/**
 * Created by blinky on 14.12.14.
 */
public class parameters {

    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            int par1 = rand.nextInt();
            int par2 = rand.nextInt();
            int par3 = rand.nextInt();
            calculatePar(par1,par2,par3);
            printPar(par1, par2, par3);
        }
    }
    public static int calculatePar(int par1, int par2, int par3){
        int calc = par1 * par2 * par3;
        return calc;
    }
    public static void printPar(int par1, int par2, int par3){
        System.out.printf("param1 %d * par2 %d * par3 %d", par1, par2, par3);
        System.out.println();
    }
}

