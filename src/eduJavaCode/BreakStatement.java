package eduJavaCode;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0, number;
		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the number : ");
			
			number = input.nextDouble();
			
			if(number < 0.0)
			{
				break;
			}
			
			sum += number; 	//sum = 30.0
		}
		
		System.out.println(sum);
	}

}
