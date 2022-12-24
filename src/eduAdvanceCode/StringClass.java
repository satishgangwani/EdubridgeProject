package eduAdvanceCode;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "   Edubridge India Pvt Ltd  ";
		String str3 = "";
		String str2 = "Pune";
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		System.out.println("-----------------------");
		
		String str5 = "selenium";
		String str6 = "selenium";
		String str7 = "SELENIUM";
		String str8 = "zabcd";
		System.out.println(str5 == str6);
		System.out.println(str5.equalsIgnoreCase(str7));
		System.out.println(str5.compareTo(str6));
		
		System.out.println("-----------------------");
		
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(10, 15));
		
		System.out.println("-----------------------");
		
		System.out.println(str1.length());
		
		System.out.println("-----------------------");
		
		
		System.out.println(str1.charAt(11));
		
		System.out.println(str1.contains("India"));
		
		System.out.println(str1.endsWith(" "));
		
		System.out.println(str1.indexOf("India"));
		
		System.out.println(str3.isEmpty());
		
		System.out.println(str1.replace("Pvt Ltd", "Gov"));
		
		String a[] = str1.split(" ");
		
		for(String ele : a)
		{
			System.out.println(ele);
		}
		
		System.out.println(a[1]);
		
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.trim());
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
