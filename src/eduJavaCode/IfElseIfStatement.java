package eduJavaCode;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -15;
		
		if ((number >= 1) && (number <=100))
		{
			System.out.println("Number is small number");
		}
		
		else if ((number >= 101) && (number <= 1000))
		{
			System.out.println("Number is medium number");
		}
		
		else if((number >= 1001) && (number <= 10000))
		{
			System.out.println("Number is big number");
		}
		
		else if(number > 10000)
		{
			System.out.println("Number is high number");
		}
		
		else
		{
			System.out.println("Number is either negative or zero");
		}
	}

}
