package com.inherit;

class Parent {
	private String name = "tom";
	private String address = "seoul";
	
	// 생성자
	Parent() {
		System.out.println("Parent 생성자!");
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class Child extends Parent {
	String email;
	
	Child() {
		System.out.println("child 생성자!");
	}
	
	// Method Overriding
	// 메소드 이름, 리턴 타입, 파라메터 리스트가 반드시 동일해야 함!
	// 수식어(접근 지정자)는 변경 가능
	@Override
	public String getName() {
//		return this.getName(); // 무한 호출
		return "tomson";
	}
	
	@Override
	public String getAddress() {
		return "london";
	}

	// 자식 타입의 객체를 생성하면 메모리에 먼저 부모 객체가 생성이 되고, 그 아래에 자식 객체가 따라 붙음.
	public static void main(String[] args) {
		Child child = new Child();
		
		System.out.println(child.getName());
		System.out.println(child.getAddress());
//		System.out.println(child.name);
		
		System.out.println("--------------");

		Child child2 = new Child();
		child2.setName("hohyun");
		child2.setAddress("서울시 강서구");
		
		System.out.println(child2.getName());
		System.out.println(child2.getAddress());
		
		// 부모가 자식 보다 큼
		// 여기서 크다는 의미는 좀 더 광범위하다는 의미
		Parent x = new Child(); // 있어도 안 쓰는 것
		// Child y = (Child)new Parent(); // 써야 하는데 없는 것
		
		System.out.println("--------------");
		
		Child c = new Child();
		Parent p = new Child();
		Object o = new Child();
		System.out.println(p.getName());
		
	}

}
