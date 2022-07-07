package Q14;


public class ShapeFactory {
	
	public static Shape getCircleObject()
	{
		return new Circle();
	}
	
	public static Shape getSquareObject()
	{
		return new Square();
	}
	
	public static Shape getRectangleObject()
	{
		return  new Rectangle();
	}
}


