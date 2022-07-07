package Q1;
public class Role {
	
	private Role()
	{
		
	}
	
	public static Role getRole()
	{
		//System.out.println("factory method get called");
		return new Role();
	}
	

}
