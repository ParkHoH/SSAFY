package com.util;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> name = new Vector<>();
		name.add("spring");
		name.add("summer");
		name.add("fall");
		name.add("winter");
		name.add("spring");
		name.add(2, "idx add");
//		name.add(123); // 에러 발생

		name.remove(1);
//		name.clear(); // remvoe all

		for (String s : name) {
			System.out.println(s);
		}

		System.out.println("--------------");

		Vector v1 = new Vector(2, 2); // (내부 배열 크기 2, 늘릴 때 크기 2)

		System.out.println(v1.capacity());
		v1.add(123);
		v1.add("Hello");
		v1.add(true);
		System.out.println(v1.capacity());
		v1.add(12.3);
		v1.add("Hello");
		System.out.println(v1.capacity());

		for (int i = 0; i < v1.size(); i++) { // v1.size(): v1 안의 내용물 갯수
			System.out.println(v1.get(i));
		}

	}
}
