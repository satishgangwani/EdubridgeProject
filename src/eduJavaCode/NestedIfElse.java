package eduJavaCode;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 30, number2 = 50, number3 = 60;
		
		if(number1 > number2)
		{
			if(number1 > number3)
			{
				System.out.println("number1 is the greatest " +number1);
			}
			else
			{
				System.out.println("number3 is the greatest 1st  " +number3);
			}
		}
		else
		{
			if(number2 > number3)
			{
				System.out.println("number2 is the greatest " +number2);
			}
			else
			{
				System.out.println("number3 is the greatest 2nd " +number3);
			}
		}
		
		System.out.println("Program execution continue ..........");
		
	}

}
