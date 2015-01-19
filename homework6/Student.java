package Random;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by blinky on 18.01.15.
 */
public class Student {



     private String firstName;
      private  String lastName;
    private  int id;
    private  int group;


    public void Student(String firstName, String lastName, int id, int group){

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.group = group;

    }

    @Override
    public String toString() {
        return this.firstName + this.lastName + this.id + this.group;
    }
}