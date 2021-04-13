package com.divergent.corejava.assignment6;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Class for test PriorityQueue
 * 
 * @author Jayant
 *
 */
public class PriorityQueueSample {
	static void priorityM() {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Hello");
		queue.add("Hy");
		queue.add("Bye Bye");
		// Using queue methods
		System.out.println("head of queue:" + queue.peek());
		Iterator<String> itr = queue.iterator(); // generic iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {

		PriorityQueueSample.priorityM();
	}
}
