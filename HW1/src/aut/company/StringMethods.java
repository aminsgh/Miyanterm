package aut.company;

import java.util.ArrayList;

public class StringMethods {
    private String string;
    private ArrayList<Character> arrayListOfX;
    private ArrayList<Character> arrayListOfY;
    private ArrayList<Character> characters;

    private String finalString="";

    private Character operation;
    private int indexOfX;
    private int indexOfY;

    private int coefficientOfX;
    private int coefficientOfY;

    public StringMethods(String string) {
        this.string = string;
        characters = new ArrayList<>();
        arrayListOfX = new ArrayList<>();
        arrayListOfY = new ArrayList<>();
        removedParentheses();
        setIndexOfXAndY();
        setCorrectIndexes(arrayListOfX);
        setCorrectIndexes(arrayListOfY);
        for (int i = 0; i <arrayListOfX.size() ; i++) {
            finalString+=arrayListOfX.get(i);

        }
        finalString+=getOperation();
        for (int i = 0; i <arrayListOfY.size() ; i++) {
            finalString+=arrayListOfY.get(i);

        }
    }

    public void removedParentheses() {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '(' && string.charAt(i) != ')' && string.charAt(i) != 32) {
                characters.add(string.charAt(i));
            }

        }
        indexOfX = characters.indexOf('X');
        indexOfY = characters.indexOf('Y');
    }

    public void setIndexOfXAndY() {
        if (indexOfX != -1 && indexOfY != -1) {
            for (int i = 0; i < characters.indexOf('X') + 1; i++) {
                arrayListOfX.add(characters.get(i));
            }
            operation = characters.get(characters.indexOf('X') + 1);
            for (int i = characters.indexOf('X') + 2; i <= characters.indexOf('Y'); i++) {
                arrayListOfY.add(characters.get(i));
            }
        } else if (indexOfX == -1) {
            arrayListOfX.add('+');
            arrayListOfX.add('0');
            arrayListOfX.add('X');
            for (int i = 0; i < characters.indexOf('Y') + 1; i++) {
                arrayListOfY.add(characters.get(i));
            }
            operation = 'Y';

        } else if (indexOfY == -1) {
            arrayListOfY.add('+');
            arrayListOfY.add('0');
            arrayListOfY.add('Y');
            for (int i = 0; i < characters.indexOf('X') + 1; i++) {
                arrayListOfX.add(characters.get(i));
            }
            operation = 'X';

        }
    }

    public void setCorrectIndexes(ArrayList<Character> arrayList) {
        ArrayList<Character> tmp=new ArrayList<Character>();
        if (!arrayList.get(0).equals('+') && !arrayList.get(0).equals('-')) {
           tmp.add('+');
            tmp.addAll(arrayList);
            arrayList.add('m');
            for (int i = 0; i <tmp.size() ; i++) {
                arrayList.set(i,tmp.get(i));

            }


        }


    }


    public int getIndexOfX() {
        return indexOfX;
    }

    public int getIndexOfY() {
        return indexOfY;
    }

    public void setString(String string) {
        this.string = string;
    }
    public void setCoefficientOfX(int coefficientOfX) {
        this.coefficientOfX = coefficientOfX;
    }

    public int getCoefficientOfX() {
        return coefficientOfX;
    }

    public int getCoefficientOfY() {
        return coefficientOfY;
    }

    public void setCoefficientOfY(int coefficientOfY) {
        this.coefficientOfY = coefficientOfY;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public ArrayList<Character> getArrayListOfX() {
        return arrayListOfX;
    }

    public void setArrayListOfX(ArrayList<Character> arrayListOfX) {
        this.arrayListOfX = arrayListOfX;
    }

    public ArrayList<Character> getArrayListOfY() {
        return arrayListOfY;
    }

    public void setArrayListOfY(ArrayList<Character> arrayListOfY) {
        this.arrayListOfY = arrayListOfY;
    }

    public String getFinalString() {
        return finalString;
    }

    public void setFinalString(String finalString) {
        this.finalString = finalString;
    }

}
