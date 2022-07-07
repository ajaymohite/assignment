package Q3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmiTest {
	
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Applicationcontex.xml");
		Emi emi=co.getBean("emi1",Emi.class);
		
		System.out.println("Rate of Interest : "+emi.rate);
		double rate=emi.rate;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter amount");
		
		double amount=scan.nextDouble();
		
		System.out.println("loan for how many month");
		int month=scan.nextInt();
		
		double TPA=amount+((amount*rate)/100)*month;
		
		System.out.println("total payable amount : "+TPA);
		
		
		double emi2=TPA/month;
		System.out.println("Emi per month "+emi2);
	}

}
