package aut.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Triangle extends Polygon {


    public Triangle(int side1, int side2, int side3) {
       super(side1,side2,side3);
    }


    public double calculatePerimeter() {

        int p = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;
        p = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        Math.sqrt(p);
        return p;
    }

    public double calculateArea() {
        return sides.get(0) + sides.get(1) + sides.get(2);

    }





    public boolean isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))) {
            System.out.println(true);
            return true ;
        } else {
            System.out.println(false);
            return false;
        }

    }


}
