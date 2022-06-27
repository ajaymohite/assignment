package Q5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxLength {
	public static void main(String[] args) {

		String[] str = { "dell", "soni", "hp", "lenovo", "panasonic" };
		List<Integer> len = new ArrayList<Integer>();
		
		for (String s : str) {
			int count=0;
			char a[] = s.toCharArray();
			for (char ch : a) {
				count++;
			}
			len.add(count);
		}
	
		System.out.println(len);
		Integer max=len.stream().max((s1,s2)-> s1.intValue() >s2.intValue() ?1 :-1).get();
		int index=len.indexOf(max);
		System.out.println("String having maximum length : "+str[index] +" and count is : "+max);
		

	}
}
