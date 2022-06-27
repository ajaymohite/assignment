package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Marks {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(15);
        l.add(25);
        
        List<Integer> distinctElements = l.stream().distinct().collect(Collectors.toList());

		//Let's verify distinct elements
		System.out.println(distinctElements);		
	}
	
	

}
