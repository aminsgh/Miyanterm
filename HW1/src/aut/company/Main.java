package aut.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> valueOfArrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<Integer> valueOfArrayList2 = new ArrayList<>();
        String string = "";
        String expression="";
        int array1 = 1;
        int array2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the first matrix (X):{");
        String tmp1 = scanner.nextLine();
        while (!tmp1.equals("")) {
            arrayList1.add(tmp1);
            tmp1 = scanner.nextLine();
        }
        System.out.println("}");
        System.out.println("Define the first matrix (Y):{");
        String tmp2 = scanner.nextLine();
        while (!tmp2.equals("")) {
            arrayList2.add(tmp2);
            tmp2 = scanner.nextLine();
        }
        System.out.println("}");
        System.out.println("set operation :{");
        String tmp3 = scanner.nextLine();
        while (!tmp3.equals("")) {
             expression+=tmp3;
            tmp3 = scanner.nextLine();
        }
        System.out.println("}");

        for (int i = 0; i < arrayList1.get(0).length(); i++) {
            if (arrayList1.get(0).charAt(i) == ',') {
                array1++;
            }
        }
        for (int i = 0; i < arrayList2.get(0).length(); i++) {
            if (arrayList2.get(0).charAt(i) == ',') {
                array2++;
            }
        }
        setMatrix(arrayList1, valueOfArrayList1);
        setMatrix(arrayList2, valueOfArrayList2);
        Matrix x = new Matrix(arrayList1.size(), array1);
        Matrix y = new Matrix(arrayList2.size(), array2);
        x.setMatrixValue(valueOfArrayList1);
        y.setMatrixValue(valueOfArrayList2);
         OperationSystem operationSystem =new OperationSystem(expression,x,y);


    }

    public static void setMatrix(ArrayList<String> arrayList, ArrayList valueOfArrayList) {
        String string = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (!string.equals("")) {
                valueOfArrayList.add(Integer.parseInt(string));
                string = "";
            }
            for (int j = 0; j < arrayList.get(i).length(); j++) {
                if (arrayList.get(i).charAt(j) != ',') {
                    string += arrayList.get(i).charAt(j);
                } else {
                    valueOfArrayList.add(Integer.parseInt(string));
                    string = "";
                }

            }

        }
        valueOfArrayList.add(Integer.parseInt(string));
    }
}
