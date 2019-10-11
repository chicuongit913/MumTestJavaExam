package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest23 {

	@Test
	void test() {
		assertEquals(1, matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {3, -2, 3}));
		assertEquals(1, matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {2, 1, -1, -1, 2, 1}));
		assertEquals(1, matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {2, 1, -2, 3}));
		assertEquals(1, matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {1, 1, 1, -1, -1, 1, 1, 1}));
		assertEquals(0, matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {4, -1, 3}));
	}
	
	int matches(int[ ] a, int[ ] p) {
		if (a == null || a.length == 0 || p == null || p.length == 0) {
			return 0;
		}
		
		int startSequence = 0;
		int sumP = 0;
		for (int i = 0; i < p.length; i++) {
			
			int lengthSequence = Math.abs(p[i]);
			sumP +=lengthSequence;
			
			if(startSequence + lengthSequence > a.length || lengthSequence == 0)
				return 0;
			
			int[] sequences = Arrays.copyOfRange(a, startSequence, startSequence+lengthSequence);
			boolean nPositive = isPositive(p[i]);
			boolean checkPositive = checkPositiveArray(sequences);
			
			if(nPositive != checkPositive)
				return 0;
			
			startSequence += lengthSequence;
		}
		
		if(sumP == a.length)
			return 1;
		else
			return 0;
	}
	
	boolean checkPositiveArray(int[] a) {
		boolean checkPositive = true;
		
		for (int anA : a) {
			if(anA <= 0)
				checkPositive = false;
		}
		
		return checkPositive;
	}
	
	boolean isPositive(int n) {
		if(n>0)
			return true;
		else
			return false;
	}
}
