
public class ShapeTest {
	public static void main(String[] args)
	{
		
		Shape[] shapes= new Shape[6];
		shapes[0]=new Square(5);
		shapes[1]=new Triangle(3,4);
		shapes[2]=new Circle(2);
		shapes[3]=new Sphere(8);
		shapes[4]=new Cube(7);
		shapes[5]=new TetraHedron(6);


     for (Shape shps : shapes) {
    	 if (shps instanceof TwoDimensionalShape) {
			 System.out.println(shps.toString()+ "\n My area is: "+((TwoDimensionalShape) shps).getArea());
		}
    	 else if (shps instanceof ThreeDimensionalShape) {
    		 System.out.println(shps.toString()+ "\n My area is: "+((ThreeDimensionalShape) shps).GetArea()+"/n My Volume is: "+((ThreeDimensionalShape)shps).GetVolume());			
		}
		
	}

	}

}
