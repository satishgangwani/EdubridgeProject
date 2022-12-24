package eduJavaCode;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 1, number2 = 2, number3 = 9;
		boolean result;
		
		result = ((number1 > number2) || (number3 < number1));
		System.out.println(result);
		
		result = ((number1 < number2) && (number3 > number1));
		System.out.println(result);
		
	}

}
