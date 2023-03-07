package com.demo;

public enum Coffee {
	small(150,100f),medium(200,150f),large(250,250f);	//these are treated as objects
	private int qty;	//in ml
	private float price;
	private Coffee(int qty, float price) {	//declared as private since it is not called by other methods
		this.qty=qty;
		this.price=price;
	}
	public int getQty() {
		return qty;
	}
	public float getPrice() {
		return price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
