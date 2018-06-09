package aut.company;

import aut.company.cards.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayerHelpForGame {
    static ArrayList finalListOfPlayerOne = new ArrayList();
    static ArrayList finalListOfPlayerTwo = new ArrayList<>();
    static ArrayList finalListOfRandomPlayerTwo = new ArrayList<>();
    private static Players playerOne;
    private static Players playerTwo;
    private static Players playerRandomTwo;
    private int typeOfGame;


    public PlayerHelpForGame(int typeOfGame) {
        if (typeOfGame == 1) {
            this.typeOfGame = typeOfGame;
            System.out.println("player one");
            playerOne = new Players("player");
            System.out.println("player change>>>>>>>>>>>");
            System.out.println("player two ");
            playerTwo = new Players("player");
            playerRandomTwo = null;
            finalListOfPlayerOne.addAll(playerOne.getFinalAnimalList());
            finalListOfPlayerTwo.addAll(playerTwo.getFinalAnimalList());
        } else if (typeOfGame == 2) {
            this.typeOfGame = typeOfGame;
            System.out.println("player one");
            playerOne = new Players("player");
            System.out.println("player change>>>>>>>>>>>");
            playerRandomTwo = new Players("pc");
            playerTwo = null;
            finalListOfPlayerOne.addAll(playerOne.getFinalAnimalList());
            finalListOfRandomPlayerTwo.addAll(playerRandomTwo.getFinalAnimalList());
        }

    }


    public boolean attackingPlayerOne(int numberOfMyCard, int numberOfEnemyCard, String type) {
        if (attackingPlayers(numberOfMyCard - 1, numberOfEnemyCard - 1, type, finalListOfPlayerOne, finalListOfPlayerTwo)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean attackingPlayerTwo(int numberOfMyCard, int numberOfEnemyCard, String type) {
        if (attackingPlayers(numberOfMyCard - 1, numberOfEnemyCard - 1, type, finalListOfPlayerTwo, finalListOfPlayerOne)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean attackingRandomPlayer() {
        Random random = new Random();
        int tmp = random.nextInt(2);
        if (tmp == 1) {
            if (attackingPlayers(random.nextInt(10) + 1, random.nextInt(10) + 1, "Hit", finalListOfRandomPlayerTwo, finalListOfPlayerOne)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (attackingPlayers(random.nextInt(10) + 1, random.nextInt(10) + 1, "Kill", finalListOfRandomPlayerTwo, finalListOfPlayerOne)) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean attackingPlayers(int numberOfMyCard, int numberOfEnemyCard, String type, ArrayList finalListOfPlayerOne, ArrayList finalListOfPlayerTwo) {
        if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Lion) {
            if (((Lion) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Bear) {
            if (((Bear) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Tiger) {
            if (((Tiger) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Vulture) {
            if (((Vulture) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Fox) {
            if (((Fox) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Elephant) {
            if (((Elephant) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Wolf) {
            if (((Wolf) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Hog) {
            if (((Hog) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Hippopotamus) {
            if (((Hippopotamus) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Cow) {
            if (((Cow) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Rabbit) {
            if (((Rabbit) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else if (finalListOfPlayerOne.get(numberOfMyCard) instanceof Turtle) {
            if (((Turtle) finalListOfPlayerOne.get(numberOfMyCard)).attacking((Card) finalListOfPlayerTwo.get(numberOfEnemyCard), type)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("error enter correct statement ");
            return false;
        }

    }

    public boolean helpFromCardPlayerOne() {
        Card card1;
        int request1 = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(toStringOne());
        System.out.println("enter number of card you want  increase it's power");
        card1 = (Card) finalListOfPlayerOne.get(scanner1.nextInt());
        System.out.println("enter amount of your request");
        request1 = scanner1.nextInt();
        System.out.println("enter numbers of cards you want to help from them,and enter one line 0 for finish");
        ArrayList<Integer> helpIntListOne = new ArrayList<>();
        ArrayList<Card> helpListOne = new ArrayList<>();
        int tmp;
        tmp = scanner1.nextInt();
        while (tmp != 0) {
            helpIntListOne.add(tmp - 1);
            tmp = scanner1.nextInt();
        }
        for (int i = 0; i < helpIntListOne.size(); i++) {
            helpListOne.add(((Card) finalListOfPlayerOne.get(helpIntListOne.get(i))));
        }
        return isHelpDown(card1, request1, helpListOne);
    }

    public boolean helpFromCardPlayerTwo() {
        Card card;
        int request2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(toStringTwo());
        System.out.println("enter number of card you want  increase it's power");
        card = (Card) finalListOfPlayerTwo.get(scanner.nextInt());
        System.out.println("enter amount of your request");
        request2 = scanner.nextInt();
        System.out.println("enter numbers of cards you want to help from them,and enter one line 0 for finish");
        ArrayList<Integer> helpIntListTwo = new ArrayList<>();
        ArrayList<Card> helpListTwo = new ArrayList<>();
        int tmp;
        tmp = scanner.nextInt();
        while (tmp != 0) {
            helpIntListTwo.add(tmp - 1);
            tmp = scanner.nextInt();
        }
        for (int i = 0; i < helpIntListTwo.size(); i++) {
            helpListTwo.add(((Card) finalListOfPlayerTwo.get(helpIntListTwo.get(i))));
        }
        return isHelpDown(card, request2, helpListTwo);
    }

    public boolean helpFromCardPlayer(Card card, int request, ArrayList<Card> arrayList) {
        if (card.helpFromOtherCard(request, arrayList)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isHelpDown(Card card, int request, ArrayList<Card> helpList) {
        if (helpFromCardPlayer(card, request, helpList)) {
            System.out.println("you request is down");
            return true;
        } else {
            System.out.println("change your cards");
            return false;
        }
    }

    public boolean fullHPOne() {
        Card card1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(toStringOne());
        System.out.println("enter number of card you want to increase it");
        card1 = (Card) finalListOfPlayerOne.get(scanner1.nextInt() - 1);
        if (fullHP(card1)) {
            System.out.println("your HP is full");
            return true;
        } else {
            return false;
        }
    }

    public boolean fullHPTwo() {
        Card card2;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(toStringTwo());
        System.out.println("enter number of card you want to increase it");
        card2 = (Card) finalListOfPlayerTwo.get(scanner2.nextInt() - 1);
        if (fullHP(card2)) {
            System.out.println("your HP is full");
            return true;
        } else {
            return false;
        }
    }

    public boolean fullHP(Card card) {
        if (card.fullHP()) {
            return true;
        } else {
            return false;
        }


    }

    public boolean fullHPRandom() {
        Card randomCard;
        Random random = new Random();
        randomCard = (Card) finalListOfRandomPlayerTwo.get(random.nextInt(10) + 1);
        if (fullHP(randomCard)) {
            System.out.println("your HP is full(pc)");
            return true;
        } else {
            return false;
        }
    }


    public String toStringOne() {
        String string1 = "";
        for (int i = 0; i < finalListOfPlayerOne.size(); i++) {
            string1 += i + 1 + "." + finalListOfPlayerOne.get(i).toString() + "\n";
        }
        return "Player: one {\n" + string1 +
                "}";
    }

    public String toStringTwo() {
        String string2 = "";
        for (int i = 0; i < finalListOfPlayerTwo.size(); i++) {
            string2 += i + 1 + "." + finalListOfPlayerTwo.get(i).toString() + "\n";
        }
        return "Player: two{\n" + string2 +
                "}";
    }


    public String toStringRandomPlayer() {
        String string3 = "";
        for (int i = 0; i < finalListOfRandomPlayerTwo.size(); i++) {
            string3 += i + 1 + "." + finalListOfRandomPlayerTwo.get(i).toString() + "\n";
        }
        return "Player: computer{\n" + string3 +
                "}";
    }

    public boolean isFinished() {
        int tmp1 = 0;
        int tmp2 = 0;
        int tmp3 = 0;
        if (typeOfGame == 1) {
            tmp3 = -1;
        } else if (typeOfGame == 2) {
            tmp2 = -1;
        }
        for (int i = 0; i < finalListOfPlayerOne.size(); i++) {
            if (((Card) finalListOfPlayerOne.get(i)).isAlive()) {
                tmp1++;
            }

        }
        if (typeOfGame != 2) {
            for (int i = 0; i < finalListOfPlayerTwo.size(); i++) {
                if (((Card) finalListOfPlayerTwo.get(i)).isAlive()) {
                    tmp2++;
                }
            }
        }
        if (typeOfGame != 1) {
            for (int i = 0; i < finalListOfRandomPlayerTwo.size(); i++) {
                if (((Card) finalListOfRandomPlayerTwo.get(i)).isAlive()) {
                    tmp3++;
                }
            }
        }
        if (tmp1 == 0 || tmp2 == 0 || tmp3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getTypeOfGame() {
        return typeOfGame;
    }
}
