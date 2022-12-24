package eduAdvanceCode;

public class MethodOveridingChild extends MethodOverrindingParent{
	
	 public void add(int c, int d)
	{
		System.out.println("I am a child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOveridingChild obj = new MethodOveridingChild();
		
		obj.add(10, 20);
		
	
	}

}
