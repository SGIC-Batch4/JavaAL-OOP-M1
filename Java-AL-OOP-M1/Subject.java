package com.sgic.result;

public class Subject {
	private String id;
	private String name;
	private double marks;
	
	Subject(String id,String name, double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}
	
	
	
}
