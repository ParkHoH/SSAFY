package com.ssafy.live1.array;

public class ArrayTest_15 {
    public static void main(String[] args) {
        // TODO: 문제에서 제시하는 2차원 배열을 생성하고 내용을 출력하시오.
    	
    	int [][] arr = new int[2][3];
    	int num = 0;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[0].length; j++) { 
    			arr[i][j] = num;
    			num += 1;
    		}
    	}

    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[0].length; j++) { 
    			System.out.print(arr[i][j]);
    		}
    		System.out.println();
    	}
    	
        // END:
    }
}
