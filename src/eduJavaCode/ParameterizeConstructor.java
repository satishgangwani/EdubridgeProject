package eduJavaCode;

public class ParameterizeConstructor {
	
	int wheels;
	
	public ParameterizeConstructor(int wheels)
	{
		this.wheels = wheels;
		
		System.out.println(this.wheels +"  wheeler vehicle created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizeConstructor v1 = new ParameterizeConstructor(2);
		ParameterizeConstructor v2 = new ParameterizeConstructor(3);
		ParameterizeConstructor v3 = new ParameterizeConstructor(4);
	}

}
