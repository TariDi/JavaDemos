package com.demo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String args[]) {
		Map<String,Integer> hm = new HashMap<>();
		hm.put("Kishori", 22);
		hm.put("Tarini", 16);
		hm.put("Rashmi", 25);
		
		/*System.out.println(hm.get("Rashmi"));
		Set<String> keys = hm.keySet();
		
		for(String s : keys) {
			System.out.println(hm.get(s));
		}
		
		Iterator<String> it= keys.iterator();
		
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(hm.get(s));
		}*/
		
		Set<Entry<String, Integer>> keys2= hm.entrySet();
		Iterator<Entry<String, Integer>> it2= keys2.iterator();
		
		while(it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();	//Entry is a nested class of Map
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
}
