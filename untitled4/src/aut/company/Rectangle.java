package aut.company;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Polygon {
    ArrayList<Integer> sides;


    public Rectangle(int side1, int side2) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
    }

    public double calculatePerimeter() {

        return (sides.get(0) * sides.get(1));
    }

    public double calculateArea() {
        return (sides.get(0) + sides.get(1)) * 2;

    }


    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isSquare() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))) {
            return true;
        } else return false;
    }


}
