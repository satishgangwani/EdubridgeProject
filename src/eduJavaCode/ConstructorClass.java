package eduJavaCode;

public class ConstructorClass {
	
	public ConstructorClass(int b, int c)
	{
		System.out.println("I am a constructor");
		System.out.println(b);
	}
	
	public static void add(int a)
	{
		System.out.println("I am a method");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorClass obj = new ConstructorClass(30, 100);	
		
		add(20);
		
		
	}

}
