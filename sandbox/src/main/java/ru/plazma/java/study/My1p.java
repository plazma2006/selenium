package ru.plazma.java.study;

public class My1P {

	public static void main(String[] args) {
		hello("PLAZMA");
		hello("USER");
		hello("ZLAT");
		hello("WORLD");

		Square s = new Square(5);
		System.out.println(" площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println(" площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());

		point();

	}

	public static void hello(String somebody) {
		System.out.println("HELLO, " + somebody + "!");

		}

	public static void point() {
		double d1, d2;
		Point p1 = new Point(5, 10);
		Point p2 = new Point(-5, 10);
		d1 = p1.distance(p1, p2);
		d2 = p1.distanceTo(p2);
		System.out.println(d1);
		System.out.println(d2);

	}
}




