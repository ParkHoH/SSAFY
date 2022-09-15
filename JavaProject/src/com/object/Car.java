package com.object;

public class Car {
	// member, field, data, attribute...
	// 보통 필드라고 부름
	int num;
	String model;
	String owner;
	
	public Car() {
		this(0); //	== this.num = 0;
		// 뒤 생성자로 넘기기
	}
	
	public Car(int num) {
		this(num, null); // 같은 의this.num = num;
		// 뒤 생성자로 넘기기
	}
	
	public Car(int num, String model) {
		this(num, model, null);
//		this.num = num;
//		this.model = model;
		// 뒤 생성자로 넘기기
	}

	public Car(int num, String model, String owner) {
		this.num = num;
		this.model = model;
		this.owner = owner;
		System.out.println("Car 생성 완료!(생성자)");
	}
	
	public void info() {
		System.out.println("num:" + num);
		System.out.println("model:" + model);
		System.out.println("owner:" + owner);
	}
	
	public void run() {
		System.out.println("run run run..");
	}

	public void stop() {
		System.out.println("stop!!!");
	}
	
	
	public static void main(String[] args) {
		Car car = new Car(1111, "model3", "hohyun");
		car.info();
		car.run();
		car.stop();
		
		System.out.println("---------");
		
		Car car2 = new Car();
		car2.num = 1234;
		car2.model = "m5";
		car2.owner = "tommy";
		car2.info();
		
		System.out.println("---------");
		
		Car c1 = new Car();
		Car c2 = new Car(1234);
		Car c3 = new Car(457, "k5");
		Car c4 = new Car(457, "아반떼", "kim");
		
		c1.info();
		System.out.println("---");
		c2.info();
		System.out.println("---");
		c3.info();
		System.out.println("---");
		c4.info();
	}

}
