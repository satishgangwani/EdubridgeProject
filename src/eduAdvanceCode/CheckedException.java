package eduAdvanceCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to world");
		
		
		System.out.println("We are searching for a file");
		FileInputStream obj = new FileInputStream("E:\\Edubridge\\DayWiseContent\\Java\\JavaCo.txt");
		System.out.println("File is present");
		
		
		System.out.println("Welcome to Java");

	}

}
