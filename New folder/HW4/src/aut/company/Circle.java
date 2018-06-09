package aut.company;


import static java.lang.Math.PI;

public class Circle {
    private int radius;
    private Point center;

    /**
     * this is a first constructor
     *
     * @param center
     */
    public Circle(Point center) {
        this(center, 0);
    }

    /**
     * this is a second constructor
     *
     * @param center
     * @param radius
     */
    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * this method for Perimeter
     *
     * @return Perimeter of Circle
     */
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    /**
     * this method for area
     *
     * @return area of Circle
     */
    public double getArea() {
        return (radius * radius) * PI;
    }

    /**
     * this is a getter method
     *
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * this is a setter method
     *
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * this is a getter method
     *
     * @return center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * this is a setter method
     *
     * @param center
     */
    public void setCenter(Point center) {
        this.center = center;
    }

}
