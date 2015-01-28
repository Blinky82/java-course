import java.util.Scanner;
/**
 * Created by blinky on 08.12.14.
 */

//Направете програма която приема 5 положителни числа от конзолата и намира най-голямото от тях.

public class homework24 {

    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  int[] arr = new int[5];
  
  for(int i =0;i<arr.length;i++){
   
  arr[i]=scanner.nextInt();
  }
  int maxVal=arr[0];
  
  for(int i=0;i<arr.length;i++){

   if(maxVal<arr[i]){
    maxVal=arr[i];
   }
  }
  System.out.println("Max val: "+maxVal);
 }
}
