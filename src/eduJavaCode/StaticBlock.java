package eduJavaCode;

public class StaticBlock {
	static int a;
	static String b;
	int c;
	
	static {
		a = 200;
		b = "Edubridge India Pvt Ltd";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(b);

	}

}
