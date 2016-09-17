package miltos.tutorials.executables;

import miltos.tutorials.model.Circle;
import miltos.tutorials.model.Drawing;
import miltos.tutorials.model.Shape;
import miltos.tutorials.model.Triangle;

public class Application {
	
	private static double DIAMETER = 2;
	private static double HEIGHT = 1.33;
	private static double BASE = 2.43;
	
	public static void main(String[] args){
		
		//Create an empty drawing
		Drawing drawing = new Drawing();
		
		//Instantiate two different shapes 
		Shape triangle = new Triangle(HEIGHT,BASE);
		Shape circle = new Circle(DIAMETER);
		
		//Calculate the area of the circle
		drawing.setShape(circle);
		double area = drawing.calculateArea();
		System.out.println("The area of the circle is: " + area);
		
		//Calculate the area of the triangle
		drawing.setShape(triangle);
		area = drawing.calculateArea();
		System.out.println("The area of the triangle is: " + area);
		
		//Instantiate the parent class and call the method
		Shape shape = new Shape();
		drawing.setShape(shape);
		area = drawing.calculateArea();
		System.out.println("This is a generic shape with area equal to: " + area);
		
	}
}
