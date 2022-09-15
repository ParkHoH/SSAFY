package com.ssafy.live2.modifier.encapsulation;

class UnbelievableUserInfo {
	//이름은 null이 될 수 없음.
	private String name = "홍길동";
	// 계좌는 0보다 커야 함.
	
	private int account = 10000;
	
	// TODO: name 과 account에 부적절한 값이 할당되지 못하도록 처리하시오.
	//  name과 account 는 private으로 변경되어야 한다.
    String getName() {
    	return this.name;
    }
    
    void setName(String name) {
    	if (name == null)
    		System.out.println("부적절한 네이밍: " + name);
    	else
    		this.name = name;
    }

    int getAccount() {
    	return this.account;
    }
    
    void setAccount(int account) {
    	if (account < 0)
    		System.out.println("부적절한 Account: " + account);
    	else
    		this.account = account;
    }
	
	
	// END:
}

public class UnbelievableTest {
	public static void main(String[] args) {
		UnbelievableUserInfo info = new UnbelievableUserInfo();
		System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
		info.setName(null);
		info.setAccount(-100);
		System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
	}
}