package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.media.sound.AlawCodec;

class MumTest6 {

	@Test
	void test() {
		assertEquals(3, findPOE(new int[] {1, 8, 3, 7, 10, 2}));
		assertEquals(2, findPOE(new int[] {1, 5, 3, 1, 1, 1, 1, 1, 1}));
		assertEquals(5, findPOE(new int[] {2, 1, 1, 1, 2, 1, 7}));
		assertEquals(-1, findPOE(new int[] {1, 2, 3}));
		assertEquals(-1, findPOE(new int[] {3, 4, 5, 10}));
		assertEquals(-1, findPOE(new int[] {1, 2, 10, 3, 4}));
	}
	
	int findPOE(int[] a) {
		if (a.length < 3 || a == null) {
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum +=a[j];
			}
			
			for (int k = i+1; k < a.length; k++) {
				rightSum +=a[k];
			}
			
			if(leftSum == rightSum)
				return i;
		}
		return -1;
	}
}
