package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		List<Employee> elist=new ArrayList<Employee>();
		
		elist.add(new Employee(1,"ajay"));
		elist.add(new Employee(1,"shree"));
		elist.add(new Employee(1,"john"));
		elist.add(new Employee(1,"shree"));
		elist.add(new Employee(1,"vivek"));
		elist.add(new Employee(1,"john"));
		
		List<String> distinctName=elist.stream().map(p->p.name).distinct().collect(Collectors.toList());
		System.out.println(distinctName);
	}

}
