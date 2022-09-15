package com.ssafy.live1.array;


public class ArrayTest_11 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };
		
		// TODO: 위 배열의 요소 중 평균(실수, 소숫점 세째에서 반올림 출력)과 절대값 기준으로
		
		int sum = 0;
		for (int x : intArray) {
			sum += x;
		}
		double avg = sum / intArray.length;
		
		//  평균에서 가장 거리가 먼 값을 출력하시오.(여러 개일 경우는 하나만)
		double min_value = Integer.MAX_VALUE;;
		double max_value = Integer.MIN_VALUE;
		int max_idx = -1;
		int min_idx = -1;
		
		for (int i =0; i < intArray.length; i++) {
			if (Math.abs(intArray[i] - avg) > max_value) {
				max_value = Math.abs(intArray[i] - avg);
				max_idx = i;
			}
			
			if (Math.abs(intArray[i] - avg) < min_value) {
				min_value = Math.abs(intArray[i] - avg);
				min_idx = i;
			}
		}
		
		// END:
		System.out.printf("avg:%.2f, maxDiff: %d, minDiff:%d%n", avg, intArray[max_idx], intArray[min_idx]);

	}
}
