import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */
public class homework3 {

        public static void main(String[] args) {

            String firstName ="";
            String lastName ="";
            int age;
            int sex;
            int id;
            int phone;

            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in, "UTF-8");

            System.out.println("Въведи името на служителя:");
            firstName = input.nextLine();

            System.out.println("Въведи фамилия на служителя:");
            lastName = input.nextLine();

            System.out.println("Въведи години на служителя:");
            age = input.nextInt();

            if (age > 120) {
                System.out.println("Вие шегувате ли се?");
            }

            System.out.println("Въведи пол на служителя (м или ж):");
            sex = input.nextInt();

            System.out.println("Въведи ЕГН на служителя:");
            id = input.nextInt();

            System.out.println("Въведи телефон на служителя:");
            phone = input.nextInt();

            System.out.println("Името на служителя е:" + firstName);
            System.out.println("Фамиалята на служителя е:" + lastName);
            System.out.println("Служителя е на:" + age + "години");
            System.out.println("Служителят е:" + sex);
            System.out.println("ЕГН на служителя e:" + id);
            System.out.println("Телефонът на служителя е:" + phone);
        }

}
