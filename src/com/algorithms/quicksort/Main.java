package com.algorithms.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hien
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(3,5,2,1,4);
		List<Integer> sort = quickSort(array);
		sort.forEach(e -> System.out.println(e));
	}
	
	/**
	 * If array size = 2 => return array
	 * If array size > 2:
	 * - Choose a pivot = array [0]
	 * - Switch elements lesser than pivot to the left
	 *   Switch elements bigger than pivot to the right
	 * - return quickSort(left array) + pivot + quickSort(right array)
	 * @param array [3,5,2,1,4]
	 * @return [1,2,3,4,5]
	 */
	public static List<Integer> quickSort(List<Integer> array) {
		if (array.size() < 2) {
			return array;
		} else {
			Integer pivot = array.get(0);
			List<Integer> less = new ArrayList<>();
			List<Integer> greater = new ArrayList<>();
			List<Integer> sort = new ArrayList<>();
			for (int i = 1; i < array.size(); i++) {
				if (array.get(i) < pivot) {
					less.add(array.get(i));
				} else {
					greater.add(array.get(i));
				}
			}
			sort.addAll(quickSort(less));
			sort.add(pivot);
			sort.addAll(quickSort(greater));
			return sort;
		}
	}

}
