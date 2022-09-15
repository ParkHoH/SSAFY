package com.member;
// 회원 정보 저장 클래스

public class Member {
	// field(data)
	int num;
	String name;
	String address;
	int age;

	// 생성자
	public Member() {}

	public Member(int num, String name, String address, int age) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// method
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
//	public static void main(String[] args) {
//		Member m = new Member(112, "tommy kim", "London", 25);
//		System.out.println(m); // toString을 하지 않아도 자동으로 호출
//		System.out.println(m.toString());
//	}

}
