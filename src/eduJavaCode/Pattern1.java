package eduJavaCode;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		for(i = 1; i<=10; i++)	//i = 4
		{
			for (j = 10; j >= i; j--)	//j = 2
			{
				System.out.print("*");		//***//**//*//
			}
			System.out.println();
		}
		
	}

}
