package com.algorithms.selectionsort;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Artist> list = new ArrayList<>();
		list.add(new Artist("Trinh Cong Son", 156));
		list.add(new Artist("Son Tung mtp", 88));
		list.add(new Artist("Coldplay", 200));
		list.add(new Artist("Khanh Ly", 5));
		list.add(new Artist("Thuy Chi", 256));
		list.add(new Artist("Emily", 89));
		
		List<Artist> downSort = downSort(list);
		downSort.forEach(x -> System.out.println(x.getName()));
	}
	
	public static List<Artist> downSort(List<Artist> list) {
		List<Artist> sortList = new ArrayList<>();
		Artist artist = getArtist(list);
		while (artist != null) {
			sortList.add(artist);
			list.remove(artist);
			artist = getArtist(list);
		}
		return sortList;
	}

	private static Artist getArtist(List<Artist> list) {
		if (!list.isEmpty()) {
			int max = list.get(0).getCount();
			int indexMax = 0;
			for (int i = 1; i < list.size(); i++) {
				int count = list.get(i).getCount();
				if (max < count) {
					indexMax = i;
					max = count;
				}
			}
			// Find element have max
			Artist artist = list.get(indexMax);
			return artist;
		}
		return null;
	}

}
