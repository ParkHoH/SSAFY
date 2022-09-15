package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulti2D {

	public static void main(String[] args) throws Exception {
		int [][] a = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};
//		System.out.println(Arrays.deepToString(a));
	
		// 외부에서 행, 열값 입력 받기
//		int z = System.in.read(); 
			// 예외 처리를 해줘야 함.
		    // read의 경우 모든 값을 int로 받기 때문에 불편함.
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); // 행
		int j = sc.nextInt(); // 열
		
		String[] direction = {"up", "down", "left", "right"};
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			
			if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) {
				System.out.println("out of bound!!");
				continue;
			}
				
			System.out.println(direction[k] + ": " + a[nx][ny]);
		}
	
	}

}
