package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sun.tools.jar.resources.jar;

class MumTest32 {

	@Test
	void test() {
		assertEquals(12, smallest(2));
		assertEquals(624, smallest(4));
		assertEquals(4062, smallest(7));
	}
	
	int smallest(int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		int i = 1;
		int digit = 2;
		while (i < Integer.MAX_VALUE) {
			if(isExistDigit(i, digit)) {
				int j = 1;
				int count = 0;
			
				while (j <= n) {
					if(isExistDigit(i*j, digit)) {
						count++;
					} else {
						break;
					}
					j++;
				}
				
				if(count == n) {
					return i;	
				}
			}
			
			i++;
		}
		return 0;
	}
	
	boolean isExistDigit(int n, int digit) {
		while (n > 0) {
			if(n % 10 == digit)
				return true;
			n /=10;
		}
		return false;
	}

}
