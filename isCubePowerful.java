package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest48 {

	@Test
	void test() {
		System.out.println(isCubePowerful(87));
	}
	
	int isCubePowerful(int n) {
		if (n < 1)
			return 0;
		
		int length = 0;
		int number = n;
		while (number > 0) {
			number /=10;
			length++;
		}
		
		double sum = 0;
		number = n;
		while ( number > 0) {
			sum += Math.pow(number % 10, length);
			number /=10;	
		}
		
		if(sum == n)
			return 1;
		else 
			return 0;
	}
}
