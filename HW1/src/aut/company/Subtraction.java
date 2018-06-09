package aut.company;

public class Subtraction extends Calculate {
    private Matrix finalMatrix;

    public Subtraction(Matrix x, Matrix y) {
        super(x, y);
        finalMatrix = new Matrix(getX().getRow(), getX().getColumn());
        calculateMatrix();
        System.out.println(finalMatrix.toString());
    }

    @Override
    public void calculateMatrix() {
        for (int i = 0; i < getX().getColumn(); i++) {
            for (int j = 0; j < getX().getRow(); j++) {
                finalMatrix.setIndxOf(i, j, getX().getIndxOf(i, j) - getY().getIndxOf(i, j));

            }

        }
    }

    public Matrix getFinalMatrix() {
        return finalMatrix;
    }
}
