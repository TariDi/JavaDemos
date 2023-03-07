package com.demo.model;

public class Process implements Comparable<Process>{
	private float burstTime, startTime, turnAroundTime, waitingTime, finishTime, arrivalTime;

	
	
	public Process() {
		super();
		this.burstTime = 0.0f;
		this.startTime = 0.0f;
		this.turnAroundTime = 0.0f;
		this.waitingTime = 0.0f;
		this.finishTime = 0.0f;
		this.arrivalTime=0.0f;
	}



	public Process(float burstTime, float arrivalTime) {
		super();
		this.burstTime = burstTime;
		this.arrivalTime = arrivalTime;
	}



	public float getBurstTime() {
		return burstTime;
	}



	public void setBurstTime(float burstTime) {
		this.burstTime = burstTime;
	}



	public float getStartTime() {
		return startTime;
	}



	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}



	public float getTurnAroundTime() {
		return turnAroundTime;
	}



	public void setTurnAroundTime(float turnAroundTime) {
		this.turnAroundTime = finishTime-arrivalTime;
	}



	public float getWaitingTime() {
		return waitingTime;
	}



	public void setWaitingTime(float waitingTime) {
		this.waitingTime = turnAroundTime-burstTime;
	}



	public float getFinishTime() {
		return finishTime;
	}



	public void setFinishTime(float finishTime) {
		this.finishTime = burstTime+startTime;
	}
	

	public float getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(float arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	@Override
	public String toString() {
		return "Process [burstTime=" + burstTime + ", startTime=" + startTime + ", turnAroundTime=" + turnAroundTime
				+ ", waitingTime=" + waitingTime + ", finishTime=" + finishTime + ", arrivalTime=" + arrivalTime + "]\n";
	}

	public int compareTo(Process p) {
		if(p.burstTime<this.burstTime)
			return 1;
		else if(p.burstTime>=this.burstTime)
			return -1;
		return 0;
	}
	
	
	

}
