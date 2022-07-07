package Q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Q15.Customer;

public class ItemTest {
	
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Item item=(Item) contex.getBean("itemlist");
		
		item.show();
		System.out.println("--------------------------\n");
		
		
	item.ascending();
	System.out.println("--------------------------\n");
	item.descending();
	System.out.println("--------------------------\n");
		
	item.removeDuplicate();
		
	}

}
