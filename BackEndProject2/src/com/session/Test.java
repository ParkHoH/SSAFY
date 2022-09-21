package com.session;

import java.awt.Point;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Point point1 = new Point(1, 1);
		HashMap<Point, Integer> map = new HashMap<>();
		
		map.put(point1, 1);
		
		Point point2 = new Point(1, 1);
		
		System.out.println(map.containsKey(point2));
		
	}
}
