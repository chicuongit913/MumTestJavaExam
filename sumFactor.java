package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.comp.Analyzer;

class MumTest14 {

	@Test
	void test() {
		assertEquals(4, sumFactor(new int[] {1, -1, 1, -1, 1, -1, 1}));
		assertEquals(0, sumFactor(new int[] {1, 2, 3, 4}));
		assertEquals(2, sumFactor(new int[] {3, 0, 2, -5, 0}));
		assertEquals(1, sumFactor(new int[] {1}));
		assertEquals(3, sumFactor(new int[] {0, 0, 0}));
		
	}
	
	int sumFactor(int[ ] a) {
		if(a == null || a.length == 0)
			return 0;
		
		int sumA = 0, sumFactor = 0;
		for (int anA : a) {
			sumA += anA;
		}
		
		for(int anA : a) {
			if (sumA == anA) {
				sumFactor++;
			}
		}
		
		return sumFactor;
	}

}
