package eduAdvanceCode;

import java.util.*;

public class ListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Edubridge");
		name.add("Capgemini");
		name.add("Cognizant");
		name.add("Deloitte");
		name.add("Edubridge");
		System.out.println(name);
		
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext())
		{
			String item = itr.next();
			
			System.out.println(item +"  " +item.length());
		}
		
		
		
		
	}

}
