package checkifsorted;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckIfSortedTest {

	@Test
	void testCheckIfSorted() {
		// testing int arrays
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
		
		// testing String arrays
		String[] str_arr1 = {};
		String[] str_arr2 = {"ab"};
		String[] str_arr3 = {"ab", "bc", "cd", "de", "ef", "fg"};
		String[] str_arr4 = {"bc", "ab", "zz", "aa", "cc", "ee", "bb"};
		String[] str_arr5 = {"zz", "aa"};
		
		assertTrue(CheckIfSorted.checkIfSorted(str_arr1));
		assertTrue(CheckIfSorted.checkIfSorted(str_arr2));
		assertTrue(CheckIfSorted.checkIfSorted(str_arr3));
		
		assertFalse(CheckIfSorted.checkIfSorted(str_arr4));
		assertFalse(CheckIfSorted.checkIfSorted(str_arr5));
 	}
}
