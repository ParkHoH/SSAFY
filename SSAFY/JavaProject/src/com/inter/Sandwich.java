package com.inter;

public interface Sandwich {
	int getCalorie(); // 샌드위치 칼로리

	String getIngredient(); // 샌드위치 재료

	String getDescription(); // 샌드위치 설명
	
	default void info() {
		System.out.println("cal: " + getCalorie());
		System.out.println("ingredient: " + getIngredient());
		System.out.println("desc: " + getDescription());
	}

}
