package com.divergent.corejava.assignment6;

import java.util.TreeSet;

/**
 * Class for test TreeSet
 * 
 * @author Jayant
 *
 */
public class TreeSetSample {

	void method() {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(11);
		t.add(22);
		t.add(1);
		t.add(50);
		System.out.println("Initial value " + t);
		System.out.println("Order change" + t.descendingSet());
		System.out.println("Head value" + t.headSet(22));
		System.out.println("Tail value" + t.tailSet(22));
		System.out.println("Mid(sub) value" + t.subSet(11, 50));
		System.out.println("Highest value " + t.pollFirst());
		System.out.println("Lowest value " + t.pollLast());

	}

	public static void main(String[] args) {
		TreeSetSample sample = new TreeSetSample();
		sample.method();

	}
}
