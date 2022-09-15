package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLambda {
	
	public static void main(String[] args) {
		
		List<Integer> score = new ArrayList<>(Arrays.asList(22, 45, 85, 76, 25, 14));
		System.out.println(score);
		
		score.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(score);
		
		score.replaceAll(x -> x *10);
		System.out.println(score);
		
		System.out.println("----------------");
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("tommy");
		list.add("bill");
		list.add("jane");
		list.add("roy");
		list.add("tommy");
		list.add("kim");
		
		// 리스트 안의 내용물들에 대해 조건을 체크한 후 조건에 맞으면 삭제해줌.
		list.removeIf(name -> name.contains("t"));
		System.out.println(list);
		
		list.replaceAll(name -> name + " ssafy");
		System.out.println(list);
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>(); // 선언
//		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(22, 45, 76)); // 선언과 초기화 동시에 하기
//		
//		arr.add(1); // 원소 추가
//		arr.add(1);
//		arr.add(1);
//		arr.remove(0); // 인덱스 기준 제거
//		
//		arr.removeIf(x -> x == 1 || x % 2 == 0);
//		
//		arr.replaceAll(x -> x * 10);
		
	}
}
