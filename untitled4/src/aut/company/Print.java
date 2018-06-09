package aut.company;

import java.util.ArrayList;

public class Print {
    ArrayList<Shape> shapeArrayList;

    public  Print() {
        shapeArrayList = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapeArrayList.add(shape);
    }


    public void printAll() {
        for (int i = 0; i < shapeArrayList.size(); i++) {
            System.out.println(shapeArrayList.get(i).draw());
            System.out.println(shapeArrayList.get(i).calculatePerimeter());
            System.out.println(shapeArrayList.get(i).calculateArea());

        }

    }

    public void describeEqualSides() {
        for (int i = 0; i < shapeArrayList.size(); i++) {
            if (shapeArrayList.get(i) instanceof Triangle) {
                ( (Triangle) shapeArrayList.get(i)).isEquilateral();
            }
            if (shapeArrayList.get(i) instanceof Rectangle) {
                ((Rectangle) shapeArrayList.get(i)).isSquare();
            }
        }
    }


}
