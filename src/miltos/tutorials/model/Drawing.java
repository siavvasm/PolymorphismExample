package miltos.tutorials.model;

public class Drawing {
	
	Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public double calculateArea(){
		return this.shape.area();
	}
}
