
public class Circle extends TwoDimensionalShape {

	private double radius;

	public Circle(double radius) {
		super();
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius>0?radius:0;
	}

	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
	public String toString() {
		
		return super.toString()+",my name is Circle \n my Radius: "+getRadius();
	}

}
