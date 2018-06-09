package aut.company;

import java.util.Objects;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {

        return radius * 2 * PI;

    }

    public double calculateArea() {
        return radius * radius * PI;

    }

    @Override
    String  draw() {
       return this.toString();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }


    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
