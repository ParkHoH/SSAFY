package com.generic;

class RedBean {

	@Override
	public String toString() {
		return "단팥입니다.";
	}

}

class CreamCheese {

	@Override
	public String toString() {
		return "크림치즈입니다.";
	}

}

public class FishBread<X> {
	private X filled; // 붕어빵 안에 들어가는 소의 타입

	public X getFilled() {
		return filled;
	}

	public void setFilled(X filled) {
		this.filled = filled;
	}

	public static void main(String[] args) {
		
		FishBread<RedBean> bean = new FishBread<RedBean>();
		FishBread<CreamCheese> cream = new FishBread<CreamCheese>();
		
		bean.setFilled(new RedBean());
//		bean.setFilled(new CreamCheese()); // type checking
		cream.setFilled(new CreamCheese());
		
		System.out.println(bean.getFilled()); // getFilled는 toStirng을 호출함
	}

}
