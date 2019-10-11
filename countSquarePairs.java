package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sun.awt.www.content.audio.x_aiff;

import java.lang.Math;
import java.lang.Math;

class MumTest10 {

	@Test
	void test() {
		assertEquals(2, countSquarePairs(new int[] {9, 0, 2, -5, 7}));
		assertEquals(0, countSquarePairs(new int[] {9}));
		assertEquals(2, countSquarePairs(new int[] {5, 20, 4, 0}));
		
	}
	
	int countSquarePairs(int[ ] a) {
		if (a == null || a.length < 2) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] != a[j] && a[i] > 0 && a[j] > 0 && isSquareRoot(a[i]+a[j]))
				{
					count++;
				}
			}
		}
		
		return count;
	}
	
	boolean isSquareRoot(int number) {
		double root = Math.sqrt(number);
		
		if (root == (int) root) {
			return true;
		}
		
		return false;
	}
}
