package com.second;

// &&, || : �� ��¥�� �����ڴ� short circuit logic�� ����Ǿ� �� �κ��� üũ�Ͽ� ������� ������, �� �κ��� �������� ����.
public class OperatorTest {
	public static void main(String[] args) {

		System.out.println("&& �� || ����");
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
		System.out.println("short circuit logic ����");
		
		int i = 3, j = 5, k = 9;
		if (i++ > 3 && ++j > 1)
			System.out.println(++k);
		System.out.println(i + "," + j + "," + k);

		
		System.out.println("--------------------");
		System.out.println("���� ������ ����");
		
		int x = 10, y = 20;
		String result = (x > y) ? "yes" : "no";
		System.out.println(result);
	
	}
}
