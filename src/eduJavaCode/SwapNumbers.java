package eduJavaCode;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
		int c;
		System.out.println("Swapping of two numbers with using third variable");
		System.out.println("Before swapping the value of a is " +a +" and b is "+b);
		c = a;	//c = 10
		
		a = b;	//a = 20
		
		b = c;	//b = 10
		
		System.out.println("After swapping the value of a is " +a +" and b is "+b);
		
		System.out.println("------------------------------------");
		
		System.out.println("Swapping of two numbers without using third variable");
		
		int  d = 10, e = 20;
		
		System.out.println("Before swapping the value of d is " +d +" and e is "+e);
		
		d = d + e;	//d = 30
		e = d - e;	//e = 10
		d = d - e;	//d = 20
		
		System.out.println("After swapping the value of d is " +d +" and e is "+e);
		
	}

}
