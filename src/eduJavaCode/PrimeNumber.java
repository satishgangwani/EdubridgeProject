package eduJavaCode;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 10;
		int temp = 0;
		
		
		for (int i = 2; i <= no-1; i++)
		{
			if(no%i == 0)
			{
				temp = temp + 1;	//temp = 2
			}
		}
		
		if(temp == 0)
		{
			System.out.println("Number is prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}

	}

}
