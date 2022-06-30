package tddApplication;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que14 {
	static ApplicationContext contex = new ClassPathXmlApplicationContext("/tddApplication/config.xml");

	static EmpDao dao = contex.getBean("empdao", EmpDao.class);
	public static void main(String[] args) {

		
		Que14 driver=new Que14();
		System.out.println("enter username");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		Employee e2=dao.getEmployee(name);
		
		if(name.equals(e2.getEmail())&&pass.equals(e2.getPassword()))
		{
			System.out.println(e2);
		}
		else
		{
			
			  System.out.println("sorry account not found please create account");
			  System.out.println("enter username"); //Scanner sc=new Scanner(System.in);
			  Employee e=new Employee(); String name1=sc.next();
			  System.out.println("enter password"); String pass1=sc.next();
			  e.setEmail(name1); e.setPassword(pass1);
			  
			  int insert=dao.insert(e); System.out.println(insert);
			 
			
			dao.insert(e);
		
			
		}
				
		

	}

	
}