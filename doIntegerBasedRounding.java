package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.tools.classfile.Annotation.element_value;

class MumTest47 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	void doIntegerBasedRounding(int[ ] a, int n) {
		if (n < 0 ) {
			for (int i = 0; i < a.length; i++) {
				int j = 1; 
				boolean found = false;
				while (!found) {
					int prev = n * ( j - 1);
					int next = n * j;
					if (a[i] >= prev && a[i] <= next) {
						if (found) {
							if (a[i] == prev) {
								a[i] = prev;
							} else if (a[i] == next) {
								a[i] = next;
							} else if(a[i] - prev == next - a[i]){
								a[i] = next; // greater one is used 
							} else if(a[i] - prev > next - a[i]){
								a[i] = next;
							} else {
								a[i] = prev;
							}
						}
						found = true;
					}
					j++;
				}
			}
		}
	}
}
