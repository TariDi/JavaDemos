package com.demo.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.task.MyCallable;

public class TestExecutor {
	private static final int NTHREADS = 10;
	
	public static void main(String[] args) {
		
		//create thread pool of size = NTHREADS
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);	
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		
		for(int i=0;i<2000;i++) {
			Callable<Long> worker = new MyCallable();
			Future<Long> submission = executor.submit(worker); 
			list.add(submission);
		}
		
		long sum= 0;
		System.out.println(list.size());
		for(Future<Long> future : list) {
			try {
				sum+=future.get();
				
			}catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sum);
		executor.shutdown();
		
		

	}

}
