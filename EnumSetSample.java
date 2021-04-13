package com.divergent.corejava.assignment6;

import java.util.EnumSet;
/**
 * Class for Test EnumSet
 * @author Jayant
 *
 */
public class EnumSetSample {
  enum e{
	  ADD,SUBSTRACT,MULTIPLY,DIVISION;
  }
	static void set() {
		EnumSet<e> set1, set2, set3, set4;
		set1=EnumSet.of(e.ADD,e.MULTIPLY);
		 set2 = EnumSet.complementOf(set1);
		 set3 = EnumSet.allOf(e.class);
		 set4 = EnumSet.range(e.SUBSTRACT, e.MULTIPLY);
		 System.out.println("1: " +set1);
		 System.out.println("2: " +set2);
		 System.out.println("3: " +set3);
		 System.out.println("4: " +set4);
	}
public static void main(String[] args) {
	set();
}
}
