package Q15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext co=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Customer cust=(Customer) co.getBean("cust1");
		
		cust.showCustomer();
	}
}
