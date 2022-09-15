package com.ssafy.live2.poly;

import com.ssafy.live2.extend.person.Person;
import com.ssafy.live2.extend.person.SpiderMan;

public class PolySpiderTest {
	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터 파커", true);
		// 다형성
		SpiderMan sman2 = sman;
		Person person = sman;
		Object[] objs = new Object[4];
		
		// 형변환
//		Person[] person2 = (Person[]) objs;
		
		
		objs[0] = sman;
		objs[1] = "Hello";
		objs[2] = objs;
		objs[3] = 1; // auto-boxing
		
		// 형 변환
		SpiderMan fromObjArray = (SpiderMan) objs[0];
		fromObjArray.fireWeb();
		
		if (objs[1] instanceof SpiderMan) {
			SpiderMan fromObjArray2 = (SpiderMan) objs[1];
			fromObjArray2.fireWeb();
		}
		
		for (Object object : objs) {
			System.out.println(object.getClass().getName());
		}
		
		System.out.println(sman2);

	}
}
