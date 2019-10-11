package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest54 {

	@Test
	void test() {
		System.out.println(isPrimeHappy(32));
	}
	int isPrimeHappy(int n) {
		int sum = 0;
		
		for (int i = 2; i < n; i++) {
			sum += (isPrime(i)) ? i : 0;
		}
		System.out.println(sum);
		
		if (sum == 0) {
			return 0;
		} else if(sum % n == 0){
				return 1;
		} else {
			return 0;
		}
	}
	
	boolean isPrime(int n) {
		if(n < 2)
			return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
