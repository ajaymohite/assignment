
package Q14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTestFactory {
	public static void main(String[] args) {
		
	
	
	ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
	
	Shape circle=(Shape)contex.getBean("circle");
	Shape square=(Shape)contex.getBean("square");
	Rectangle rec=(Rectangle)contex.getBean("rectangle");
	
	
	
	
	
	
	System.out.println("Which Object you want to create \n1. Circle\n2. Square \n3. Rectangle");
	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1: circle.area(10);
			circle.sidesOfShape();
			break;
	case 2: square.area(4);
			square.sidesOfShape();
			break;
	case 3: rec.area(2, 4);
			rec.sidesOfShape();
			break;
			default: System.out.println("enter valid choice");
	
	}
	
	
}
	

}
