package checkifsorted;
/**
 * This class will provides static method to check if an array is sorted
 * 
 * author: Phu Ha
 * date: February 25, 2024
 */

public class CheckIfSorted {
	
	// for int array
	public static boolean checkIfSorted(int[] arr) {
		// edge case, if arr is empty or arr is of length 1, return true
		if (arr.length == 0 || arr.length == 1) {
			return true;
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			// if the value at i+1 is less than value at i, return false
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	// for object array that implements comparable
	public static <T extends Comparable<? super T>> boolean checkIfSorted(T[] arr) {
		//edge case
		if (arr.length == 0 || arr.length == 1) return true;
		
		for (int i = 1; i < arr.length; i++) {
			// if using compareTo method on value at i to value at i - 1 < 0, return false
			if (arr[i].compareTo(arr[i - 1]) < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Is [1, 2, 3] sorted? " + checkIfSorted(new int[]{1, 2, 3}));
		System.out.println("Is [2, 3, 1] sorted? " +checkIfSorted(new int[]{ 2, 3, 1}));
	}
}
