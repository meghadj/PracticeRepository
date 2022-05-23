package com.shapes;

public class Square extends Shape implements ITwoDShape{
	public Square(int s1, int s2) {
		side=s1;
		side=s2;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int area=side*side;
		System.out.println("Area of the square" + "=" +area);
	}

	@Override
	public void draw2d() {
		// TODO Auto-generated method stub
		System.out.println("Drawing 2d square");
	}

		
	}
	

