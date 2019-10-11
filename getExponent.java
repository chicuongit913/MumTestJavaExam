package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest38 {

	@Test
	void test() {
		System.out.println(getExponent(128, 4));
	}

	int getExponent(int n, int p) {
		if(p <= 1)
			return -1;
		
		double Legal = 1;
		int max = 0;
		int i = 0;
		
		while (Legal <= n) {
			
			if(n % Legal == 0)
				max = i;
			
			i++;
			
			Legal = Math.pow(p, i);
			System.out.println(Legal);
		}
		
		return max;
	}
	
	
}
