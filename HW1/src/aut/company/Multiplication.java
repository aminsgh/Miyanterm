package aut.company;

public class Multiplication extends Calculate {
    private Matrix finalMatrix;

    public Multiplication(Matrix x, Matrix y) {
        super(x, y);
        finalMatrix = new Matrix(getX().getRow(), getX().getColumn());
        calculateMatrix();
        System.out.println(finalMatrix.toString());
    }

    @Override
    public void calculateMatrix() {
        if (getX().getColumn() == getY().getRow()) {
            for (int i = 0; i < getX().getRow(); i++) {
                for (int j = 0; j < getX().getColumn(); j++) {
                    int sum=0;
                    for (int k = 0; k <getX().getColumn() ; k++) {
                        sum+=getX().getIndxOf(i,k)*getY().getIndxOf(k,j);
                        finalMatrix.setIndxOf(i, j,sum);
                    }

                }

            }
        }else {
            System.out.println("con't do!!!");
        }
    }


    public Matrix getFinalMatrix() {
        return finalMatrix;
    }
}
