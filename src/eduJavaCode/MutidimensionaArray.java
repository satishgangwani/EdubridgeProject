package eduJavaCode;

public class MutidimensionaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age[][];
		
		age = new int[3][2];
		
		age[0][0] = 10;
		age[0][1] = 20;
		age[1][0] = 30;
		age[1][1] = 40;
		age[2][0] = 50;
		age[2][1] = 60;
		
		for(int i = 0; i < 3; i++)		//i = 3
		{
			for(int j = 0; j < 2; j++)	//j = 1
			{
				System.out.println(age[i][j]);
			}
		}
		

	}

}
