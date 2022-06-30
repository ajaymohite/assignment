package tddApplication;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowmap implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub


		Employee e=new Employee();
		e.setEmail(rs.getString(1));
		e.setPassword(rs.getString(2));
		
		
		return e;
	}

}
