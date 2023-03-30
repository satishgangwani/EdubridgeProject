package eduJavaCode;

public class StaticVariable {
	int a = 100;
	static int b = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		
		obj1.a = 500;
		obj2.a = 600;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.b = 500;
		obj2.b = 600;
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		
		
		

	}

}
