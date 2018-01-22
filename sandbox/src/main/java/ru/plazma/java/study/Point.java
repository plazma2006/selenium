package ru.plazma.java.study;

public class Point {
  public double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public  double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
  }

  public  double distanceTo(Point p) {
    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
  }
}
