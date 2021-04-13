package com.divergent.corejava.assignment6;

import java.util.Stack;

/**
 * Class for test Stack
 * 
 * @author Jayant
 *
 */
public class StackSample {
	static void pushSample(Stack<Integer> stack) {
		System.out.println("Push Operation");

		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}

	}

	static void popSample(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void peekSample(Stack<Integer> stack) {
		System.out.println("Peek Operation:");

		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}

	static void searchSample(Stack<Integer> stack) {

		Integer pos = (Integer) stack.search(stack);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		pushSample(stack);
		popSample(stack);
		pushSample(stack);
		peekSample(stack);
		searchSample(stack);
	}
}
