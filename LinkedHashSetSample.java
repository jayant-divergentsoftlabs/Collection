package com.divergent.corejava.assignment6;

import java.util.LinkedHashSet;

/**
 * Class for test LonkedHashSet
 * 
 * @author Jayant
 *
 */
public class LinkedHashSetSample {
	void set() {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("qwerty");
		linkedset.add("asdfgh");
		linkedset.add("zxcv");
		System.out.println("Size:" + linkedset.size());
		System.out.println("Initial String: " + linkedset);
		System.out.println("Remove zxcv :" + linkedset.remove("zxcv"));
		System.out.println("Checking zxcv is present " + linkedset.contains("zxcv"));
		System.out.println("Checking asdfgh is present " + linkedset.contains("asdfgh"));
		System.out.println("String after updation" + linkedset);
	}

	public static void main(String[] args) {
		LinkedHashSetSample sample = new LinkedHashSetSample();
		sample.set();
	}

}
