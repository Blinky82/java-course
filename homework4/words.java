/**
 * Created by blinky on 06.01.15.
 */

import java.util.Scanner;

public class words

{

    public static void main(String []args)

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String s1= sc.nextLine();

        String s2=s1.replace(" ","");
        char [] ch=s2.toCharArray();

        int counter=0;

        for(int i=0;i<ch.length;i++)
        {
            int count=0;

            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    count++;
            }
            if(count>1)
            {
                boolean flag=false;


                for (int k=i-1;k>=0 ;k-- )
                {
                    if(ch[i] == ch[k] )
                        flag=true;
                }
                if( !flag )
                    counter=counter+1;
            }
        }
        if(counter > 0)
            System.out.println("Number of repeating charcters in the given string is/are " +counter);
        else
            System.out.println("Sorry there is/are no repeating words!");
    }
}
