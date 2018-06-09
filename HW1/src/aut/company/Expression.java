package aut.company;

import java.util.ArrayList;

public class Expression extends StringMethods {
    private ArrayList<Character> expressionArray;
    private String coefficientsOfX ="";
    private String coefficientsOfY ="";
    private int coefficientOfX;
    private int coefficientOfY;
    private Matrix x;
    private Matrix y;

    public Expression(String expression, Matrix x, Matrix y) {
        super(expression);
        this.x = x;
        this.y = y;
        expressionArray = new ArrayList<>();
        setCoefficients();
        x.multiplicationTO(coefficientOfX);
        y.multiplicationTO(coefficientOfY);


    }

    public Expression(Matrix x, Matrix y) {
        this("", x, y);
    }

    public void setfinalmatrix() {
        this.x.multiplicationTO(coefficientOfX);
        this.y.multiplicationTO(coefficientOfY);
    }

    public void setCoefficients() {
        for (int i = 1; i < getArrayListOfX().size() - 1; i++) {
            coefficientsOfX += getArrayListOfX().get(i);
        }
        for (int i = 1; i < getArrayListOfY().size() - 1; i++) {
            coefficientsOfY += getArrayListOfY().get(i);
        }
        if (getArrayListOfX().get(0) == '-') {
            if (!coefficientsOfX.equals("")) {
                coefficientOfX = Integer.parseInt(coefficientsOfX) * -1;
            } else {
                coefficientOfX = -1;
            }
        } else {
            if (!coefficientsOfX.equals("")) {
                coefficientOfX = Integer.parseInt(coefficientsOfX);
            } else {
                coefficientOfX = 1;
            }
        }
        if (getArrayListOfY().get(0) == '-') {
            if (!coefficientsOfY.equals("")) {
                coefficientOfY = Integer.parseInt(coefficientsOfY);
            } else {
                coefficientOfY = -1;
            }
        } else {
            if (!coefficientsOfY.equals("")) {
                coefficientOfY = Integer.parseInt(coefficientsOfY);
            }else {
                coefficientOfY=1;
            }
        }

    }

    public void setIndexOfExpressionArray(int index, char ch) {
        expressionArray.add(index, ch);

    }

    public char getIndxOfExpressionArray(int index) {
        return expressionArray.get(index);

    }

    public ArrayList<Character> getExpreArray() {
        return expressionArray;
    }

    public void setExpreArray(ArrayList<Character> expressionArray) {
        this.expressionArray = expressionArray;
    }

    public int getCoefficientOfX() {
        return coefficientOfX;
    }

    public void setCoefficientOfX(int coefficientOfX) {
        this.coefficientOfX = coefficientOfX;
    }

    public int getCoefficientOfY() {
        return coefficientOfY;
    }

    public void setCoefficientOfY(int coefficientOfY) {
        this.coefficientOfY = coefficientOfY;
    }


    public Matrix getX() {
        return x;
    }

    public Matrix getY() {
        return y;
    }
}
