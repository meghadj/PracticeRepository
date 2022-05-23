package com.shapes;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(6);
		obj.draw();
		
		Rectangle rect= new Rectangle(4,5);
		rect.draw();
	
		
		Square sqr=new Square(3,5);
		sqr.draw();
		sqr.draw2d();
		sqr.display();
		sqr.message();

	}

}
