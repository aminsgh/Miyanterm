package aut.company;

public class Rectangle {
    static Point start;
    private int length;
    private int width;

    /**
     * this is a first constructor
     *
     * @param length
     * @param width
     * @param starts
     */
    public Rectangle(int length, int width, Point starts) {
        this.length = length;
        this.width = width;
        start = starts;
    }

    /**
     * this is a  second constructor
     *
     * @param length
     * @param width
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * this method for Perimeter
     *
     * @return Perimeter of Rectangle
     */
    public int getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * this method for area
     *
     * @return area of Rectangle
     */
    public int getArea() {
        return length * width;
    }

    /**
     * this is a getter method
     *
     * @return
     */
    public Point getStart() {
        return start;
    }

    /**
     * this is a setter method
     *
     * @param starts
     */
    static void setStart(Point starts) {
        start = starts;
    }

    /**
     * this is a getter method
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     * this is a setter method
     *
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * this is a getter method
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * this is a setter method
     *
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
