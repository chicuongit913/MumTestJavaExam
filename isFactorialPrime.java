package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest57 {

	@Test
	void test() {
		System.out.println(isFactorialPrime(101));

	}
	
	int isFactorialPrime(int n) {
		if (isPrime(n)) {
			int factorialN = 0;
			for (int i = 1; i < n; i++) {
				factorialN = factorial(i)+1;
				System.out.println(factorialN);
				if(factorialN == n)
					return 1;
				else if(factorialN > n) {
					break;
				}
			}
		}
		return 0;
	}
	
	int factorial(int n) {
		if(n > 0 ) {
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
	
	boolean isPrime(int n) {
		if (n <= 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
