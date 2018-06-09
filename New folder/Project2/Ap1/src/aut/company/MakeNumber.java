package aut.company;

public class MakeNumber {
    private String string;
    private int[] finalArray;
    private int number1;
    private int number2;
    private int finalInt;

    public MakeNumber(String string) {
        this.string = string;
        number1 = setNumber(string.charAt(0));
        number2 = setNumber(string.charAt(1));
        finalInt = 10 * number1 + number2;
        this.finalArray = new int[finalInt];
        setFinalArray();
        printArr();

    }

    private void printArr() {
        for (int i = 0; i < finalInt; i++) {
            System.out.print(finalArray[i] + ",");
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNunber2() {
        return number2;
    }

    public void setNunber2(int nunber2) {
        this.number2 = nunber2;
    }

    public int setNumber(char ch) {
        int i = 0;
        switch (ch) {
            case '0':
                i = 0;
                break;
            case '1':
                i = 1;
                break;
            case '2':
                i = 2;
                break;
            case '3':
                i = 3;
                break;
            case '4':
                i = 4;
                break;
            case '5':
                i = 5;
                break;
            case '6':
                i = 6;
                break;
            case '7':
                i = 7;
                break;
            case '8':
                i = 8;
                break;
            case '9':
                i = 9;
                break;

        }
        return i;
    }

    public void setFinalArray() {
        for (int i = 0; i < this.finalInt; i++) {
            finalArray[i] = (i * (i + 1)) / 2;

        }

    }

    public int getFinalInt() {
        return finalInt;
    }

}
