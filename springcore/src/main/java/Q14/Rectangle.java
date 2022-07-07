package Q14;

public class Rectangle implements Shape{

	
	
	public void area(int a,int b)
	{
		System.out.println("area of rectangle : "+a*b);
		
	}

	@Override
	public void sidesOfShape() {

		System.out.println("sides of Rectangle : "+4);
		
	}

	@Override
	public void area(int a) {
		// TODO Auto-generated method stub
		
	}

}
