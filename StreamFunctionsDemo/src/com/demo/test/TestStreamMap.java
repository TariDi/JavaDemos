package com.demo.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamMap {
	
	public static void main(String[] args) {
		IntStream.range(1,5)
		.forEach(System.out::println);
		
		Stream.of("d1","d2","d3")
		.map(s-> s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);	//this is a chain of functions
		
		
	}

}
