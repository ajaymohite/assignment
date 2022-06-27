package Q4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Maximum {
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		
		int cname=list.stream().max((a,b)->a>b?1:-1).get();
		System.out.println("maximum number is : "+cname);
	}
	
	


}
