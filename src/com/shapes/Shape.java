package com.shapes;

public abstract class Shape {
	int length, breadth, area, side, radius;
	float pi;
	
	public abstract void draw();
	
	public void display() {
		System.out.println("This is the completed method in the abstract class");
	}

}
