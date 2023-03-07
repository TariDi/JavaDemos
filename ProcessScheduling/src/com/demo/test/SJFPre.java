package com.demo.test;

import com.demo.model.Process;
import com.demo.service.ProSchedService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SJFPre {

	public static void main(String[] args) {
		List<Process> arrivalQueue = new ArrayList<>();
		Queue<Process> readyQueue = new LinkedList<>();
		Queue<Process> finishQueue = new LinkedList<>();
		
		ProSchedService.acceptProcess(arrivalQueue);
		ProSchedService.displayProcess(arrivalQueue);
		
		readyQueue.
		
		

	}

}
