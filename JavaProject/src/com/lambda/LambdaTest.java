package com.lambda;

// @FunctionalInterface: 인터페이스 안에 메서드가 한 개만 존재하는 경우 
@FunctionalInterface
interface Something {
	int some(int a, int b);
}

class Robot {
	public void work(Something s, int x, int y) {
		int result = s.some(x, y);
		System.out.println(result);
	}
}

public class LambdaTest {

	public static void main(String[] args) {
		// 람다식 사용하지 않는 경우
		Robot tommy = new Robot();
		tommy.work(new Something() {
			@Override
			public int some(int a, int b) {
				return a +  b;
			}
		}, 5, 6);
		
		System.out.println("------------------");
		
		// 람다식을 사용하는 경우
		Robot jane = new Robot();
		Something s = (a, b) -> a + b;
		jane.work(s, 3, 4);
		jane.work((a, b) -> a * b, 2, 3);
	}
	
//	// 1번
//	int max(int a, int b) {
//		return (a > b) ? a : b;
//	}
//
//	// 메서드 이름, 리턴 타입 x, 파라메터 타입 x, 실행 문장이 1개인 경우 {} 생략 가능
////	(a, b) -> a > b ? a : b
//
//	// 2번
//	void printName(String name, int i) {
//		System.out.println(name + "=" + i);
//	}
////	(name, i) -> System.out.println(name + "=" + i)
//
//	// 3번
//	int square(int x) {
//		return x * x;
//	}
////	x -> x * x
//
//	// 4번
//	int rand() {
//		return (int) (Math.random() * 6);
//	}
////	() -> (int)(Math.random() * 6)
//
//	// 5번
//	int sum(int[] arr) {
//		int sum = 0;
//		for (int i : arr) {
//			sum += i;
//		}
//		return sum;
//	}
//
////	arr -> {
////		int sum = 0;
////		for (int i : arr) {
////			sum += i;
////		}
////		return sum;
////	}

}
