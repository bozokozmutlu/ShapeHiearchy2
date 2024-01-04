
public class TetraHedron extends ThreeDimensionalShape {
   private double a;
   
	
	public TetraHedron(double a) {
	super();
	setA(a);
	}


	public double getA() {
	return a;
}


public void setA(double a) {
	this.a = a>0?a:0;
}


	public double GetArea() {
		return Math.sqrt(3)*Math.pow(getA(), 2);
	}

	
	public double GetVolume() {
		return Math.sqrt(2)/12*Math.pow(a, 3);
	}
 @Override
	public String toString() {
		
		return super.toString()+",my name is TetraHedron  \n my edge:"+getA();
	}
}
