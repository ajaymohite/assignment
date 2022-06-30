package Q7;

public class Palindrome {
	
	public static boolean palindromeCheck(int num)
	{
		
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(palindromeCheck(1231));
	}

}
