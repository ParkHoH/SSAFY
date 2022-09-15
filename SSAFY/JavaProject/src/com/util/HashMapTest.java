package com.util;

import java.util.HashMap;
import java.util.Map;

// map: (key, value)의 상으로 이루어진 자료 구조. key는 중복되면 안됨.
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "first");
		hm.put(2, "second");
		hm.put(2, "third");
		hm.put(4, "third");
		
		System.out.println(hm);

		for (Integer i : hm.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		for (String s : hm.values()) {
			System.out.println(s);
		}
		
//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
//			keyType key = entry.getKey();
//			valType val = entry.getValue();
//			
//		}
//		
//		for (Map.Entry<k, v> entry : hm.entrySet()) {
//			
//		}
		
		hm.entrySet();
		
	}
}
