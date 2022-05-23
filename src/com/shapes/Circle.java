package com.shapes;

public class Circle extends Shape {
	
	public Circle(int radius) {
		pi=3.14f;
		this.radius=radius;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		float area=pi*radius*radius;
		System.out.println("Area of the circle" + "=" +area);
	}
	

}
