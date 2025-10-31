package com.Sample;

public class City {
	private String name;
	private double temparature;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTemparature() {
		return temparature;
	}
	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}
	public City(String name, double temparature) {
		super();
		this.name = name;
		this.temparature = temparature;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", temparature=" + temparature + "]";
	}
	
	

}
