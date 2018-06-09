package aut.company;

public class Main {

    public static void main(String[] args) {
       Triangle triangle=new Triangle(1,2,1);
       Rectangle rectangle=new Rectangle(4,4);
       Print print=new Print();
       print.addShape(triangle);
       print.describeEqualSides();
       print.printAll();
       print.describeEqualSides();
    }
}
