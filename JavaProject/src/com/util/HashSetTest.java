package com.util;

import java.util.HashSet;

// 중복 x, 순서 x
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(1);
		hs.add(3);
		hs.add(2);

		hs.remove(1);
		System.out.println(hs);
		
		for (Integer i : hs) {
			System.out.println(i);
		}
		
	}
}
