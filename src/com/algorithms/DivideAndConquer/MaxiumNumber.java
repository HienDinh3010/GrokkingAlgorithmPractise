package com.algorithms.DivideAndConquer;

import java.util.LinkedList;

/**
 * @author Hien
 * Find maximum number in a list
 * Input: list = { 4, 2, 8, 1, 11, 9}
 * Output: 11
 * Algorithm: Recursive Function
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
		System.out.println("Method 1  " + findMax(list, list.get(0)));
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(4);
		list2.add(2);
		list2.add(8);
		list2.add(21);
		list2.add(1);
		list2.add(11);
		list2.add(9);
		System.out.println("Method 2  " + findMaxTwo(list2));
	}
	
	/*
	 * Pseudo code: findMax(list, max) 
	 * - Base case: list is 1 element => return max
	 * - Recursive case: list is more than one element 
	 *   sublist = remove first element from list
	 *   Compare max with first element from sublist => change max to this first element if max is lesser
	 *   call findMax(sublist, max)
	 */
	public static Integer findMax(LinkedList<Integer> list, Integer max) {
		if (list.size() == 1) {
			return max;
		} else {
			list.remove(0);
			max = max < list.get(0) ? list.get(0) : max;
			return findMax(list, max);
		}
	}
	
	/**
	 * Pseudo code: findMaxTwo(list)
	 * - Base case: list is two elements => max = element greater
	 * - Recursive case: 
	 *   if list[0] > list[1] => swap value of list[0] & list[1]
	 *   Remove list[0]
	 *   Call findMaxTwo(list)
	 * @param list 4, 2, 8, 21, 1, 11, 9
	 * @return 21
	 */
	public static Integer findMaxTwo(LinkedList<Integer> list) {
		if (list.size() == 2) {
			return list.get(0) > list.get(1) ? list.get(0): list.get(1);
		} else {
			if (list.get(0) > list.get(1)) {
				list.remove(1);
				list.add(1, list.get(0));
			}
			list.remove(0);
			return findMaxTwo(list);
		}
	}
}
