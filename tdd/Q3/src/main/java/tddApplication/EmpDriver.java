package tddApplication;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("/tddApplication/config.xml");
		
		EmpDao dao=contex.getBean("empdao",EmpDao.class);
		
		
		Employee e=new Employee();
		/*
		 * e.setEmail("ajay@gmail.com"); e.setPassword("ajay@123");
		 * 
		 * int insert=dao.insert(e); System.out.println(insert);
		 */
		
		
		/*
		 * Employee e2=dao.getEmployee("ajay@gmail.com");
		 * 
		 * System.out.println(e2.getEmail()); System.out.println(e2.getPassword());
		 */
		
		
		Employee e2=dao.getEmployee("ajay@gmail.com");
		System.out.println(e2);
		
		

		if("ajay@gmail.com".equals(e2.getEmail()) && "ajay@123".equals(e2.getPassword()))
			System.out.println("yes");
		else
			System.out.println("no");
		
		
		EmpDriver driver=new EmpDriver();
	System.out.println(driver.checkLogin("ajay@gmail.com", "ajay@123"));
			
			
			
	}
	
	public boolean checkLogin(String name,String pass)
	{
ApplicationContext contex=new ClassPathXmlApplicationContext("/tddApplication/config.xml");
		
		EmpDao dao=contex.getBean("empdao",EmpDao.class);
		Employee e2=dao.getEmployee(name);
		
		if(name.equals(e2.getEmail())&&pass.equals(e2.getPassword()))
			return true;
		else
			return false;
	}
	
}
