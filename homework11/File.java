import java.io.*;
import java.util.*;
import java.nio.*;

//В папка files ще намерите файл с име students.txt, където на всеки ред има име и фамилия на един студент. 
//Направете програма, която чете този файл и за всеки студент създава нов обект (от предварително създаден клас)
//и вкарва обекта в лист. След изчитането на целия документ обходете масива и изведете в конзолата името и 
//фамилията на всички студенти подредени по азбучен ред спрямо фамилията.

//Не са позволени модификации по файла.

public class File {
	
	public static void main(String[] args) throws IOException
    {
		
		private String name;
    	private String family;
    	private  String student = name + family;

    	StringBuffer sb = new StringBuffer(student);
    	System.out.println(sb.reverse());
    	
        try {
            File inputFile = new File("students.txt");
            if (!inputFile.exists()){
            	
                System.out.println("File students.txt was not found.");
                System.exit(0);
            }

            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            String line;
            List<String> stl = new LinkedList();
            while(true){
                line=input.readLine();
                if(line!=null&&line.length() > 1)
                stl.add(line);
                if(line == null)
                    break;
            }

            family = new String[stl.size()];
            for (int i=0;i<stl.size();i++) {
                family[i]=stl.get(i);
            }

            Arrays.sort(family);
            for (String string : family) {
                System.out.println(string);
            }

            File nameSort = new File("SortedByFamily.txt");
            PrintWriter writer = new PrintWriter(scoreSort);
            for (String string : family) {
                writer.write(string+"\n");
            }

            writer.close();

        } catch (Exception ex) {
            Logger.getLogger(MembersAndScores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

	
//	private String name;
//	private String family;
//	
//	public class CompanyProfile {
//
//		readFile("students", students);
//		ArrayList<Students> students = new ArrayList<Students>(); 
//}
//
//	public static void readFile(String path){
//		try {
//			
//			FileReader fileReader = new FileReader(path);
//			
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//			while (bufferedReader.ready()) {
//				
////				while (bufferedReader.ready()) {
////				    String line = bufferedReader.readLine();
////				    String[]red=line.split(" ");
////				    Student current=new Student(red[0],red[1]);
////				    System.out.println(current);
////				 
//				   }
//				
//				for (int i = 0; i < students.length; i++) {
//					for (i = 0)
//					
//				}
//			  String line = bufferedReader.readLine();
//			  System.out.println(line);
//			}
//			
//			bufferedReader.close();
//			
//		} catch (Exception e) {
//			System.out.println("There is an error reading the file!");
//			System.out.println(e.getMessage());
//		}
//	}
//	
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
//
//}
//}