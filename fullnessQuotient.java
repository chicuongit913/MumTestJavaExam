package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest35 {

	@Test
	void test() {
		fullnessQuotient(94);
	}
	int fullnessQuotient(int n) {
		if (n < 1)
			return -1;
		
		int countZero = 0;
		int count = 0;
		
		for (int base = 2; base < 9; base++) {
			int number = n;
			System.out.println(base);
			System.out.println("VVV");
			while (number > 0) {
				System.out.println(Arrays.toString(new int[] {number % base, number/base, number}));
				if(number % base == 0)
					countZero++;
				
				number /= base;
				
			}
			System.out.println("----------------");
			if(countZero == 0)
				return 1;
		}
		
		return count;
	}
}
