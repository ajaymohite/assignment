package Q10;
public class Demo {
	
	public static String concat(String a [])
	{
		String ans="";
		
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
				ans+=a[i];
			else
				ans+=a[i]+"-";
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(concat(new String[] {"apple","orange","banana","lemon"}));
	}

}
