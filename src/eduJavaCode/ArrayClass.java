package eduJavaCode;

public class ArrayClass {
	
	public static void main(String []args)
	{
		int age[] = new int[5];
		
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		age[3] = 40;
		age[4] = 50;
		
		//int age[] = {10, 20, 30, 40, 50}
		
		int len = age.length;
		
		System.out.println(len);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(age[i]); 	//10 20 30 40 50
		}
	}

}
