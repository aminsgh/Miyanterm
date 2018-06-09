package aut.company;

public class Main {

    public static void main(String[] args) {
        //tamrin 5
        {
            Item farmandChocolate = new Item("chocolate", "Farmand");
            farmandChocolate.increment(5);
            Item chakelsPofak = new Item("pofak", "chakels");
            chakelsPofak.increment(3);
            farmandChocolate.printItem();
            chakelsPofak.printItem();
        }
        // end************************************
     //tamrin 6
        {
            Rational rational = new Rational(144, 162);
            Rational rational1 = new Rational(135, 600);
            System.out.println("first number fraction:");
            rational.printFraction();
            System.out.println("first number fraction:");
            rational.printFlout();
            System.out.println("second number flout:");
            rational1.printFraction();
            System.out.println("second number flout:");
            rational1.printFlout();
            System.out.println("fraction:...................................");
            System.out.println("add:");
            rational.add(rational, rational1).printFraction();
            System.out.println("sub:");
            rational.sub(rational, rational1).printFraction();
            System.out.println("mult:");
            rational.mult(rational, rational1).printFraction();
            System.out.println("div:");
            rational.div(rational, rational1).printFraction();
            System.out.println("flout:......................................");
            System.out.println("add:");
            rational.add(rational, rational1).printFlout();
            System.out.println("sub:");
            rational.sub(rational, rational1).printFlout();
            System.out.println("mult:");
            rational.mult(rational, rational1).printFlout();
            System.out.println("div:");
            rational.div(rational, rational1).printFlout();
        }

        //end******************************************
    }
}
