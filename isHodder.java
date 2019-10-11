package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest59 {

	@Test
	void test() {
		System.out.println(isHodder(127));
	}
	
	int isHodder(int n) {
		if (isPrime(n)) {
			double pow = 0;
			int j = 1;
			while (pow < n) {
				pow = Math.pow(2, j) - 1;
				if (pow == n) {
					return j;
				}
				j++;
			}
		}
		
		return 0;
	}
	
	boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
