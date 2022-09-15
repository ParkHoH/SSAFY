package com.ssafy.live3.generic.box;

public class UseBoxTest {

    public static void main(String[] args) {
        useNormalBox();
        useGenericBox();
        useNumberBox();
    }

    private static void useNormalBox() {
        // TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
    	
    	NormalBox nbox = new NormalBox();
    	// Object 처리 --> 뭐든지 담을 수 있음
    	nbox.setSome(1);
    	nbox.setSome("Hello");
    	
    	Object obj = nbox.getSome();
//    	Integer num = (Integer)obj; <- 컴파일 ok, 런타임에 오류 발생
    	
    	if (obj instanceof String) {
    		String str = (String)obj;
    		System.out.println(str + " : " + str.length());
    	}
    	
        // END:
    }

    private static void useGenericBox() {
        // TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.
    	
    	GenericBox<String> sbox = new GenericBox<>();
    	sbox.setSome("Hello");
//    	sbox.setSome(1); <= 컴파일 시 오류 발견
    	String str = sbox.getSome();
    	System.out.println(str + " : " + str.length());
    	
        // END:
    }

    private static void useNumberBox() {
        // TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.
    	NumberBox<Number> numbox = new NumberBox<>();
    	numbox.addSome(1, 10L, 3.41f);
    	
    	NumberBox<Double> dbox = new NumberBox<>();
    	dbox.addSome(1.2, 2.3);
    	
    	GenericBox<Object> obox = new GenericBox<>();
        // END:
    }

}
