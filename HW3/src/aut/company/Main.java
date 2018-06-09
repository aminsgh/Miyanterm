package aut.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tmpInt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Two player\n2.play with computer");
        tmpInt = scanner.nextInt();
        if (tmpInt == 1) {
            PlayerHelpForGame playerHelpForGame = new PlayerHelpForGame(1);
            getWhatToDo(playerHelpForGame, 1, 1);
        } else if (tmpInt == 2) {
            PlayerHelpForGame playerHelpForGame = new PlayerHelpForGame(2);
            getWhatToDo(playerHelpForGame, 1, 2);
        } else {
            System.out.println("false number.................");
        }
    }


    public static void getWhatToDo(PlayerHelpForGame playerHelpForGame, int player, int typeOfGame) {
        if (!playerHelpForGame.isFinished()) {
            if (typeOfGame == 1) {
                if (player == 1) {
                    int tmpInt1 = 0;
                    int myCard1 = 0;
                    int enemyCard1 = 0;
                    String type1 = "";
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("player one tune>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("1.attacking\n2.help from my other card\n3.full the Hp");
                    tmpInt1 = scanner1.nextInt();
                    if (tmpInt1 == 1) {
                        System.out.println("your card is:\n"+playerHelpForGame.toStringOne());
                        System.out.println("please enter the number of card that you want attacking by it");
                        myCard1 = scanner1.nextInt();
                        System.out.println("enemy card is:\n"+playerHelpForGame.toStringTwo());
                        System.out.println("please enter the number of card that you want attacking to");
                        enemyCard1 = scanner1.nextInt();
                        System.out.println("enter type of attack ");
                        type1 = scanner1.next();
                        if (playerHelpForGame.attackingPlayerOne(myCard1, enemyCard1, type1)) {
                            System.out.println("attacking down");
                            System.out.println("change player>>>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 2, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    } else if (tmpInt1 == 2) {
                        System.out.println("your card now is:\n"+playerHelpForGame.toStringOne());
                        if (playerHelpForGame.helpFromCardPlayerOne()) {
                            System.out.println("help is down");
                            getWhatToDo(playerHelpForGame,1,typeOfGame);
                        } else {
                            System.out.println("you can get help change card >>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    } else if (tmpInt1 == 3) {
                        System.out.println("your card now is:\n"+playerHelpForGame.toStringOne());
                        if (playerHelpForGame.fullHPOne()) {
                            System.out.println("change player>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 2, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    }
                } else if (player == 2) {
                    int tmpInt2 = 0;
                    int myCard2 = 0;
                    int enemyCard2 = 0;
                    String type2 = "";
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("player two tune>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("1.attacking\n2.help from my other card\n3.full the Hp");
                    tmpInt2 = scanner2.nextInt();
                    if (tmpInt2 == 1) {
                        System.out.println("your card is\n"+playerHelpForGame.toStringTwo());
                        System.out.println("please enter the number of card that you want attacking by it");
                        myCard2 = scanner2.nextInt();
                        System.out.println("your enemy card is\n"+playerHelpForGame.toStringOne());
                        System.out.println("please enter the number of card that you want attacking to");
                        enemyCard2 = scanner2.nextInt();
                        System.out.println("enter type of attack ");
                        type2 = scanner2.next();
                        if (playerHelpForGame.attackingPlayerTwo(myCard2, enemyCard2, type2)) {
                            System.out.println("attacking down");
                            System.out.println("change player>>>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 2, typeOfGame);
                        }
                    } else if (tmpInt2 == 2) {
                        System.out.println("your card is\n"+playerHelpForGame.toStringTwo());
                        if (playerHelpForGame.helpFromCardPlayerTwo()) {
                            System.out.println("help is down");
                            getWhatToDo(playerHelpForGame,2,typeOfGame);
                        } else {
                            System.out.println("you can get help change card >>>>>");
                            getWhatToDo(playerHelpForGame, 2, typeOfGame);
                        }
                    } else if (tmpInt2 == 3) {
                        System.out.println("your card is\n"+playerHelpForGame.toStringTwo());
                        if (playerHelpForGame.fullHPTwo()) {
                            System.out.println("change player>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 2, typeOfGame);
                        }
                    }
                }
            } else if (typeOfGame == 2) {
                if (player == 1) {
                    int tmpInt11 = 0;
                    int myCard11 = 0;
                    int enemyCard11 = 0;
                    String type11 = "";
                    Scanner scanner11 = new Scanner(System.in);
                    System.out.println("player one tune>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("1.attacking\n2.help from my other card\n3.full the Hp");

                    tmpInt11 = scanner11.nextInt();
                    if (tmpInt11 == 1) {
                        System.out.println("your card is:\n"+playerHelpForGame.toStringOne());
                        System.out.println("please enter the number of card that you want attacking by it");
                        myCard11 = scanner11.nextInt();
                        System.out.println("your enemy card is:\n"+playerHelpForGame.toStringRandomPlayer());
                        System.out.println("please enter the number of card that you want attacking to");
                        enemyCard11 = scanner11.nextInt();
                        System.out.println("enter type of attack ");
                        type11 = scanner11.next();
                        if (playerHelpForGame.attackingPlayerOne(myCard11, enemyCard11, type11)) {
                            System.out.println("attacking down");
                            System.out.println("change player>>>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 3, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    } else if (tmpInt11 == 2) {
                        System.out.println("your card now is:\n"+playerHelpForGame.toStringOne());
                        if (playerHelpForGame.helpFromCardPlayerOne()) {
                            System.out.println("help is down");
                        } else {
                            System.out.println("you can get help change card >>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    } else if (tmpInt11 == 3) {
                        System.out.println("your card now is:\n"+playerHelpForGame.toStringOne());
                        if (playerHelpForGame.fullHPOne()) {
                            System.out.println("change player>>>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 3, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    }
                } else if (player == 3) {
                    Random random = new Random();
                    int randomForChoosing = random.nextInt(2);
                    if (randomForChoosing != 0) {
                        if (playerHelpForGame.attackingRandomPlayer()) {
                            System.out.println("attacking down(pc)");
                            System.out.println("player change>>>>>>>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        } else {
                            getWhatToDo(playerHelpForGame, 3, typeOfGame);
                        }
                    } else {
                        if (playerHelpForGame.fullHPRandom()) {
                            System.out.println("change player>>>>>>>");
                            getWhatToDo(playerHelpForGame, 1, typeOfGame);
                        }
                    }
                }
            }
        }
    }

}
