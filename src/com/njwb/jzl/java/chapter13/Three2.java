package com.njwb.jzl.java.chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Three2 {
	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Alpha", 98);
		hMap.put("Beta", 60);
		hMap.put("Sigema", 80);
		Integer integer = null;

		Iterator iterator = hMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();

			String key = (String) entry.getKey();
			int value = (int) entry.getValue();
			System.out.println(key + ":" + value);

		}

		hMap.put("Sigema", 100);

		iterator = hMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();

			String key = (String) entry.getKey();
			int value = (int) entry.getValue();
			System.out.println(key + ":" + value);

		}

	}
}
