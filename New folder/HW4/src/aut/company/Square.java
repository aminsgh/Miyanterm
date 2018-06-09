package aut.company;

public class Square {
    private Point start;
    private int length;

    /**
     * this is a first constructor
     *
     * @param start
     */
    public Square(Point start) {
        this(start, 0);
    }


    /**
     * this is a second constructor
     *
     * @param start
     * @param length
     */
    public Square(Point start, int length) {
        this.start = start;
        this.length = length;
    }

    /**
     * this method for area
     *
     * @return area of square
     */
    public int getArea() {
        return length * length;
    }

    /**
     * this method for area
     *
     * @return Perimeter of square
     */
    public int getPerimeter() {
        return length * 4;
    }

    /**
     * this is a getter method
     *
     * @return start
     */
    public Point getStart() {
        return start;
    }

    /**
     * this is a setter method
     *
     * @param start
     */
    public void setStart(Point start) {
        this.start = start;
    }

    /**
     * this is a getter method
     *
     * @return length
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
}
