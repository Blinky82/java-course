package Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashMap;

/**
 * Created by blinky on 16.01.15.
 */
public class AlphabeticalWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        System.out.println( "Please enter a line of text" );

        String userInput = sc.nextLine();

        userInput = userInput.toLowerCase();

        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(userInput.split(" ")));

        userInput = userInput.replaceAll( "\\W", " " );
        userInput = userInput.replaceAll( "  ", " " );

        String[] tokens = userInput.split( " " );
        System.out.println( userInput );


        ArrayList< String > items = new ArrayList< String >();

        items.addAll( Arrays.asList( tokens ) );

        int count = 0;

        for( int i = 0; i < items.size(); i++ )
        {
            System.out.printf( "%s: ", items.get( i ) );
            for( int j = 0; j < items.size(); j++ )
            {
                if( items.get( i ).equals( items.get( j ) ) )
                    count++;
                if( items.get( i ).equals( items.get( j ) ) && count > 1 )
                    items.remove( j );
            }
            System.out.printf( "%d\n", count );
            count = 0;
        }
    }
}

