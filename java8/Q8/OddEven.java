package Q8;

import java.util.Scanner;
import java.util.function.Predicate;

public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		
		Predicate<Integer> p=i->i%2==0;// predicate used test method and return type is boolean
		System.out.println("given no is even : "+p.test(num));
		boolean b=p.test(num); 
		
		if(b==true)
			System.out.println("given no is even");
		else
			System.out.println("given no is odd");
	}

}
