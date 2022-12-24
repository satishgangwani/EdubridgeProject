package eduJavaCode;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 123456789, rem;
		int b = 0;		//b = 312
		
		while(a != 0)
		{
			rem = a%10;			//rem = 2
			
			b = (b*10) + rem;	//b = 312
			
			a = a/10;			//a = 0
		}
		
		System.out.println("Reverse value of a is " +b);

	}

}
