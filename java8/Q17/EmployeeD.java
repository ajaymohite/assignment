package Q17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.yash.assignment.Employee;

public class EmployeeD {
	/*
	 * String empName;
	 *  LocalDate birth; 
	 *  LocalDate joining; 
	 *  LocalDate resign; 
	 *  String location; 
	 *  String department; 
	 *  double salary;
	 */
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("ajay",LocalDate.of(1996, 04, 22),LocalDate.of(2010, 03, 18),LocalDate.of(2030, 11, 23),"pune","development",23000));
		list.add(new Employee("vijay",LocalDate.of(1996, 11, 01),LocalDate.of(2005, 05, 15),LocalDate.of(2030, 07, 23),"mumbai","testing",25000));
		list.add(new Employee("smith",LocalDate.of(1996, 07, 25),LocalDate.of(2011, 05, 15),LocalDate.of(2030, 07, 23),"chennai","testing",27000));
		list.add(new Employee("john",LocalDate.of(1997, 9, 25),LocalDate.of(2025, 05, 30),LocalDate.of(2035, 07, 15),"hydrabad","testing",31000));
		
		System.out.println("Employee in particular department");
		
		Map<String, List<Employee>> empByDept=list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		 Set<Entry<String, List<Employee>>> entrySet = empByDept.entrySet();         
         for (Entry<String, List<Employee>> entry : entrySet) 
         {
             System.out.println("--------------------------------------");
             System.out.println("Employees In "+entry.getKey() + " : ");                            
             System.out.println("--------------------------------------");                           
             List<Employee> list1 = entry.getValue();        
             for (Employee e : list1) 
             {
                 System.out.println(e.getName());
             }
         }

		
		
		
		System.out.println("Highest salary --");
       Map<String, Optional<Employee>> maxSalary=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
      maxSalary.entrySet().forEach(System.out::println);
		
		/*
		 * Map<String, Employee> topEmployees = list.stream().collect(groupingBy(e ->
		 * e.department,collectingAndThen(maxBy(Comparator.comparingInt(e -> e.salary)),
		 * Optional::get)));
		 */
        
		


        System.out.println("Lowest Salary--");
        Map<String, Optional<Employee>> minSalary=list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        minSalary.entrySet().forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        System.out.println("Average salary of each department--");
        Map<String, Double> avgSalaryOfDepartments=
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));       
        Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
        for (Entry<String, Double> entry : entrySet1) 
        {
             System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
        
        System.out.println("............................................................");
        System.out.println(" Number of employee in each department");
        Map<String, Long>noofemployee=
                list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(noofemployee);




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		 
		 
		 
		 
		
		
		
	}

}
