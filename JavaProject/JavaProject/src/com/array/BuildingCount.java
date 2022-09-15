package com.array;

import java.util.Scanner;

public class BuildingCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(src);
		
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			int n = sc.nextInt();
			char[][] graph = new char[n][n];
			
			// 그래프 입력 받기
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					graph[i][j] = sc.next().charAt(0); // "G".charAt(0) -> 'G'
				}
			}
			
//			System.out.println(Arrays.deepToString(graph));
			
			// 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
			int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1};
			int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1};
			int result = Integer.MIN_VALUE; // 답
			
			// 배열의 모든 칸 탐색
			for(int x = 0; x < n; x++) { // 행
				for(int y = 0; y < n; y++) { // 열			
					if (graph[x][y] == 'B') { // 빌딩인 경우, 주변 8방 체크해봐야 함
						boolean gExist = false; // 8방 체크하는 도중 공원(G)가 발견되면 TRUE로 바꿔줌
						
						for (int i = 0; i < 8; i++) { // 8방 체크
							// 새로운 위치 계산
							int nx = x + dx[i];
							int ny = y + dy[i];
							
							// nx, ny가 배열 밖이라면...
							if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
								continue; // 다음 방향 체크 gogo
							}
							
							// 배열 안이라면...
							if (graph[nx][ny] == 'G') { // 공원 발견
								gExist = true; // 공원 발견
								break; // 나머지 방향 체크 멈춤
							}
						}
						// 8방향 다 체크 후 or 공원이 발견돼서 break 됐던가
						
						if (gExist == true) {
							if (2 > result) 
								result = 2;
							continue;
						}
						
						// 주변 8방이 모두 빌딩이라서 높이 카운트
						int cnt = -1;
						for (int k = 0; k < n; k++) {
							if (graph[x][k] =='B')  // 가로 방향 카운트. 열.
								cnt += 1;
							
							if (graph[k][y] =='B')  // 세로 방향 카운트. 행.
								cnt += 1;
						}
						
						if (cnt > result)
							result = cnt;
						
					} // B인 경우
 				} // 열
			} // 행
			
			System.out.printf("#%d %d%n", tc, result);
		}

	}
	
	static String src = "3\r\n"
			+ "6\r\n"
			+ "G B G G B B\r\n"
			+ "G B G G B G\r\n"
			+ "B B B B G B\r\n"
			+ "B G B B B B\r\n"
			+ "G B B B B G\r\n"
			+ "G B B B B G\r\n"
			+ "5\r\n"
			+ "G B G G B\r\n"
			+ "G B G G B\r\n"
			+ "B B B B G\r\n"
			+ "B G B B B\r\n"
			+ "G B B B B\r\n"
			+ "3\r\n"
			+ "G G B\r\n"
			+ "G B B\r\n"
			+ "B B B";

}
