package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest33 {

	@Test
	void test() {
		System.out.println(Arrays.toString(clusterCompression(new int[] {0, 0, 0, 2, 0, 2, 0, 2,2 , 2, 0, 0,1})));
		System.out.println(Arrays.toString(clusterCompression(new int[] {})));
	}
	
	int[ ] clusterCompression(int[ ] a) {
		int[] clusterArray = new int[a.length];
		
		if (a.length == 0 || a.length == 1) {
			return a;
		}
		
		int k = 0;
		clusterArray[k] = a[0];
		
		for (int i = 1; i < clusterArray.length; i++) {
			if (clusterArray[k] != a[i] ) {
				k++;
				clusterArray[k] = a[i];
			}
		}
		
		return Arrays.copyOfRange(clusterArray, 0, k+1);
	}
}
