package Q11;

import java.util.ArrayList;
import java.util.List;

public class Parallel {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("Even Numbers before Parallel Stream");
		System.out.println(num);

		System.out.println("Even Numbers after Parallel Stream");

		
		num.stream().parallel().forEach(System.out::println);
	}
}
