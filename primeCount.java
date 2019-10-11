package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest8 {

	@Test
	void test() {
		assertEquals(primeCount(10, 30), 6);
		assertEquals(primeCount(11, 29), 6);
		assertEquals(primeCount(20, 22), 0);
		assertEquals(primeCount(1, 1), 0);
		assertEquals(primeCount(5, 5), 1);
		assertEquals(primeCount(6, 2), 0);
		assertEquals(primeCount(-10, 6), 3);
	}
	
	int primeCount(int start, int end) {
		int count = 0;
		if(end <= 1 || start > end)
			return 0;
		
		if(start < 2)
			start = 2;
		
		while(start <= end)
		{
			if (isPrimeNumber(start)) {
				count++;
			}
			start++;
		}
		return count;
	}
	
	boolean isPrimeNumber(int number) {
		if(number == 2 || number == 3)
			return true;
		
		for (int i = 2; i <= number/2; i++) {
			if(number % i == 0)
				return false;
		}
		
		return true;
	}

}
