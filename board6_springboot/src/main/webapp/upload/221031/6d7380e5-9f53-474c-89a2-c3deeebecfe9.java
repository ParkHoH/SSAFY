import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Algo1_서울_14_박호현 {
	static int X; // 목표 길이
	static PriorityQueue<Integer> stick; // 자른 스틱을 담을 우선순위 큐
	
	public static void main(String[] args) throws Exception { // 예외 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 br 선언
		
		int TC = Integer.parseInt(br.readLine()); // 전체 테스트 케이스
		
		for (int tc = 1; tc <= TC; tc++) { // 테스트 케이스만큼 반복
			X = Integer.parseInt(br.readLine()); // 목표 길이
			stick = new PriorityQueue<>((o1, o2) -> (o1 - o2)); // stick을 가장 작은 순으로 정렬해줌
			
			stick.add(64); // 64cm 길이의 막대를 처음에 넣기
			
			System.out.println("#" + tc + " " + go()); // 전체 결과 출력
		}
	}

	private static int go() { // 답으로 구성된 스틱을 구하는 함수 -> 개수를 리턴해줌
		while (true) { // 중지할 때까지 반복
			int oriSum = 0; // 현재 stick의 합을 구하기 위한 변수
			
			for (Integer i : stick) { // 모든 stick을 돌면서
				oriSum += i; // oriSum에 더해줌
			}
			
			if (oriSum == X) { // 더해준 값이 X와 같은 경우,
				return stick.size(); // 사이즈를 리턴해줌
			}
			
			int popNum = stick.poll(); // 스틱에서 가장 작은 길이의 막대를 꺼냄
			int halfNum = popNum / 2; // 해당 막대의 길이를 반으로 나눈 값
			
			stick.add(halfNum); // 먼저 반값을 stick에 넣어줌
			
			if (oriSum - popNum + halfNum < X) { // 만약 전체의 길이가 X보다 작은 경우에는,
				stick.add(halfNum); // stick에 나머지 반값을 넣어줌
			} 
		}
	}
}
