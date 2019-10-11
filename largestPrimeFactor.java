package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest44 {

	@Test
	void test() {
		System.out.println(largestPrimeFactor(5231145));
	}
	
	int largestPrimeFactor(int n) {
		 if(n <= 3 )
			 return 0;
		 
		 int largestPrime = 0;
		 
		 for (int i = 2; i <= n/2; i++) {
			if(n % i == 0 && isPrimeNumber(i)) {
				largestPrime = i;
			}
		}
		return largestPrime;
	}
	
	boolean isPrimeNumber(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
