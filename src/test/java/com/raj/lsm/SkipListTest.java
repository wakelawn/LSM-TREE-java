package com.raj.lsm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SkipListTest {

	@Test
	void shouldFindInsertedValues() {
		SkipList skipList = new SkipList();

		skipList.insert(10);
		skipList.insert(20);
		skipList.insert(30);

		assertTrue(skipList.contains(10));
		assertTrue(skipList.contains(20));
		assertTrue(skipList.contains(30));
	}

	@Test
	void shouldReturnFalseForMissingValue() {
		SkipList skipList = new SkipList();

		skipList.insert(10);
		skipList.insert(30);

		assertFalse(skipList.contains(20));
	}

	@Test
	void shouldInsertValuesInUnsortedOrder() {
		SkipList skipList = new SkipList();

		skipList.insert(30);
		skipList.insert(10);
		skipList.insert(20);

		assertTrue(skipList.contains(10));
		assertTrue(skipList.contains(20));
		assertTrue(skipList.contains(30));
	}
}