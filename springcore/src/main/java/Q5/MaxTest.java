package Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxTest {
	
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Max max=(Max)contex.getBean("max1");
		
		max.show();
		max.maxNum();
		
	}

}
