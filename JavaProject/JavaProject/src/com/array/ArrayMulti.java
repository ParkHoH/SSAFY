package com.array;

import java.util.Iterator;

// 2차원 이상의 배열: 다차원 배열
public class ArrayMulti {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int [][] multi = new int[3][2];
		
		// 배열의 길이
		System.out.println(multi.length);
		System.out.println(multi[1].length);
		System.out.println("배열의 길이의 합: " + (multi.length + multi[1].length));
		System.out.println("배열의 길이의 합: " + multi.length + multi[1].length);
		
		System.out.println("------------");
		
		int[][] multi2 = new int[3][];
		multi2[0] = new int[5];
		multi2[1] = new int[2];
		multi2[2] = new int[3];
		
		System.out.println("------------");
		
		// 배열 선언 방법: 여러 가지
		int[] x[], y, z[][];
	
		System.out.println("------------");
		
		// 배열의 값을 알고 있는 경우
		int [][] score = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			} // 한 해에 있는 모든 열이 출력됨. 하나의 행 처리가 완료.
			System.out.println(); // 줄바꿈
		} 
		
	}
}
