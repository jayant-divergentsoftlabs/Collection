package com.divergent.corejava.assignment6;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Class for test NavigationSet
 * 
 * @author Jayant
 *
 */
public class NavigationSetSample {
	static void sample() {
		NavigableSet<Integer> n = new TreeSet<Integer>();
		n.add(2);
		n.add(4);
		n.add(6);
		n.add(10);
		n.add(8);
		System.out.println("Initial Values" + n);
		System.out.println("Reverse " + n.descendingSet());
		System.out.println("Value more thn 4 " + n.tailSet(4, true));
		System.out.println("Pool first " + n.pollFirst());
		System.out.println("Pool Last " + n.pollLast());
	}

	public static void main(String[] args) {
		sample();
	}
}
