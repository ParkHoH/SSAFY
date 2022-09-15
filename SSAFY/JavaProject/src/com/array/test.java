package com.array;

public class test {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			for (int i = 0; i < 4; i++) {
				arr[i] = i;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("오류 발생");
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}