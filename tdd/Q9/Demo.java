package Q9;

class Demo {
	
	public static void remove11(String str)
	{
		//String str="hi $ owi@#5 how are$$ y^0ou";
		String ans="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' &&str.charAt(i)<='z')
			{
				ans+=str.charAt(i);
			}
			else if(str.charAt(i)>='A' &&str.charAt(i)<='Z')
			{
				ans+=str.charAt(i);
			}
			else if(str.charAt(i)==' ')
			{
				ans+=" ";
			}
			
			else
			{
				ans+="";
			}
			
			
			
		}
		System.out.println(ans);
		
		
	}
	
	
	
	public static String remove(String s)
	{
		s=s.replaceAll("[^a-zA-Z ]", "");
		return s;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(remove("This @Red $car-"));
		
	}
}
