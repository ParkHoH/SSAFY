package com.member;

public class MemberTest {

	public static void main(String[] args) {
		MemberManager manager = new MemberManager();
		Member m1 = new Member(1, "hohyun", "seoul", 22);
		Member m2 = new Member(2, "harry", "inchen", 32);
		Member m3 = new Member(3, "poter", "busan", 42);
		
		System.out.println("--------초기 회원 검색--------");
		
		Member[] testMembers = manager.getMembers();
		printMembers(testMembers);
		System.out.println("총 " + testMembers.length + "명");

		System.out.println();
		System.out.println("--------회원 추가--------");

		System.out.println(manager.addMember(m1));
		System.out.println(manager.addMember(m2));
		System.out.println(manager.addMember(m3));
		
		System.out.println();
		System.out.println("--------번호로 회원 검색--------");
		
		manager.findByNum(1);		
		manager.findByNum(3);
		
		System.out.println();
		System.out.println("--------이름으로 회원 검색--------");
		
		manager.findByName("hohyun");		
		manager.findByName("harry");
		manager.findByName("noone");
		
		System.out.println();
		System.out.println("--------주소로 회원 검색--------");
		
		manager.findByAddress("틀린 주소");		
		manager.findByAddress("seoul");
		
		System.out.println();
		System.out.println("--------번호 기준 주소 수정--------");
		
		manager.updateAddress(1, "ulsan");		
		manager.findByAddress("seoul");
		manager.findByAddress("ulsan");
		
		System.out.println();
		System.out.println("--------회원 삭제--------");
		
		System.out.println(manager.deleteMember(1));
		System.out.println(manager.deleteMember(1));
		
		System.out.println();
		System.out.println("--------삭제한 회원 검색--------");
		
		manager.findByNum(1);	
		
		System.out.println();
		System.out.println("--------전체 회원 검색--------");
		
		Member[] members = manager.getMembers();
		System.out.println("총 " + members.length + "명");
		printMembers(members);
	}
	
	static void printMembers(Member[] list) {
		for (Member member : list) {
			System.out.println(member);
		}
	}

}
