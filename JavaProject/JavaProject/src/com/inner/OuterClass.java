package com.inner;

// 1. static inner class: 외부 클래스를 생성하지 않고도 사용 가능
public class OuterClass { // outer class . top-level class
	
	static int num = 256;
	
	static class Inner { // inner class
		public void go() {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		System.out.println(num);
		int num = 2;
		System.out.println(num);
		System.out.println(OuterClass.num);
		
		Inner i = new Inner();
		i.go();
		System.out.println(i.getClass().getName()); // com.inner.OuterClass$Inner
	}
}
