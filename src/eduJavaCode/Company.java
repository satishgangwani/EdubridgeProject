package eduJavaCode;

public class Company {
	
	String domainName;
	
	public Company()
	{
		domainName = "default";
	}
	
	public Company(String dn)
	{
		domainName = dn;
	}
	
	public void displayDomainName()
	{
		System.out.println(domainName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company obj = new Company("Banking");
		
		
		Company obj1 = new Company();
		obj1.displayDomainName();
		obj.displayDomainName();
	}

}
