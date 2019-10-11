package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MumTest13 {

	@Test
	void test() {
		assertEquals(1, stantonMeasure(new int[] {1}));
		assertEquals(1, stantonMeasure(new int[] {0}));
		assertEquals(0, stantonMeasure(new int[] {3, 1, 1, 4}));
		assertEquals(6, stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
		assertEquals(0, stantonMeasure(new int[] {}));
	}
	
	int stantonMeasure(int[ ] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		
		int oneCount = 0, stantonMeasure = 0;
		
		for (int anA : a) {
            if (anA == 1) {
                oneCount++;
            }
        }

        for (int anA : a) {
            if (anA == oneCount)
                stantonMeasure++;
        }

        return stantonMeasure;
		
	}

}
