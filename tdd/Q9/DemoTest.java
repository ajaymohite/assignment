package Q9;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		//assert("hi how are you", Demo.remove("hi$ how&^$$ a90r$#3e 00))y0ou"));
		assertEquals("This red car", Demo.remove("This @red $car-."));
		
	}

}
