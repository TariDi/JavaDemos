package com.demo.test;

import com.demo.model.Consumer;
import com.demo.model.Producer;
import com.demo.model.Storage;

public class TestProducerConsumer {
	
	public static void main(String args[]) {
		Storage s = new Storage();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.start();
		c.start();
	}
}
