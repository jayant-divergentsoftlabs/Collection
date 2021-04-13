package com.divergent.corejava.assignment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class for test forEachRemaining
 * 
 * @author Jayant
 *
 */
public class IteratorforEachSample {

	void sample() {

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");

		Iterator<String> iterator = fruits.iterator();

		iterator.forEachRemaining((f) -> System.out.println(f));
	}

	public static void main(String args[]) {
		IteratorforEachSample eachSample = new IteratorforEachSample();
		eachSample.sample();
	}

}
