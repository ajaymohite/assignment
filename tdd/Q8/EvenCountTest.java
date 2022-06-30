package Q8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenCountTest {

	@Test
	void test() {
		assertEquals(5, EvenCount.countEven(new int[] {1,2,33,44,234,2455,22,553,2,77}));
	}

}
