package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest4 {

	@Test
	void test() {
		assertEquals(4321, reverNumber(1234));
		assertEquals(50021, reverNumber(12005));
		assertEquals(1, reverNumber(1));
		assertEquals(1, reverNumber(1000));
		assertEquals(0, reverNumber(0));
		assertEquals(-54321, reverNumber(-12345));
	}
	
	static int reverNumber(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		int sign = 1;
		if(n < 0) {
			sign = -1;
		}
		
		int rev = 0;
		n = n * sign;
		
		while (n > 0) {
			rev = rev*10 + n%10;
			n = n/10;
		}

		return rev * sign;
	}

}
