package Q10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "ajay"));
		list.add(new Employee(2, "vijay"));
		list.add(new Employee(3, "kumar"));
		list.add(new Employee(4, "ganesh"));
		list.add(new Employee(5, "rohit"));
		list.add(new Employee(6, "vijay"));
		list.add(new Employee(7, "pratik"));
		list.add(new Employee(8, "vinay"));
		list.add(new Employee(9, "shree"));
		list.add(new Employee(10, "kumar"));

		//
		System.out.println(list);
		System.out.print("out put in set : ");
		Set<String> emp = list.stream().map(i -> i.name).collect(Collectors.toSet());
		System.out.println(emp);
		System.out.print("output in map : ");
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(i -> i.id, i -> i.name));
		System.out.println(map);

	}
}
