
public class Triangle extends TwoDimensionalShape {
      private double a,h; 
	
	public double getArea() {
		return getA()*getH()/2 ;
	}

	public Triangle(double a, double h) {
		super();
	    setH(h);
     	setA(a);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a>0?a:0;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h>0?h:0;
	}
  
    public String toString() {
	   return super.toString()+",my name is Triangle  \n My Edge:"+getA()+" \n My Height:"+ getH();
}
}
