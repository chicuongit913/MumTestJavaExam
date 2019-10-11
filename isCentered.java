package mumTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest1 {

	@Test
	public void main() {
		int f1[] = {1, 2, 3, 4, 5};
		assertEquals(isCentered(f1), 0);
		
		int f2[] = {3, 2, 1, 4, 5};
		assertEquals(isCentered(f2), 1);
		
		int f3[] = {3, 2, 1, 4, 1};
		assertEquals(isCentered(f3), 0);
	}
	
	
	static int isCentered(int[] numbers) {
		if (numbers == null || numbers.length % 2 == 0) 
			return 0;
		
		int midIndex = numbers.length / 2 ;
		int middleItem = numbers[midIndex];
		for (int i=0; i<numbers.length; i++)
		{
			if (i != midIndex && middleItem >= numbers[i])
				return 0;
		}
		return 1;
	}

}
