package Q14;

public  class Square implements Shape {

	@Override
	public void area(int a) {
		System.out.println("Area of Square : "+a*a);
		
	}

	@Override
	public void sidesOfShape() {
		// TODO Auto-generated method stub
		System.out.println("sides of Square : "+4);
	}

}
