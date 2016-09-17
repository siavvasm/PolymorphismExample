package miltos.tutorials.model;

public class Shape {
	
	private static double measure;
	
	public Shape(){
		
	}
	
	public Shape(double measure){
		this.measure = measure;
	}
	
	public static double getMeasure() {
		return measure;
	}

	public static void setMeasure(double measure) {
		Shape.measure = measure;
	}

	public double area(){
		System.out.println("This method calculates the area of a specific shape");
		return -1;
	}
}
