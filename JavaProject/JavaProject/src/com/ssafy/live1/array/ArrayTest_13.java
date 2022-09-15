package com.ssafy.live1.array;


public class ArrayTest_13 {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 7, 8, 10, 12, 15, 16, 17, 18};

        // TODO: 1~20까지의 숫자 중 intArray에서 사용되지 않은 숫자를 출력하세요.
        
        int[] result = new int[20];
        for (int x : intArray) {
        	result[x-1] += 1;
        }
        
        for (int i = 0; i < result.length; i++) {
        	if (result[i] == 0) {
        		System.out.print(i + 1 + " ");
        	}
        }
        
        // END:
    }
}
