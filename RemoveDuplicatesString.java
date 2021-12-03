package week3.day2.Assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		
		
		String text="paypal india";
		
		char[] charArray = text.toCharArray();
		
		Set <Character> charSet=new TreeSet<Character>();
		
		Set <Character> dupCharSet=new TreeSet<Character>();
		
		for(int i=0; i<charArray.length;i++)
			
		{
			if (charSet.add(charArray[i])==false)
			{
				dupCharSet.add(charArray[i]);
				
			}
			
			
			
			
		}
		
		
		System.out.println(dupCharSet);
		
		System.out.println(charSet);
		
		
		charSet.removeAll(dupCharSet);
		
		//System.out.println(charSet);
		
		
		for(Character cs : charSet) {
			
			if (cs!=' ')
			{
			
			 System.out.print(cs);
			 
			 System.out.print(", ");
			
			}
		}
		     
		     
		

	}

}
