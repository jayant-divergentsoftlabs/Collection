package com.divergent.corejava.assignment6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

/**
 * Class for test Random Access Interface
 * 
 * @author Jayant
 *
 */
public class RandomAccessSample {

	void access() {
		Collection<Integer> c = new ArrayList<Integer>();
		if (c instanceof RandomAccess) {
			System.out.println("use random access algorithm");
		} else {
			System.out.println("use sequential access algorithm");
		}
	}

	public static void main(String[] args) {
		RandomAccessSample sample = new RandomAccessSample();
		sample.access();
	}

}
