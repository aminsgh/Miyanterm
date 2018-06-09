package aut.company;

public class OperationSystem extends Expression {


    public OperationSystem(String expression, Matrix x, Matrix y) {
        super(expression, x, y);
        if (getOperation() == '+') {
            Adding adding = new Adding(getX(), getY());
        } else if (getOperation() == '-') {
            Subtraction subtraction = new Subtraction(getX(), getY());
        } else if (getOperation() == '.') {
            Multiplication multiplication = new Multiplication(getX(), getY());
        } else if (getOperation() == 'X') {
            System.out.println(x.toString());
            ;
        } else if (getOperation() == 'Y') {
            System.out.println(y.toString());
        } else {
            System.out.println("expression is not valid");
        }
    }

    public OperationSystem(Matrix x, Matrix y) {
        this("", x, y);
    }

}
