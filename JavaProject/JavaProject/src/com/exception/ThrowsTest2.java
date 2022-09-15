package com.exception;

public class ThrowsTest2 {

	private void test(int num) {
		if(num >= 0) // 정상 실행
			System.out.println(++num);
		else { // 비정상인 경우. 예외를 발생 시킴
			try {
				throw new Exception(); // 예외를 발생시키는 문장
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThrowsTest2 t = new ThrowsTest2();
		t.test(-1);
	}
	
}
