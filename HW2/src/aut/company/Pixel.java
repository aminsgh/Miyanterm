package aut.company;

import java.util.Objects;

public class Pixel {
    private Pixel rightPixel;
    private Pixel leftPixel;
    private Pixel upPixel;
    private Pixel downPixel;

    private boolean booleanRightPixel = false;
    private boolean booleanLeftPixel = false;
    private boolean booleanUpPixel = false;
    private boolean booleanDownPixel = false;

    private boolean visitBooleanRightPixel = false;
    private boolean visitBooleanLeftPixel = false;
    private boolean visitBooleanUpPixel = false;
    private boolean visitBooleanDownPixel = false;

    private char position;


    public Pixel(char position, Pixel rightPixel, Pixel leftPixel, Pixel upPixel, Pixel downPixel) {
        this.rightPixel = rightPixel;
        this.leftPixel = leftPixel;
        this.upPixel = upPixel;
        this.downPixel = downPixel;
        this.position = position;
    }

    public Pixel(char position) {
        this(position, null, null, null, null);

    }

    public Pixel() {
        this((char) 215, null, null, null, null);
    }


    public Pixel getRightPixel() {
        return rightPixel;
    }

    public void setRightPixel(Pixel rightPixel) {
        this.rightPixel = rightPixel;
        booleanRightPixel = true;
    }

    public Pixel getLeftPixel() {
        return leftPixel;
    }

    public void setLeftPixel(Pixel leftPixel) {
        this.leftPixel = leftPixel;
        booleanLeftPixel = true;
    }

    public Pixel getUpPixel() {
        return upPixel;
    }

    public void setUpPixel(Pixel upPixel) {
        this.upPixel = upPixel;
        booleanUpPixel = true;
    }

    public Pixel getDownPixel() {
        return downPixel;
    }

    public void setDownPixel(Pixel downPixel) {
        this.downPixel = downPixel;
        booleanDownPixel = true;
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }

    public boolean isBooleanRightPixel() {
        return booleanRightPixel;
    }

    public void setBooleanRightPixel(boolean booleanRightPixel) {
        this.booleanRightPixel = booleanRightPixel;
    }

    public boolean isBooleanLeftPixel() {
        return booleanLeftPixel;
    }

    public void setBooleanLeftPixel(boolean booleanLeftPixel) {
        this.booleanLeftPixel = booleanLeftPixel;
    }

    public boolean isBooleanUpPixel() {
        return booleanUpPixel;
    }

    public void setBooleanUpPixel(boolean booleanUpPixel) {
        this.booleanUpPixel = booleanUpPixel;
    }

    public boolean isBooleanDownPixel() {
        return booleanDownPixel;
    }

    public void setBooleanDownPixel(boolean booleanDownPixel) {
        this.booleanDownPixel = booleanDownPixel;
    }

    public boolean isVisitBooleanRightPixel() {
        return visitBooleanRightPixel;
    }

    public void setVisitBooleanRightPixel(boolean visitBooleanRightPixel) {
        this.visitBooleanRightPixel = visitBooleanRightPixel;
    }

    public boolean isVisitBooleanLeftPixel() {
        return visitBooleanLeftPixel;
    }

    public void setVisitBooleanLeftPixel(boolean visitBooleanLeftPixel) {
        this.visitBooleanLeftPixel = visitBooleanLeftPixel;
    }

    public boolean isVisitBooleanUpPixel() {
        return visitBooleanUpPixel;
    }

    public void setVisitBooleanUpPixel(boolean visitbooleanUpPixel) {
        this.visitBooleanUpPixel = visitbooleanUpPixel;
    }

    public boolean isVisitBooleanDownPixel() {
        return visitBooleanDownPixel;
    }

    public void setVisitBooleanDownPixel(boolean visitbooleanDownPixel) {
        this.visitBooleanDownPixel = visitbooleanDownPixel;
    }

    @Override
    public String toString() {
        return "" + position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return position == pixel.position &&
                Objects.equals(rightPixel, pixel.rightPixel) &&
                Objects.equals(leftPixel, pixel.leftPixel) &&
                Objects.equals(upPixel, pixel.upPixel) &&
                Objects.equals(downPixel, pixel.downPixel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rightPixel, leftPixel, upPixel, downPixel, position);
    }


}
