package com.second;

// &&, || : 두 개짜리 연산자는 short circuit logic이 적용되어 앞 부분을 체크하여 결과값이 나오면, 뒷 부분을 수행하지 않음.
public class OperatorTest {
	public static void main(String[] args) {

		System.out.println("&& 와 || 예시");
		boolean a = true, b = false, c = false;
		if (a && b)
			System.out.println("hello");
		else
			System.out.println("bye");

		if (a || c)
			System.out.println("gogo");
		else
			System.out.println("nono");

		
		System.out.println("--------------------");
		System.out.println("short circuit logic 예시");
		
		int i = 3, j = 5, k = 9;
		if (i++ > 3 && ++j > 1)
			System.out.println(++k);
		System.out.println(i + "," + j + "," + k);

		
		System.out.println("--------------------");
		System.out.println("삼항 연산자 예시");
		
		int x = 10, y = 20;
		String result = (x > y) ? "yes" : "no";
		System.out.println(result);
	
	}
}
