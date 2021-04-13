package com.divergent.corejava.assignment6;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Class for testing Dequeue
 * 
 * @author Jayant
 *
 */
public class DequeueSample {
	void sample() {
		Deque<String> deque = new LinkedList<String>();
		deque.add("Hello Foot");
		deque.add("Hello mid");
		deque.add("Hello Head");
		System.out.println(deque + "\n");
		deque.removeFirst();
		deque.removeLast();
		System.out.println("After removing" + deque);
	}

	public static void main(String[] args) {
		DequeueSample sample1 = new DequeueSample();
		sample1.sample();
	}
}
