package Q11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentTest {

	public static void main(String[] args) {
		
		
		ApplicationContext co=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Student student1=(Student)co.getBean("student1");
		Student student2=(Student)co.getBean("student2");
		Student student3=(Student)co.getBean("student3");
		Student student4=(Student)co.getBean("student4");
		
		
		
		List<Student> slist = new ArrayList<Student>();
		

		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
		slist.add(student4);

		for (Student s : slist) {
			System.out.println(s.studentName + " " + s.result.total);
		}
		
		List<Student> sortstudlist = slist.stream()
				.sorted((s1, s2) -> Float.compare(s1.result.total, s2.result.total)).collect(Collectors.toList());
	
		System.out.println("list of student basis of total marks");
		
		for (Student s : sortstudlist) {
			System.out.println(s.studentName + " " + s.result.total);
		}
		
		
		
		
		}

}
