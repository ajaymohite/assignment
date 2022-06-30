package tddApplication;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	
	
	
	private JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
		this.objJdbc = objJdbc;
	}
	
	
	public int insert(Employee e)
	{
		String query="insert into employee(email,password)values(?,?)";
		int update=objJdbc.update(query,e.getEmail(),e.getPassword());
		return update;
		
	}
	
	public Employee getEmployee(String email)
	{
		String query="select * from employee where email=?";
		RowMapper<Employee> rowMapper=new rowmap();
		
		Employee e2=objJdbc.queryForObject(query, rowMapper,email);
		
		return e2;
		
	}

}
