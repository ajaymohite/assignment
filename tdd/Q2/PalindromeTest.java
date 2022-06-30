package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true, Palindrome.check("aabaa","aabaa"));
	}

}
