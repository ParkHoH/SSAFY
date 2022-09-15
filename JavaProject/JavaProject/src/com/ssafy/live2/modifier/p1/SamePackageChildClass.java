package com.ssafy.live2.modifier.p1;

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class SamePackageChildClass extends Parent {
	 Parent p = new Parent();
	 
	 public void method() {
		 p.publicVar = 10;
		 p.protectVar = 20;
		 p.defaultVar = 30;
//		 p.privVar = 40;
	 }
	 
	 
    // END:
}
