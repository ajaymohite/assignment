package Q8;

public class EvenCount {
	
	public static int countEven(int a[])
	{
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countEven(new int[] {1,2,3,4,5,6,7,8}));
	}

}
