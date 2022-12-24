package eduJavaCode;

public class PublicAccessModifiers {
	
	  protected int a = 100;
	
	  protected void add()
	{
		System.out.println("This is a method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicAccessModifiers obj = new PublicAccessModifiers();
		
		System.out.println(obj.a);
		
		obj.add();
		
	}

}
