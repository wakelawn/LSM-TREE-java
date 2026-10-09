
package com.raj.lsm;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LsmTreeTest {
	@Test
	void shouldUpdateExistingValue() {
		LsmTree db = new LsmTree();

		db.put("name", "Raj");
		db.put("name", "Rahul");

		assertEquals("Rahul", db.get("name"));
	}

	@Test
	void shouldReturnNullForMissingKey() {
		LsmTree db = new LsmTree();

		assertEquals(null, db.get("unknown"));
	}

	@Test
	void shouldDeleteExistingKey() {
		LsmTree db = new LsmTree();

		db.put("name", "Raj");
		db.delete("name");

		assertEquals(null, db.get("name"));
	}
}
