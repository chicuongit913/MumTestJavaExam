package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest24 {

	@Test
	void test() {
		assertEquals(0, isStacked(7));
		assertEquals(1, isStacked(10));
		assertEquals(1, isStacked(15));
		assertEquals(1, isStacked(1));
		assertEquals(1, isStacked(3));
		assertEquals(1, isStacked(21));
		assertEquals(1, isStacked(28));
		assertEquals(0, isStacked(30));
		assertEquals(0, isStacked(230));
	}

	int isStacked(int n) {
		if (n <= 0) {
			return 0;
		}

		int sumStack = 0;
		for (int i = 1; i <= n && sumStack <= n ; i++) {
			sumStack +=i;
			if(sumStack == n)
				return 1;
		}
		
		return 0;
	}
}
