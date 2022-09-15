package com.inherit;

public class BonusTest {
	static void printBouns(Employee who) {
		System.out.println(who.getBonus());
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(1, "tom", 3000);
		Employee m = new Manager(2, "jerry", 5000, 1);
		
		printBouns(e);
		printBouns(m);
		
		Manager bill = new Manager(200, "biil Kim", 5000, 111);
		printBouns(bill);
	}

}
