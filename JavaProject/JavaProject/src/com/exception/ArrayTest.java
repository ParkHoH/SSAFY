package com.exception;

import com.object.Car;

// ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException: Runtime Exception
public class ArrayTest {
	int num;

	public static void main(String[] args) {
		int a = 0, b = 8;
		int result = -99;
		Car c = null; // 지역변수는 사용 전에 초기화 시켜줘야 함.
		int age;
		
//		System.out.println(age);
		
		try {
			c.info();
			result = b / a;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생!");
			result = 100; // 예외 발생 시 설정할 값
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생!");
			
		} catch (Exception e) { // 다른 exception 보다 먼저 올 수 없음
			e.printStackTrace();
			System.out.println("Other Exception 발생!");
		}
		
		finally {
			System.out.println("finally..!");
		}

		System.out.println("----------------");

		int[] num = { 1, 2, 3 };

		try {
			for (int i = 0; i <= num.length; i++) {
				System.out.println(num[i]);
			}

		} catch (NullPointerException e) {
			System.out.print("1번 예외: ");
			System.out.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("2번 예외: ");
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.print("모든 오류");
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally..!");
		}

		System.out.println("Done!");
		
	}

}
