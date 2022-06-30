package Q11;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {

		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();

		assertTrue(Singleton.checkSingleton(s1, s2));
		
	}

}
