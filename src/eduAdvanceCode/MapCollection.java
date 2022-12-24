package eduAdvanceCode;

import java.util.*;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> MbDiary = new TreeMap<String, String>();
		
		MbDiary.put("Edubridge", "9822222222");
		MbDiary.put("TCS", "9822222211");
		MbDiary.put("Infosys", "9822222233");
		MbDiary.put("Capgemini", "9822222244");
		MbDiary.put("Cognizant", "9822222255");
		MbDiary.put("Deloitte", "9822222266");
		MbDiary.put("Edubridge", "9822222277");
		MbDiary.put("Edubridge", "9822222288");
		
		System.out.println(MbDiary);
		
		for(Map.Entry<String, String> obj : MbDiary.entrySet())
		{
			System.out.println(obj.getKey() +"  " +obj.getValue());
		}
		
		
		
	}

}
