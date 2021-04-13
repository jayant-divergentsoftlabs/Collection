package com.divergent.corejava.assignment6;

import java.util.EnumMap;

/**
 * Class for test EnumMap
 * 
 * @author Jayant
 *
 */
public class EnumMapSample {
	public enum shirt {
		S, M, L, XL, XXL;
	}

	static void test() {
		EnumMap<shirt, String> s = new EnumMap<shirt, String>(shirt.class);
		s.put(shirt.S, "Small");
		s.put(shirt.M, "Medium");
		s.put(shirt.L, "Large");
		s.put(shirt.XL, "Extra Large");
		System.out.println(s);
		System.out.println("Size of ENUM is " + s.size());

	}

	public static void main(String[] args) {
		test();
	}
}
