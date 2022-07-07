package Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {
	
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		
		Role role=(Role)contex.getBean("fact");
	}

}

