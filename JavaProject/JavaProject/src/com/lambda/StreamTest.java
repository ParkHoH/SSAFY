package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.abst.Circle;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("joyful", "professional", "jdk", "java"));
		
		// 1. 스트림 사용하지 않은 경우
		long count = 0;
		for (String name : names) {
			if (name.contains("j"))
				count++;
		}
		System.out.println(count);
		
		System.out.println("----------------");
		count = 0;
		
		// 2. 스트림 사용하는 경우
		// filter(): 중간 연산 / count(): 최종 연산
		count = names.stream().filter(name -> name.contains("j")).count(); 
		System.out.println(count);
		names.stream().filter(x -> x.contains("o")).forEach(x -> System.out.println(x));
		
		// map(): 스트림 내의 요소들을 하나씩 특정 값으로 변환해줌. 파이프라인 형식.
		names.stream().map(x -> x.concat("qq")).forEach(x -> System.out.println(x));
		
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> ss = iList.parallelStream().filter(x -> x > 3).limit(3); // 중간 연산
		ss.forEach(x -> System.out.print(x + " "));
		
	}

}
