package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Q15.Customer;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		Employee emp2=(Employee) context.getBean("emp2");
		Employee emp3=(Employee) context.getBean("emp3");
		Employee emp4=(Employee) context.getBean("emp4");
		
		
		List<Employee> elist=new ArrayList<Employee>();
		elist.add(emp1);
		elist.add(emp2);
		elist.add(emp3);
		elist.add(emp4);
		
		System.out.println(elist);
		
		List<Double> e=elist.stream().map(i->i.salary).sorted().collect(Collectors.toList());
		System.out.println(e);
		
		
		for(Double ee:e)
		{
			for(Employee emp:elist)
			{
				if(ee==emp.salary)
				{
					System.out.println("Name "+emp.empName+"  "+"Salary "+emp.salary);
				}
			}
		}
		
		//List<Employee> sortedlist =elist.stream().sorted((s1,s2)->Double.compare(s1.salary, s2.salary).toList();
		
		
		
		
		
		
	}

}
