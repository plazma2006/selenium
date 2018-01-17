package ru.plazma.java.study;

public class My1P {

	public static void main(String[] args) {
		hello("PLAZMA");
		hello("USER");
		hello("ZLAT");
		hello("WORLD");

		double l = 5;
		System.out.println(" площадь квадрата со стороной " + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println(" площадь прямоугольника со стороной " + a + " и " + b + " = " + area(a, b));

	}

	public static void hello(String somebody) {
		System.out.println("HELLO, " + somebody + "!");

	}

	public static double area(double len) {
		return len * len;
	}

	public static double area(double a, double b) {

		return a * b;
	}
	}




