package com.algorithms.DivideAndConquer;

import java.util.LinkedList;

/**
 * @author Hien
 * Find maximum number in a list
 * Input: list = { 4, 2, 8, 1, 11, 9}
 * Output: 11
 * Algorithm: Recursive Function
 * Pseudo code:
 * findMax(list)
 *   max = list[0]
 * - Base case: list is 1 element => return max
 * - Recursive case: list is more than one element 		
 * 		remove first element from list
 * 		compare 
 *
 */
public class MaxiumNumber {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(21);
		list.add(1);
		list.add(11);
		list.add(9);
		System.out.println(findMax(list, list.get(0)));
	}
	
	public static Integer findMax(LinkedList<Integer> list, Integer max) {
		if (list.size() == 1) {
			return max;
		} else {			
			list.remove(0);
			if (max < list.get(0)) {
				max = list.get(0);
			}
			return findMax(list, max);
		}
	}
}
