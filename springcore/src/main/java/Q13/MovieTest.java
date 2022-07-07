package Q13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		
		
		Movie movie=contex.getBean("movie1",Movie.class);
		movie.count();
	}

}
