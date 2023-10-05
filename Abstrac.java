package main3;

public class Abstrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Shape[] shapes = new Shape[4];

	        shapes[0] = new Circle("Red", 5.0);
	        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
	        shapes[2] = new Triangle("Green", 3.0, 4.0, 5.0);
	        shapes[3] = new Square("Yellow", 7.0);

	        
	        for (Shape shape : shapes) {
	            System.out.println("Color: " + ((AbstractShape) shape).getColor());
	            System.out.println("Area: " + shape.area());
	            System.out.println("Perimeter: " + shape.perimeter());
	            System.out.println();
	        }
	}

}
