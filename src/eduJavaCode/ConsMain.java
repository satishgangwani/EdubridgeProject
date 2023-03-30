package eduJavaCode;

public class ConsMain {

	private int x;
	
	private ConsMain()
	{
		System.out.println("Constructor Called");
		x = 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsMain obj = new ConsMain();	
		
		System.out.println("Value of x is " +obj.x);
		
	}

}
