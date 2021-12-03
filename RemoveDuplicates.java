package week3.day2.Assignments;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		
		char[] charArray = text.toCharArray();
		
		// initailize a set
		
		Set <String> textSet=new LinkedHashSet<String>();
		
		for (int i=0; i <charArray.length;i++)
			
		{
			textSet.add(Character.toString(charArray[i]));
			
		}

		
		
		
		System.out.println(textSet);
		
		String joined = String.join("", textSet);
		
		System.out.println(joined);
		
	}

}
