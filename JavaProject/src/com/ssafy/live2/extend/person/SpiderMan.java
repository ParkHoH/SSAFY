package com.ssafy.live2.extend.person;

public class SpiderMan extends Person {
	boolean isSpider;
	Spider spider = new Spider();
	
	public SpiderMan(String name, boolean isSpider) {
		// super(); <- 생략되어 있음
		super(name);
		this.isSpider = isSpider;
	}
	
	public void fireWeb() {
		if (isSpider) {
			spider.fireWeb();
		} else {
			System.out.println("사람일 때는 참자");
		}
	}
	
	@Override
	public void jump() {
		if (isSpider) {
			System.out.println("사람일 때는 점프 안 함");
		} else {
			super.jump();
		}
	}

}
