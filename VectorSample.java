package com.divergent.corejava.assignment6;

import java.util.Vector;

/**
 * Class for test Vector
 * 
 * @author Jayant
 *
 */
public class VectorSample {
	void vectorSample() {
		Vector<String> vec = new Vector<String>();

		vec.add("He");
		vec.add("She");
		vec.add("It");
		vec.add("Anyname");

		vec.addElement("I"); // using addElement Method of Vector
		vec.addElement("We");
		vec.addElement("You");
		System.out.println("Elements are: " + vec);
	}

	public static void main(String[] args) {
		VectorSample sample = new VectorSample();
		sample.vectorSample();
	}
}
