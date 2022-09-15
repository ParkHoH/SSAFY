package com.array;

public class ArrayMulti2D2 {

	public static void main(String[] args) throws Exception {
		int[][] a = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 }, { 5, 6, 7, 8, 9 }, };

		String[] direction = { "UP", "DOWN", "LEFT", "RIGHT" };
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
//		int[][] delta = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // dx, dy랑 같은 표현!

		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				System.out.printf("현재 x 위치: %d%n", x);
				System.out.printf("현재 y 위치: %d%n", y);
				
				//  4방향 접근
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					
					// 배열 안쪽의 위치인지 체크
					if (nx < 0 || ny < 0 || nx >= a.length || ny >= a[x].length) {
						System.out.println("- " + direction[i] + ": OUT OF BOUND!");
						continue;
					}

					System.out.println("- " + direction[i] + ": " + a[nx][ny]);
				}

				System.out.println("--------------------");

			}
		}

	}

}
