package com.algorithms.sumarray.recursivefunction;

/**
 * @author Hien
 * Sum an array using recursive function
 *
 */
public class SumArray {

	public static void main(String[] args) {
		int[] array = {1,2,4,6};
		System.out.println(sum(array, 0));
	}
	
	public static int sum(int[] array, int total) {
		if (array.length == 1 ) {
			total =+ array[0];
		} else {
			total = array[0] + sum(getSubArray(array), total);
		}
		return total;
	}

	/**
	 * Get sub array except the first element
	 * @param array [1,2,3,4]
	 * @return [2,3,4]
	 */
	public static int[] getSubArray(int[] array) {
		int length = array.length;
		if (length > 1) {
			int[] subArray = new int[length - 1];
			for (int i = 1; i < length; i++) {
				subArray[i-1] = array[i];
			}
			return subArray;
		}
		return null;
	}
}
