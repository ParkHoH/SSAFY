package com.test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}
		
		double even=0;
		double odd=0;
		int sum=0;
		double avg=0;
		

		for(int i=0;i<10;i++) {
			if((i+1)%2==1) {
				odd+=arr[i];
//				System.out.println("짝수: "+arr[i]);
			}else {
				even+=arr[i];
//				System.out.println("홀수: "+arr[i]);
			}
		}
		sum=(int)even;
		avg=odd/5;
		System.out.println("sum : "+sum);
		System.out.println(String.format("avg : %.1f",avg));
	}
}
