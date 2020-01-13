package com.algorithms.sumarray.DivideAndConquer;

/**
 * @author Hien
 * Sum an array using recursive function
 *
 */
public class SumArray {

	public static void main(String[] args) {
		int[] array = {1,2};
		System.out.println(sum(array));
	}
	
	public static int sum(int[] array) {
		if (array.length == 0 ) {
			return 0;
		} 
		return array[0] + sum(getSubArray(array));
	}

	/**
	 * Get sub array except the first element
	 * @param array [1,2,3,4]
	 * @return [2,3,4]
	 */
	public static int[] getSubArray(int[] array) {
		int length = array.length;
		if (length > 0) {
			int[] subArray = new int[length - 1];
			for (int i = 1; i < length; i++) {
				subArray[i-1] = array[i];
			}
			return subArray;
		}
		return null;
	}
}
