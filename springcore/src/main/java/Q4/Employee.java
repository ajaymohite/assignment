package Q4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	int empId;
	String empName;
	double salary;



	Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public void showEmp()
	{
		System.out.println("Emp Id : "+empId);
		System.out.println("Emp Name : "+empName);
		System.out.println("Emp Salary : "+salary);
		dept.showDept();
		
	}
	
	
	
	
	
	
	

}
