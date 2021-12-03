package week3.day2.Assignments;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set <Integer> numbers=new TreeSet<Integer>();
		
		for (int i=0;i<arr.length;i++)
			
		{
			
			if( numbers.add((int) arr[i])==false)
					
					{
				
				System.out.println(arr[i]);
				
					}
			
			
			
		}
		
		

	}

}
