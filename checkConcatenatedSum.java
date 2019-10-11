package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest42 {

	@Test
	void test() {
		System.out.println(checkConcatenatedSum(198, 2));
		System.out.println(checkConcatenatedSum(9, 1));
	}
	
	int checkConcatenatedSum(int n, int catlen) {
		System.out.println("---------------");
		if (n == 0 || catlen == 0) {
			return 0;
		}
		int sum = 0;
		int len = convertCatlenToNumber(catlen);
		
		int number = n;
		while (n > 0) {
			System.out.println((n%10) * len);
			sum += (n%10) * len;
			
			if(sum > number)
				return 0;
			
			n = n/10;
		}
		if(sum == number)
			return 1;
		else {
			return 0;
		}
	}
	
	int convertCatlenToNumber(int catlen) {
		int n = 1;
		int len = 1;
		for (int i = 1; i < catlen; i++) {
			len *=10;
			n += len;
		}
		
		return n;
	}
}
