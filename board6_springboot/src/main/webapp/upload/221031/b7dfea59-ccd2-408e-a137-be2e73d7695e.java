import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo2_서울_14_박호현 {
	static int R, C; // 행의 길이, 열의 길이
	static Point start, end; // M의 좌표, Z의 좌표
	static char[] answer; // 정답 배열
	
	static char[][] board; // (R, C)로 구성된 board
	static boolean[][] visited;
	
	static int[] dx = {0, 0, 1, -1}; // 방향 백터: 동,서,남,북
	static int[] dy = {1, -1, 0, 0}; // 방향 백터: 동,서,남,북
	
	public static void main(String[] args) throws Exception { // 예외 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 br 선언
		StringTokenizer st; // 입력을 위한 st 선언
		
		int TC = Integer.parseInt(br.readLine()); // 전체 테스트 케이스
		
		for (int tc = 1; tc <= TC; tc++) { // 테스트 케이스 만큼 반복 
			st = new StringTokenizer(br.readLine()); // R, C를 입력 받기 위한 st 선언
			
			R = Integer.parseInt(st.nextToken()); // 행의 길이
			C = Integer.parseInt(st.nextToken()); // 열의 길이
			
			board = new char[R][]; // 행의 길이만큼 board를 초기화 해줌
			visited = new boolean[R][C];
			answer = new char[3]; // 정답 선언

			for (int i = 0; i < R; i++) { // 행의 길이만큼 반복하며,
				board[i] = br.readLine().toCharArray(); // board에 값을 char로 넣어줌
			}
			
			for (int i = 0; i < R; i++) { // 행의 길이만큼 반복
				for (int j = 0; j < C; j++) { // 열의 길이만큼 반복
					if (board[i][j] == 'M') { // 출발지인 경우
						start = new Point(i, j); // 좌표 저장
					} else if (board[i][j] == 'Z') { // 목적지인 경우
						end = new Point(i, j); //  좌표 저장
					}
				}
			}
			
			boolean exist = false; // 방향에 값이 존재하는지 확인
			visited[start.x][start.y] = true;
			
			for (int i = 0; i < 4; i++) { // 4방향을 탐색
				int nx = start.x + dx[i];
				int ny = start.y + dy[i];
				
				if (nx < 0 || ny < 0 || nx >= R || ny >= C || board[nx][ny] == '.') {
					continue;
				}
				
				if (chk_dir(nx, ny, i)) {
					exist = true;
					break;
				}
			}
			
			if (!exist) {
				check_possible(start.x, start.y);
			}
			
			
			System.out.println("#" + tc + " " + answer[0] + " " + answer[1] + " " + answer[2]);
		}
	}

	private static void check_possible(int x, int y) {
		System.out.println();
		
	}

	private static boolean chk_dir(int x, int y, int dir) {
		char cur = board[x][y];
		
		if (dir == 0) {
			if (cur == '-') {
				chk_dir(x, y-1, dir);
				return true;
				
			} else if (cur == '+') {
				chk_dir(x, y-1, dir);
				return true;
				
			} else if (cur == '1') {
				chk_dir(x+1, y, 2);
				return true;
			}
		}
		
		if (dir == 1) {
			if (cur == '-') {
				chk_dir(x, y+1, dir);
				return true;
				
			} else if (cur == '+') {
				chk_dir(x, y+1, dir);
				return true;
				
			} else if (cur == '3') {
				chk_dir(x-1, y, 3);
				return true;
				
			} else if (cur == '4') {
				chk_dir(x+1, y, 2);
				return true;
				
			}
		}
		
		if (dir == 2) { // 남
			if (cur == '|') {
				chk_dir(x+1, y, dir);
				return true;
				
			} else if (cur == '+') {
				chk_dir(x+1, y, dir);
				return true;
				
			} else if (cur == '2') {
				chk_dir(x, y+1, 0);
				return true;
				
			} else if (cur == '3') {
				chk_dir(x, y-1, 1);
				return true;
				
			}
		}
		
		if (dir == 3) { // 북
			if (cur == '|') {
				chk_dir(x-1, y, dir);
				return true;
				
			} else if (cur == '+') {
				chk_dir(x-1, y, dir);
				return true;
				
			} else if (cur == '1') {
				chk_dir(x, y+1, 0);
				return true;
				
			} else if (cur == '4') {
				chk_dir(x, y-1, 1);
				return true;
				
			}
			
		}
			
			
		check_possible(x, y);
		
		return false;
	}
	
}
