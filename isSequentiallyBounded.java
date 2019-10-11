package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest30 {

	@Test
	void test() {
		assertEquals(0, isSequentiallyBounded(new int[]{0}));
		assertEquals(1, isSequentiallyBounded(new int[]{2}));
		assertEquals(1, isSequentiallyBounded(new int[]{1, 2, 2, 3}));
		assertEquals(1, isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99, 100, 100, 101} ));
	}

	int isSequentiallyBounded(int[ ] a) {
		if (a.length == 0) {
			return 1;
		}
		
		if (a.length == 1 && a[0] == 0) {
			return 0;
		}
		
		int occurs = 0;
		int j = 0;
		for (int i = 0; i < a.length-1; i++) {
			j = i + 1;
			occurs = 1;
			
			while (j < a.length && a[i] == a[j]) {
				occurs++;
				j++;
			}

			if(a[i] < occurs ||  a[i] > a[j])
				return 0;
			
			i = j-1;
		}
		
		return 1;
	}
}
