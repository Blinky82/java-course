package Random;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

/**
 * Created by blinky on 24.01.15.
 */

//Направете програма, която приема изречение и подрежда по азбучен ред всички думи от него.

public class ClassAtoB {
     
     public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        Stack<String> Stack = new Stack<String>();

        Scanner in = new  Scanner (System.in);

        System.out.println("Enter a string: ");

        String text = in.nextLine();
        in.close();

        char[] toChar = text.toCharArray();

        for(char ch : toChar ){
            String currentChar = Character.toString(ch);
            if(currentChar.equals(currentChar.toUpperCase())){
                Stack.add(currentChar);
            }
            else if(currentChar.equals(currentChar.toLowerCase())){
                queue.add(currentChar);
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove());
        }

        System.out.println();
        while(!Stack.isEmpty()){

            String current = Stack.pop();
            System.out.print(current);

        }

    }
}
