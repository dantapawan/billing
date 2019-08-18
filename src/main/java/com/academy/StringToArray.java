package com.academy;

import java.util.HashMap;
import java.util.Map;

public class StringToArray {
	public void insertElements(String tossy) {
		//tossy = "elephant";
		char[] array = tossy.toCharArray();
		// int sum = array.length;
		// int count = 0;
		Map<Character, Integer> ma = new HashMap<Character, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!ma.containsKey(array[i])) {


				ma.put(array[i], 1);
				
			} else {
				int val = ma.get(array[i]);
				val++;
				ma.put(array[i], val);
			}
			
		}
		for(Character i :ma.keySet()) {
			System.out.println("key:"+i +" - "+"value:"+ma.get(i));	
			
		
			
		}
		
	}
}