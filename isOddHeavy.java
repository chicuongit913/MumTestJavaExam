package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest37 {

	@Test
	void test() {
		assertEquals(1, isOddHeavy(new int[] {11, 4, 8, 9, 15}));
	}

	int isOddHeavy(int[ ] a) {
		if(a.length == 0)
			return 0;
		
		int maxEvent = a[0];
		boolean isExistOdd = false;
		boolean isExistEven = false;
		
		for(int anA : a) {
			if(anA % 2 == 0 && (maxEvent % 2 != 0 || maxEvent <= anA)) {
				maxEvent = anA;
				isExistEven = true;
			} else {
				isExistOdd = true;
			}
		}
		
		if(!isExistOdd)
			return 0;
		
		if(!isExistEven)
			return 1;
		
		for (int anA : a) {
			if(anA %2 != 0 && (anA < maxEvent || maxEvent%2 != 0) )
				return 0;
		}
		
		return 1;
	}
}
