package Q7;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

public class Array1 {
	
	int a[];
	@Autowired
	Array2 arr;
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	

	public Array2 getB() {
		return arr;
	}
	public void setB(Array2 arr) {
		this.arr = arr;
	}
	
	public void merge()
	{
		System.out.print("Array 1 : ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nArray 2 : ");
		for(int i=0;i<arr.b.length;i++)
		{
			System.out.print(arr.b[i]+" ");
		}
		
		
		
		
		int c[]=new int[a.length+arr.b.length];
		//System.out.println(c.length);
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		
		
		
		for(int i=a.length;i<c.length;i++)
		{
			c[i]=arr.b[j];
			j++;
			
		}
		int max=c[0];
		System.out.print("\nmerge array : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
			
			
			
			if(max<c[i])
				max=c[i];
		}
		
		
		System.out.println("\nmaximum number : "+max);
		
		
		
		
		
		
	}
	
	
}
