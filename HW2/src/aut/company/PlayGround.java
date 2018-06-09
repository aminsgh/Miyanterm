package aut.company;

import java.util.Random;

public abstract class PlayGround {

    static Pixel[][] playerOneGround = new Pixel[10][10];

    static Pixel[][] playerTwoGround = new Pixel[10][10];

    public PlayGround() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                playerOneGround[i][j] = new Pixel();
                playerTwoGround[i][j] = new Pixel();
            }
        }

    }


    static void addNewShip(Position position1, Position position2, Pixel[][] player) {
        if (!position1.equals(position2)) {
            if (position1.getX() == position2.getX()) {
                if (position1.getY() > position2.getY()) {
                    int now = position1.getY();
                    int to = position2.getY();
                    while (now > to) {
                        player[position1.getX()][now].setPosition('@');
                        player[position1.getX()][now].setLeftPixel(player[position1.getX()][now - 1]);
                        player[position1.getX()][now - 1].setRightPixel(player[position1.getX()][now]);
                        now--;
                    }
                    player[position1.getX()][to].setPosition('@');


                } else if (position1.getY() < position2.getY()) {
                    int now = position1.getY();
                    int to = position2.getY();
                    while (now < to) {
                        player[position1.getX()][now].setPosition('@');
                        player[position1.getX()][now].setRightPixel(player[position1.getX()][now + 1]);
                        player[position1.getX()][now + 1].setLeftPixel(player[position1.getX()][now]);
                        now++;

                    }
                    player[position1.getX()][to].setPosition('@');
                }
            } else if (position1.getY() == position2.getY()) {
                if (position1.getX() > position2.getX()) {
                    int now = position1.getX();
                    int to = position2.getX();
                    while (now > to) {
                        player[now][position1.getY()].setPosition('@');
                        player[now][position1.getY()].setUpPixel(player[position1.getX()][now - 1]);
                        player[now - 1][position1.getY()].setDownPixel(player[position1.getX()][now]);
                        now--;
                    }

                } else if (position1.getX() < position2.getX()) {
                    int now = position1.getX();
                    int to = position2.getX();
                    while (now < to) {
                        player[now][position1.getY()].setPosition('@');
                        player[now][position1.getY()].setDownPixel(player[position1.getX()][now + 1]);
                        player[now + 1][position1.getY()].setUpPixel(player[position1.getX()][now]);
                        now++;
                    }
                    player[to][position1.getY()].setPosition('@');
                }
            } else {
                System.out.println("error position is not valid");
            }
        } else {
            player[position1.getX()][position1.getY()].setPosition('@');
        }
    }

    static void hitShip(Position position, String type, Pixel[][] player) {
        if (type.equals("Random")) {
            Random random = new Random();
            position.setX(position.getX() - 1 + random.nextInt(3));
            position.setY(position.getY() - 1 + random.nextInt(3));
            hitShip(position, "Normal", player);
        } else if (type.equals("Normal")) {
            if (player[position.getX()][position.getY()].getPosition() == '@') {

                deleteAShip(position, player);
            } else {
                deleteAShip(position, player);


            }
        } else {
            System.out.println("type is not valid");

        }
    }

    static void deleteAShip(Position position, Pixel[][] player) {
        Position tmp;
        player[position.getX()][position.getY()].setPosition('#');
        if (player[position.getX()][position.getY()].isBooleanUpPixel() && !player[position.getX()][position.getY()].isVisitBooleanUpPixel()) {
            tmp = position;
            if (tmp.getY() != 0) {
                player[position.getX()][position.getY()].setVisitBooleanUpPixel(true);
                tmp.setX(tmp.getX() - 1);
                deleteAShip(tmp, player);
            }
        }
        if (player[position.getX()][position.getY()].isBooleanRightPixel() && !player[position.getX()][position.getY()].isVisitBooleanRightPixel()) {
            tmp = position;
            if (tmp.getY() != 9) {
                player[position.getX()][position.getY()].setVisitBooleanRightPixel(true);
                tmp.setY(tmp.getY() + 1);
                deleteAShip(tmp, player);
            }
        }
        if (player[position.getX()][position.getY()].isBooleanLeftPixel()) {
            tmp = position;
            if (tmp.getY() != 0) {
                player[position.getX()][position.getY()].setVisitBooleanLeftPixel(true);
                tmp.setY(tmp.getY() - 1);
                deleteAShip(tmp, player);
            }

        }
        if (player[position.getX()][position.getY()].isBooleanDownPixel()) {
            tmp = position;
            if (tmp.getX() != 9) {
                player[position.getX()][position.getY()].setVisitBooleanDownPixel(true);
                tmp.setX(tmp.getX() + 1);
                deleteAShip(tmp, player);
            }

        }

    }

    public abstract void addNewShip(Position position1, Position position2);

    public abstract void hitShip(Position position, String type);

    public abstract void addAScore();

    public abstract boolean checkForWin();

    public abstract void setMyGround();

    public abstract void setEnemyGround();


}
