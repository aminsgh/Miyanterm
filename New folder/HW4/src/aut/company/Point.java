package aut.company;

public class Point {
    private int x;
    private int y;

    /**
     * this is a null constructor
     */
    public Point() {
    }

    /**
     * this is a main constructor
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * this is a getter method
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * this is a setter method
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * this is a getter method
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * this is a setter method
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
}
