package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class MumTest55 {

	@Test
	void test() {
		System.out.print(Arrays.toString(encodeArray(-1)));;
	}

	
	int[] encodeArray(int n) {
		
		if(n == 0)
			return new int[] {1};
		
		int length = 0;
		int number = n;
		
		if(n < 0) {
			length++;
			number = -n;
		}
		
		while (number > 0) {
			length += number%10 + 1;
			number /= 10;
		}
		
		int[] encodeArray = new int[length];
		
		number = n;
		if(n < 0) {
			encodeArray[0] = -1;
			number = -n;
		}
		
		while (number > 0) {
			int i = 0;
			encodeArray[--length] = 1;
			while (i < number%10) {
				encodeArray[--length] = 0;
				i++;
			}
			
			number /= 10;
		}
		
		return encodeArray;
	}
}
