package Q10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",Demo.concat(new String[] {"apple","orange","banana","lemon"}));
	}

}
