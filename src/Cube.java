
public class Cube extends ThreeDimensionalShape{
   
	 private double a;
	
	
	public double GetArea() {
		return  6*Math.pow( getA(), 2);
	}

	
	
	public double GetVolume() {
		
		return Math.pow(getA(), 3);
	}



	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a>0?a:0;
	}



	public Cube(double a) {
		super();
		setA(a);	}

    public String toString()
    {
	    return super.toString()+"my name is Cube \n My Edge is:"+ getA();
    }
}
