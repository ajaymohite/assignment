package Q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void test() {
		assertEquals(true, ArmstrongNumber.checkArmstrong(153));
	}

}
