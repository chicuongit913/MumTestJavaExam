package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest45 {

	@Test
	void test() {
		System.out.println(Arrays.toString(encodeNumber(1200)));
	}
	
	int[] encodeNumber(int n) {
        if (n <= 1)
            return null;
        
    	int number = n;
    	int length = 0;
    	for (int i = 2; i <= number;) {
    		if (isPrime(i) && number%i == 0) {
				length++;
				number /=i;
    		} else {
    			i++;
    		}
		}
    	int[] results = new int[length];
    	number = n;
    	for (int i = 2, j = 0; i <= number && j < length;) {
			if (isPrime(i) && number % i == 0) {
				results[j] = i;
				number /= i;
				j++;
			}
			else {
				i++;
			}
		}
    	
    	return results;
    }

	
	boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
