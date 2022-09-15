package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatTest {

	public static void main(String[] args) throws Exception {
		Car c = new Car(1234, "x5", "tommy");

		// file에 저장
		FileOutputStream fos = new FileOutputStream("car.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); // process stream

		oos.writeObject(c); // 객체가 파일에 저장이 됨.

		System.out.println("saved!");

		FileInputStream fis = new FileInputStream("car.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		c = (Car)ois.readObject();
		
		System.out.println(c.getClass());
		System.out.println(c);
		
		ois.close();
		oos.close();
	}

}
