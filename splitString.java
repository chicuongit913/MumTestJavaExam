 package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest3 {

	@Test
	void main() {
		char a[] = {'a', 'b', 'c'};
		assertEquals(null, f(a, 0, 4));
		
		char ex1[] = {'a', 'b', 'c'};
		assertArrayEquals(ex1, f(a, 0, 3));
		
		char ex2[] = {'a', 'b'};
		assertArrayEquals(ex2, f(a, 0, 2));
		
		char ex3[] = {'a'};
		assertArrayEquals(ex3, f(a, 0, 1));
	
		assertArrayEquals(null, f(a, 1, 3));
		
		char ex4[] = {'b', 'c'};
		assertArrayEquals(ex4, f(a, 1, 2));
	}

	char[ ] splitString(char[ ] a, int start, int len) {
		
		if(a == null || a.length < (start + len) || start < 0 || len < 0)
			return null;
		
		char[] sub = new char[len];
		for (int i = start, j = 0; i < (start + len); i++, j++) {
			sub[j] = a[i];
		}
		
		return sub;
	}
}
