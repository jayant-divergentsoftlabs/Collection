package com.divergent.corejava.assignment6;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Class for test HashMap
 * 
 * @author Jayant
 *
 */
public class HashMapSample {

	void map() {
		SortedMap<Integer, String> s = new TreeMap<Integer, String>();

		s.put(1, "Jayant");
		s.put(2, "Jay");
		s.put(4, "Herry");
		s.put(3, "Merry");
		System.out.println(s);
		s.put(2, "Jerry");
		System.out.println("After changing name " + s);
		s.remove(4);
		System.out.println("After removing " + s);

	}

	public static void main(String[] args) {
		HashMapSample sample = new HashMapSample();
		sample.map();
	}
}
