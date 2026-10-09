
package com.raj.lsm;

public class SkipList {

	private static final int MAX_LEVEL = 4;

	private final Node head = new Node(Integer.MIN_VALUE, MAX_LEVEL);

	private static class Node {

		int value;
		Node[] next;

		Node(int value, int level) {
			this.value = value;
			this.next = new Node[level + 1];
		}
	}

	// method checks whether a number exists in the list by following the
	// connections at level 0
	public boolean contains(int target) {
		Node current = head.next[0];

		while (current != null) {
			if (current.value == target) {
				return true;
			}

			current = current.next[0];
		}

		return false;
	}

	// method inserts a new number into the list at level 0
	public void insert(int value) {
		Node current = head;

		while (current.next[0] != null && current.next[0].value < value) {
			current = current.next[0];
		}

		Node newNode = new Node(value, 0);

		newNode.next[0] = current.next[0];
		current.next[0] = newNode;
	}
}
