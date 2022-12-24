package eduJavaCode;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0, number;
		
		Scanner obj = new Scanner(System.in);
		
		for(int i = 1; i < 6; i++)
		{
			System.out.println("Enter the number");
			
			number = obj.nextDouble();
			
			if(number <= 0.0)
			{
				continue;
			}
			
			sum += number;
			
		}
		
		System.out.println(sum);
	}

}
