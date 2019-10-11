package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest15 {

	@Test
	void test() {
		assertEquals(16, guthrieIndex(7));	
		assertEquals(0, guthrieIndex(1));
		assertEquals(1, guthrieIndex(2));
		assertEquals(2, guthrieIndex(4));
		assertEquals(8, guthrieIndex(42));
	}

	int guthrieIndex(int n) {
		if (n <= 0) {
			return 0;
		}
		int guthrieIndex = 0;
		while (n != 1) {
			n = caculateNextGuthrieNumber(n);
			guthrieIndex++;
		}
		return guthrieIndex;
	}
	
	int caculateNextGuthrieNumber(int n) {
		if(n % 2 == 0) {
			return n/2;
		} else {
			return n*3+1;
		}
	}
}
