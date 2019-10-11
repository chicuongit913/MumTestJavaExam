package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest5 {

	@Test
	void test() {
		assertArrayEquals(new int[] {1, 2}, matchArray(new int[] {1, 8, 3, 2}, new int[] {4, 2, 6, 1}));
	}
	
	static int[] matchArray(int[] first, int[] second) {
		if(first == null || second == null ) {
			return null;
		}
		System.out.println(Arrays.toString(first));
		if(first.length == 0 || second.length == 0)
			return new int[0];
		int min = (first.length < second.length) ? first.length : second.length;
		int[] a, b;
		if (min == first.length)
		{
			a = first;
			b = second;
		}
		else
		{
			a = second;
			b = first;
		}
		 int[] c = new int[min];
		 int k = 0;
		 for (int i = 0; i < a.length; i++)
		 {
			 for (int j = 0; j < b.length; j++)
			 {
				if (a[i] == b[j])
				{
					c[k] = a[i];
					k++;
				}
			 }		
		 }
			
		int[] retArray = new int[k];
		for (int t = 0; t < retArray.length; t++) {
			retArray[t] = c[t];
		}
		return retArray;
	}

}
