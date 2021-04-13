package com.divergent.corejava.assignment6;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class for test ArrayDeque
 * 
 * @author Jayant
 *
 */
public class ArrayDequeSample {
	void array() {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(11);
		deque.add(22);
		deque.add(33);
		System.out.println(deque + "\n");
		deque.removeFirst();
		deque.removeLast();
		System.out.println("After removing" + deque);
	}

	public static void main(String[] args) {
		ArrayDequeSample sample = new ArrayDequeSample();
		sample.array();
	}
}
