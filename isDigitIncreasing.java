package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest51 {

	@Test
	void test() {
		System.out.println(isDigitIncreasing(7404));
	}

	int isDigitIncreasing(int n) {
		if (n <= 0) {
			return 0;
		}
		
		if( n <= 9)
			return n;
		
		for (int i = 1; i <= 9; i++) {
			int sum = i;
			int nextNumber = i;
			int length = i;
			while (sum < n ) {
				length *= 10;
				nextNumber += length;
				sum += nextNumber;
				
			}
			
			if(sum == n)
			{
				System.out.println(i);
				return 1;
			}
				
		}
		
		return 0;
	}
}
