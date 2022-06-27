package Q17;
import java.time.LocalDate;

public class Employee {
	
	String empName;
	LocalDate birth;
	LocalDate joining;
	LocalDate resign;
	String location;
	String department;
	double salary;
	
	
	
	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public LocalDate getBirth() {
		return birth;
	}


	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}


	public LocalDate getJoining() {
		return joining;
	}


	public void setJoining(LocalDate joining) {
		this.joining = joining;
	}


	public LocalDate getResign() {
		return resign;
	}


	public void setResign(LocalDate resign) {
		this.resign = resign;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee(String empName, LocalDate birth, LocalDate joining, LocalDate resign, String location,
			String department, double salary) {
		super();
		this.empName = empName;
		this.birth = birth;
		this.joining = joining;
		this.resign = resign;
		this.location = location;
		this.department = department;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", birth=" + birth + ", joining=" + joining + ", resign=" + resign
				+ ", location=" + location + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	

}
