package com.exception;

// throws: 예외가 발생한 곳에서 바로 처리하지 않고 호출자로 예외를 보내서 그곳에서 처리하도록 함.
public class ThrowsTest3 {

	private void test(int num) throws Exception { // main에 Exception을 적으면 JVM에 오류를 던짐
		if(num >= 0) // 정상 실행 
			System.out.println(++num);
		else // 비정상인 경우. 예외를 발생 시킴
			throw new Exception(); // 예외를 발생시키는 문장
	}
	
	public static void main(String[] args) throws Exception {
		ThrowsTest3 t = new ThrowsTest3();
		t.test(0);
	}
	
}
