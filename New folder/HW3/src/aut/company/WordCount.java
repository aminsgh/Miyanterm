package aut.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WordCount {
    private int chars;
    private int words;
    private int lines;

    public WordCount(String string) {
        this.chars = 1;
        this.lines = 1;
        this.words = 1;
        countingAll(string);
    }

    public void countingAll(String string) {
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {

            if (Character.isWhitespace(string.charAt(i))) {
                this.addNewWords(1);
            }
        }
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '\n') {
                this.addNewLine(1);
            }
        }
        this.addNewChars(string.length() - words);
    }


    public void printAll() {
        System.out.println(chars + "//" + words + "//" + lines);
    }

    public void addNewChars(int i) {
        this.chars += i;
    }

    public void addNewWords(int i) {
        this.words += i;
    }

    public void addNewLine(int i) {
        this.lines += i;
    }

    public int getChars() {
        if (chars == 1) {
            return 0;
        }
        return chars;
    }

    public void setChars(int chars) {
        this.chars = chars;
    }

    public int getWords() {
        if (words == 1) {
            return 0;
        }
        return words;

    }

    public void setWords(int words) {
        this.words = words;
    }

    public int getLines() {
        if (lines == 1) {
            return 0;
        }
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public static ArrayList setArrList() {
        ArrayList<String> arr = new ArrayList<String>();
        boolean isNotFinish = true;
        Scanner scanner = new Scanner(System.in);
        String end = scanner.nextLine();
        while (isNotFinish) {
            if (!end.equals("end")) {
                String nextLine = end;
                System.out.println(nextLine);
                arr.add(nextLine);
            } else {
                isNotFinish = false;
            }
            end = scanner.nextLine();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        ArrayList<String> arr;
        String start=scanner.nextLine();


        if (start.equals("wc -W") || start.equals("wc -Word")) {
            arr = setArrList();
            for (int i = 0; i < arr.size() ; i++) {
                string += "\n" + arr.get(i);
            }
            System.out.println(string);
            WordCount wordCount = new WordCount(string);
            System.out.println(wordCount.getWords());
        } else if (start.equals("wc -L") || start.equals("wc -Line")) {
            arr = setArrList();
            for (int i = 0; i < arr.size(); i++) {
                string += "\n" + arr.get(i);
            }
            WordCount wordCount = new WordCount(string);
            System.out.println(wordCount.getLines());
        } else if (start.equals("wc -C") || start.equals("wc -Char")) {
            arr = setArrList();
            for (int i = 0; i < arr.size(); i++) {
                string += "\n" + arr.get(i);
            }
            WordCount wordCount = new WordCount(string);
            System.out.println(wordCount.getChars());
        } else {
            arr = setArrList();
            for (int i = 0; i < arr.size(); i++) {
                string += "\n" + arr.get(i);
            }
            WordCount wordCount = new WordCount(string);
            wordCount.printAll();
        }

    }

}
