package aut.company;

public class PlayerTwo extends PlayGround {
    private Pixel[][] myGroundOfPlayerTwo = new Pixel[10][10];
    private Pixel[][] enemyGroundOfPlayerTwo = new Pixel[10][10];
    private String s1 = "";
    private String s2 = "";
    private static int scoreTwo = 0;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public PlayerTwo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                myGroundOfPlayerTwo[i][j] = new Pixel();
                enemyGroundOfPlayerTwo[i][j] = new Pixel();
            }
        }
    }

    @Override
    public void addNewShip(Position position1, Position position2) {
        PlayerOne.addNewShip(position1, position2, playerTwoGround);
        setMyGround();
    }

    @Override
    public void hitShip(Position position, String type) {
        hitShip(position, type, playerOneGround);
        setEnemyGround();


    }

    @Override
    public void addAScore() {
        scoreTwo++;
    }

    @Override
    public boolean checkForWin() {
        if (scoreTwo == 5) {
            System.out.println("player one is winner .....");
            return true;
        }
        return false;

    }

    @Override
    public void setMyGround() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.myGroundOfPlayerTwo[i][j] = playerTwoGround[i][j];
            }
        }
    }

    @Override
    public void setEnemyGround() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.enemyGroundOfPlayerTwo[i][j] = playerOneGround[i][j];

            }

        }
    }


    public Pixel[][] getMyGroundOfPlayerTwo() {
        return myGroundOfPlayerTwo;
    }

    public void setMyGroundOfPlayerTwo(Pixel[][] myGroundOfPlayerTwo) {
        this.myGroundOfPlayerTwo = myGroundOfPlayerTwo;
    }

    public Pixel[][] getEnemyGroundOfPlayerTwo() {
        return enemyGroundOfPlayerTwo;
    }

    public void setEnemyGroundOfPlayerTwo(Pixel[][] enemyGroundOfPlayerTwo) {
        this.enemyGroundOfPlayerTwo = enemyGroundOfPlayerTwo;
    }

    public Pixel getIndexOfMyGround(int i, int j) {
        return myGroundOfPlayerTwo[i][j];
    }

    public void setIndexOfMyGround(Pixel myGround, int i, int j) {
        this.myGroundOfPlayerTwo[i][j] = myGround;
    }

    public Pixel getIndexOfEnemyGround(int i, int j) {
        return enemyGroundOfPlayerTwo[i][j];
    }

    public void setIndexOfEnemyGround(Pixel enemyGround, int i, int j) {
        this.enemyGroundOfPlayerTwo[i][j] = enemyGround;
    }

    @Override
    public String toString() {
        s1 = "";
        s2 = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (myGroundOfPlayerTwo[i][j].getPosition() == '@') {
                    s1 += ANSI_BLUE + myGroundOfPlayerTwo[i][j].getPosition() + "/";
                } else if (myGroundOfPlayerTwo[i][j].getPosition() == '#') {
                    s1 += ANSI_RED + myGroundOfPlayerTwo[i][j].getPosition()  + "/";
                } else {
                    s1 += ANSI_GREEN + myGroundOfPlayerTwo[i][j].getPosition() + "/";
                }
                if (enemyGroundOfPlayerTwo[i][j].getPosition() == '@') {
                    s2 += ANSI_GREEN + (char) 215 + ANSI_GREEN + "/";
                } else if (enemyGroundOfPlayerTwo[i][j].getPosition() == '#') {
                    s2 += ANSI_RED + enemyGroundOfPlayerTwo[i][j].getPosition() + "/";
                }else {
                    s2 += ANSI_GREEN + enemyGroundOfPlayerTwo[i][j].getPosition()  + "/";
                }
            }
            s1 += "\n";
            s2 += "\n";
        }
        return "PlayerTwo{" +
                "myGroundOfPlayerTwo=\n" + s1 + "\n" +
                ", enemyGroundOfPlayerTwo=\n" + s2 +
                '}';
    }


    public static int getScoreTwo() {
        return scoreTwo;
    }

    public static void setScoreTwo(int scores) {
        scoreTwo = scores;
    }
}
