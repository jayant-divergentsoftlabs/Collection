package com.divergent.corejava.assignment6;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Class for test of removing Iterator
 * 
 * @author Jayant
 *
 */
public class IteratorRemoveSample {

	void method() {
		ArrayList<String> vehicles = new ArrayList<String>();
		vehicles.add("Car");
		vehicles.add("Truck");
		vehicles.add("Bike");
		vehicles.add("Cycle");

		ListIterator<String> listIterator = vehicles.listIterator();
		System.out.println("Before remove : " + vehicles);
		listIterator.next();

		listIterator.remove();
		listIterator.next();
		listIterator.remove();
		System.out.println("After remove  " + vehicles);
	}

	public static void main(String[] args) {
		IteratorRemoveSample sample = new IteratorRemoveSample();
		sample.method();

	}
}
