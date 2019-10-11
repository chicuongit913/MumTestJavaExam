package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest19 {

	@Test
	void test() {
		assertEquals(502, henry(1, 3));
		System.out.println(henry(1, 3));
		assertEquals(8134, henry(1, 4));
		System.out.println(henry(1, 4));
	}
	
	int henry (int i, int j) {
		if (i == 0 || j == 0) {
			return 0;
		}
		
		return findPerfectNumberIndex(i) + findPerfectNumberIndex(j);
	}
	
	int findPerfectNumberIndex(int index) {
		int max = Integer.MAX_VALUE;
		int indexPerfectNumber = 0;
		for (int i = 2; i < max; i++) {
			if(isPerfectNumber(i)) {	
				indexPerfectNumber++;
				if (indexPerfectNumber == index) {
					return i;
				}
			}
		}
		return 0;
	}
	
	boolean isPerfectNumber(int n) {
		if (n <= 1) {
			return false;
		}
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n%i == 0) {
				sum +=i;
			}
		}
		
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}
}
