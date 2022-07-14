package com.second;

// 포멧 자동 조정: 컨트롤 + 쉬프트 + F
// java에서 사용하는 데이터들의 종류
// 예약어: 자주색으로 표시
// 식별자(클래스, 변수, 메소드 이름 등): 예약어는 안 됨. 문자로 시작해야 함.
public class DataTypeTest {
	public static void main(String[] args) {
		
		// 논리형
		boolean flag = false;
		boolean flag2 = true;
		System.out.println(flag || flag2);
		
		
		// 정수형
		byte b = 127; // 1 바이트
//		b = b - 1; 
		// 정수 리터럴이 연산에 사용되는 경우에는 기본적으로 4 byte에 담겨있음. => 크기가 맞지 않기 때문에 오류 발생
		int b2 = b + 1; // 1번째 해결 방법
		b = (byte)(b + 1); // 2번째 해결 방법: 형 변환
		
		short s = 12345; // 2 바이트
		int i = 7890; // 4 바이트
		long l = 200000000000L; // 8 바이트
		// char c = 78; 
		// 이렇게 사용하기 보다는 아래처럼 사용
		char c = 'c'; // 2 바이트. 문자형. 한 글자 저장에 사용
		System.out.println("b:" + b);
		System.out.println("s:" + s);
		System.out.println("i:" + i);
		System.out.println("l:" + l);
		System.out.println("c:" + c);
		
		
		// 실수형
//		float f = 3.14;
		// 실수 리터럴을 변수에 할당하는 경우에 기본적으로 8 바이트에 담겨있음. => 크기가 맞지 않기 때문에 오류 발생
		float f = 3.14f; // == (float)3.14;
		double d = 8.92;
		System.out.println(f);
		System.out.println(d);
		
		
		// 참조형
		String name = "tommy";
		System.out.println(name);
		
	}
}
