package eduJavaCode;

public class StaticClass {
	
	static int a = 100;
	int b = 200;
	
	static class NestedClass
	{
		public void display()
		{
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticClass.NestedClass obj = new StaticClass.NestedClass();
		
		obj.display();
		
	}

}
