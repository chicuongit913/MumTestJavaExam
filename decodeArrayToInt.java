package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest52 {

	@Test
	void test() {
		System.out.println(decodeArray(new int[] {-1, 0, 1}));
	}

	int decodeArray(int[ ] a) {
		if (a.length == 0) {
			return 0;
		}
		
		int signal = 1;
		int start = 0;
		
		if(a[0] == -1)
		{
			signal = -1;
			start = 1;
		}
		
		int sum = 0;
		int countN = 0;
		for (int i = start; i < a.length;) {
			if (a[i] == 0) {
				countN++;
				i++;
			} else if (a[i] == 1) {
				System.out.println(a[i]);
				sum = sum * 10 + countN ;
				countN = 0;
				i++;
			} else if (a[i] != 0 || a[i] != 1) {
				return 0;
			} else 
				i++;
		}
		if(signal == -1)
			return -sum;
		return sum;
	}
}
