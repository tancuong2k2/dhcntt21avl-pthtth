package baitaplab1b;

public class DemoPolygon {
	public static void main(String[] args) {
		Polygon t = new Triangle(3, 4, 5);
		Polygon r = new Rectangle(5, 3);
		Polygon s = new Square(4);

		System.out.println("Triangle: CV=" + t.perimeter() + ", DT=" + t.area());
		System.out.println("Rectangle: CV=" + r.perimeter() + ", DT=" + r.area());
		System.out.println("Square: CV=" + s.perimeter() + ", DT=" + s.area());
	}
}
