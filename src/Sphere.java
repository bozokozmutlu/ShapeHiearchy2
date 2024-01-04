
public class Sphere extends ThreeDimensionalShape{
     private double radius;
	@Override
	public double GetArea() {

		return 4*Math.PI*Math.pow(getRadius(),2);
	}

	public Sphere(double radius) {
		super();
       setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius>0?radius:0;
	}

	
	public double GetVolume() {
		return (4/3)*Math.PI*Math.pow(getRadius(), 3);
	}
	public String toString() {
		return super.toString()+"my name is Sphere  \n my Radius:"+getRadius();
	}

}
