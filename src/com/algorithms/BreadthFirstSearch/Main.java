package com.algorithms.BreadthFirstSearch;

import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.Queue;

/**
 * Breadth-first search
 * Problem: Find the nearest mango seller in your friend network
 * Input: 
 * Your friend network as Hashtable<String, String[]>
 * Output:
 * Name of person who sells mango nearest you, for the simple demo if name contains "m" means he/she sells mango
 * @author dnmhi
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String[]> network = new Hashtable<>();
		network.put("you", new String[] {"Bob", "Claire", "Alice"});
		network.put("Bob", new String[] {"Anuj", "Pegge"});
		network.put("Claire", new String[] {"Thom", "Jonny"});
		network.put("Alice", new String[] {"Pegge"});
		network.put("Anuj", new String[] {});
		network.put("Pegge", new String[] {});
		network.put("Thom", new String[] {});
		network.put("Jonny", new String[] {});
		findMangoSeller(network);
	}
	
	public static boolean findMangoSeller(Hashtable<String, String[]> network) {
		Queue<String> networkQueue = getQueue(network, "you");
		while (!networkQueue.isEmpty()) {
			String name = networkQueue.poll();
			if (isMangoSeller(name)) {
				System.out.println("Mango seller " + name);
				return true;
			}
			networkQueue.addAll(getQueue(network, name));			
		}
		return false;		
	}

	private static Queue<String> getQueue(Hashtable<String, String[]> network, String key) {
		Queue<String> networkQueue = new ArrayDeque<>();
		String[] names = network.get(key);
		for (String name: names) {
			networkQueue.add(name);
		}
		return networkQueue;
	}
	
	/**
	 * @param name
	 * @return true if name contains "m"
	 * Note: just a simple demo for breadth-first search
	 */
	public static boolean isMangoSeller(String name) {
		if (name.contains("m")) {
			return true;
		}
		return false;
	}

}
