package com.algorithms.DivideAndConquer;

import java.util.LinkedList;

import com.algorithms.common.Artist;
import com.algorithms.common.ArtistModel;

/**
 * @author Hien
 * 
 * Write a recursive function to count the number of items in a list.
 * Input: list Artist
 * Output: count length of list
 * Algorithm: Recursive Function
 * count(list)
 * - Base case: list is empty => return 0
 * - Recursive case: return (count + count(list which is eliminate first element))
 * Note: should use Linkedlist because we need to 
 * remove fist element from the list in each call to recursive function
 */
public class NumberOfItems {

	public static void main(String[] args) {
		System.out.println(count(ArtistModel.getInstance().getArtists()));
	}
	
	public static int count(LinkedList<Artist> list) {
		if (list.size() == 0) {
			return 0;
		}
		list.remove(0);
		return 1 + count(list);
	}
}
