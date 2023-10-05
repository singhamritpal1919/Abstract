package main3;

public abstract class AbstractShape implements Shape{
	
	private String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public abstract double area();
    public abstract double perimeter();

}
