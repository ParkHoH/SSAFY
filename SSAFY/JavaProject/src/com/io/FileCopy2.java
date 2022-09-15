package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//try with resource : 예외 발생 여부와 관계없이 스트림 사용 후 자동으로 close 시켜주는 기능
// try (스트림 생성 문자ㅣ 스트림 생성 문자) {
//         스트림 사용...
// } catch() {}
public class FileCopy2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("./src/com/io/FileCopy.java"); // 읽어올 파일이 없을 때는 FileNotFoundException
			FileOutputStream fos =  new FileOutputStream("./src/com/io/Other.java"); //중복될 경우 덮어쓰기를 함
				){

			for (int i = 0; (i = fis.read()) != -1;) {			
				System.out.println(i);
				fos.write(i); // 
			}

			System.out.println("file copied");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
