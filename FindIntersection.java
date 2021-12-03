package week3.day2.Assignments;

import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {

	public static void main(String[] args) {
		
		char[] charArray1={3,2,11,4,6,7};
		
		char[] charArray2={1,2,8,4,9,7,3};
		
		 Set <Integer> set1=new TreeSet<Integer>();
		 
		 Set <Integer> set2=new TreeSet<Integer>();
		 
		 
		 for (int i=0;i<charArray1.length;i++)
			 
		 {
			 
			 set1.add((int) charArray1[i]);
			 
			 
		 }
		
		 for (int j=0; j<charArray2.length;j++)
			 
		 {
			 
			 if (set1.contains((int) charArray2[j]))
				 
				 
			 {
				 set2.add((int) charArray2[j]);
				 
			 }
			 
		 }
		
		System.out.println(set2);
	
		
		
		
		
	}


}
