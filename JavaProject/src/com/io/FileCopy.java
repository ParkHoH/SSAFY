package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = // 원본
					new FileInputStream("./src/com/io/FileCopy.java"); // 읽어올 파일이 없을 때는 FileNotFoundException
			FileOutputStream fos =  // 복사본
					new FileOutputStream("./src/com/io/Other.java"); //중복될 경우 덮어쓰기를 함

			for (int i = 0; (i = fis.read()) != -1;) {			
				System.out.println(i);
				fos.write(i); // 
			}

			fis.close();
			fos.close();

			System.out.println("file copied");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
