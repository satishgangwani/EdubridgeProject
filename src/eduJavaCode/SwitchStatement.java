package eduJavaCode;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int week = 2;
		String day;
		
		switch(week)
		{
			case 1 :
					day = "Sunday";
					break;
					
			case 2 :
					day = "Monday";
					break;
					
			case 3 :
					day = "Tuesday";
					break;
					
			case 4 : 
					day = "Wednesday";
					break;
					
			case 5 :
					day = "Thursday";
					break;
					
			case 6 :
					day = "Friday";
					break;
					
			case 7 :
					day = "Saturday";
					break;
					
			default :
					day = "Invalid Day";
					break;
					
					
		}
		
		System.out.println(day);
		
	}

}
