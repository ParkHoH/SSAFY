package com.exception;

public class Bank {
	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.transfer(); // 이체 메소드
	}

	private void transfer() {
		withdraw(); // 출금 메서드
		try {
			deposit(); // 입금 메서드
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("출금 취소"); // 예외 발생 후 뒷처리(rollback)
		}
		
	}

	private void deposit() throws MyException { // MyException으로 예외를 보내기 => 하나의 메소드는 하나의 기능만 담당
		throw new MyException("입금 예외 발생");
	}

	private void withdraw() {
		System.out.println("출금 성공");
	}

}
