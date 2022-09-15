package com.object;

public class StaticTest {
	// field
	int count; // 인스턴스 변수
	static int scount; // 클래스 변수: 클래스 영역에 저장
	
	static { // static block
		System.out.println("static-1");
	}
	
	public static void hello() {
		System.out.println("hello~~~~~");
	}
	
	public static void main(String[] args) {
		System.out.println((int)Math.pow(2, 3));
		
		StaticTest.hello();
		
//		System.out.println(this.scount); 오류 발생
		
		// 객체를 생성하지 않아도 이미 만들어져 있음
		System.out.println(++StaticTest.scount);
		
//		StaticTest s1 = new StaticTest();
//		StaticTest s2 = new StaticTest();
//		StaticTest s3= new StaticTest();
//		
//		System.out.println(++s1.count + ", " + ++s2.count + ", " + ++s3.count);
//		System.out.println(++s1.scount + ", " + ++s2.scount + ", " + ++s3.scount);
		
	}
	
	static { // static block
		System.out.println("static-2");
	}
	
}