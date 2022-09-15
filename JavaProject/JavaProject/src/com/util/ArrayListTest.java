package com.util;

import java.util.ArrayList;

import com.abst.Circle;
import com.abst.Rect;
import com.abst.Shape;

// 중복 o, 순서 o
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Shape> slist = new ArrayList<>();
		slist.add(new Circle(3));
		slist.add(new Rect(3, 4));
		
		for (Shape shape : slist) {
			System.out.println(shape.getClass().getSimpleName());
			System.out.printf("%.2f%n", shape.getArea());
			System.out.printf("%.2f%n", shape.getCircum());
		}
		
		System.out.println("-------------");
		
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println(arr.size());
		System.out.println(arr.indexOf(1));
		
		arr.add(1); // auto-boxing
		arr.add(2);
		arr.add(3);
		
		for (Integer i : arr) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		arr.clear();
		
		for (Integer i : arr) {
			System.out.println(i);
		}
	}
	
}
