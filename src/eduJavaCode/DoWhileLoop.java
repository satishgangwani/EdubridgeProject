package eduJavaCode;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, number;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the number : ");
			
			number = input.nextInt();		//0.0
			
			sum += number; 	//30.0
		}while(number != 0.0);
		
		System.out.println(sum);
		
	}

}
