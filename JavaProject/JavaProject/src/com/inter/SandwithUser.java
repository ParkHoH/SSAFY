package com.inter;

public class SandwithUser {
	// 알아보기 쉽다.
	// 편하다.
	public static void main(String[] args) {
		
		Sandwich[] sandwich = new Sandwich[2];
		
		sandwich[0] = new SteakCheese();
		sandwich[1] = new PulledPorkBarbecue();
		
		for (Sandwich s : sandwich) {
			System.out.println(s.getClass().getSimpleName());
			System.out.println("칼로리: " + s.getCalorie());
			System.out.println("구성: " + s.getIngredient());
			System.out.println("설명: " + s.getDescription());
			System.out.println("--------------");
		}
		
	}

}
