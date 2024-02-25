package checkifsorted;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckIfSortedTest {

	@Test
	void testCheckIfSorted() {
		int[] arr1 = {};
		int[] arr2 = {1};
		int[] arr3 = { 0, 0, 0, 0, 0, 0, 0, 0};
		int[] arr4 = {1, 2, 3, 4, 5, 5, 5, 6, 7};
		int[] arr5 = { 1, 0 , 1, 0, 1, 1 ,0};
		int[] arr6 = { 0, 1, 2, 3, 4, 5, 1};
		
		assertTrue(CheckIfSorted.checkIfSorted(arr1));
		assertTrue(CheckIfSorted.checkIfSorted(arr2));
		assertTrue(CheckIfSorted.checkIfSorted(arr3));
		assertTrue(CheckIfSorted.checkIfSorted(arr4));
		
		assertFalse(CheckIfSorted.checkIfSorted(arr5));
		assertFalse(CheckIfSorted.checkIfSorted(arr6));
 	}
}
