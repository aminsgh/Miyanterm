package aut.company;

public abstract class Calculate {
    private Matrix x;
    private Matrix y;

    public Calculate(Matrix x, Matrix y) {
        this.x = x;
        this.y = y;
    }

    abstract public void calculateMatrix();

    public Matrix getX() {
        return x;
    }

    public void setX(Matrix x) {
        this.x = x;
    }

    public Matrix getY() {
        return y;
    }

    public void setY(Matrix y) {
        this.y = y;
    }
}
