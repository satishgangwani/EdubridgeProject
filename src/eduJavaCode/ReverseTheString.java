package eduJavaCode;

public class ReverseTheString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Edubridge";		//hsitaS
		int leng = name.length();
		String rev = "";
		for(int i = leng - 1; i >= 0; i--)	//i = 3,  
		{
			rev = rev + name.charAt(i);		//rev = hsitas
		}
		System.out.println("Reverse of " +name+ " is " +rev);

	}

}
