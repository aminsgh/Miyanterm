package aut.company;

import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public abstract class Polygon extends Shape {
  protected   ArrayList<Integer> sides;


    public Polygon(Integer... side) {
        sides = new ArrayList<>();
        Collections.addAll(sides, side);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public String toString() {

        String string ="";
        for (int i = 0; i <sides.size() ; i++) {
            string+= "Polygon{" +
                    "sides="+i + sides.get(i) +
                    '}';
        }
        return string;

    }

    @Override
    String  draw() {
      return this.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return this.sides.containsAll(polygon.sides)&&polygon.sides.containsAll(this.sides);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sides);
    }


}
