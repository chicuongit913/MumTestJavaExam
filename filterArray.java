package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest40 {

	@Test
	void test() {
		System.out.println(Arrays.toString(filterArray(new int[] {9, -9} , 4)));
	}
	int[ ] filterArray(int[ ] a, int n) {
		if (a.length == 0 || n == 0) {
			return new int[] {};
		}
		int i = 0;
		int count = 0;
		int[] representation = new int[a.length + 1];
		while ( n > 0 && i < a.length+1) {
			if(n%2 != 0)
			{
				representation[i] = count;
				i++;
			}
			count++;
			n /=2;
		}
		System.out.println(Arrays.toString(representation));
		System.out.println(representation[i-1]);
		
		if(representation[i-1] >= a.length)
			return null;
		
		int[] tempArr = new int[i];
		for (int j = 0; j < i; j++) {
			tempArr[j] = a[representation[j]];
		}
		
		return tempArr;
	}
}
