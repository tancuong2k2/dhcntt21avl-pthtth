package baitaplab1b;

public class Polygon {

	double area();

	double perimeter();
}

// Ví dụ Triangle
class Triangle implements Polygon {
	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double perimeter() {
		return a + b + c;
	}

	public double area() {
		double p = perimeter() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

// Rectangle kế thừa Quadrilateral
class Quadrilateral implements Polygon {
	protected double a, b, c, d;

	public Quadrilateral(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public double perimeter() {
		return a + b + c + d;
	}

	public double area() {
		return 0;
	} // placeholder
}

class Rectangle extends Quadrilateral {
	private double width, height;

	public Rectangle(double width, double height) {
		super(width, height, width, height);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}

class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
}
