package eduAdvanceCode;

public class EncapsulationaMain {

	private int empSSN;
	private String empName;
	private int empAge;
	
	public int getEmpSSN()
	{
		return empSSN;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public int getEmpAge()
	{
		return empAge;
	}
	
	public void setEmpSSN(int ssn)
	{
		empSSN = ssn;
	}
	
	public void setEmpName(String name)
	{
		empName = name;
	}
	
	public void setEmpAge(int age)
	{
		empAge = age;
	}
}
