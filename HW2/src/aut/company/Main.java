package aut.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xOfHitOne = 0;
        int yOfHitOne = 0;
        int xOfHitTwo = 0;
        int yOfHitTwo = 0;
        int tmp;
        Position positionHitOne = new Position(0, 0);
        Position positionHitTwo = new Position(0, 0);
        PlayerOne playerOne = new PlayerOne();
        PlayerTwo playerTwo = new PlayerTwo();
        ArrayList<Position> playerOnePositions = new ArrayList<>();
        playerOnePositions.addAll(setAllShip());

        System.out.println();
        System.out.println("player change>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();

        ArrayList<Position> playerTwoPositions = new ArrayList<>();
        playerTwoPositions.addAll(setAllShip());


        playerOne.addNewShip(playerOnePositions.get(0), playerOnePositions.get(1));
        playerOne.addNewShip(playerOnePositions.get(2), playerOnePositions.get(3));
        playerOne.addNewShip(playerOnePositions.get(4), playerOnePositions.get(5));
        playerOne.addNewShip(playerOnePositions.get(6), playerOnePositions.get(7));
        playerOne.addNewShip(playerOnePositions.get(8), playerOnePositions.get(9));

        playerTwo.addNewShip(playerTwoPositions.get(0), playerTwoPositions.get(1));
        playerTwo.addNewShip(playerTwoPositions.get(2), playerTwoPositions.get(3));
        playerTwo.addNewShip(playerTwoPositions.get(4), playerTwoPositions.get(5));
        playerTwo.addNewShip(playerTwoPositions.get(6), playerTwoPositions.get(7));
        playerTwo.addNewShip(playerTwoPositions.get(8), playerTwoPositions.get(9));

        while (!playerOne.checkForWin() || !playerTwo.checkForWin()) {
            System.out.println(playerOne.toString());
            System.out.println("enter x for hit a enemy ship");
            xOfHitOne = scanner.nextInt();
            positionHitOne.setX(xOfHitOne);
            System.out.println("enter y for hit a enemy ship");
            yOfHitOne = scanner.nextInt();
            positionHitOne.setY(yOfHitOne);
            System.out.println("enter the type: 1.Normal  2.Random ");
            tmp = scanner.nextInt();
            if (tmp == 1) {
                playerOne.hitShip(positionHitOne, "Normal");
            } else {
                playerOne.hitShip(positionHitOne, "Random");
            }
            System.out.println();
            System.out.println("player change>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();

            System.out.println(playerTwo.toString());
            System.out.println("enter x for hit a enemy ship");
            xOfHitTwo = scanner.nextInt();
            positionHitTwo.setX(xOfHitTwo);
            System.out.println("enter y for hit a enemy ship");
            yOfHitTwo = scanner.nextInt();
            positionHitTwo.setY(yOfHitTwo);
            System.out.println("enter the type: 1.Normal  2.Random ");
            tmp = scanner.nextInt();
            if (tmp == 1) {
                playerTwo.hitShip(positionHitOne, "Normal");
            } else {
                playerTwo.hitShip(positionHitOne, "Random");
            }


        }
    }

    private static ArrayList<Position> setAllShip() {
        Scanner scanner = new Scanner(System.in);
        int x5, y5;
        int x4, y4;
        int x3, y3;
        int x2, y2;
        int x1, y1;
        int tmp;
        ArrayList<Position> positions = new ArrayList<>();
        System.out.println("player one chose five place for ships:");
        System.out.println("please enter x  for ship in size 5");
        x5 = scanner.nextInt();
        System.out.println("please enter y  for ship in size 5");
        y5 = scanner.nextInt();
        Position startShip5 = new Position(x5, y5);
        System.out.println("please set side for ship :\n" + "1.up 2.right 3.left 4.down");
        tmp = scanner.nextInt();
        Position endShip5 = new Position(getXAndY(x5, y5, tmp, 5)[0], getXAndY(x5, y5, tmp, 5)[1]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("player one chose five place for ships:");
        System.out.println("please enter x  for ship in size 4");
        x4 = scanner.nextInt();
        System.out.println("please enter y  for ship in size 4");
        y4 = scanner.nextInt();
        Position startShip4 = new Position(x4, y4);
        System.out.println("please set side for ship :\n" + "1.up  2.right  3.left  4.down");
        tmp = scanner.nextInt();
        Position endShip4 = new Position(getXAndY(x4, y4, tmp, 4)[0], getXAndY(x4, y4, tmp, 4)[1]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("please enter x  for ship in size 3");
        x3 = scanner.nextInt();
        System.out.println("please enter y  for ship in size 3");
        y3 = scanner.nextInt();
        Position startShip3 = new Position(x3, y3);
        System.out.println("please set side for ship :\n" + "1.up 2.right 3.left 4.down");
        tmp = scanner.nextInt();
        Position endShip3 = new Position(getXAndY(x3, y3, tmp, 3)[0], getXAndY(x3, y3, tmp, 3)[1]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("please enter x  for ship in size 2");
        x2 = scanner.nextInt();
        System.out.println("please enter y  for ship in size 2");
        y2 = scanner.nextInt();
        Position startShip2 = new Position(x2, y2);
        System.out.println("please set side for ship :\n" + "1.up 2.right 3.left 4.down");
        tmp = scanner.nextInt();
        Position endShip2 = new Position(getXAndY(x2, y2, tmp, 2)[0], getXAndY(x2, y2, tmp, 2)[1]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("please enter x  for ship in size 1");
        x1 = scanner.nextInt();
        System.out.println("please enter y  for ship in size 1");
        y1 = scanner.nextInt();
        Position startShip1 = new Position(x1, y1);
        Position endShip1 = new Position(x1, y1);
        for (int i = 0; i < 10; i++) {
            positions.add(null);
        }

        positions.set(0, startShip5);
        positions.set(1, endShip5);
        positions.set(2, startShip4);
        positions.set(3, endShip4);
        positions.set(4, startShip3);
        positions.set(5, endShip3);
        positions.set(6, startShip2);
        positions.set(7, endShip2);
        positions.set(8, startShip1);
        positions.set(9, endShip1);

        return positions;
    }

    private static int[] getXAndY(int x, int y, int tmp, int size) {
        int[] ints = new int[2];

        if (tmp == 1 && x - size >= 0) {
            ints[0] = (x - size) + 1;
            ints[1] = y;
        } else if (tmp == 2 && y + size < 10) {
            ints[0] = x;
            ints[1] = (y + size) - 1;
        } else if (tmp == 3 && y - size >= 0) {
            ints[0] = x;
            ints[1] = (y - size) + 1;
        } else if (tmp == 4 && x + size < 10) {
            ints[0] = (x + size) - 1;
            ints[1] = y;
        }
        return ints;
    }

}
