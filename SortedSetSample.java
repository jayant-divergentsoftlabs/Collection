package com.divergent.corejava.assignment6;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * Class for SortedSet with forEachReamaining
 * @author Jayant
 *
 */
public class SortedSetSample {
     void sorted() {
    	 SortedSet<String>s=new TreeSet<String>();
    	 s.add("Z");
    	 s.add("w");
    	 s.add("A");
    	 s.add("a");
    	 System.out.println(s);
    	 s.remove("w");
    	 System.out.println("String after removing s " +s);
    	 System.out.println("Iterating ");
    	 Iterator<String>i=s.iterator();
    	 i.forEachRemaining((it) ->System.out.println(it) );
     }
public static void main(String[] args) {
	SortedSetSample sample=new SortedSetSample();
	sample.sorted();
}
}
