package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest28 {

	@Test
	void test() {
		assertEquals(1, isTrivalent(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
		
	}
	
	int isTrivalent (int[ ] a) {
		if (a == null || a.length < 3) {
			return 0;
		}
		int[] tempArray = new int[a.length];;
		int lengthArray = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(!isNinArray(a[i], tempArray, lengthArray)) {
				tempArray[lengthArray] = a[i];
				lengthArray++;
			}
		}
		
		if(lengthArray == 3)
			return 1;
		else return 0;
	}
	
	boolean isNinArray(int n, int[] a, int lengthArray) {
		
		if(lengthArray == 0) {
			return false;
		}
		
		for (int i = 0; i < lengthArray; i++) {
			if(a[i] == n)
				return true;
		}
		
		return false;
	}
}
