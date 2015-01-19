package Random;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by blinky on 18.01.15.
 */
public class StudentE {

    public static void main(String[] args) {

        ArrayList<Student> information= new ArrayList<Student>();

        Student first = new Student("Георги", "Иванов", 13, 4);
        Student second = new Student("Сашо", "Георгиев", 2000, 5);
        Student third = new Student("Георги", "Иванов", 4000, 4);
        Student forth = new Student("Георги", "Иванов", 5000, 4);
        Student fifth = new Student("Георги", "Иванов", 6000, 4);

        information.add(first);
        information.add(second);
        information.add(third);
        information.add(forth);
        information.add(fifth);

        for(Student student : information);
        {
            System.out.println(information);

        }

  }
}
