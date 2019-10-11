package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest27 {

	@Test
	void test() {
		assertEquals(1, isVanilla(new int[] {}));
		assertEquals(0, isVanilla(new int[] {11, 22, 13, 34, 125}));
		assertEquals(1, isVanilla(new int[] {99, -9, 999, 9, -9999}));
		assertEquals(0, isVanilla(new int[] {11, 110011, 1111, 11111, -11111}));
	}
	
	int isVanilla(int[ ] a) {
		if (a.length == 0)
			return 1;
		
		int digit = a[0]%10;
		
		for(int anA : a) {
			if(isVanillaNumber(Math.abs(anA), digit) == 0)
				return 0;
		}
		
		return 1;
	}
	
	int isVanillaNumber(int n, int digit) {
		while (n > 0) {
			if(n % 10 != digit)
				return 0;
			n /=10;
		}
		return 1;
	}

}
