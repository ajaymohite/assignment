package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Q15.Customer;

public class AveTest {

	
	public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		
		AveNum avg=(AveNum)co.getBean("ave");
		avg.show();
		
		
		
	}
}
