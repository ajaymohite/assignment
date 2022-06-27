package Q13;

public class Series {
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		
		for (int i = 0; i < a.length; i++) {
			if(i<=4)
			{
				String str=a[i]+"-"+(a[i+2]);
				System.out.println(str+", ");
				i=i+2;
			}
			
			else if(i<=10)
			{
				String str=a[i]+"-"+(a[i+4]);
				System.out.println(str+", ");
				i=i+4;
			}
			else
			{
				String str=a[i]+"-"+(a[i+3]);
				System.out.println(str+", ");
				i=i+3;
			}
			
			
		}
	}

}
