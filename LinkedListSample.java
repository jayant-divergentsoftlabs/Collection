package com.divergent.corejava.assignment6;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Sample for LinkedList
 * 
 * @author Jayant
 *
 */
public class LinkedListSample {
	void linkList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(22);
		list.add(11); // Storing duplicate element
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}

	public static void main(String[] args) {
		LinkedListSample sample = new LinkedListSample();
		sample.linkList();
	}

}
