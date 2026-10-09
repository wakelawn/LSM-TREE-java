package com.raj.lsm;

import java.util.HashMap;
import java.util.Map;

public class LsmTree {

	private final Map<String, String> data = new HashMap<>();

	public void put(String key, String value) {
		data.put(key, value);
	}

	public String get(String key) {
		return data.get(key);
	}
	
	public void delete(String key) {
	    data.remove(key);
	}

	public static void main(String[] args) {

		LsmTree db = new LsmTree();

		db.put("name", "Rehan");
		db.put("name", "Raj");

		System.out.println("Data inserted successfully");

		String value = db.get("name");

		System.out.println(value);

		System.out.println(db.get("age"));
		
		db.delete("name");

		System.out.println(db.get("name"));
	}
}