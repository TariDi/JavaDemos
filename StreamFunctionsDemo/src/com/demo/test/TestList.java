package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<String> alpha = Arrays.asList("a","b","c","d");
		
		/*final long startTime = System.currentTimeMillis();
		List<String> alphaUpper = new ArrayList<>();
		
		for(String s : alpha) {
			alphaUpper.add(s.toUpperCase());
		}
		
		System.out.println(alpha);
		System.out.println(alphaUpper);
		
		final long endTime = System.currentTimeMillis();
		
		System.out.println("Execution Time:"+(endTime-startTime));*/
		

		/*List<String> alpha = Arrays.asList("a","b","c","d");
		
		final long startTime = System.currentTimeMillis();
		
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
		final long endTime = System.currentTimeMillis();
		
		System.out.println("Execution Time:"+(endTime-startTime));*/
		
		/*List<String> alpha = Arrays.asList("a","b","c","d");
		final long startTime = System.currentTimeMillis();
		List<String> collect = alpha.stream().map(s->s+"b").collect(Collectors.toList());
		System.out.println(collect);
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time:"+(endTime-startTime));*/
		
		/*final long startTime = System.currentTimeMillis();
		IntStream.range(1,11).map(i->i*2).forEach(System.out::println);
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time:"+(endTime-startTime));*/
		
		/*final long startTime = System.currentTimeMillis();
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> collect = num.stream().filter(n->n>3).collect(Collectors.toList());
		//List<Integer> collect1 = IntStream.range(1,9).filter(n->n>3).boxed().collect(Collectors.toList());
		num.stream().reduce((a,b)->a+b).ifPresent(System.out::println);
		num.stream()
		.reduce((a,b)->a>b?a:b)
		.ifPresent(System.out::println);
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time:"+(endTime-startTime));*/
		
		/*List<String> names = Arrays.asList("Kalyani","Tarini","Riya","Kishori","Anushka","Kanchan");
		
		names
			.stream()
			.filter(s->s.startsWith("K"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		names
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		*/
		
		List<String> alpha = Arrays.asList("d1","c2","d2","c3");
		
		final long startTime1 = System.currentTimeMillis();
		alpha
			.parallelStream()
			.map(String::toUpperCase)
			.allMatch(s->{								//allMatch(); noneMatch(); anyMatch()
				System.out.println("any match: "+s);
				return s.startsWith("A");
			});
		final long endTime1 = System.currentTimeMillis();
		System.out.println("Execution Time1:"+(endTime1-startTime1));
		
		final long startTime = System.currentTimeMillis();
		alpha
		.stream()
		.map(String::toUpperCase)
		.allMatch(s->{								//allMatch(); noneMatch(); anyMatch()
			System.out.println("any match: "+s);
			return s.startsWith("A");
		});
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time1:"+(endTime1-startTime1));
		
		/*final long startTime1 = System.currentTimeMillis();
		IntStream.range(10000,20000)
			.filter(s->{
				//System.out.format("filter: %s \n",s,Thread.currentThread().getName());
				return true;
			})
			.forEach(s->{
				//System.out.format("forEach: %s [%s]\n",s,Thread.currentThread().getName());
			});
		final long endTime1 = System.currentTimeMillis();
		System.out.println("Execution Time1:"+(endTime1-startTime1));
		*/
		
		
		/*final long startTime = System.currentTimeMillis();
		IntStream.range(1, 10000)
			.parallel()
			.filter(s->{
				//System.out.format("filter: %s [%s]\n",s,Thread.currentThread().getName());
				return true;
			})
			.forEach(s->{
				//System.out.format("forEach: %s [%s]\n",s,Thread.currentThread().getName());
			});
		final long endTime = System.currentTimeMillis();
		System.out.println("Execution Time:"+(endTime-startTime));*/
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		

	}
	
}
