package com.divergent.corejava.assignment6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Sample for ArrayList
 * 
 * @author Jayant
 *
 */

public class ArrayListSample {
	void arrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Jayant");
		list.add("Bhaderia");
		Iterator<String> itr = list.iterator(); // Iterator itr=list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		ArrayListSample sample = new ArrayListSample();
		sample.arrayList();
	}
}
