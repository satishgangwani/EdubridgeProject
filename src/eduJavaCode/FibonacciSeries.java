package eduJavaCode;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 1;
		int c;
		
		System.out.print(a +" " +b);		//0 1 1 2 3 5 8
		
		for(int i = 1; i<=20; i++)	//i = 6
		{
			c = a + b;				//c = 5
			System.out.print(" " +c);
			a = b;					//a = 5
			b = c;					//b = 8
		}

	}

}
