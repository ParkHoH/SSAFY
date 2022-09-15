package com.member;

// 회원 관리 클래스(회원 등록, 회원 삭제, 회원 검색...)
// 1) 이름으로 검색하는 메소드: findByName()
// 2) 주소로 검색하는 메소드: findByAddress()
// 3) 번호 기준으로 주소를 수정하는 메소드: updateAddress()
public class MemberManager {

	// 회원 정보를 저장할 배열
	Member[] members;

	// 최대 회원 수
	int max = 10;

	// 회원 추가를 위한 인원수
	int cnt;

	// 생성자
	public MemberManager() {
		members = new Member[max];
	}

	// 메서드
	// 회원 추가
	public String addMember(Member m) {
		if (cnt < max) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] == null) {
					members[i] = m;
					cnt++;
					return m.name + " 추가 완료";
				}
			}
		}
		return "더 이상 추가할 수 없습니다!";
	}

	// 회원 삭제
	public String deleteMember(int num) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null)
				continue;

			if (members[i].num == num) { // 바로 접근할 경우 NullPointerException 발생
				String result = members[i].name + " 삭제 완료";
				members[i] = null;
				cnt--;
				return result;
			}
		}
		return "삭제할 데이테가 없습니다.";
	}

	// 회원 검색 - 번호 기준
	public Member findByNum(int num) {
		for (Member member : members) {
			if (member == null)
				continue;

			if (member.num == num) {
				System.out.println(member.num + "번 검색 완료");
				return member;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return null;

	}

	// 회원 검색 - 주소 기준
	public Member findByAddress(String address) {
		for (Member member : members) {
			if (member == null)
				continue;

			if (member.address == address) {
				System.out.println(member.address + " 주소 검색 완료");
				return member;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return null;

	}

	// 회원 검색 - 이름 기준
	public Member findByName(String name) {
		for (Member member : members) {
			if (member == null)
				continue;

			if (member.name.equals(name)) {
				System.out.println(member.name + " 이름 검색 완료");
				return member;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return null;

	}

	// 3) 번호 기준으로 주소를 수정하는 메소드: updateAddress()
	public void updateAddress(int num, String address) {
		Member member = findByNum(num);
		if (member == null) {
			System.out.println("해당 회원이 없습니다.");
		} else {
			member.address = address;
			System.out.println("주소 수정 완료");
		}
	}

	// 모든 회원 정보
	public Member[] getMembers() {
		Member[] temp = new Member[cnt];
		int count = 0;

		for (Member member : members) {
			if (member == null)
				continue;

			temp[count++] = member;
		}

		return temp;
	}
}
