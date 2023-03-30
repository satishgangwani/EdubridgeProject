package eduJavaCode;

public class TypesOfVariables {
	
	public int instanceVariables;
	
	public static int staticVariables;
	
	 public void add()
	{
		int b;
		System.out.println(instanceVariables);
		System.out.println(staticVariables);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
		
		TypesOfVariables obj = new TypesOfVariables();
		
		obj.add();
		System.out.println(obj.instanceVariables);
		
		
		System.out.println(staticVariables);
		
	}
	
	

}
