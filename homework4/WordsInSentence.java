 import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */

public class WordsInSentence {

 public static int maxMonotonicSequenceLength(int[] elements) {

  int maxValue = 0;
  int positionOfMax = 0;
  int length = 2;

  for (int i = 2; i < elements.length; ++i) {
   if (elements[i] < maxValue) {
    
    int count = 1;
    int previousMaxElement = 0;

    for (int j = 1; j <= i - 1; ++j) {
     if ((elements[j] < elements[i])
       && previousMaxElement < elements[j]) {

      previousMaxElement = elements[j];
      count = count + 1;
      
    if (length < count) {
       length = count;
       positionOfMax = j;
       maxValue = elements[j];
      }
     }
    }
   } else {
    positionOfMax = i;
    maxValue = elements[i];
    length = length + 1;
   }
  }
  System.out.println("Position of max: " + positionOfMax);
  for(int i = positionOfMax+1-length;i <= positionOfMax; i++)
  {
   System.out.println(elements[i]);
  }
  return length;
 }

 public static void main(String[] args) {
  
 Scanner input = new Scanner(System.in);
  int[] numbers = new int[10];

  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextInt();
  }
  System.out.println(maxMonotonicSequenceLength(numbers));

 }
}

----

//Направете програма която приема изречение и брои колко думи има в него.

public class WordsInSentence {

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Your sentence: ");

  String words = in.nextLine();
  System.out.print("The words in your sentence are " + countWords(words));
 }

 public static int countWords(String words) {
  int res = 0;

  for (int i = 0; i <= words.length() - 1; i++) {
   if (words.charAt(i) == ' ' || words.charAt(i) == ','
     || words.charAt(i) == ':') {
    res++;
   }
  }
  res++;
  return res;
 }
