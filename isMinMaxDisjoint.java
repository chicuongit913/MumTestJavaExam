package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class MumTest31 {

	@Test
	void test() {
		assertEquals(0, isMinMaxDisjoint(new int[] {18, -1, 3, 4, 0}));
		assertEquals(1, isMinMaxDisjoint(new int[] {9, 0, 5, 19}));
		assertEquals(0, isMinMaxDisjoint(new int[] {0, 5, 18, 0, 9}));
		assertEquals(0, isMinMaxDisjoint(new int[] {7, 7, 7, 7}));
		assertEquals(0, isMinMaxDisjoint(new int[] {}));
		assertEquals(1, isMinMaxDisjoint(new int[] {0, -1 , -2 , -3 , -4, 5, 9, 2 , 18}));
	}

	int isMinMaxDisjoint(int[ ] a) {
		if (a == null|| a.length < 3) {
			return 0;
		}

		int minIndex = 0, maxIndex = 0;
		int minOccour = 1, maxOccour = 1;
		
		for (int i = 1; i < a.length; i++) {
			if(a[minIndex] > a[i]) {
				minIndex = i;
				minOccour = 1;
			} else if (a[maxIndex] < a[i]) {
				maxIndex = i;
				maxOccour = 1;
			} else if (a[minIndex] == a[i]) {
				minOccour++;
			} else if (a[maxIndex] == a[i]) {
				maxOccour++;
			}
		}
		System.out.println(Arrays.toString(new int[] {minIndex, maxIndex, minOccour, maxOccour}));
		if(a[minIndex] != a[maxIndex] && Math.abs(minIndex-maxIndex) != 1 && minOccour == 1 && maxOccour == 1) {
			return 1;
		}
		return 0;
	}
	
	
}
