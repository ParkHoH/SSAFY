package com.inner;

// 2. member class: 내부 클래스를 사용(생성)하기 전에 먼저 외부 클래스가 먼저 생성되어 있어야 함.
// top-level 클래스에 붙일 수 있는 수식어: public final, abstract, default
class Boat { // private
	
}

public class Car {
	int num = 1234;
	
	// top level의 클래스가 아니므로 public을 붙여도 됨!
	private class Engine { // inner class: public, private, protected, default, static
		public void go() {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Engine e = c.new Engine(); // new Car().new Engine() , 내부 클래스 생성
		e.go();
		System.out.println(e.getClass().getName());
	}

}
