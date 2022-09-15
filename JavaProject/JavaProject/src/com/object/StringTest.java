package com.object;

public class StringTest {

	public static void main(String[] args) {
		System.out.println(StaticTest.scount);
		StaticTest.hello();
		
		String s = "mylimeorange"; // constant string pool에 저장됨
		String t = new String("mylimeorange"); // 힙 영역에 저장
		String x = "mylimeorange";
		
		if (s == t) // false: 주소값 다름
			System.out.println("s == t");
		
		if (s.equals(t)) // true: 내용 비교
			System.out.println("s.equals(t)");
		
		if (s == x) // true: 주소가 같음
			System.out.println("s == x");
		
		if (s.equals(x)) // true
			System.out.println("s.equals(x)");
		
		System.out.println("----------------");
		
		s.concat("hello");
		System.out.println(s); // 원본 수정 불가
		String k = s.concat("hello");
		System.out.println(k); // 원본 수정 불가
		System.out.println((s + "hello") == k);
		System.out.println( "mylimeorangehello" == k);
		System.out.println( "mylimeorangehello" == (s + "hello"));

		System.out.println("----------------");
		
		s.toUpperCase();
		System.out.println(s); // 원본 수정 불가
		
		System.out.println("----------------");
		
		s = s + "gogo";
		System.out.println(s);
		System.out.println("mylimeorangegogo" == s);
		System.out.println(s.equals("mylimeorangegogo"));
		System.out.println(s.toUpperCase());
		
		System.out.println("----------------");
		
		StringBuilder sb = new StringBuilder("mylimeorage");
		sb.append("hello");
		System.out.println(sb);
//		System.out.println(sb == "mylimeoragehello"); // 오류 발생
	}
}
