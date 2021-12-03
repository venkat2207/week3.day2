package week3.day2.Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(new Integer[]{3,2,11,4,6,7});
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		System.out.println(list.get(list.size()-2));

		
		

	}

}
