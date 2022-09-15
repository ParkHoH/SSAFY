package com.exception;

// throws: 예외가 발생한 곳에서 바로 처리하지 않고 호출자로 예외를 보내서 그곳에서 처리하도록 함.
public class ThrowsTest {
	
	private int work(int a, int b) throws MyException, YourException {
		if (a > b)
			return a+b;
		else if (a == b) 
			throw new MyException("MyException 발생: a와 b가 같습니다.");
		else
			throw new YourException("YourException 발생: a가 b 보다 작습니다.");
	}
	
	private void test(int num) throws MyException, Exception {
		if(num > 0) // 정상 실행
			System.out.println(++num);
		else if (num == 0) // 비정상인 경우
			throw new MyException("파라메터가 0입니다. 양수를 입력해주세요.");
		else // 비정상인 경우. 예외를 발생 시킴
			throw new Exception(); // 예외를 발생시키는 문장
	}
	
	public static void main(String[] args) {
		
		ThrowsTest t = new ThrowsTest();
		System.out.println(t);
		
		try {
			t.work(3, 5);
			t.work(3, 3);
			t.work(3, 15);
			
		} catch (MyException e) {
			e.printStackTrace();
			
		} catch (YourException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("--------------");
		
		try {
			t.test(0);
		} catch (MyException e) {
			System.out.println(e); // 레퍼런스를 출력하면 클래스 안의 toString()가 자동 호출됨.
			
		} catch (Exception e) {
			System.out.println("파라메터는 양수이어야 합니다.");
			e.printStackTrace();
		}
	}
	
}
