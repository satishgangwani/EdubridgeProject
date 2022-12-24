package eduAdvanceCode;

public class EmpcapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationaMain obj = new EncapsulationaMain();
		
		obj.setEmpSSN(112233);
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		
		System.out.println("SSN of the employee is  " +obj.getEmpSSN());
		System.out.println("Name of the employee is  " +obj.getEmpName());
		System.out.println("Age of the employee is  " +obj.getEmpAge());
	}

}
