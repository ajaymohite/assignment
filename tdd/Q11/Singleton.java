package Q11;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
	
	private static Singleton singleton=new Singleton();

	public Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static Singleton getSingleton()
	{
		return singleton;
	}
	
	
	
	public static boolean checkSingleton(Singleton s1,Singleton s2)
	{
		if(s1.hashCode()==s2.hashCode())
			return true;
		else
			return false;
		
	}
	
	
}
