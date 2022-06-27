package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarks {
	public static void main(String[] args) {
		List<Integer> mlist=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student count");
		int count=sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("enter marks for student "+(i+1));
			int marks=sc.nextInt();
			mlist.add(marks);
			
		}
		
		double aveMarks=mlist.stream().collect(Collectors.averagingInt(i->i));
		
		System.out.println("Average marks is : "+aveMarks);
		
		
	}

}
