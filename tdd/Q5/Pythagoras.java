package Q5;

public class Pythagoras {
	
	public static boolean check(int a,int b,int c)
	{
		if((a*a+b*b==c*c))
			return true;
		else
			return false;
	}
	
	
	
	public static void main(String[] args) {
		;
		System.out.println(check(3, 4, 5));
	}

}
