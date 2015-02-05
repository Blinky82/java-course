import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

//Направете програма която приема от конзолата 5 държави и съответно техните столици. 
//След като потребителят въведе информацията, запишете държавите във файл с име countries.txt, 
//а столиците в друг файл – cities.txt

public class Countries {

	    String Countries, Cities;

		public static void main(String[] args) {

			String filePath = "../countries.txt";
			String filePath2 = "../cities.txt";

			try {

//				FileWriter fileStream = new FileWriter(filePath,true);
				
				FileWriter filePath = new filePath(filePath);
				BufferedWriter writer = new BufferedWriter(filePath);
				Scanner get = new Scanner(System.in);
				
				for (int i = 0; i < 5; i++) {
					int Countries = get.nextLine();
					writer.write(Integer.toString(number));
					writer.newLine();
				}
				
				writer.close();
				
			} catch (Exception e) {
				System.out.println("There is an error!");
				System.out.println(e.getMessage());
			}
			
			System.out.print("The files are saved! \n");
		}

	}

