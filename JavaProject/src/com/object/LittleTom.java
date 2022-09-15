package com.object;

class Tom {

	int age = 50;

	protected void hello() {
		System.out.println("Tom-hello()");
	}

}

interface Hillary {
	int age = 48; // public static final
}

class Bill {
}

public class LittleTom extends Tom implements Hillary {

	int age = 20; // LittleTom은 3개의 필드를 가지고 있음

	@Override
	protected void hello() {
		System.out.println("LittleTom-hello");
	}

	public void test() {
		System.out.println("--------test-------");
		System.out.println(age); // 20
		System.out.println(this.age); // 20
		System.out.println(super.age); // 50
//		Hillary.age = 11; // 오류 발생
		System.out.println(Hillary.age); // 48
		System.out.println("---------------- ---");
	}

	public static void main(String[] args) {
		Tom t = new LittleTom();
		t.hello(); // LittleTom-hello; overriding
		System.out.println(t.age); // overriding�� method���� ����

		LittleTom little = new LittleTom();
		little.hello();
		little.test();

		if (little instanceof LittleTom) { // �ش� Ÿ���� ��ü�ΰ�?
			System.out.println("instance of LittleTom");
		}

		if (little instanceof Tom) { // �ڽ��� �θ� Ÿ���̴�.
			System.out.println("instance of Tom");
		}

		if (little instanceof Object) {
			System.out.println("instance of Object");
		}
		
		if (little instanceof Hillary) {
			System.out.println("instance of Hillary");
		}
	}

}
