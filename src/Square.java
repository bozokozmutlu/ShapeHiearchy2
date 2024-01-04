
public class Square extends TwoDimensionalShape{

  private double a;
  
	public Square(double a) {
	super();
	setA(a);
}

	public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a>0?a:0;
}

	public double getArea() {
		return Math.pow(a, 2);
	}
	
		public String toString() {
			return super.toString()+",my name is Square \n my edge: "+getA();
		}

}
