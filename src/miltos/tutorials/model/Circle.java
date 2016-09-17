package miltos.tutorials.model;

public class Circle extends Shape {
	
	public Circle(){
		super();
	}
	
	public Circle(double measure){
		super(measure);
	}
	
	public double area(){
		return 3.14 * (super.getMeasure()*super.getMeasure());
	}
}
