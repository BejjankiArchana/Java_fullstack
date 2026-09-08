package com.collections.comparable;

public class Mobile {
	int id;
	String name;
	double price;
	public Mobile(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
