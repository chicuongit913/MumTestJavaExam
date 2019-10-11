package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest11 {

	@Test
	void test() {
		assertEquals(139, findPorcupineNumber(30));
		assertEquals(409, findPorcupineNumber(139));
	}
	
	int findPorcupineNumber(int n) {
		int porcupineNumber = 0;
		boolean found = false;
		int endDigit = 0;
		while (!found) {
			n++;
			endDigit = n%10;
			if(endDigit == 9 && isPrimeNumber(n)) {
				if(findNextPrime(n) % 10 == 9) {
					porcupineNumber = n;
					found = true;
				}
			}
		}
		
		return porcupineNumber;
	}
	
	int findNextPrime(int n) {
		n++;
		while (!isPrimeNumber(n)) {
			n++;
		}
		return n;
	}
	
	boolean isPrimeNumber(int n) {
		if(n <= 1)
			return false;
		
		for (int i = 0; i < Math.sqrt(n); i++) {
			if(n % i ==0)
				return false;
		}
		
		return true;
	}

}
