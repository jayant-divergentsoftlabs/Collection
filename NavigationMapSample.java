package com.divergent.corejava.assignment6;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Class for test NavigationMap
 * 
 * @author Jayant
 *
 */
public class NavigationMapSample {
	void map() {
		NavigableMap<String, Integer> n = new TreeMap<String, Integer>();
		n.put("Jay", 111);
		n.put("Jayant", 112);
		n.put("Sharvil", 114);
		n.put("Arpit", 113);
		System.out.println("Navigation map" + n);
		System.out.println("Descending order " + n.descendingMap());
		System.out.printf("Last Key : " + n.lastKey());
		System.out.printf("\nFirst Key : " + n.firstKey());

	}

	public static void main(String[] args) {
		NavigationMapSample sample = new NavigationMapSample();
		sample.map();
	}
}
