package com.divergent.corejava.assignment6;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Class for test HashSet
 * 
 * @author Jayant
 *
 */
public class HashSetSample {
	void set() {
		HashSet<String> a = new HashSet<String>();

		a.add("Never Ever");
		a.add("Give Up");
		a.add("No one will");
		a.add("did it for uh");
		System.out.println(a);
		System.out.println("Contain or not " + a.contains("you can"));
		a.remove("No one will");
		System.out.println("After remove " + a);
		Iterator<String> i = a.iterator();
		while (i.hasNext())
			System.out.println("Iterating " + i.next());
	}

	public static void main(String[] args) {
		HashSetSample setSample = new HashSetSample();
		setSample.set();
	}

}
