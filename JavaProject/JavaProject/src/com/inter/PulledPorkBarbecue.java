package com.inter;

public class PulledPorkBarbecue implements Sandwich {

	@Override
	public int getCalorie() {
		return 327;
	}

	@Override
	public String getIngredient() {
		return "풀드포크 바비큐 1스쿱" + " + " + "치즈 2장" + " + " + "스모크 바비큐";
	}

	@Override
	public String getDescription() {
		return "미국 스타일의 풀드 포크 바비큐가 가득 들어간 샌드위치";
	}
}
