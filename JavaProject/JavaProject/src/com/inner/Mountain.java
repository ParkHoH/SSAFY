package com.inner;

// 3. local class
public class Mountain {
	int height = 1950;
	
	public void work() {
		class Gold { // local class: 메소드 안에 선언되어 있음. 메소드 안에서만 사용 가능.
			void dig() {
				System.out.println(height);
			}
		}
		
		Gold gold = new Gold();
		gold.dig();
		System.out.println(gold.getClass().getName()); // com.inner.Mountain$1Gold
		
	}
	
	public static void main(String[] args) {
		Mountain m = new Mountain();
		m.work();
		System.out.println(m.getClass().getName());
		
	}
}
