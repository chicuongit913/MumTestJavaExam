package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest26 {

	@Test
	void test() {
		assertEquals(1, isIsolated(69));
		assertEquals(1, isIsolated(58));
		assertEquals(1, isIsolated(63));
		assertEquals(0, isIsolated(59));
		assertEquals(0, isIsolated(62));
	}
	
	int isIsolated(long n) {
		if(n > Integer.MAX_VALUE || n < 1)
			return -1;
		
		long square = n * n;
		long cube = n * n * n;
		
		while (square > 0) {
			long digit = square % 10;
			
			long tempCube = cube;
			while (tempCube > 0) {
				if(tempCube % 10 == digit)
					return 0;
				tempCube /=10;
			}
			square /=10;
		}
		
		return 1;
	}

}
