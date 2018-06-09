package aut.company;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(0, 1);

    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        setFinallNumber(numerator, denominator);

    }

    public Rational add(Rational rational1, Rational rational2) {
        Rational tmp = new Rational((rational1.getNumerator() * rational2.getDenominator()) + (rational2.getNumerator() * rational1.getDenominator()), rational1.getDenominator() * rational2.getDenominator());
        return tmp;

    }

    public Rational sub(Rational rational1, Rational rational2) {
        Rational tmp = new Rational((rational1.getNumerator() * rational2.getDenominator()) - (rational2.getNumerator() * rational1.getDenominator()), rational1.getDenominator() * rational2.getDenominator());
        return tmp;
    }

    public Rational mult(Rational rational1, Rational rational2) {
        Rational tmp = new Rational(rational1.getNumerator() * rational2.getNumerator(), rational1.getDenominator() * rational2.getDenominator());
        return tmp;
    }

    public Rational div(Rational rational1, Rational rational2) {
        Rational tmp = new Rational(rational1.getNumerator() * rational2.getDenominator(), rational1.getDenominator() * rational2.getNumerator());
        return tmp;
    }


    public void setFinallNumber(int numerator, int denominator) {
        int i = numerator;
        if (numerator > denominator) {
            i = denominator;
        }

        if (numerator == denominator) {
            this.numerator = 1;
            this.denominator = 1;
        } else {
            while (i > 0) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator = numerator / i;
                    denominator = denominator / i;
                    this.numerator = this.numerator / i;
                    this.denominator = this.denominator / i;
                    i--;
                } else {
                    i--;
                }
            }
        }
    }

    public void printFraction() {
        System.out.println("/**" + this.numerator + "/" + this.denominator);
    }

    public void printFlout() {
        float i;
        i = (float) this.numerator / (float) this.denominator;
        System.out.print("/**");
        System.out.print(i);
        System.out.println("");
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

}
