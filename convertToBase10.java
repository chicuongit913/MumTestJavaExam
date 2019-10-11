package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest22 {

	@Test
	void test() {
		assertEquals(11, convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
		assertEquals(14, convertToBase10(new int[ ] {1, 1, 2}, 3));
		assertEquals(213,convertToBase10(new int[ ] {3, 2, 5}, 8));
	}
	int convertToBase10(int[ ] a, int base) {
		if(isLegalNumber(a, base) == 0) {
			return 0;
		}
		int base10 = 0;
		for (int i = a.length; i > 0; i--) {
			base10 += a[i-1] * caculateLegalNumber(base, a.length - i);
		}
		return base10;
	}
	
	int caculateLegalNumber(int n,int legal) {
		if(legal == 0)
			return 1;

		int legalNumber = 1;
		for (int i = 0; i < legal; i++) {
			legalNumber = legalNumber * n;
		}
		return legalNumber;
	}
	
	int isLegalNumber(int[] a, int base) {
		if(a.length == 0 || a == null || base == 0)
			return 0;
		
		for(int anA : a) {
			if(anA < 0 || anA > base)
				return 0;
		}
		
		return 1;
	}
}
