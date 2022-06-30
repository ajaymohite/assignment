package Q5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagorasTest {

	@Test
	void test() {
		assertEquals(true, Pythagoras.check(3, 4, 5));
	}

}
