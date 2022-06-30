package Q4;

public class ArmstrongNumber {
	
	public static boolean checkArmstrong(int num)
	{
		int temp=num;
		int num2=num;
		int digit=0;
		while(temp>0)
		{
			digit++;
			temp/=10;
		}
		
		//System.out.println(digit);
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			
			sum+=power(rem, digit);
			num/=10;
			
		}
		
		if(sum==num2)
			return true;
		else
			return false;
		
		
		
		
		
	}
	
	public static int power(int num,int power)
	{
		int sum=num;
		for(int i=1; i<power;i++)
		{
			sum*=num;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		checkArmstrong(12334);
		System.out.println(checkArmstrong(153));
		
	}
}
