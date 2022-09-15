package com.inter;

public class SteakCheese implements Sandwich {
	
	@Override
	public int getCalorie() {
		return 355;
	}

	@Override
	public String getIngredient() {
		return "스테이크 1스쿱" + " + " + "치즈 2장" + " + " +  "사우스웨스트 치폴레" + " + "+  "스모크 바비큐";
	}

	@Override
	public String getDescription() {
		return "육즙이 쫙~풍부한 비프 스테이크의 풍미가 입안 한가득";
	}

}
