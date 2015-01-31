import java.util.Scanner;

/**
 * Created by blinky on 01.12.14.
 */
public class CompanyDb {

//Компания се нуждае от система за съхранение на информация за служители.  
//Направете програма, която изисква следната информация: 
//Име, Фамилия, Години (0, 120), пол (еднобуквен 'м' или 'ж'), ЕГН, телефон. 
//Подберете подходящите типове данни и декларирайте нужните променливи. 
//Прочетете от конзолата нужната иформация за служител и след това я изведете на конзолата

        public static void main(String[] args) {

        String firstName ="";
        String lastName ="";
        int age;
        String sex;
        String id;
        String phone;

        Scanner input = new Scanner(System.in);

        System.out.println("Въведи името на служителя:");
        firstName = input.next();

        System.out.println("Въведи фамилия на служителя:");
        lastName = input.next();

        System.out.println("Въведи години на служителя:");
        age = input.nextInt();

        if (age > 120) {
            System.out.println("Вие шегувате ли се?");
        }

        System.out.println("Въведи пол на служителя (м или ж):");
        sex = input.next();
        
        if(!sex.equals("М")&&!sex.equals("Ж")) {
        
         System.out.println("Къв си ти бе изрод");
        }

        System.out.println("Въведи ЕГН на служителя:");
        id = input.next();

        System.out.println("Въведи телефон на служителя:");
        phone = input.next();

        System.out.println("Името на служителя е:" + firstName);
        System.out.println("Фамиалята на служителя е:" + lastName);
        System.out.println("Служителя е на:" + age + "години");
        System.out.println("Служителят е:" + sex);
        System.out.println("ЕГН на служителя e:" + id);
        System.out.println("Телефонът на служителя е:" + phone);
    }
}
