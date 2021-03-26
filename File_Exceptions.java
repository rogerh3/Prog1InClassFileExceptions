import java.io.*; 
import java.util.Scanner; 


public class File_Exceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			try {
			//Check if output file exists and either create it or append/add to it
			FileWriter fw = new FileWriter("/users/rogerhaydeniii/Desktop/totalGrades.txt", true);
			PrintWriter outputFile = new PrintWriter(fw);  
			
			//File to read from
			File fr = new File("/users/rogerhaydeniii/Desktop/tempOutput.txt");
			Scanner inputFile = new Scanner(fr); 
			
			//Create variables
			int totalGrades = 0;
			int gradeCounter = 0;
			
			while (inputFile.hasNext()) {
				int grade = inputFile.nextInt();
				//Adds all grades to the total
				totalGrades+= grade; 
				//Adds number of grades to the total number of grades
				gradeCounter++; 
				}
			
			outputFile.println("Grade Statistics"); 
			outputFile.println("=================");
			outputFile.println("Total Points: " + totalGrades);
			outputFile.println("Total Assignments: " + gradeCounter); 
			outputFile.println("Average Score: " + totalGrades/gradeCounter); 
			
			//Close the files 
			outputFile.close();
			inputFile.close();
			}
			catch (FileNotFoundException error) {
				System.out.println("Sorry, I can not find that file."); 
				System.out.println("Error Message: " + error.getLocalizedMessage()); 
			}
		
	}

}
