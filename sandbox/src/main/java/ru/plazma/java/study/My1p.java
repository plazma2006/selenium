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

		}

	public static void hello(String somebody) {
		System.out.println("HELLO, " + somebody + "!");

		}


}




