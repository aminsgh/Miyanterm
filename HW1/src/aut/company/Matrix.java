package aut.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    private int[][] matrix;
    private int row;
    private int column;

    public Matrix(int row, int column, int value) {
        matrix = new int[row][column];
        this.row = row;
        this.column = column;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = value;

            }

        }

    }

    public Matrix(int row, int column) {
        this(row, column, 0);
    }

    public void setMatrixValue(ArrayList<Integer> arrayList) {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                matrix[i][j]=arrayList.get(i*row+j);

            }

        }
    }

    public void multiplicationTO(int coefficient) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] *= coefficient;
            }

        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;

    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getIndxOf(int row, int column) {
        return matrix[row][column];
    }

    public void setIndxOf(int row, int column, int value) {
        matrix[row][column] = value;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < getRow(); i++) {
            string += Arrays.toString(matrix[i]) + "\n";
        }

        return "Matrix{" +
                getClass().getSimpleName() + "\n" + string +
                '}';
    }
}
