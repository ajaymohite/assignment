package Q14;

public class Circle implements Shape {

	@Override
	public void area(int a) {
		
		System.out.println("Area of circle : "+3.14*a*a );
		
	}

	@Override
	public void sidesOfShape() {
		// TODO Auto-generated method stub
		System.out.println("sides of circle : "+0);
	}

}
