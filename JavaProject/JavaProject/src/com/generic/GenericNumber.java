package com.generic;

public class GenericNumber<T extends Number> {
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public static void main(String[] args) {
		GenericNumber<Integer> i = new GenericNumber<>();
		GenericNumber<Double> d = new GenericNumber<>();

		i.setNum(3);
		d.setNum(3.3);

		System.out.println(i.getClass().getSimpleName());
		System.out.println(i.getNum());
		System.out.println(d.getClass().getSimpleName());
		System.out.println(d.getNum());

	}

}