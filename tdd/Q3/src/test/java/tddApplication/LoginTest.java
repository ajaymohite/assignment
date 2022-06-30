package tddApplication;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class LoginTest {

	@Test
	void test() {
		EmpDriver driver=new EmpDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String name=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		assertEquals(true, driver.checkLogin(name,pass));//ajay@gmail.com  ajay@123
	}

}
