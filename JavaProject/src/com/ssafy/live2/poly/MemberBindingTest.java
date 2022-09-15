package com.ssafy.live2.poly;

class SuperClass{
    String x = "super";
    
    public void method() {
        System.out.println("super class method");
    }
}

class SubClass extends SuperClass{
    String x = "sub";
    String y = "sub_y";
    
    @Override
    public void method() {
    	System.out.println(y);
        System.out.println("sub class method");
    }
}

public class MemberBindingTest {

    public static void main(String[] args) {
    	// TODO: 참조 객체의 레벨에 따라 어떤 멤버 변수 또는 메서드가 동작하는지 확인하시오.
        SubClass subClass = new SubClass();
        System.out.println(subClass.x); // 자식 변수
        subClass.method(); // 자식 메서드
        
        SuperClass superClass = subClass;
        System.out.println(superClass.x); // 부모 변수
        superClass.method(); // 자식 메서드: 오버라이드
        
        
        // END:
    }

}


