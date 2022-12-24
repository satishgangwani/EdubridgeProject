package eduAdvanceCode;

public class MethodOverloading {
	
	public void add()
	{
		int c = 10, d = 20;
		
		System.out.println(c + d);	
	}
	
	public void add(int a, int b)
	{
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(50, 60);
		obj.main();
	}
	
	public void main()
	{
		System.out.println("I am a main method");
	}

}
